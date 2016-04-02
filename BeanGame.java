import javafx.application.Application;
import javafx.collections.ObservableList;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.scene.shape.*;
import java.lang.Math;

public class BeanGame extends Application {
	public void start(Stage primaryStage) {   
		Pane pane = new Pane();
		Polyline polyline = new Polyline();
	

		
		final double WIDTH = 400, HEIGHT = 400;
		double centerX = WIDTH / 2, centerY = HEIGHT /2;
		//double widthUnit = WIDTH / 10, heightUnit = WIDTH / 10 ;
		polyline.getPoints().addAll(new Double[]{	centerX- 0.05* WIDTH , centerY - (Math.sqrt(3)/2)* 0.3* HEIGHT - 0.1* HEIGHT,
													centerX- 0.05* WIDTH , centerY - (Math.sqrt(3)/2)* 0.3* HEIGHT,
													centerX- 0.35* WIDTH , centerY + (Math.sqrt(3)/2)* 0.3* HEIGHT,
													centerX- 0.35* WIDTH , centerY + (Math.sqrt(3)/2)* 0.3* HEIGHT + 0.15* HEIGHT,
													
													centerX+ 0.35* WIDTH , centerY + (Math.sqrt(3)/2)* 0.3* HEIGHT + 0.15* HEIGHT,
													centerX+ 0.35* WIDTH , centerY + (Math.sqrt(3)/2)* 0.3* HEIGHT,
													centerX+ 0.05* WIDTH , centerY - (Math.sqrt(3)/2)* 0.3* HEIGHT,
													centerX+ 0.05* WIDTH , centerY - (Math.sqrt(3)/2)* 0.3* HEIGHT - 0.1* HEIGHT
													});
		pane.getChildren().add(polyline);
		
		Scene scene = new Scene(pane,WIDTH,HEIGHT);
		
		primaryStage.setTitle("ShowPolygon");
		primaryStage.setScene(scene);
		primaryStage.show();
	}
}