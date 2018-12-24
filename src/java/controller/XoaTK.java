/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import dao.sinhvienDAO;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.ResultSet;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.MyConnectDB;

/**
 *
 * @author MinhMan
 */
@WebServlet(name = "XoaTK", urlPatterns = {"/XoaTK"})
public class XoaTK extends HttpServlet {

 public XoaTK(){
        super();
}
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException {
        String MaSV = request.getParameter("Ma");
       sinhvienDAO tv = new sinhvienDAO();
      if (tv.del(MaSV)) {
           RequestDispatcher dispatcher = request.getRequestDispatcher("index.jsp");
           dispatcher.forward(request, response);
       } else {
           PrintWriter pw = response.getWriter();
				pw.println("ko xóa được");
           
       }
       
               }
 @Override
 protected void doPost(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException {
    
    }
   
    



}
