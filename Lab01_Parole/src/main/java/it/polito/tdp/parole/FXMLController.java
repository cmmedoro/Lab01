package it.polito.tdp.parole;

import it.polito.tdp.parole.model.Parole;
import it.polito.tdp.parole.model.Words;
//import java.util.concurrent.TimeUnit;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class FXMLController {
	
	//Parole elenco ;
	Words elencoW;

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private TextField txtParola;
    
    @FXML
    private Button btnCancella;

    @FXML
    private Button btnInserisci;

    @FXML
    private TextArea txtResult;
    
    @FXML
    private TextArea txtTime;

    @FXML
    private Button btnReset;
    
    private String parola;
    //private Parole p = new Parole();
    private Words w = new Words();

    @FXML
    void doInsert(ActionEvent event) {
    	long start = System.nanoTime();
    	parola = this.txtParola.getText();
    	//inserisco la parola nella struttura dati
    	//p.addParola(parola);
    	w.addParola(parola);
    	//this.txtResult.setText(p.getElenco().toString());
    	this.txtResult.setText(w.getElenco().toString());
    	this.txtParola.setText("");
    	long end = System.nanoTime();
    	this.txtTime.setText("Tempo impiegato per l'operazione: "+(end-start)+" nanosecondi");
    	//long convert = TimeUnit.SECONDS.convert((end-start),TimeUnit.NANOSECONDS);
    	//this.txtTime.setText("Tempo impiegato per l'operazione: "+convert+" secondi");
    }
    
    @FXML
    void doClear(ActionEvent event) {
    	long start = System.nanoTime();
    	String s = this.txtResult.getSelectedText();
    	//p.cancel(s);
    	w.cancel(s);
    	//this.txtResult.setText(p.getElenco().toString());
    	this.txtResult.setText(w.getElenco().toString());
    	long end = System.nanoTime();
    	this.txtTime.setText("Tempo impiegato per l'operazione: "+(end-start)+" nanosecondi");
    }

    @FXML
    void doReset(ActionEvent event) {
    	long start = System.nanoTime();
    	//p.reset();
    	w.reset();
    	this.txtParola.setText("");
    	this.txtResult.setText("");
    	long end = System.nanoTime();
    	this.txtTime.setText("Tempo impiegato per l'operazione: "+(end-start)+" nanosecondi");
    }

    @FXML
    void initialize() {
        assert txtParola != null : "fx:id=\"txtParola\" was not injected: check your FXML file 'Scene.fxml'.";
        assert btnInserisci != null : "fx:id=\"btnInserisci\" was not injected: check your FXML file 'Scene.fxml'.";
        assert txtResult != null : "fx:id=\"txtResult\" was not injected: check your FXML file 'Scene.fxml'.";
        assert btnReset != null : "fx:id=\"btnReset\" was not injected: check your FXML file 'Scene.fxml'.";

        //elenco = new Parole() ;
        elencoW = new Words();
    }
}
