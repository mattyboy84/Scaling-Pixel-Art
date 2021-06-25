package sample;

import javafx.application.Application;
import javafx.geometry.Rectangle2D;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.Screen;
import javafx.stage.Stage;

public class Main extends Application {

    //
    Rectangle2D screenBounds = Screen.getPrimary().getBounds();
    //

    //1080p
    int madeWithWidth = 1920;
    int madeWithHeight = 1080;

    //1440p
    //int currentWidth = 2560;
    //int currentHeight = 1440;
    //
    //screen size detection
    int currentWidth = (int) screenBounds.getMaxX();
    int currentHeight = (int) screenBounds.getMaxY();
    //
    float scaleX = (float) currentWidth / madeWithWidth;
    float scaleY = (float) currentHeight / madeWithHeight;

    Group group = new Group();
    Scene scene = new Scene(group, currentWidth, currentHeight);
    //
    //Image image = new Image("file:src\\default_floor.png", (new Image("file:src\\default_floor.png").getWidth() * scaleX), (new Image("file:src\\default_floor.png").getHeight() * scaleY), true, false);

    //
    ImageView imageView = new ImageView(new Image("file:src\\default_floor.png", (new Image("file:src\\default_floor.png").getWidth() * scaleX), (new Image("file:src\\default_floor.png").getHeight() * scaleY), true, false));

    ImageView isaac= new ImageView(new Image("file:src\\tile00.png", (new Image("file:src\\tile00.png").getWidth() * scaleX), (new Image("file:src\\tile00.png").getHeight() * scaleY), true, false));

    @Override

    //TODO All image x and y deltas will also need to be scaled. e.g. isaac's head and Gurdy Jr's face

        public void start(Stage stage) throws Exception {
        System.out.println(screenBounds);

        group.getChildren().addAll(imageView,isaac);


        stage.setScene(scene);
        stage.setFullScreen(true);
        stage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
