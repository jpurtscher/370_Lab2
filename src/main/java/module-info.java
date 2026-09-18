module com.example.graph_app2 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.graph_app2 to javafx.fxml;
    exports com.example.graph_app2;
}