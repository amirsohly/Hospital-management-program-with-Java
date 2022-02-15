package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class PassEditNursrDr_Controller {

    @FXML
    private TextField txt_Change_User;

    @FXML
    private TextField txt_Change_Pass;

    @FXML
    private Label lbl_Change_status;

    @FXML
    void btn_Change_Ok(ActionEvent event) {

        if(txt_Change_User.getText().equals("user") && txt_Change_Pass.getText().equals("333")){

            lbl_Change_status.setText("your login is successfully...");

            try{
                Stage primaryStage = new Stage();
                Parent root2 = FXMLLoader.load(getClass().getResource("Edit_NurseDr.fxml"));
                primaryStage.setScene(new Scene(root2,700,500));
                primaryStage.setTitle("login");
                primaryStage.show();
            }catch (Exception e){
                e.printStackTrace();
            }
        }else{
            lbl_Change_status.setText(" your Password or Username is False !!! ");
        }

    }

    @FXML
    void btn_Change_cancel_OnAction(ActionEvent event) {
        txt_Change_User.setText(" ");
        txt_Change_Pass.setText(" ");
        lbl_Change_status.setText(" ");
    }

}
