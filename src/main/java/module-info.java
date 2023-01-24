module com.example.demka {
    requires javafx.controls;
    requires javafx.fxml;
            
                            
    opens com.example.demka to javafx.fxml;
    exports com.example.demka;
}