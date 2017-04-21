/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ebankingEmployee;

//import static e_bankingsystem.Signup.empName;
//import static e_bankingsystem.Signup.password;
//import static e_bankingsystem.Signup.position;
//import static e_bankingsystem.Signup.userName;
//import EBanking_ws.DBClass;
import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.swing.JOptionPane;

/**
 *
 * @author DELL
 */
public class Controller {

    public static void main(String[] args) {

//         /* Set the Nimbus look and feel */
//        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
//        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
//         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
//         */
//        try {
//            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//                if ("Nimbus".equals(info.getName())) {
//                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                    break;
//                }
//            }
//        } catch (ClassNotFoundException ex) {
//            java.util.logging.Logger.getLogger(TestFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(TestFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(TestFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(TestFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        
//        
//        Controller controller=new Controller();
//        WelcomePage welcome=new WelcomePage(controller);
//        welcome.setVisible(true);
    }

    /**
     * Method to validates form
     *
     * @param username
     * @param password
     * @return
     */
    public static boolean validateForm(String username, String password) throws Exception {

        //connection
        Connection con = getConnection();
        //execute sql query
        PreparedStatement pst = con.prepareStatement("Select username, password from employee where username=? and password=?");
        pst.setString(1, username);
        pst.setString(2, password);
        ResultSet rs = pst.executeQuery();
        if (rs.next()) {
            return true;
        } else {
            throw new Exception("Incorrect Login");
            // return false;
        }

    }

    /**
     *
     * METHOD TO ADD EMPLOYEE
     *
     * @param empName
     * @param position
     * @param username
     * @param password
     */
    public static void addEmployee(String empName, String position, String username, String password) {
        //sql query to insert data into the table
        String query = "insert into employee (name,position,username,password) values ('" + empName + "','" + position + "','" + username + "','" + password + "')";

        try {
            //make connection
            Connection c = getConnection();
            Statement stmt = c.createStatement();
            stmt.executeUpdate(query);
            JOptionPane.showMessageDialog(null, "Saved");

        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    /**
     * VALIDATE SIGNUP CONTENTS
     *
     * @param empName
     * @param position
     * @param username
     * @param password
     * @return
     */
    public static boolean validateSignupContents(String empName, String position, String username, String password) throws Exception {
        if (empName.isEmpty() == true || position.isEmpty() == true || username.isEmpty() == true || password.isEmpty() == true) {
            throw new Exception("Empty Fields detected !! Please fill all Fields");

        } else {
            return true;
        }

    }

    /**
     * VALIDATES USER NAME CHECK WHETHER THE USERNAME IS ALREADY EXISTING OR NOT
     *
     * @param username
     * @return
     * @throws java.lang.Exception
     */
    public static boolean validateUsername(String username) throws Exception {

        //connection
        Connection con = getConnection();
        //execute sql query
        PreparedStatement pst = con.prepareStatement("Select username from employee where username='" + username + "'");

        ResultSet rs = pst.executeQuery();
        if (rs.next()) {
            throw new Exception("user name is already existing!!! please try another");

        } else {
            return true;
        }

    }

    /**
     * METHOD TO UPDATE EMPLOYEE'S DETAILS
     *
     * @param empName
     * @param position
     * @param username
     * @param password
     * @param selectedEmpName
     */
    public static void updateEmployee(String empName, String position, String username, String password) {

        //Query to update selected employee's details
        String query = "Update employee set name='" + empName + "'" + ",position='" + position + "'" + ",username='" + username + "'" + ",password='" + password + "'" + "where username='" + username + "'";

        try {
            //make connection
            Connection c = getConnection();
            Statement stmt = c.createStatement();
            stmt.executeUpdate(query);
            JOptionPane.showMessageDialog(null, "Updated");

        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    /**
     * DELEETE SELECTED EMPLOYEE
     *
     * @param username
     * @param password
     */
    public static void deleteEmployee(String username, String password) {
        String query = "delete from employee where username='" + username + "'" + "&& password='" + password + "'";
        try {
            //make connection
            Connection c = getConnection();
            Statement stmt = c.createStatement();
            stmt.executeUpdate(query);
            JOptionPane.showMessageDialog(null, "Deleted");

        } catch (Exception e) {
            e.printStackTrace();
        }

    }
//
//    /**
//     * METHOD TO ADD CUSTOMER
//     *
//     * @param cusName
//     * @param birthdate
//     * @param address
//     * @param mobileNo
//     * @param email
//     * @param accType
//     * @param accNumber
//     * @param sortCode
//     * @param balance
//     * @param card
//     */
//    public static void addCustomer(String cusName, String birthdate, String address, String mobileNo, String email, String accType, String accNumber, String sortCode, double balance, String card) {
//        //sql query to insert data into the table
//        String query = "insert into customer (cusName,birthdate,address,mobile,email,accountType,accountNumber,sortCode,balance,card) values ('" + cusName + "','" + birthdate + "','" + address + "','" + mobileNo + "','" + email + "','" + accType + "','" + accNumber + "','" + sortCode + "','" + balance + "','" + card + "')";
//
//        try {
//            //make connection
//            Connection c = getConnection();
//            Statement stmt = c.createStatement();
//            stmt.executeUpdate(query);
//            JOptionPane.showMessageDialog(null, "Saved");
//
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//
//    }
//
//    /**
//     * Validate date format Date format is (yyyy-MM-dd)
//     *
//     * @param date
//     * @return
//     */
//    public static boolean validateDate(String date) throws Exception {
//        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
//        try {
//            sdf.parse(date);
//            return true;
//
//        } catch (ParseException ex) {
//            throw new Exception("Please check date format!!! The format must be YYYY-MM-DD");
//
//        }
//    }
//
//    /**
//     * Method to enforce user to fill all the mandatory fields ALL THE FIRLDS
//     * ARE MANDATORY OTHER THAN CARD NO
//     *
//     * @param cusName
//     * @param birthdate
//     * @param address
//     * @param mobileNo
//     * @param email
//     * @param accountType
//     * @param accountNumber
//     * @param Sortcode
//     * @param balance
//     * @param card
//     * @return
//     */
//    public static boolean validateFormContents(String cusName, String birthdate, String address, String mobileNo, String email, String accountType, String accountNumber, String Sortcode, String card) throws Exception {
//        if (cusName.isEmpty() == true || birthdate.isEmpty() == true || address.isEmpty() == true || mobileNo.isEmpty() == true || email.isEmpty() == true || accountType.isEmpty() == true || accountNumber.isEmpty() == true || Sortcode.isEmpty() == true) {
//            throw new Exception("Please fill all the mandatory fields");
//
//        } else {
//            return true;
//        }
//
//    }
//
//    /**
//     *
//     * @param strNumber
//     * @return
//     */
//    public static double parseDouble(String strNumber) {
//        if (strNumber == null && strNumber.length() <= 0) {
//            return 1;
//
//        } else {
//            return 0;
//        }
//    }
//
//    /**
//     * VALIDATE ACCOUNT NUMBER WHETHER IT IS EXISTING OR NOT
//     *
//     * @param accountNumber
//     * @param cusName
//     * @return
//     */
//    public static boolean validateCustomer(String accountNumber, String cusName) throws Exception {
//        //try {
//        //connection
//        Connection con = getConnection();
//        //execute sql query
//        PreparedStatement pst = con.prepareStatement("Select cusName from customer where accountNumber='" + accountNumber + "'");
//
//        ResultSet rs = pst.executeQuery();
//        if (rs.next()) {
//            // cusName=(rs.getString("cusName"));
//            return true;
//        } else {
//            throw new Exception("Account Number does not existing.Plz check");
//            //JOptionPane.showMessageDialog(null, "Account Number does not existing.Plz check", "ERROR", JOptionPane.ERROR_MESSAGE);
//        }
//
//    }
//    
//    
//    /**
//     * VALIDATES USER NAME CHECK WHETHER THE USERNAME IS ALREADY EXISTING OR NOT
//     *
//     * @param username
//     * @return
//     * @throws java.lang.Exception
//     */
//    public static boolean validateAccountNo(String accNumber) throws Exception {
//
//        //connection
//        Connection con = getConnection();
//        //execute sql query
//        PreparedStatement pst = con.prepareStatement("Select accountNumber from customer where accountNumber='" + accNumber + "'");
//
//        ResultSet rs = pst.executeQuery();
//        if (rs.next()) {
//            throw new Exception("AccountNumber is already existing!!! please try another");
//            
//        } else {
//            return true;
//        }
//
//    }
//
//    /**
//     * Method to check whether account number field is filled or not
//     *
//     * @param accountNumber
//     * @return
//     */
//    public static boolean checkAccountNumberField(String accountNumber) throws Exception {
//        if (accountNumber.isEmpty() == true) {
//            throw new Exception("Please fill account number field");
//            // JOptionPane.showMessageDialog(null, "Please fill account number field", "ERROR", JOptionPane.ERROR_MESSAGE);
//            // return false;
//        } else {
//            return true;
//        }
//    }
//
//    /**
//     * UPDATE CUSTOMER DETAILS
//     *
//     * @param cusName
//     * @param birthdate
//     * @param address
//     * @param mobile
//     * @param email
//     * @param accType
//     * @param accNumber
//     * @param sortCode
//     * @param balance
//     * @param card
//     */
//    public static void updateCustomerDetails(String cusName, String birthdate, String address, String mobile, String email, String accType, String accNumber, String sortCode, double balance, String card) {
//
//        //Query to update selected employee's details
//        String query = "Update customer set cusName='" + cusName + "'" + ",birthdate='" + birthdate + "'" + ",address='" + address + "'" + ",mobile='" + mobile + "'" + ",email='" + email + "'" + ",accountType='" + accType + "'" + ",sortCode='" + sortCode + "'" + ",balance='" + balance + "'" + ",card='" + card + "'"
//                + "where accountNumber='" + accNumber + "'";
//
//        try {
//            //make connection
//            Connection c = getConnection();
//            Statement stmt = c.createStatement();
//            stmt.executeUpdate(query);
//            JOptionPane.showMessageDialog(null, "Updated");
//
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//
//    }
//
//    /**
//     * Delete customer
//     *
//     * @param accNumber
//     */
//    public static void deleteCustomer(String accNumber) {
//        String query = "delete from customer where accountNumber='" + accNumber + "'";
//        try {
//            //make connection
//            Connection c = getConnection();
//            Statement stmt = c.createStatement();
//            stmt.executeUpdate(query);
//            JOptionPane.showMessageDialog(null, "Deleted");
//
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//
//    }
    
    /**
     * To retrieve all registered Employee's list
     * @return
     * @throws SQLException 
     */
    public static ArrayList<String> getEmployeeList() throws SQLException {
        ArrayList<String> employee = new ArrayList<String>();
        Connection c;
        try {
            c = getConnection();
        } catch (Exception ex) {
            return null;
        }
        //SQL query to select data
        String query = "select name,position from employee";

        Statement stmnt = c.createStatement();
        ResultSet rs;
        rs = stmnt.executeQuery(query);
        while (rs.next()) {
            employee.add("\t"+rs.getString("name") + "\t" +"\t"+"\t"+"\t"+"\t"+ rs.getString("position"));
//                employee.add(0, rs.getString("name")); 
//                employee.add(1, rs.getString("position"));
            //employee.addAll(0, rs.getString("name"),rs.getString("position"));
        }
        return employee;
    }
    
    
//    /**
//     * To retrieve all the registered customer list
//     * @return
//     * @throws SQLException 
//     */
//    public static ArrayList<String> getCustomerList() throws SQLException {
//        ArrayList<String> customer = new ArrayList<String>();
//        //execute connection
//        Connection c;
//        try {
//            c = getConnection();
//        } catch (Exception ex) {
//           return null;
//        }
//        //SQL query to select data
//        String query = "select cusName,accountNumber from customer";
//
//        Statement stmnt = c.createStatement();
//        ResultSet rs;
//        rs = stmnt.executeQuery(query);
//        while (rs.next()) {
//            customer.add("\t"+" "+rs.getString("cusName") + "\t"+"\t"+"\t "+"\t"+" "+" " + rs.getString("accountNumber"));
////                employee.add(0, rs.getString("name")); 
////                employee.add(1, rs.getString("position"));
//            //employee.addAll(0, rs.getString("name"),rs.getString("position"));
//        }
//        return customer;
//    }
//    
    
    /**
     * To verify the get particular customer who has the particular account number
     * @param accNumber
     * @return
     * @throws SQLException 
     */
    public static ArrayList<String> selectCustomer(String accNumber) throws SQLException {
        ArrayList<String> SelectedCustomerDetails = new ArrayList<String>();
//connection
        Connection con;
        try {
            con = getConnection();
        } catch (Exception ex) {
            return null;
        }
        //execute sql query
        PreparedStatement pst = con.prepareStatement("Select birthdate,address,mobile,email,accountType,accountNumber,sortCode,balance,card from customer where accountNumber='" + accNumber + "'");

        ResultSet rs = pst.executeQuery();
        if (rs.next()) {
            SelectedCustomerDetails.add(rs.getString("birthdate") + " " + rs.getString("address") + " " + rs.getString("mobile") + " " + rs.getString("email") + " " + rs.getString("accountType") + " " + rs.getString("sortCode") + " " + rs.getString("balance") + " " + rs.getString("card"));
        } else {

        }
        return SelectedCustomerDetails;
    }
    
    /**
     * To select particular employee whose username and password is entered 
     * @param username
     * @param password
     * @return
     * @throws SQLException 
     */
    public static ArrayList<String> selectedEmployee(String username, String password) throws SQLException {
        ArrayList<String> SelectedEmployeeDetails = new ArrayList<String>();
//connection
        Connection con;
        try {
            con = getConnection();
        } catch (Exception ex) {
           return null;
        }
        //execute sql query
        PreparedStatement pst = con.prepareStatement("Select name,position from employee where username='" + username + "'" + "&& password='" + password + "'");

        ResultSet rs = pst.executeQuery();
        if (rs.next()) {
            SelectedEmployeeDetails.add(rs.getString("name") + " " + rs.getString("position"));
        } else {

        }
        return SelectedEmployeeDetails;
    }
    
    /**
     * verify customer with account number
     * @param accountNumber
     * @return 
     */
    public static String verifyCustomer(String accountNumber){
        String cusName = " ";
                    Connection con;
                    try {    
                        con = getConnection();
                        //execute sql query
                        PreparedStatement pst = con.prepareStatement("Select cusName from customer where accountNumber='" + accountNumber + "'");
                        ResultSet rs = pst.executeQuery();
                        if (rs.next()) {
                            cusName=rs.getString("cusName");
                        }
                    }catch(Exception ex){
                        return null;
                    }
                    return cusName;
    }
    
    /**
     * DB Connection
     * @return 
     */
    
    public static Connection getConnection() throws Exception {
          Connection connection = null;
        if (connection == null) {
            //JDBC
            Class.forName("com.mysql.jdbc.Driver");
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/ebankingsystem", "root", "");
            
        }
        return connection;
    }
//     

}
