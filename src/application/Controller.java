package application;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class Controller  {
	 @FXML
	    private Button suma;

	    @FXML
	    private Button multiplicacion;

	    @FXML
	    private Button C;

	    @FXML
	    private Button siete;

	    @FXML
	    private Button restar;

	    @FXML
	    private Button ocho;

	    @FXML
	    private Button dos;

	    @FXML
	    private Button seis;

	    @FXML
	    private Button nueve;

	    @FXML
	    private Button cuatro;

	    @FXML
	    private Button coma;

	    @FXML
	    private TextField texto;

	    @FXML
	    private Button division;

	    @FXML
	    private Button cinco;

	    @FXML
	    private Button cero;

	    @FXML
	    private Button borrar;

	    @FXML
	    private Button uno;

	    @FXML
	    private Button igual;

	    @FXML
	    private Button tres;

	    private Boolean haciendoOperacion = true;


    @FXML
    void anyadirValor(ActionEvent event) {
    	texto.setText(texto.getText() + ((Button)event.getSource()).getText());
    	haciendoOperacion = true;
    }

    @FXML
    void anyadirOperador(ActionEvent event) {
    	if(haciendoOperacion){
    		texto.setText(texto.getText() + ((Button)event.getSource()).getText());
    		haciendoOperacion = false;
    	}
    }

    @FXML
    void vaciarTexto(ActionEvent event) {
    	texto.setText("");
    	haciendoOperacion = true;
    }

    public void eliminarValor(){
		if(texto.getText().length() != 0){
			texto.setText(texto.getText().substring(0, texto.getText().length()-1));
		}
	}


}
