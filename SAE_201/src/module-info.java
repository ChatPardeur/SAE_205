module SAE_201 {
	requires javafx.controls;
	requires javafx.fxml;
	requires javafx.graphics;
	requires javafx.base;
	opens vue to javafx.graphics, javafx.fxml, javafx.controls, javafx.base;
	opens controleur to javafx.graphics, javafx.fxml, javafx.controls, javafx.base;
	opens modele to javafx.graphics, javafx.fxml, javafx.controls, javafx.base;
	
	
	exports controleur;
}
