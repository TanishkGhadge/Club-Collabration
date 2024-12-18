/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import dto.UserDTO;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.RegistrationAuthenticator;

/**
 *
 * @author hp
 */
public class RegisterChecker extends HttpServlet {

    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException 
    {
        resp.sendRedirect("Registration.html");
    }

    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException 
    {
        String username = req.getParameter("firstname");
        String empid = req.getParameter("empid");
        String city = req.getParameter("empcity");
        String gender = req.getParameter("gender");
        String course = req.getParameter("course");
        String feedback = req.getParameter("feedback");
        String email = req.getParameter("email");
        String phone = req.getParameter("phone");
        String password = req.getParameter("pass");
        
        UserDTO u1 = new UserDTO();
        u1.setFeedback(feedback);
        u1.setCourse(course);
        u1.setEmail(email);
        u1.setEmpcity(city);
        u1.setEmpid(empid);
        u1.setGender(gender);
        u1.setPassword(password);
        u1.setPhone(phone);
        u1.setUsername(username);
        
        RegistrationAuthenticator r1 = new RegistrationAuthenticator();
        boolean regis = r1.isRegis(u1);
        
        if(regis)
        {
            resp.sendRedirect("home.jsp");
        }
        else
        { 
            resp.sendRedirect("Registration.html");
        }
    }
    
    
}
