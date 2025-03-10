package daihocmo.javafxenglishapp;

import java.io.IOException;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;

public class PrimaryController {

    public void checkHandle() {
        Alert alert = new Alert(Alert.AlertType.INFORMATION, "HELOO WORLD",ButtonType.OK);
        alert.show();
    }
}
