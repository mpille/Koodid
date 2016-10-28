package praktikum11;

import javafx.scene.shape.Rectangle;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class kujund extends Application {
	@Override
	public void start(Stage primaryStage) throws Exception {
		Pane pane = new Pane();

		Rectangle kast = new Rectangle(100, 100, 300, 200);
		pane.getChildren().add(kast);

		Scene stseen = new Scene(pane, 600, 400);
		primaryStage.setScene(stseen);
		primaryStage.show();
	}
}