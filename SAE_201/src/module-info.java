module SAE_201 {
	requires javafx.controls;
	requires javafx.fxml;
	requires javafx.graphics;
	opens vue to javafx.graphics, javafx.fxml, javafx.controls;
	
	exports controleur;
}
