package jb;

// Java Program to create RadioButton and add it to a ToggleGroup
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.collections.*;
import javafx.stage.Stage;
import javafx.scene.text.Text.*;
import javafx.scene.text.*;
public class radiobutton_1 extends Application {
    // labels
    Label l;

    // launch the application
    public void start(Stage s)
    {
        // set title for the stage
        s.setTitle("creating RadioButton");

        // create a tile pane
        TilePane r = new TilePane();

        // create a label
        l = new Label("This is a Radiobutton example ");

        // create a toggle group
        ToggleGroup tg = new ToggleGroup();

        // create radiobuttons
        RadioButton r1 = new RadioButton("male");
        RadioButton r2 = new RadioButton("female");
        RadioButton r3 = new RadioButton("others");

        // add radiobuttons to toggle group
        r1.setToggleGroup(tg);
        r2.setToggleGroup(tg);
        r3.setToggleGroup(tg);

        // add label
        r.getChildren().add(l);
        r.getChildren().add(r1);
        r.getChildren().add(r2);
        r.getChildren().add(r3);

        // create a scene
        Scene sc = new Scene(r, 200, 200);

        // set the scene
        s.setScene(sc);

        s.show();
    }

    public static void main(String args[])
    {
        // launch the application
        launch(args);
    }
}
