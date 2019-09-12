const SubTaskServices = require('../services/SubTaskServices.js')

class SubTaskController
{
    constructor(app,urlencodedParser)
    {
        let subTaskServices = new SubTaskServices()

        app.get('/api/v1/users/:id/task/:taskId/subTask',function(request,response){
            let id = request.params.id;
            let taskId = request.params.taskId;
            subTaskServices.getAllSubTasksByTaskId(id,taskId)
            .then(function(result){
                response.status(200).send(result)
            })
            .catch(function(err){
                response.status(404).send(err)
            })
        })    

        app.get('/api/v1/users/:id/task/:taskId/subTask/:subTaskId',function(request,response){
            let id = request.params.id;
            let taskId = request.params.taskId;
            let subTaskId = request.params.subTaskId;
            subTaskServices.getSingleSubTaskBySubTaskId(id,taskId,subTaskId)
            .then(function(result){
                response.status(200).send(result)
            })            
            .catch(function(err){
                response.status(404).send(err)
            })
        })

        app.post('/api/v1/users/:id/task/:taskId/subTask',function(request,response){
            let id = request.params.id;
            let taskId = request.params.taskId;
            let subTaskTitle = request.body.subTaskTitle;
            let subTaskDescription = request.body.subTaskDescription;
            let subTaskCreated = request.body.subTaskCreated;
            let subTaskToBeDoneOn = request.body.subTaskToBeDoneOn;
            subTaskServices.addSubTaskByTaskId(id,taskId,subTaskTitle,subTaskDescription,subTaskCreated,subTaskToBeDoneOn)
            .then(function(result){
                response.status(200).send(result)
            })
            .catch(function(err){
                response.status(404).send(err)
            })
        })

        app.delete('/api/v1/users/:id/task/:taskId/subTask/:subTaskId',function(request,response){
            let id = request.params.id;
            let taskId = request.params.taskId;
            let subTaskId = request.params.subTaskId;
            subTaskServices.deleteSubTaskBySubTaskId(id,taskId,subTaskId)
            .then(function(result){
                response.status(200).send(result)
            })
            .catch(function(err){
                response.status(404).send(err)
            })
        })

        app.put('/api/v1/users/:id/task/:taskId/subTask/:subTaskId',function(request,response){
            let id = request.params.id;
            let taskId = request.params.taskId;
            let subTaskId = request.params.subTaskId;
            let subTaskTitle = request.body.subTaskTitle;
            let subTaskDescription = request.body.subTaskDescription;
            let subTaskCreated = request.body.subTaskCreated;
            let subTaskToBeDoneOn = request.body.subTaskToBeDoneOn;
            subTaskServices.updateSubTaskBySubTaskId(id,taskId,subTaskId,subTaskTitle,subTaskDescription,subTaskCreated,subTaskToBeDoneOn)
            .then(function(result){
                response.status(200).send(result)
            })
            .catch(function(err){
                response.status(404).send(err)
            })
        })
    }
}

module.exports = SubTaskController;