module com.example.demo {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;

    opens mateusz to javafx.fxml;
    exports mateusz;
}