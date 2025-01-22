package lab_exercise_6_13;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.collections.FXCollections;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Modality;
import javafx.stage.Stage;

/**
===========================================================================================
 CLASS NAME	: Cake_u_lator
 DESCRIPTION: A class that tests the cake class and its inheritors.
 AUTHOR		: Gillian E. Florin
 COPYRIGHT	: Created 11/28/2022
 REVISION HISTORY:
 Date:				By:				Description:
===========================================================================================
 */
public class Cake_u_lator extends Application{
	int arrSize;
	static int i=0;
	static int highestPriceIndex;
	static int totalPrice=0;
	static Cake[] cakeArray;
	static boolean val;
	TextFieldValidation validation;
	TextFieldValidationDouble validationD;
	
	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage arg0) throws Exception {
		// TODO Auto-generated method stub
		String[] orderOrReady = {"Order", "Readymade"};
		Stage window = new Stage();
		VBox vLayout = new VBox();
		Label introLabel = new Label("Welcome to the Cakery");
		introLabel.setStyle("-fx-font: 24 Impact;");
		Label introLabel2 = new Label("How many cake do you want to  buy?");
		TextField introTField = new TextField();
		introTField.setText("20");
		introTField.textProperty().addListener(new TextFieldValidation(introTField));
		introTField.setMaxWidth(200);
		Button butt = new Button("OK");
		butt.setOnAction(e->{
			arrSize = Integer.parseInt(introTField.getText());
			window.close();
			});
		vLayout.setAlignment(Pos.CENTER);
		vLayout.setSpacing(15);
		vLayout.getChildren().addAll(introLabel,introLabel2,introTField,butt);
		Scene intro = new Scene(vLayout,250,200);
		
		window.setOnCloseRequest(e->{
			if(confirmExit()) {
				window.close();
				Platform.exit();
				i=99999;
			}else {	e.consume();}
		});
		
		window.setScene(intro);
		window.setTitle("How many?");
		window.showAndWait();
		
		cakeArray = new Cake[arrSize];
		
		Label lbl = new Label("Input details please: ");
		Label lblType = new Label("Order or Readymade? ");
		Label lblName = new Label("Name: ");
		Label lblRate = new Label("Rate: ");
		Label lblWt_Qtty = new Label("Weight: ");
		
		TextField fieldName = new TextField("");
		TextField fieldRate = new TextField("");
		fieldRate.textProperty().addListener(new TextFieldValidation(fieldRate));
		TextField fieldWeight_Qtty = new TextField("");
		
		Button butt2 = new Button("Okay");
		
		VBox vLayoutRight = new VBox(lblName,fieldName,lblRate,fieldRate,lblWt_Qtty,fieldWeight_Qtty);
		
		
		validation = new TextFieldValidation(fieldWeight_Qtty);
		validationD = new TextFieldValidationDouble(fieldWeight_Qtty);
		ComboBox<String> choice = new ComboBox<String>(FXCollections.observableArrayList(orderOrReady));
		choice.setValue("Order");
		choice.setOnAction(e->{
			if(choice.getValue()=="Readymade") {
				lblWt_Qtty.setText("Quantity: ");
				fieldWeight_Qtty.textProperty().removeListener(validationD);
				
				fieldWeight_Qtty.textProperty().addListener(validation);
			}else {
				lblWt_Qtty.setText("Weight: ");
				fieldWeight_Qtty.textProperty().removeListener(validation);
				fieldWeight_Qtty.textProperty().addListener(validationD);
			}
		});
		
		VBox vLayoutLeft = new VBox(lblType,choice);
		vLayoutLeft.setAlignment(Pos.CENTER);
		
		HBox hLayoutInner = new HBox(vLayoutLeft,vLayoutRight);
		hLayoutInner.setAlignment(Pos.CENTER);
		
		VBox vLayoutInnerFull = new VBox(lbl,hLayoutInner,butt2);
		vLayoutInnerFull.setAlignment(Pos.CENTER);
		Scene scene = new Scene(vLayoutInnerFull,300,300);
		window.setScene(scene);
		window.setTitle("Input cake details");
		
		//this is for posting result
		Label[] lblNameRes = new Label[arrSize];
		Label[] lblRateRes= new Label[arrSize];
		Label[] lblWt_QttyRes = new Label[arrSize];	
		
		while(i<arrSize) {
			lbl.setText("Input details for cake no. "+ (i+1)+" please: ");
			butt2.setOnAction(e->{
				//if empty set label to msg
				if(!(fieldName.getText()!= "" && fieldRate.getText()!="" && fieldWeight_Qtty.getText()!="")) 
					lbl.setText("Please don't leave any fields empty");
				else if(choice.getValue()=="Readymade") {
					cakeArray[i] = new ReadymadeCake(
							fieldName.getText(),
							Double.parseDouble(fieldRate.getText()),
							Integer.parseInt(fieldWeight_Qtty.getText()));
					lblNameRes[i] = new Label("Name: " +fieldName.getText());
					lblRateRes[i] = new Label("Rate: "+fieldRate.getText());
					lblWt_QttyRes[i] = new Label("Quantity: " +fieldWeight_Qtty.getText());
					fieldName.setText("");
					fieldRate.setText("");
					fieldWeight_Qtty.setText("");
					if(cakeArray[i].calcPrice()>cakeArray[highestPriceIndex].calcPrice())
						highestPriceIndex=i;
					totalPrice+=cakeArray[i].calcPrice();
					i++;
					window.close();
				}else if(choice.getValue()=="Order") {
					cakeArray[i] = new OrderCake(
							fieldName.getText(),
							Double.parseDouble(fieldRate.getText()),
							Double.parseDouble(fieldWeight_Qtty.getText()));
					lblNameRes[i] = new Label("Name: " +fieldName.getText());
					lblRateRes[i] = new Label("Rate: " +fieldRate.getText());
					lblWt_QttyRes[i] = new Label("Weight: " +fieldWeight_Qtty.getText());
					fieldName.setText("");
					fieldRate.setText("");
					fieldWeight_Qtty.setText("");
					if(cakeArray[i].calcPrice()>cakeArray[highestPriceIndex].calcPrice())
						highestPriceIndex=i;
					totalPrice+=cakeArray[i].calcPrice();
					i++;
					window.close();
				}else {
					System.out.println("Error?? how did it even reach this");
				}
			});
			if(!window.isShowing()) window.showAndWait();
		}
		
		if(!val) {
			postResults(arrSize, lblNameRes, lblRateRes,lblWt_QttyRes);
		}
	}
	
	public static void postResults(int arrSize, Label[] lblName, Label[] lblRate, Label[] lblWt_Qtty) {
		Stage newWindow = new Stage();
		FlowPane fLayout = new FlowPane();
		VBox[] cakeDetailsNode = new VBox[arrSize];
		Label[] price = new Label[20];
		i=0;
		
		String cssLayout = "-fx-border-color: black;\n" +
                "-fx-border-insets: 5;\n" +
                "-fx-border-width: 3;\n";
		
		while(i<arrSize) {
			Label lblHead = new Label("Cake no. "+(i+1));
			price[i] = new Label("Total Price:" + cakeArray[i].calcPrice());
			cakeDetailsNode[i] = new VBox(lblHead,lblName[i],lblRate[i],lblWt_Qtty[i],price[i]);
			cakeDetailsNode[i].setAlignment(Pos.CENTER_LEFT);
			cakeDetailsNode[i].setStyle(cssLayout);
			fLayout.getChildren().add(cakeDetailsNode[i]);
			i++;
		}
		
		Label msgHead = new Label("Summary of what you bought");
		msgHead.setStyle("-fx-font: 24 Impact;");
		//flowpane
		Label msgTotal = new Label("The total price is : " + totalPrice);
		msgTotal.setStyle("-fx-font: 20 arial;");
		Label msgMostExpensive = new Label("The most expensive cake was: ");
		Label lblHead  = new Label("Cake no. " + highestPriceIndex);
		
		VBox mostExpensiveNode = new VBox(
				lblHead,
				new Label(lblName[highestPriceIndex].getText()), 
				new Label(lblRate[highestPriceIndex].getText()),
				new Label(lblWt_Qtty[highestPriceIndex].getText()),
				new Label(price[highestPriceIndex].getText()));
		mostExpensiveNode.setAlignment(Pos.CENTER);
		
		VBox vLayoutResult = new VBox(msgHead,fLayout,
				msgTotal,msgMostExpensive,
				mostExpensiveNode);
		vLayoutResult.setAlignment(Pos.CENTER);
		vLayoutResult.setSpacing(20);
		
		Scene resultScene = new Scene(vLayoutResult, 300, 700);
		newWindow.setScene(resultScene);
		newWindow.show();
	}
	
	public static boolean confirmExit() {
		val=false;
		Stage window3 = new Stage();
		window3.initModality(Modality.APPLICATION_MODAL);
		window3.setOnCloseRequest(e-> val =true);
		window3.setTitle("Confirm Exit?");
		Label label = new Label("Are You sure you want to exit?");
		Button butt1 = new Button("Yes");
		Button butt2 = new Button("No");
		butt1.setOnAction(f-> {
			val = true;
			window3.close();
		});
		butt2.setOnAction(f-> {
			val = false;
			window3.close();
		});
		HBox hLayout = new HBox(butt1,butt2);
		hLayout.setAlignment(Pos.CENTER);
		VBox vLayout = new VBox(label,hLayout);
		vLayout.setAlignment(Pos.CENTER);
		Scene scene = new Scene(vLayout,300,100);
		window3.setScene(scene);
		window3.showAndWait();
		return val;
	}
}
