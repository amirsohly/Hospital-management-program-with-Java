package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import java.sql.SQLException;

public class Edit_NurseDr_Conrtoller {

    @FXML
    private TextField txt_EditNurseDr_FName;

    @FXML
    private TextField txt_EditNurseDr_LName;

    @FXML
    private TextField txt_EditNurseDr_NurseName;

    @FXML
    private TextField txt_EditNurseDr_DrName;

    @FXML
    private Label lbl_EditNurseDr_status;

    DatabaseManeger databaseManeger = new DatabaseManeger();

    @FXML
    void btn_EditNurseDr_Dr_onAction(ActionEvent event) {

    }

    @FXML
    void btn_EditNurseDr_Nurse_OnAction(ActionEvent event) throws SQLException {
        databaseManeger.Update_Nurse(txt_EditNurseDr_FName.getText(),txt_EditNurseDr_LName.getText());
    }

    @FXML
    void btn_EditNurseDr_cancel_OnAction(ActionEvent event) {

        txt_EditNurseDr_FName.setText(" ");
        txt_EditNurseDr_LName.setText(" ");
        txt_EditNurseDr_DrName.setText(" ");
        txt_EditNurseDr_NurseName.setText(" ");
        lbl_EditNurseDr_status.setText(" ");

    }

}
