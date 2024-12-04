module com.example.jogo {
    requires javafx.controls;
    requires javafx.fxml;

    requires com.dlsc.formsfx;

    opens com.example.jogo to javafx.fxml;
    exports com.example.jogo;
}