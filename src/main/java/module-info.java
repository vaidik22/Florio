module io.github.prajjwal.florio {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;


    opens io.github.prajjwal.florio to javafx.fxml;
    exports io.github.prajjwal.florio;
}