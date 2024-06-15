package vue;

import controleur.Main;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;

public class CtrlListeAnnule {

    @FXML
    private Button bnQuitter;

    @FXML
    private ComboBox<?> bnTrier;

    @FXML
    private TableView<?> tableViewAnnule;

    @FXML
    private TextField txt_Filtrer;

    @FXML
    void clickQuitter(ActionEvent event) {
    	System.out.println("cc");
    	Main.fermerListe();
    }

    
    
    private void Initialize() 
    {
    	
	}
}
