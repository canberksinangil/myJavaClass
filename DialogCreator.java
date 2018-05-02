/**
 * Created by Canberk Sinangil.
 */

package sample.Controllers;

import javafx.scene.control.Alert;


public class DialogCreator {


    public DialogCreator() {
    }

    public void createDialog(String dialogType, String title, String headerText, String contentText){

        Alert myAlert;

        if (dialogType.equalsIgnoreCase("information") || dialogType.equalsIgnoreCase("i") ){
            myAlert = new Alert(Alert.AlertType.INFORMATION);
        } else if (dialogType.equalsIgnoreCase("warning") || dialogType.equalsIgnoreCase("w") ){
            myAlert = new Alert(Alert.AlertType.WARNING);
        } else if (dialogType.equalsIgnoreCase("confirmation") || dialogType.equalsIgnoreCase("c")){
            myAlert = new Alert(Alert.AlertType.CONFIRMATION);
        } else if (dialogType.equalsIgnoreCase("error") || dialogType.equalsIgnoreCase("e")) {
            myAlert = new Alert(Alert.AlertType.ERROR);
        }else {
            myAlert = new Alert(Alert.AlertType.WARNING);
            myAlert.setHeaderText("Dialog defined wrong!");
            myAlert.setContentText("For information dialog you can use \"information\" or \"i\"" + System.lineSeparator() +
                                    "For warning dialog you can use \"warning\" or \"w\"" + System.lineSeparator() +
                                    "For confirmation dialog you can use \"confirmation\" or \"c\"" + System.lineSeparator() +
                                    "For error dialog you can use \"error\" or \"e\"" + System.lineSeparator() +
                                    "Example expression " +
                                    "objectName.createDialog(\"dialogType\", \"title\" or null, \"header text\" or null, \"content text\" or null");
        }

        if (title != null){
            myAlert.setTitle(title);
        }

        if (headerText != null){
            myAlert.setHeaderText(headerText);
        }

        if (contentText != null){
            myAlert.setContentText(contentText);
        }

        myAlert.showAndWait();

    }

}

