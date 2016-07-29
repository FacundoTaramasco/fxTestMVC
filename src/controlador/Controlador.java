package controlador;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import modelo.Negocio;

import java.net.URL;
import java.util.ResourceBundle;

public class Controlador implements Initializable {

    private Negocio modelo;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        modelo = Negocio.getInstance();
    }


    @FXML
    public void metodoPrueba(ActionEvent e) {
        modelo.hacerUnaTarea();
    }


}
