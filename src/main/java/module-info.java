module com.example.cse_213_2311519_mahmuda {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.cse_213_2311519_mahmuda to javafx.fxml;
    exports com.example.cse_213_2311519_mahmuda;
}