import javafx.application.Application;
import javafx.scene.*;
import javafx.scene.control.*;
import javafx.scene.paint.*;
import javafx.scene.layout.*;
import javafx.scene.text.*;
import javafx.stage.Stage;
import javafx.geometry.*;
import javafx.beans.value.ObservableValue;
import javafx.scene.control.ToggleGroup;

public class Qwerty24 extends Application{

    public static void main(String args []){launch(args);}

    public void start(Stage primaryStage ){
        Text t = new Text("Programming is fun");
        Button bt = new Button("=>");
        Button bt1 = new Button("<=");
        ToggleGroup tg = new ToggleGroup();
        RadioButton cb = new RadioButton("Red");
        cb.setToggleGroup(tg);
        cb.selectedProperty().addListener(
                (ObservableValue<? extends Boolean> ov, Boolean old_val, Boolean new_val) ->{
                    t.setFill(Color.RED);
                });
        RadioButton cb1 = new RadioButton("Yellow");
        cb1.setToggleGroup(tg);
        cb1.selectedProperty().addListener(
                (ObservableValue<? extends Boolean> ov, Boolean old_val, Boolean new_val) ->{
                    t.setFill(Color.YELLOW);
                });
        RadioButton cb2 = new RadioButton("Black");
        cb2.setToggleGroup(tg);
        cb2.selectedProperty().addListener(
                (ObservableValue<? extends Boolean> ov, Boolean old_val, Boolean new_val) ->{
                    t.setFill(Color.BLACK);
                });RadioButton cb3 = new RadioButton("Orange");
        cb3.setToggleGroup(tg);
        cb3.selectedProperty().addListener(
                (ObservableValue<? extends Boolean> ov, Boolean old_val, Boolean new_val) ->{
                    t.setFill(Color.ORANGE);
                });RadioButton cb4 = new RadioButton("Green");
        cb4.setToggleGroup(tg);
        cb4.selectedProperty().addListener(
                (ObservableValue<? extends Boolean> ov, Boolean old_val, Boolean new_val) ->{
                    t.setFill(Color.GREEN);
                });
        Pane con = new Pane();
        con.getChildren().add(t);
        t.setX(0);
        t.setY(10);
        //t.setStyle();
        HBox pap = new HBox (cb,cb1,cb2,cb3,cb4);
        HBox papa = new HBox (con);

        papa.setStyle("-fx-border-style: solid;"+ "-fx-border-width: 1;"+ "-fx-border-color: black");

        HBox paps = new HBox ();
        paps.setAlignment(Pos.CENTER);
        paps.getChildren().add(bt1);
        paps.getChildren().add(bt);
        VBox p = new VBox (pap,papa,paps);


        bt.setOnAction(e->{
            t.setX(t.getX()+2);
        });

        bt1.setOnAction(e->{
            if(t.getX()>0)
                t.setX(t.getX()-2);
        });

        Scene s = new Scene( p , 600 , 600 );

        primaryStage.setTitle("Task");
        primaryStage.setScene(s);
        primaryStage.show();

    }
}
