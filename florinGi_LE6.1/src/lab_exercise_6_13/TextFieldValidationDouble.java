package lab_exercise_6_13;

import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.scene.control.TextField;

/**
===========================================================================================
 CLASS NAME	: TextFieldValidation
 DESCRIPTION: A class that implements ChangeListener interface for strings
 AUTHOR		: Gillian E. Florin
 COPYRIGHT	: Created 11/28/2022
 REVISION HISTORY:
 Date:				By:				Description:
===========================================================================================
 */
public class TextFieldValidationDouble implements ChangeListener<String> {
	/* =====================================================================================================
	 * Data fields
	 * Class also inherits the superclass data fields
	 * ====================================================================================================*/
	private final TextField field1;
	
	/* =====================================================================================================
	 * Constructor
	 * DESCRIPTION: sets value to the number data field
	 * ====================================================================================================*/
	TextFieldValidationDouble(TextField fieldInput){
		this.field1=fieldInput;
	}
	
	/* =====================================================================================================
	 * METHOD : changed
	 * DESCRIPTION: overrides the listener for textProperty. Gets called when textProperty gets changed
	 * ====================================================================================================*/
	@Override
	public void changed(ObservableValue<? extends String> observable, String oldValue, String newValue) {
		if (!newValue.matches("\\d*")) {
    		if(newValue.indexOf(".")!=newValue.lastIndexOf(".")) {
    			field1.setText(oldValue);
    			newValue = oldValue;
    		}
    		field1.setText(newValue.replaceAll("[^.0123456789]", ""));
    	}
	}

}
