package viewmodels

import models.TodoItem
import services.RAMTodoStorageService
import services.TodoStorageService


class TodoViewModel(private val todoStorageService: TodoStorageService) {

    // second constructor
    constructor() : this(RAMTodoStorageService()) {

    }

     fun addTodo( todoItem: TodoItem){
         todoStorageService.addTodo(todoItem)
    }

     fun getListTodo(): List<TodoItem>{
        return todoStorageService.getListTodo()
    }

     fun removeTodoItem(itemId: Int){
         todoStorageService.removeTodoItem(itemId)
    }

    fun getTodoItemById(itemId: Int): TodoItem?{
        return todoStorageService.getTodoItemById(itemId)
    }
}
