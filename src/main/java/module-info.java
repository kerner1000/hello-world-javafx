module hello.world.javafx {
    requires javafx.graphics;
    requires javafx.controls;
    requires javafx.fxml;
    exports org.example;
    opens org.example;
}