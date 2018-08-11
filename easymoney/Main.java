package easymoney;
import javafx.scene.Scene;

import javafx.stage.Stage;
import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.layout.Background;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
public class Main extends Application {
	Stage window;
	Scene sce1,sce2;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		launch(args);
	}
	public void start(Stage first) throws Exception {
		first = new Stage();
		window = first;
		window.setTitle("Easy Money");
		//Initial welcome screen
		StackPane lay = new StackPane();
		lay.setBackground(Background.EMPTY);
		String style = "-fx-background-color: rgba(41,128,185,1.0);";
		lay.setStyle(style);
		Label tp = new Label("Welcome");
		tp.setFont(Font.font ("Verdana", 34));
		tp.setAlignment(Pos.CENTER);
		lay.getChildren().add(tp);
		Scene sce = new Scene(lay,800,600);
		//Second and third screen
		GridPane gp = new GridPane();
		BorderPane bds= new BorderPane();
		VBox gp1 = new VBox();
		VBox gp2 = new VBox();
		//scene2 things
		Label lb3 = new Label("Withdraw");
		lb3.setFont(Font.font ("Verdana", 27));
		lb3.setOnMouseClicked(e-> {
			//code for withdrawl
		});
		Label lb4 = new Label("Deposit");
		lb4.setOnMouseClicked(e-> {
			//code for deposit
		});
		lb4.setFont(Font.font ("Verdana", 27));
		Label lb5 = new Label("Balance enquiry");
		
		lb5.setOnMouseClicked(e-> {
			//code for balance enquiry
		});
		lb5.setFont(Font.font ("Verdana", 27));
		Label lb6 = new Label("Account information");
		lb6.setOnMouseClicked(e-> {
			//code for account information
		});
		lb6.setFont(Font.font ("Verdana", 27));
		Label lb7 = new Label("Withdrawl information");
		lb7.setFont(Font.font ("Verdana", 27));
		lb7.setOnMouseClicked(e-> {
			//code for withdrawl information
		});
		gp1.getChildren().addAll(lb3,lb4);
		gp1.setSpacing(45);
		gp1.setAlignment(Pos.CENTER);
		gp2.getChildren().addAll(lb5,lb6,lb7);
		gp2.setAlignment(Pos.CENTER);
		gp2.setSpacing(45);
		bds.setLeft(gp1);
		bds.setRight(gp2);
		bds.setBackground(Background.EMPTY);
		bds.setStyle(style);
		sce2 = new Scene(bds,800,600);
		//button for scene1
		Button bt = new Button("Submit");
		GridPane.setConstraints(bt,1,2);
		bt.setOnAction(e-> window.setScene(sce2));
		//Create a label
			Label lb1 = new Label("Account ID");
			GridPane.setConstraints(lb1,0,0);
		//Password label
			Label lb2 = new Label("Password");
			GridPane.setConstraints(lb2, 0, 1);
		//TextField
			TextField tf = new TextField();
			GridPane.setConstraints(tf, 1, 0);
		//password
			TextField tf1 = new TextField();
			tf1.setPromptText("Enter your password");
			GridPane.setConstraints(tf1, 1, 1);
			gp.getChildren().addAll(lb1,lb2,tf,tf1,bt);
			gp.setAlignment(Pos.CENTER);
			Scene sce1 = new Scene(gp,800,600);
			gp.setBackground(Background.EMPTY);
			gp.setStyle(style);
			window.setScene(sce);
			window.show();
			sce.setOnMouseClicked(e -> {
				window.setScene(sce1);
			});
		
	}


}
