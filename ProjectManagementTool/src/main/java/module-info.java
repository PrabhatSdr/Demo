module com.example.projectmanagementtool {
    requires javafx.controls;
    requires javafx.fxml;

    requires com.dlsc.formsfx;

    opens com.example.projectmanagementtool to javafx.fxml;
    exports com.example.projectmanagementtool;
}