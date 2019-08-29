const userModel = require('../database/databaseCreation.js')

class TaskServices
{
    getUserAllTaskById(id)
    {
        return new Promise(function(resolve,reject){
            let query = {_id:id}
            userModel.findOne(query,{"task":1,_id:0},function(res,err){
                if(err) reject(err)
                resolve(res)
            })
        })
    }

    addUserTask(id,taskTitle,taskDescription,taskCreated,taskToBeDoneOn,taskPriority)
    {
        return new Promise(function(resolve,reject){
            let query = {_id:id}
            let taskObj = {
                taskTitle: taskTitle,
                taskDescription: taskDescription,
                taskCreated: taskCreated,
                taskToBeDoneOn: taskToBeDoneOn,
                taskPriority: taskPriority,
                subTask: []
            }
            userModel.updateOne(query,{ $push: {task:taskObj} },function(res,err){
                if(err) reject(err)
                resolve(res)
            })
        })
    }

    deleteUserTaskByTaskId(id,taskId)
    {
        console.log(id,taskId)
        return new Promise((resolve, reject) => {
            userModel.updateOne({ '_id': id, 'task._id': taskId }, { $pull: { task: { _id: taskId } } }, { multi: false }, (err, result) => {
                if (err)
                    reject(err);
                if (result)
                    resolve(result);
            });
        });
    }
    
    updateUserTaskByTaskId(id,taskTitle,taskDescription,taskCreated,taskToBeDoneOn,taskPriority)
    {
        return new Promise(function(resolve,reject){
            let query = { task : { $elemMatch: {_id:id}} }
            let taskObj = {
                taskTitle: taskTitle,
                taskDescription: taskDescription,
                taskCreated: taskCreated,
                taskToBeDoneOn: taskToBeDoneOn,
                taskPriority: taskPriority,
                subTask: []
            }
            console.log(taskObj)
            userModel.updateOne(query,{ $set: {"task.$" :taskObj} },function(res,err){
                if(err) reject(err)
                resolve("Updated successfully...")
            })
        })
    }

    getUserSingleTaskByTaskId(id,taskId)
    {
        return new Promise(function(resolve,reject){
            
            userModel.findOne({_id:id,'task._id':taskId},{task : { $elemMatch: {_id:taskId}}},{_id:0,'task._id':0},function(res,err){
                if(err) reject(err)
                resolve(res)
            })
        })
    }
}

module.exports = TaskServices;