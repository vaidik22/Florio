module io.github.prajjwal.florio {
    requires javafx.controls;
    requires javafx.fxml;


    opens io.github.prajjwal.florio to javafx.fxml;
    exports io.github.prajjwal.florio;
}