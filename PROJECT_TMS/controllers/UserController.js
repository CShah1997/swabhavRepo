const UserServices = require('../services/UserServices.js')

class UserController
{
    constructor(app,urlencodedParser,jwt)
    {

        let userServices = new UserServices();
        
        app.get('/api/v1/users',function(request,response){
            userServices.getAllUsers()
            .then(function(result){
                response.status(200).send(result)
            })
            .catch(function(err){   
                response.status(404).send(err)
            })
        })

        app.get('/api/v1/users/:id',function(request,response){
            userServices.getUserById(request.params.id)
            .then(function(result){
                response.status(200).send(response)
            })
            .catch(function(err){
                response.status(404).send(err)
            })
        })

        app.post('/api/v1/users',function(request,response){
            let dataObj = request.body;
            userServices.registerUser(dataObj)
            .then(function(result){
                response.status(200).send(result)
            })
            .catch(function(err){
                response.status(404).send(err)
            })
        })

        app.put('/api/v1/users/:id',function(request,response){
            let id = request.params.id;
            let firstName = request.body.name.firstName;
            let lastName = request.body.name.lastName;
            let mobileNumber = request.body.mobileNumber;
            let email = request.body.email;
            let userName = request.body.userName;
            let password = request.body.password;
            let task = request.body.task;
            userServices.updateUser(id,firstName,lastName,mobileNumber,email,userName,password)
            .then(function(result){
                response.status(200).send(result)
            })
            .catch(function(err){
                response.status(404).send(err)
            })
        })

        app.delete('/api/v1/users/:id',function(request,response){
            userServices.deleteUser(request.params.id)
            .then(function(result){
                response.status(200).send(result)
            })
            .catch(function(err){
                response.status(404).send(err)
            })
        })

        app.post('/api/v1/authenticate', function(request,response){
            let userName = request.body.userName;
            let password = request.body.password;
            userServices.authenticate(userName,password)
            .then(function(result){
                console.log("Welcome...")
                response.status(200).send(result)
            })
            .catch(function(err){
                response.status(404).send(err)
            })
        })

    }

       
}

module.exports = UserController