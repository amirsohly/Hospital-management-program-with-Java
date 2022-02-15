package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import java.sql.SQLException;

public class AddPatient_Controller {

    m ff = new m();


    @FXML
    private TextField txt_AddPatient_FName;

    @FXML
    private TextField txt_AddPatient_LName;

    @FXML
    private TextField txt_AddPatient_Age;

    @FXML
    private TextField txt_AddPatient_General;

    @FXML
    private TextField txt_AddPatient_BedNumber;

    @FXML
    private TextField txt_AddPatient_Room;

    @FXML
    private Button btn_AddPatient_Ok;

    @FXML
    private Button btn_AddPatient_Cancel;

    @FXML
    private TextField txt_AddPatient_Description;

    @FXML
    private Label lbl_AddPatient_status;

    @FXML
    void btn_AddPatient_Cancel_OnAction(ActionEvent event) {
        txt_AddPatient_FName.setText(" ");
        txt_AddPatient_LName.setText(" ");
        txt_AddPatient_Age.setText(" ");
        txt_AddPatient_General.setText(" ");
        txt_AddPatient_BedNumber.setText(" ");
        txt_AddPatient_Room.setText(" ");
        txt_AddPatient_Description.setText(" ");
        lbl_AddPatient_status.setText(" ");
    }

    DatabaseManeger databaseManeger = new DatabaseManeger();
    @FXML
    void btn_AddPatient_Ok_OnAction(ActionEvent event) throws SQLException {

        if(txt_AddPatient_FName.getText().equals(""))
            lbl_AddPatient_status.setText("Error!!!  please Enter FirstName... ");

        else if(txt_AddPatient_LName.getText().equals(""))
                lbl_AddPatient_status.setText("Error!!!  please Enter lastName... ");

        else if(txt_AddPatient_Age.getText().equals(""))
                lbl_AddPatient_status.setText("Error!!  please Enter Age... ");

        else if(txt_AddPatient_General.getText().equals(""))
                 lbl_AddPatient_status.setText("Error!!! please Enter Gender... ");

        else if(txt_AddPatient_BedNumber.getText().equals(""))
                lbl_AddPatient_status.setText("Error!!!  please Enter BedNumber... ");


        else if(txt_AddPatient_Room.getText().equals(""))
                 lbl_AddPatient_status.setText("Error!!!  please Enter Room... ");

        else if(txt_AddPatient_Description.getText().equals(""))
                lbl_AddPatient_status.setText("Error!!!  please Enter Description... ");


        else{
            databaseManeger.Add_Patient(txt_AddPatient_FName.getText(), txt_AddPatient_LName.getText(),
                    txt_AddPatient_Age.getText(),txt_AddPatient_General.getText() ,
                    txt_AddPatient_BedNumber.getText() , txt_AddPatient_Room.getText() ,
                    txt_AddPatient_Description.getText(),ff.getCost(),ff.getNurse(),ff.getDr());
            lbl_AddPatient_status.setText("The patient's data has been successfully saved ");

            txt_AddPatient_FName.setText(" ");
            txt_AddPatient_LName.setText(" ");
            txt_AddPatient_Age.setText(" ");
            txt_AddPatient_General.setText(" ");
            txt_AddPatient_BedNumber.setText(" ");
            txt_AddPatient_Room.setText(" ");
            txt_AddPatient_Description.setText(" ");
        }

    }

}
