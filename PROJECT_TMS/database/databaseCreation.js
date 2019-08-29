const url = "mongodb+srv://tmsChirag:tmsChirag@clusterchirag-7gmco.mongodb.net/test?retryWrites=true&w=majority"
const mongoose = require('mongoose')
let connection = mongoose.createConnection(url,{ useNewUrlParser: true },function(err){
    if(err) throw err;
    console.log("Connection Established")
})
let Schema = mongoose.Schema;
let userSchema = new Schema({
    name: {
        firstName: String,
        lastName: String
    },
    userName: String,
    password: String,
    mobileNumber: String,
    email: String,
    registeredDate: Date,
    task: [{
        taskTitle: String,
        taskDescription: String,
        taskCreated: Date,
        taskToBeDoneOn: Date,
        taskStatus: Boolean,
        taskPriority: String,

        subTask: [{
            subTaskTitle: String,
            subTaskDescription: String,
            subTaskCreated: Date,
            subTaskToBeDoneOn: Date,
            subTaskStatus: Boolean
        }]
    }]
});

let User = connection.model("User",userSchema);

module.exports = User;