module com.example.snakeladder1 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.snakeladder1 to javafx.fxml;
    exports com.example.snakeladder1;
}