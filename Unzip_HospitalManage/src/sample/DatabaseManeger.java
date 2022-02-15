package sample;

import javafx.stage.Stage;

import java.sql.*;

public class DatabaseManeger {

    private Connection connection;

    public void Connection() {
        try {
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/hospitalmanage", "root", "1234");
        } catch (Exception e) {
            System.out.println("Can Not Connect To Database .... !");
        }
    }

    public void Add_Patient(String Fname, String Lname, String Age, String General, String BedNumber, String Room, String Description, String Cost, String Nurse, String Dr) {

        AddPatient_Controller addPatient_controller = new AddPatient_Controller();
        try {
            Connection();
            Statement statement = connection.createStatement();
            statement.execute("INSERT into hospitalmanage.patient (FName, LName, Age, General, BedNumber, Room, Description ,Cost,Nurse,Dr ) " +
                    " value ('" + Fname + "' , '" + Lname + "' ,'" + Age + "','" + General + "' , '" + BedNumber + "' , '" + Room + "' , '" + Description + "' ,'" + Cost + "','" + Nurse + "','" + Dr + "')");
        } catch (Exception e) {

            System.out.println("Can't Add Patient ... !");
        }
    }

    public void Delete_Patient(String Fname, String Lname, String Age, String Room) throws SQLException {
        Connection();
        Statement statement = connection.createStatement();
        statement.executeUpdate(" delete  from hospitalmanage.patient where FName like '" + Fname + "' and LName like '" + Lname + "' and Age like  '" + Age + "' and Room like '" + Room + "' ");

    }

    public boolean Found_For_Delete(String Fname, String Lname, String Age, String Room) throws SQLException {

        Connection();
        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery("select FName,LName,Age,Room FROM hospitalmanage.patient where FName like '" + Fname + "' and LName like '" + Lname + "' and  Age like '" + Age + "' and Room like '" + Room + "'");

        if (resultSet.first()) {
            return true;
        } else {
            return false;
        }

    }

    public String For_Report() {

        m dd = new m();
        String report_data = "";
        dd.setNurse(" maryam ahmadi");
        dd.setDr("abas absi ");
        dd.setCost("10000 ");

        try {
            Connection();
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("select * from hospitalmanage.patient");
            while (resultSet.next()) {
                report_data = report_data + "name : " + resultSet.getString(2) + " " + resultSet.getString(3)
                        + "\nage : " + resultSet.getString(4) + "\nbedNumber : " + resultSet.getString(6) + "\nroom : " + resultSet.getString(7) + "\nnurse : " + dd.getNurse() + "\ndr : " + dd.getDr() + "\ncost : " + dd.getCost() + "\n\n";
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }


        return report_data;
    }


    public void Update_Nurse(String FName, String LName) throws SQLException {

        Connection();
        Statement statement = connection.createStatement();
        statement.executeUpdate("update hospitalmanage.patient set Nurse  where FName like '" + FName + "' AND  LName like '" + LName + "'");

    }


}




