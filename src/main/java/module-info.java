module com.di.practica32 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.di.practica32 to javafx.fxml;
    exports com.di.practica32;
}