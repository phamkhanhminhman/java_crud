/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import dao.sinhvienDAO;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.MyConnectDB;
import model.sinhvien;

/**
 *
 * @author MinhMan
 */
@WebServlet(name = "Link", urlPatterns = {"/Link"})
public class Link extends HttpServlet {

   public Link(){
       super();
   }
   @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException {
       sinhvienDAO dao = new sinhvienDAO();
       
       try {
           for(sinhvien ds : dao.getListthanhvien()){
                response.sendRedirect(ds.getLink());
               
           }
       } catch (Exception e) {
          PrintWriter pw = response.getWriter();
				pw.println("ko sua được");
           ;       
       }
       
 
}
}
