const express = require('express')
const cors = require('cors')
const app = express();

const UserController = require('./controllers/UserController.js')
const TaskController = require('./controllers/TaskController.js')
const SubTaskController = require('./controllers/SubTaskController.js')
const bodyParser = require('body-parser')

app.use(cors())
app.use(express.static('public'));
var urlencodedParser = bodyParser.urlencoded({ extended: false })
app.use(bodyParser.json());

let userController = new UserController(app,urlencodedParser);
let taskController = new TaskController(app,urlencodedParser); 
let subTaskController = new SubTaskController(app,urlencodedParser); 

app.get('/singlePageApp/',function(request,response){
    response.sendFile("./public/index.html")
})

var server = app.listen(8080,function(){
    console.log("server running");
})
