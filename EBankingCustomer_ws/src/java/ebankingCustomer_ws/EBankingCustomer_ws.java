/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ebankingCustomer_ws;

import java.util.ArrayList;
import javax.jws.Oneway;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

/**
 *
 * @author DELL
 */
@WebService(serviceName = "EBankingCustomer_ws")
public class EBankingCustomer_ws {
    
    Controller controller=new Controller();
    /**
     * This is a sample web service operation
     */
    @WebMethod(operationName = "hello")
    public String hello(@WebParam(name = "name") String txt) {
        return "Hello " + txt + " !";
    }
    
    /**
     * Web service operation
     */
    @WebMethod(operationName = "addCustomer")
    @Oneway
    public void addCustomer(@WebParam(name = "cusName") String cusName, @WebParam(name = "birthdate") String birthdate, @WebParam(name = "address") String address, @WebParam(name = "mobileNo") String mobileNo, @WebParam(name = "email") String email, @WebParam(name = "accType") String accType, @WebParam(name = "accNumber") String accNumber, @WebParam(name = "sortCode") String sortCode, @WebParam(name = "balance") double balance, @WebParam(name = "card") String card) {
    controller.addCustomer(cusName, birthdate, address, mobileNo, email, accType, accNumber, sortCode, balance, card);
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "validateDate")
    public boolean validateDate(@WebParam(name = "date") String date) {
        //TODO write your implementation code here:
        try{
            return controller.validateDate(date);
        }catch(Exception ex){
           return false; 
        }
        
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "validateFormContents")
    public boolean validateFormContents(@WebParam(name = "cusName") String cusName, @WebParam(name = "birthdate") String birthdate, @WebParam(name = "address") String address, @WebParam(name = "mobileNo") String mobileNo, @WebParam(name = "email") String email, @WebParam(name = "accType") String accType, @WebParam(name = "accNumber") String accNumber, @WebParam(name = "sortCode") String sortCode, @WebParam(name = "card") String card) {
        //TODO write your implementation code here:
        try{
            return controller.validateFormContents(cusName, birthdate, address, mobileNo, email, accType, accNumber, sortCode, card);
        }catch(Exception ex){
            return false;
        }
        
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "parseDouble")
    public double parseDouble(@WebParam(name = "strNumber") String strNumber) {
        //TODO write your implementation code here:
        try{
            return controller.parseDouble(strNumber);
        }catch(Exception ex){
          return 0.0;  
        }
        
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "validateCustomer")
    public boolean validateCustomer(@WebParam(name = "accountNumber") String accountNumber, @WebParam(name = "cusName") String cusName) {
        //TODO write your implementation code here:
        try{
            return controller.validateCustomer(accountNumber, cusName);
        }catch(Exception ex){
            return false;
        }
        
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "checkAccountNumberField")
    public boolean checkAccountNumberField(@WebParam(name = "accountNumber") String accountNumber) {
        //TODO write your implementation code here:
        try{
            return controller.checkAccountNumberField(accountNumber);
        }catch(Exception ex){
            return false;
        }
        
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "updateCustomerDetails")
    @Oneway
    public void updateCustomerDetails(@WebParam(name = "cusName") String cusName, @WebParam(name = "birthdate") String birthdate, @WebParam(name = "address") String address, @WebParam(name = "mobileNo") String mobileNo, @WebParam(name = "email") String email, @WebParam(name = "accType") String accType, @WebParam(name = "accNumber") String accNumber, @WebParam(name = "sortCode") String sortCode, @WebParam(name = "balance") double balance, @WebParam(name = "card") String card) {
    controller.updateCustomerDetails(cusName, birthdate, address, mobileNo, email, accType, accNumber, sortCode, balance, card);
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "deleteCustomer")
    @Oneway
    public void deleteCustomer(@WebParam(name = "accNumber") String accNumber) {
        controller.deleteCustomer(accNumber);
    }

    
    /**
     * Web service operation
     */
    @WebMethod(operationName = "verifyCustomer")
    public String verifyCustomer(@WebParam(name = "accountNumber") String accountNumber) {
        //TODO write your implementation code here:
        try{
            return controller.verifyCustomer(accountNumber);
        }catch(Exception ex){
            return null;
        }
        
    }
    /**
     * Web service operation
     */
    @WebMethod(operationName = "getCustomerList")
    public ArrayList<String> getCustomerList() {
        //TODO write your implementation code here:
        try{
            return controller.getCustomerList();
        }catch(Exception ex){
            return null;
        }
        
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "selectCustomer")
    public ArrayList<String> selectCustomer(@WebParam(name = "accNumber") String accNumber) {
        //TODO write your implementation code here:
        try{
            return controller.selectCustomer(accNumber);
        }catch(Exception ex){
           return null; 
        }
        
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "validateAccountNo")
    public boolean validateAccountNo(@WebParam(name = "accNumber") String accNumber) {
        //TODO write your implementation code here:
        try{
            return controller.validateAccountNo(accNumber);
        }catch(Exception ex){
            return false;
        }
        
    }

    

}
