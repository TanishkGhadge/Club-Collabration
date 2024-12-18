package model;


import db.DBConnector;
import dto.UserDTO;
import java.sql.SQLException;
import java.sql.Statement;


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author hp
 */
public class RegistrationAuthenticator 
{
    public boolean isRegis(UserDTO u1)
    {
        String username = u1.getUsername();
        String email = u1.getEmail();
        String password = u1.getPassword();
        String gender = u1.getGender();
        String course = u1.getCourse();
        String feedback = u1.getFeedback();
        String phone = u1.getPhone();
        String empid = u1.getEmpid();
        String city = u1.getEmpcity();
        
        try
        {
            int i=0;
            Statement st = DBConnector.getStatement();
            String query = "INSERT INTO emp(`empid`,`empname`,`empcity`,`emppassword`,`gender`,`phonenumber`,`feedback`,`email`,`course`) values('"+empid+"','"+username+"','"+city+"','"+password+"','"+gender+"','"+phone+"','"+feedback+"','"+email+"','"+course+"')";
            
            i = st.executeUpdate(query);
            
            if(i>0)
            {
                return true;
            }
            else
            {
                return false;
            }
            
        }
        catch(SQLException e)
        {
            System.out.println(e);
        }
        return false;
    }
}
