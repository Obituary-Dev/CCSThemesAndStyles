package ccsthemesandstyles;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

/**
 *
 * @author Obituary
 */
public class Main extends Application {

    Stage window;

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        window = primaryStage;
        window.setTitle("CSS themes and styles");

        // GridPane with 10px padding around edge 
        GridPane grid = new GridPane();
        grid.setPadding(new Insets(10, 10, 10, 10));
        grid.setVgap(8);
        grid.setHgap(10);

        // Name Label constraints use (child, column, row) 
        Label nameLabel = new Label("Username:");
        // overrides the .label class with the ID #bold-label
        nameLabel.setId("bold-label");
        GridPane.setConstraints(nameLabel, 0, 0);

        // Name input 
        TextField nameInput = new TextField("Hisoka");
        GridPane.setConstraints(nameInput, 1, 0);

        // Password label
        Label passLabel = new Label("Password:");
        GridPane.setConstraints(passLabel, 0, 1);

        // Password input 
        TextField passInput = new TextField();
        passInput.setPromptText("password");
        GridPane.setConstraints(passInput, 1, 1);

        // Log In button
        Button loginButton = new Button("Log In");
        GridPane.setConstraints(loginButton, 1, 2);

        // Sign up button
        Button signUpButton= new Button("Sign Up");
        //overrides the .button class with blue-button just created
        signUpButton.getStyleClass().add("button-blue");
        GridPane.setConstraints(signUpButton, 1, 3);

        grid.getChildren().addAll(nameLabel, nameInput, passLabel, passInput, loginButton, signUpButton);

        Scene scene = new Scene(grid, 300, 200);
        scene.getStylesheets().add(getClass().getResource("Viper.css").toExternalForm());
        window.setScene(scene);
        window.show();
    }
}
