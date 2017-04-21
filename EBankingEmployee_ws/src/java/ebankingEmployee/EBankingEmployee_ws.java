/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ebankingEmployee;

import java.util.ArrayList;
import javax.jws.Oneway;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

/**
 *
 * @author DELL
 */
@WebService(serviceName = "EBankingEmployee_ws")
public class EBankingEmployee_ws {

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
    @WebMethod(operationName = "validateForm")
    public boolean validateForm(@WebParam(name = "username") String username, @WebParam(name = "password") String password) {
        //TODO write your implementation code here:
        try{
          return controller.validateForm(username, password);
        }catch(Exception ex){
            return false;
        }
        
    }
    /**
     * Web service operation
     */
    @WebMethod(operationName = "addEmployee")
    @Oneway
    public void addEmployee(@WebParam(name = "empName") String empName, @WebParam(name = "position") String position, @WebParam(name = "username") String username, @WebParam(name = "password") String password) {
    controller.addEmployee(empName, position, username, password);
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "validateSignupContents")
    public boolean validateSignupContents(@WebParam(name = "empName") String empName, @WebParam(name = "position") String position, @WebParam(name = "username") String username, @WebParam(name = "password") String password) {
        //TODO write your implementation code here:
        try{
            return controller.validateSignupContents(empName, position, username, password);
        }catch(Exception ex){
            return false;
        }
        
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "validateUsername")
    public boolean validateUsername(@WebParam(name = "username") String username) {
        //TODO write your implementation code here:
        try{
           return controller.validateUsername(username);
        }catch(Exception ex){
            return false;
        }
        
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "updateEmployee")
    @Oneway
    public void updateEmployee(@WebParam(name = "empName") String empName, @WebParam(name = "position") String position, @WebParam(name = "username") String username, @WebParam(name = "password") String password) {
    controller.updateEmployee(empName, position, username, password);
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "deleteEmployee")
    @Oneway
    public void deleteEmployee(@WebParam(name = "username") String username, @WebParam(name = "password") String password) {
   controller.deleteEmployee(username, password);
    }
    
    /**
     * Web service operation
     */
    @WebMethod(operationName = "getEmployeeList")
    public ArrayList<String> getEmployeeList() {
        //TODO write your implementation code here:
        try{
            return controller.getEmployeeList();
        }catch(Exception ex){
            return null;
        }
        
    }
    
     /**
     * Web service operation
     */
    @WebMethod(operationName = "selectedEmployee")
    public ArrayList<String> selectedEmployee(@WebParam(name = "username") String username, @WebParam(name = "password") String password) {
        //TODO write your implementation code here:
        try{
            return controller.selectedEmployee(username, password);
            
        }catch(Exception ex){
            return null;
        }
        
    }

    
}
