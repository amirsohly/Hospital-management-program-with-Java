package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import java.sql.SQLException;

public class ClearPatienr_Controller {

    public Label Lbl_Status;
    @FXML
    private TextField txt_ClearPation_FName;

    @FXML
    private TextField txt_ClearPation_LName;

    @FXML
    private TextField txt_ClearPation_Age;

    @FXML
    private TextField txt_ClearPation_Room;

    @FXML
    private Button btn_ClearPation_Ok;

    @FXML
    private Button btn_ClearPation_Cancel;

    @FXML

    void btn_ClearPation_Cancel_OnAction(ActionEvent event) {

        txt_ClearPation_FName.setText(" ");
        txt_ClearPation_LName.setText(" ");
        txt_ClearPation_Age.setText(" ");
        txt_ClearPation_Room.setText(" ");
        Lbl_Status.setText(" ");

    }
    DatabaseManeger databaseManeger = new DatabaseManeger();

    @FXML
    void btn_ClearPation_Ok_OnAction(ActionEvent event) throws SQLException {


        boolean x =databaseManeger.Found_For_Delete(txt_ClearPation_FName.getText(),txt_ClearPation_LName.getText(),txt_ClearPation_Age.getText(),txt_ClearPation_Room.getText());
        if (x == true) {
            databaseManeger.Delete_Patient(txt_ClearPation_FName.getText(), txt_ClearPation_LName.getText(),txt_ClearPation_Age.getText(),txt_ClearPation_Room.getText());
            Lbl_Status.setText("Patient has been Deleted ... !");
            txt_ClearPation_FName.setText(" ");
            txt_ClearPation_LName.setText(" ");
            txt_ClearPation_Age.setText(" ");
            txt_ClearPation_Room.setText(" ");

        }else
        {
            Lbl_Status.setText("Patient Not Found ... !");
        }

    }

}
