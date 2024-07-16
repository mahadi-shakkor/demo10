module com.oop.mahadi.demo10 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.oop.mahadi.demo10 to javafx.fxml;
    exports com.oop.mahadi.demo10;
}