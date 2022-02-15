package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class Menu_Controller {


    @FXML
    void btn_menu_AddPatient_OnAction(ActionEvent event) {

        try {
            Stage primaryStage = new Stage();
            Parent root = FXMLLoader.load(getClass().getResource("AddPatient.fxml"));
            primaryStage.setScene(new Scene(root, 700, 500));
            primaryStage.setTitle("AddPatient");
            primaryStage.show();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    @FXML
    void btn_menu_ClearPatient_OnAction(ActionEvent event) {

        try {
            Stage primaryStage = new Stage();
            Parent root1 = FXMLLoader.load(getClass().getResource("ClearPatient.fxml"));
            primaryStage.setScene(new Scene(root1, 700, 500));
            primaryStage.setTitle("ClearPatient");
            primaryStage.show();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    @FXML
    void btn_menu_ReportdPatient_OnAction(ActionEvent event) {

        try {
            Stage primaryStage = new Stage();
            Parent root2 = FXMLLoader.load(getClass().getResource("ReportPatient.fxml"));
            primaryStage.setScene(new Scene(root2, 700, 500));
            primaryStage.setTitle("ClearPatient");
            primaryStage.show();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }


    public void btn_menu_EditNursrDr_OnAction(ActionEvent actionEvent) {

        try {
            Stage primaryStage = new Stage();
            Parent root2 = FXMLLoader.load(getClass().getResource("PassEdit_NurseDr.fxml"));
            primaryStage.setScene(new Scene(root2, 400, 200));
            primaryStage.setTitle("login");
            primaryStage.show();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
