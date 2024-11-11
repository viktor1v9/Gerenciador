package View;


import javafx.embed.swing.JFXPanel;
import javafx.scene.Scene;
import javafx.scene.layout.*;
import javafx.scene.text.*;
import javafx.scene.paint.Color;

public class Credits {
	
	public void initTela1(JFXPanel fxPanel) {
		Text text = new Text();
		Text text2 = new Text();
		text.setText("Desenvolvido por Victo Reis");
		text2.setText("Unisul");
		
		VBox root = new VBox(10);
		root.getChildren().addAll(text, text2);
		
		Scene scene = new Scene(root, 300, 300, Color.rgb(0, 255, 255, 0.2));
		fxPanel.setScene(scene);
		
	}
	
	public void initTela2(JFXPanel fxPanel) {
		Text text = new Text();
		Text text2 = new Text();
		Text text3 = new Text();
		Text text4 = new Text();
		text.setText("linguaguem:JAVA");
		text2.setText("biblioteca: Swing");		
		text3.setText("plataforma: JAVAfx");
		text4.setText("Banco de dados: MySQL");
		VBox root = new VBox(10);
		root.getChildren().addAll(text, text2, text3, text4);
		
		Scene scene = new Scene(root, 300, 200);
		fxPanel.setScene(scene);

}
}
