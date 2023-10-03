module com.david.testjavafx {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.david.testjavafx to javafx.fxml;
    exports com.david.testjavafx;
}
