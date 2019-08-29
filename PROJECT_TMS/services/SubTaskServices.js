const userModel = require('../database/databaseCreation.js')

class SubTaskServices
{

    getAllSubTasksByTaskId(id,taskId)
    {
        return new Promise(function(resolve,reject){
            let query = {_id:id,'task._id':taskId}
            userModel.findOne(query,{"task.$.subTask":1,_id:0},function(err,res){
                if(err){
                    reject(err);
                }
                resolve(res.task[0].subTask)
            })
        })
    }

    getSingleSubTaskBySubTaskId(id,taskId,subTaskId)
    {
        return new Promise(function(resolve,reject){
            let query = {_id:id,'task._id':taskId}
            userModel.findOne(query,{"task.$.subTask":1,_id:0},function(err,res){
                if(err){
                    reject(err);
                }
                let subTasksRes = res.task[0].subTask;
                subTasksRes.forEach(element => {
                    if(element._id == subTaskId)
                    {
                        resolve(element)
                    }
                });
            })
        })
    }

    addSubTaskByTaskId(id,taskId,subTaskTitle,subTaskDescription,subTaskCreated,subTaskToBeDoneOn)
    {
        return new Promise(function(resolve,reject){
            let query = {_id:id,'task._id':taskId}
            let subTaskObj = {
                subTaskTitle: subTaskTitle,
                subTaskDescription: subTaskDescription,
                subTaskCreated: subTaskCreated,
                subTaskToBeDoneOn: subTaskToBeDoneOn
            }
            userModel.updateOne(query,{ $push: {'task.$.subTask':subTaskObj} },function(res,err){
                if(err) reject(err)
                resolve(res)
            })
        })
    }

    deleteSubTaskBySubTaskId(id,taskId,subTaskId)
    {
        return new Promise(function(resolve,reject){
            let query = {_id:id,'task._id':taskId}
            userModel.updateOne(query,{ $pull: { 'task.$.subTask':{_id:subTaskId} } },{ multi: false},function(res,err){
                if(err) reject(err)
                resolve("Deleted successfully...")
            })
        })
    }

    updateSubTaskBySubTaskId(id,taskId,subTaskId,subTaskTitle,subTaskDescription,subTaskCreated,subTaskToBeDoneOn)
    {
        let expThis = this;
        return new Promise(function(resolve,reject){
            expThis.deleteSubTaskBySubTaskId(id,taskId,subTaskId)
            .then(function(result){
                
            })  
            .catch(function(err){

            })   
            expThis.addSubTaskByTaskId(id,taskId,subTaskTitle,subTaskDescription,subTaskCreated,subTaskToBeDoneOn)
            .then(function(result){
                resolve(result)
            })    
            .catch(function(err){
                reject(err)
            })
        })   
    }
}

module.exports = SubTaskServices;



