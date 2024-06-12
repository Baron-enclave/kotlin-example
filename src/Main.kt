
import services.RAMTodoStorageService
import viewmodels.TodoViewModel
import views.ToDoView

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
   val todoView = ToDoView(TodoViewModel(RAMTodoStorageService()))
    todoView.run()
}

