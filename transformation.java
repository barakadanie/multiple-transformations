import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.transform.Rotate;
import javafx.scene.transform.Scale;
import javafx.scene.transform.Translate;
import javafx.stage.Stage;

public class transformation extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {
       //drawing rectangele
       Rectangle rectangle=new Rectangle(50,50,100,75);
       rectangle.setFill(Color.BURLYWOOD);
       rectangle.setStroke(Color.BLACK);
       //creating the rotation trasformation
        Rotate rotate=new Rotate();
        //setting the angle of rotation
        rotate.setAngle(20);
        // setting pivot points for the rotation
        rotate.setPivotX(150);
        rotate.setPivotY(225);
        //creating a scle transformation
        Scale scale=new Scale();
        //setting the dimensions for the transformation
        scale.setX(1.5);
        scale.setY(1.5);
        //setting the pivot point for the ttransformation
        scale.setPivotX(300);
        scale.setPivotY(145);
        //craeting the translation transformation
        Translate translate=new Translate();
        //setting the x,y,z cordinates to the rectangle
        translate.setX(250);
        translate.setY(0);
        translate.setZ(0);
        //addin all tranformations to the rectangle
        rectangle.getTransforms().addAll(rotate,scale,translate);
        Group root=new Group(rectangle);
        Scene scene=new Scene(root,600,300);
        primaryStage.setTitle("Multiple transformations");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
    public static void main(String[] args)
    {
        launch(args);
    }
}
