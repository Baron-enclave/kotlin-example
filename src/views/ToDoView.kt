package views

import viewmodels.TodoViewModel

class ToDoView(val todoViewModel: TodoViewModel) {
    fun run(){
        var option: String?
        do{
            option = readLine()
            when(option){
                "1" -> displayListTodo()
            }
        }
            while (option != "0")
    }

    private fun displayListTodo(){
        val todoList = todoViewModel.getListTodo()
            println("Id\t\t\tText")
            for (item in todoList){
                println("${item.id}\t\t\t${item.text}")
            }
    }
}