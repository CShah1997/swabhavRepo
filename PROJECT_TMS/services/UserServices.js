const userModel = require('../database/databaseCreation.js')

class UserServices
{
    authenticate(userName,password)
    {
        return new Promise(function(resolve,reject){
            userModel.find({userName:userName,password:password},function(res,err){
                if(err) reject(err);
                resolve(res);
            })
        })
    }

    getAllUsers()
    {
        return new Promise(function(resolve,reject){
            userModel.find({},function(res,err){
                if(err) reject(err);
                resolve(res)
            })
        })
    }

    getUserById(id)
    {
        return new Promise(function(resolve,reject){
            userModel.find({_id:id},function(res,err){
                if(err) reject(err)
                resolve(res)
            })
        })
    }

    registerUser(dataObj)
    {
        return new Promise(function(resolve,reject){
            let user1 = new userModel({
                name: {
                    firstName: dataObj.firstName,
                    lastName: dataObj.lastName
                },
                userName: dataObj.userName,
                password: dataObj.password,
                mobileNumber: dataObj.mobileNumber,
                email: dataObj.email,
                task:[]
            })
            user1.save()
            .then(function(result){
                resolve(result)
            })
            .catch(function(err){
                reject(err)
            })
    
        })
    }

    updateUser(id,firstName,lastName,mobileNumber,email,userName,password)
    {
        return new Promise(function(resolve,reject){
            let query = {_id:id}
            let newValues = { $set: {'name.firstName':firstName,'name.lastName':lastName,'mobileNumber':mobileNumber,'email':email,'userName':userName,'password':password}}
            userModel.updateOne(query,newValues,function(res,err){
                if(err) reject(err)
                resolve("Updated successfully...")
            })
        })
    }

    deleteUser(id)
    {
        return new Promise(function(resolve,reject){
            let query = {_id:id}
            userModel.deleteOne(query,function(res,err){
                if(err) reject(err)
                resolve("Deleted successfully...")
            })
        })
    }

}

module.exports = UserServices;
