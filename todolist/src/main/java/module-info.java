module com.jomariabejo.todolist.todolist {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.jomariabejo.todolist.todolist to javafx.fxml;
    exports com.jomariabejo.todolist.todolist;
}