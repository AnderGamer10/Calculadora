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
    public void completarOperacion(){
		 String operationS = texto.getText();

		 int tamano = operationS.length();
		    String A[] = new String[100];

		    String operaciones[] = new String[100];
		    int posicion = 0;
		    double sum = 0;
		    String aux = "";

		    operaciones[0] = "+";
		    int index_operacion = 1;
		    for(int i = 0; i < tamano ; i++)
		    {
		        if(operationS.charAt(i) == '+' || operationS.charAt(i) == '-' || operationS.charAt(i) == '*' || operationS.charAt(i) == '/')
		        {
		            A[posicion] = aux;
		            operaciones[index_operacion] = String.valueOf(operationS.charAt(i));
		            posicion++;
		            index_operacion++;
		            aux = "";
		        }
		        else
		        {
		            aux = aux + operationS.charAt(i);
		        }
		    }
		    A[posicion] = aux;

		    posicion++;

		    for(int i = 0; i < posicion ; i++)
		    {
		    	switch(operaciones[i]){
		    	case "+":
		    		sum=sum+Double.parseDouble(A[i]);
		    		break;
		    	case "-":
		    		sum=sum-Double.parseDouble(A[i]);
		    		break;
		    	case "*":
		    		sum=sum*Double.parseDouble(A[i]);
		    		break;
		    	case "/":
		    		sum=sum/Double.parseDouble(A[i]);
		    		break;
		    	}

		    }
		    texto.setText(String.valueOf(sum));
	}


}
