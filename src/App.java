import javafx.scene.Scene;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.stage.Stage;

public class App extends Application {

@Override
public void start(Stage primaryStage) throws Exception{
    //Crear GUI de la aplicacion
    //Crear titulo y settear lo basico
    primaryStage.setTitle("Hojas de vida");
    Parent root = FXMLLoader.load(getClass().getResource("/App.fxml"));



    

    primaryStage.setScene((new Scene(root)));
    primaryStage.show();
}



public static void main(String[] args) throws Exception {
      
    launch(args);

    
    } 
    
} 
