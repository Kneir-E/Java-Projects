/*
========================================================
CLASS NAME  :   Main
DESCRIPTION :   a class where a machine dispenses 4 juices
				shows the different juices sold by the machine
				lets customer make a selection and shows the cost of the item
				accepts payment and releases item
AUTHOR      :   Gillian, Florin, Kevin Mepieza, Gwynne Ouano
COPYRIGHT   :   Nov 26 2022
REVISION HISTORY
Date:           By:         Description:
 -				-				-
=========================================================
*/
package application;
	
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.effect.Glow;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.CornerRadii;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Paint;
import javafx.scene.text.Font;
import javafx.scene.transform.Translate;
import javafx.stage.Stage;

public class Main extends Application{

	static CashRegister cashReg = new CashRegister();
	static DispenserType appleJuice = new DispenserType(1,50);
	static DispenserType orangeJuice = new DispenserType();
	static DispenserType mangoLassi = new DispenserType();
	static DispenserType fruitPunch = new DispenserType();
	static DispenserType choiceObj = null;
	
	@Override
	public void start(Stage primaryStage) throws Exception {
		Stage fruitJuiceMachineWindow = primaryStage;
		Scene fruitJuiceMachineScene;
	
/*========================================================
		Top of the GUI
		Declaring TitleHead objects and creating their layout
==========================================================*/
		Label lbl_title = new Label("Fruit Juice Machine");
		lbl_title.setFont(new Font("Impact", 45));
		Image titleHead = new Image(getClass().getResource("/resources/TitleHead.png").toURI().toString());
		ImageView titleHeadView = new ImageView(titleHead);
		StackPane titleFace = new StackPane(titleHeadView, lbl_title);
		
/*========================================================
		Middle part 1 - Instruction
==========================================================*/
		Label lbl_instructionHead = new Label("Instruction:");
		lbl_instructionHead.setFont(new Font("Arial Narrow", 13));
		lbl_instructionHead.setTextFill(Paint.valueOf("FFFFFF"));
		Label lbl_instruction = new Label("Please pick your beverage!");
		lbl_instruction.setFont(new Font("Arial Narrow", 18));
		lbl_instruction.setTextFill(Paint.valueOf("FFFFFF"));
		
/*========================================================
		Middle part 3 - Some of these are controlled by part 2
		so this part is written first
==========================================================*/
		Label lbl_choice = new Label("Current choice: ");
		lbl_choice.setTextFill(Paint.valueOf("FFFFFF"));
		Label lbl_choiceVal = new Label("");
		lbl_choiceVal.setTextFill(Paint.valueOf("FFFFFF"));
		Label lbl_stock = new Label("Stock: ");
		lbl_stock.setTextFill(Paint.valueOf("FFFFFF"));
		
/*========================================================
		Middle part 2 - faux buttons
		Declaring images and using them as the buttons for user's selection
==========================================================*/
		Glow glow = new Glow();
		Image iconAJ = new Image(getClass().getResource("/resources/buttAJ.png").toURI().toString());
		ImageView buttAJ = new ImageView(iconAJ);
		buttAJ.setOnMouseEntered(e->{buttAJ.setEffect(glow);});
		buttAJ.setOnMouseExited(e->{buttAJ.setEffect(null);});
		
		Image iconOJ = new Image(getClass().getResource("/resources/buttOJ.png").toURI().toString());
		ImageView buttOJ = new ImageView(iconOJ);
		buttOJ.setOnMouseEntered(e->{buttOJ.setEffect(glow);});
		buttOJ.setOnMouseExited(e->{buttOJ.setEffect(null);});
		
		Image iconML = new Image(getClass().getResource("/resources/buttML.png").toURI().toString());
		ImageView buttML = new ImageView(iconML);
		buttML.setOnMouseEntered(e->{buttML.setEffect(glow);});
		buttML.setOnMouseExited(e->{buttML.setEffect(null);});
		
		Image iconFP = new Image(getClass().getResource("/resources/buttFP.png").toURI().toString());
		ImageView buttFP = new ImageView(iconFP);
		buttFP.setOnMouseEntered(e->{buttFP.setEffect(glow);});
		buttFP.setOnMouseExited(e->{buttFP.setEffect(null);});
				
		buttAJ.setOnMouseClicked(e->{
			choiceObj = appleJuice;
			lbl_choiceVal.setText("Apple Juice");
			lbl_stock.setText("Stock: "+appleJuice.getNoOfItems());
			lbl_instruction.setText("Please proceed to payment");});
		buttOJ.setOnMouseClicked(e->{
			choiceObj = orangeJuice;
			lbl_choiceVal.setText("Orange Juice");
			lbl_stock.setText("Stock: "+orangeJuice.getNoOfItems());
			lbl_instruction.setText("Please proceed to payment");});
		buttML.setOnMouseClicked(e->{
			choiceObj = mangoLassi;
			lbl_choiceVal.setText("Mango Lassi");
			lbl_stock.setText("Stock: "+mangoLassi.getNoOfItems());
			lbl_instruction.setText("Please proceed to payment");});
		buttFP.setOnMouseClicked(e->{
			choiceObj = fruitPunch;
			lbl_choiceVal.setText("Fruit Punch");
			lbl_stock.setText("Stock: "+fruitPunch.getNoOfItems());
			lbl_instruction.setText("Please proceed to payment");});

		HBox h_button_Layout = new HBox(buttAJ, buttOJ, buttML, buttFP);
		h_button_Layout.setSpacing(10);
		h_button_Layout.setAlignment(Pos.CENTER);

/*========================================================
		Bottom Part of the GUI
		The Dispenser part and the cup that is released by the machine
		This is controlled by Middle part 4
==========================================================*/		
		Image DispenserImg = new Image(getClass().getResource("/resources/Dispenser.png").toURI().toString());
		ImageView Dispenser = new ImageView(DispenserImg);
		Image cupImg = new Image(getClass().getResource("/resources/cup.png").toURI().toString());
		ImageView cup = new ImageView(cupImg);
		cup.setVisible(false);
		cup.setFitHeight(140);
		cup.setPreserveRatio(true);
		cup.setOnMouseEntered(e->{cup.setEffect(glow);});
		cup.setOnMouseExited(e->{cup.setEffect(null);});
		cup.setOnMouseClicked(e->{
			choiceObj = null;
			cup.setVisible(false);
			lbl_instruction.setText("Please pick your beverage!");
			lbl_choiceVal.setText("");
			lbl_stock.setText("Stock: ");
		});
		StackPane DispenserArea = new StackPane(Dispenser, cup);
		Translate translate = new Translate();
		translate.setY(+20);
		cup.getTransforms().add(translate);

/*========================================================
		Middle part 4
		This part makes sure that all other parts are done before
		Proceeding to payment Screen
		checks:
			if dispenser has no unclaimed cups
			if stock of chosen item is 0
			if there has been no chosen beverage
==========================================================*/
		Button proceedToPay = new Button("Proceed to Payment");
		proceedToPay.setOnAction(e->{
			if(cup.isVisible()) {
				lbl_instruction.setText("Please take previous cup first");
			}else if(lbl_choiceVal.getText()=="") {
				System.out.println("User hasn't picked beverage yet");
				lbl_instruction.setText("Please pick beverage first!");
			}else if(choiceObj.getNoOfItems()==0) {
				lbl_instruction.setText("No stock. Pick different drink."); 
			}else{
				//calls PaymentScreen window and checks whether the sale was successful or cancelled
				boolean successfulSell = PaymentScreen.sellProduct(lbl_choiceVal.getText(),choiceObj,cashReg);
				if(successfulSell) {
					cup.setVisible(true);
					lbl_instruction.setText("Claim your beverage");
					System.out.println("Successfully sold product");
				}else {
					choiceObj=null;
					System.out.println("Cancelled transaction.");
					lbl_instruction.setText("Please pick your beverage!");
					lbl_choiceVal.setText("");
					lbl_stock.setText("Stock: ");
				}
			}
		});
		
/*========================================================
		Full layout of Dispenser.
		Includes top (titleFace) par, all middle parts, and the bottom (dispenser) part
==========================================================*/
		VBox vLayout1 = new VBox(titleFace,lbl_instructionHead,lbl_instruction, h_button_Layout, lbl_choice,lbl_choiceVal, lbl_stock, proceedToPay, DispenserArea);
		vLayout1.setSpacing(15);
		vLayout1.setAlignment(Pos.CENTER);
		BackgroundFill bgfill = new BackgroundFill(Paint.valueOf("2f4858"), CornerRadii.EMPTY, Insets.EMPTY);
		Background bg = new Background(bgfill);
		vLayout1.setBackground(bg);
		fruitJuiceMachineScene = new Scene(vLayout1, 420, 670);
		
		fruitJuiceMachineWindow.setMinHeight(670);
		fruitJuiceMachineWindow.setMinWidth(420);
		fruitJuiceMachineWindow.setTitle("Fruit Juice Machine");
		fruitJuiceMachineWindow.setScene(fruitJuiceMachineScene);
		fruitJuiceMachineWindow.show();
	}
	

	public static void main(String[] args) {
		launch(args);
	}
	
}