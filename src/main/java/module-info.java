module com.oop.mahadi.demo10 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.oop.mahadi.demo10 to javafx.fxml;
    exports com.oop.mahadi.demo10;
    exports com.oop.mahadi.demo10.h1;
    opens com.oop.mahadi.demo10.h1 to javafx.fxml;
}