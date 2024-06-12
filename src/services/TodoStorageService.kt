package services

import models.TodoItem

interface TodoStorageService{
    fun addTodo(todoItem: TodoItem)
    fun getListTodo(): List<TodoItem>
    fun removeTodoItem(itemId: Int)
    fun getTodoItemById(itemId: Int): TodoItem?
}

class RAMTodoStorageService : TodoStorageService {
    private var todoList = mutableListOf<TodoItem>()

    init {
        todoList.add(TodoItem("Drink water", 1))
        todoList.add(TodoItem("walk  30m", 2))
        todoList.add(TodoItem("sleep at 10PM", 3))
        todoList.add(TodoItem("coding", 4))
    }

    override fun addTodo(todoItem: TodoItem) {
        todoList.add(todoItem)
    }

    override fun getListTodo(): List<TodoItem> {
        return todoList
    }

    override fun removeTodoItem(itemId: Int) {
        for(item in todoList){
            if (item.id == itemId){
                todoList.remove(item)
            }
        }
    }

    override fun getTodoItemById(itemId: Int): TodoItem? {
        for (item in todoList){
            if (item.id == itemId){
                return item
            }
        }
        return null
    }

}

class FileTodoStorageService : TodoStorageService{
    override fun addTodo(todoItem: TodoItem) {
        TODO("Not yet implemented")
    }

    override fun getListTodo(): List<TodoItem> {
        TODO("Not yet implemented")
    }

    override fun removeTodoItem(itemId: Int) {
        TODO("Not yet implemented")
    }

    override fun getTodoItemById(itemId: Int): TodoItem? {
        TODO("Not yet implemented")
    }
}