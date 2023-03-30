module com.example.tpnotejavafx {
    requires javafx.controls;
    requires javafx.fxml;
            
                            
    opens com.example.tpnotejavafx to javafx.fxml;
    exports com.example.tpnotejavafx;
}