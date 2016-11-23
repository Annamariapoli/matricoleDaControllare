package it.polito.tdp.Matricole;

import java.net.URL;
import java.util.List;
import java.util.ResourceBundle;

import it.polito.tdp.model.Corso;
import it.polito.tdp.model.Model;
import it.polito.tdp.model.Studente;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class MatricoleController {  

	private Model model = new Model();
	
	public void setModel(Model model){
		this.model=model;
	}
	public Model getModel(){
		return model;
	}
   
	@FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private TextField txtMatricola;

    @FXML
    private Button btnCerca;

    @FXML
    private TextArea txtResult;

    @FXML
    void doCerca(ActionEvent event) {
    
    	String s = txtMatricola.getText();                                      //--> prendo la matricola inserita dall'utente
    	txtMatricola.clear();
    	if(s.isEmpty()){                                                      //--> se non l'ha inserita
    		txtResult.appendText("La stringa è vuota! \n ");
    		return;
    	}
    	
    	Studente studente = model.cercaStudente(txtMatricola.getText());                //--> se lo studente esiste
    	if(studente==null){
    		txtResult.appendText("lo studente non esiste nel database! \n ");
    		return;
    	}
    	
    	
    	List<Corso> CorsiStudenteCercato= model.cercaStudenteListaCorsi(s);
    	txtResult.appendText("I corsi della matricola cercata sono: " +CorsiStudenteCercato+ "\n");
    	
    	
    	
    	
    }

    @FXML
    void initialize() {
        assert txtMatricola != null : "fx:id=\"txtMatricola\" was not injected: check your FXML file 'Matricole.fxml'.";
        assert btnCerca != null : "fx:id=\"btnCerca\" was not injected: check your FXML file 'Matricole.fxml'.";
        assert txtResult != null : "fx:id=\"txtResult\" was not injected: check your FXML file 'Matricole.fxml'.";

    }
}
