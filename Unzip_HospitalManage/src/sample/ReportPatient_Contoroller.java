package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;

public class ReportPatient_Contoroller {

    @FXML
    private TextArea txt_ReportPatient_Report;

    @FXML
    private Button btn_ReportPatient_Report;


    DatabaseManeger databaseManeger = new DatabaseManeger();
    @FXML
    void btn_ReportPatient_Report_OnAction(ActionEvent event) {

       txt_ReportPatient_Report.setText(databaseManeger.For_Report());

    }

}
