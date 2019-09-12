const TaskServices = require('../services/TaskServices.js')

class TaskController
{
    constructor(app,urlencodedParser)
    {
        let taskServices = new TaskServices();

        app.get('/api/v1/users/:id/task',function(request,response){
            taskServices.getUserAllTaskById(request.params.id)
            .then(function(result){
                response.send(result)
            })
            .catch(function(err){
                response.send(err)
            })
        })    
        
        app.post('/api/v1/users/:id/task',function(request,response){
            let id = request.params.id;
            let taskTitle = request.body.taskTitle;
            let taskDescription = request.body.taskDescription;
            let taskCreated = request.body.taskCreated;
            let taskToBeDoneOn = request.body.taskToBeDoneOn;
            let taskPriority = request.body.taskPriority;
            taskServices.addUserTask(id,taskTitle,taskDescription,taskCreated,taskToBeDoneOn,taskPriority)
            .then(function(result){
                response.send(result)
            })
            .catch(function(err){
                response.send(err)
            })
        })

        app.delete('/api/v1/users/:id/task/:taskId',function(request,response){
            let id = request.params.id;
            let taskId = request.params.taskId;
            taskServices.deleteUserTaskByTaskId(id,taskId)
            .then(function(result){
                response.send(result)
            })
            .catch(function(err){
                response.send(err)
            })
        })

        app.put('/api/v1/users/:id/task/:taskId',function(request,response){
            let id = request.params.taskId;
            let taskTitle = request.body.taskTitle;
            let taskDescription = request.body.taskDescription;
            let taskCreated = request.body.taskCreated;
            let taskToBeDoneOn = request.body.taskToBeDoneOn;
            let taskPriority = request.body.taskPriority;
            taskServices.updateUserTaskByTaskId(id,taskTitle,taskDescription,taskCreated,taskToBeDoneOn,taskPriority)
            .then(function(result){
                response.send(result)
            })            
            .catch(function(err){
                response.send(err)
            })
        })

        app.get('/api/v1/users/:id/task/:taskId',function(request,response){
            let id = request.params.id;
            let taskId = request.params.taskId;
            taskServices.getUserSingleTaskByTaskId(id,taskId)
            .then(function(result){
                response.send(result)
            })            
            .catch(function(err){
                response.send(err)
            })
        })
    }
}

module.exports = TaskController;