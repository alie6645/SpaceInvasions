module com.example.spaceinvader1 {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires com.almasb.fxgl.all;

    opens com.example.spaceinvader1 to javafx.fxml;
    exports com.example.spaceinvader1;
}