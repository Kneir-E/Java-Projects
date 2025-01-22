/*
========================================================
CLASS NAME  :   PaymentScreen.java
DESCRIPTION :   a class where a new gui window will show to inform user of purchase
AUTHOR      :   Gillian, Florin, Kevin Mepieza, Gwynne Ouano
COPYRIGHT   :   Nov 26 2022
REVISION HISTORY
Date:           By:         Description:
 -				-				-
=========================================================
*/
package application;

import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Modality;
import javafx.stage.Stage;

public class PaymentScreen {
	static Boolean successfulSale = null;
	
	public static boolean sellProduct(String choice, DispenserType choiceObj, CashRegister cashReg) {
		Stage paymentWindow = new Stage();
		
/*========================================================
		Scene 2 (output) This scene changes window 2 to inform the user:
			the inputed cash was too big	- if there is not enough cash on hand for change
		  	the inputed cash was too small	- if it is smaller than the cost
			the change						- if input was good
===========================================================*/
		Button output_CloseWindowButton = new Button("Close");
		output_CloseWindowButton.setOnAction(e-> paymentWindow.close());
		Label outputMessage = new Label("");
		VBox outputLayout = new VBox(outputMessage, output_CloseWindowButton);
		outputLayout.setAlignment(Pos.CENTER);
		Scene outputScene = new Scene(outputLayout, 300, 150);
		
/*========================================================
		Scene 1 (Payment Scene)
		Payment screen window starts with this scene
		This scene accepts input and calls scene2 (output Scene) depending on the user's input
===========================================================*/
		Scene paymentScene;
		System.out.println("User picked: " + choice + "\tCost: " + choiceObj.getCost() );
		
		Label paymentScreenMessage1 = new Label("You picked: " + choice + "\tCost: " + choiceObj.getCost() );
		Label paymentScreenMessage2 = new Label("Cash on hand is : "	+ cashReg.getCurrentBalance());
		Label paymentScreenMessage3 = new Label("Cash won't be accepted if it's not enough or \nif there is not enough for change");
		Label paymentScreenMessage4 = new Label("Please input your cash below");
		TextField inputPayment = new TextField();
		
/*========================================================
		This is a listener that prevents input of characters that are not digits or '.'
		It also prevents input of more than one '.'
==========================================================*/
		inputPayment.textProperty().addListener(new ChangeListener<String>() {
		    @Override
		    public void changed(ObservableValue<? extends String> observable, String oldValue, 
		        String newValue) {
		    	if (!newValue.matches("\\d*")) {
		    		if(newValue.indexOf(".")!=newValue.lastIndexOf(".")) {
		    			inputPayment.setText(oldValue);
		    			newValue = oldValue;
		    		}
		    		inputPayment.setText(newValue.replaceAll("[^.0123456789]", ""));
		    	}
		    }
		});
		
		Button paymentButton = new Button("Pay now");
		
		paymentButton.setOnAction(e -> {
			if(inputPayment.getText()=="") {
				outputMessage.setText("Please input money");
				successfulSale=false;
			}else {
				double input = Double.parseDouble(inputPayment.getText());
				if (input<choiceObj.getCost()) {
					outputMessage.setText("Not enough money!");
					successfulSale=false;
				}else if(input-choiceObj.getCost()>cashReg.getCurrentBalance()) {
					outputMessage.setText("Cash is too big to return change.");
					successfulSale=false;
				}else{
					outputMessage.setText("Here is your change: " + cashReg.acceptAmount(input, choiceObj.getCost()));
					choiceObj.makeSale();
					successfulSale=true;
				}
			}
			paymentWindow.setScene(outputScene);
		});
		
		
		VBox paymentScreenLayout1 = new VBox(
				paymentScreenMessage1,
				paymentScreenMessage2,
				paymentScreenMessage3,
				paymentScreenMessage4,
				inputPayment,
				paymentButton);
		paymentScreenLayout1.setAlignment(Pos.CENTER);
		paymentScene = new Scene(paymentScreenLayout1, 300,150);
		paymentWindow.setScene(paymentScene);
		paymentWindow.setOnCloseRequest(e->{
			successfulSale=false;
		});
		paymentWindow.initModality(Modality.APPLICATION_MODAL);
		paymentWindow.showAndWait();
		return successfulSale.booleanValue();
	}
}
