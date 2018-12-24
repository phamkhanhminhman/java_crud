/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.ResultSet;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
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
@WebServlet(name = "SuaTK", urlPatterns = {"/SuaTK"})
public class SuaTK extends HttpServlet {

    String Ma = "";
    String TenFile = "";
    String Size = "";
    String Location ="";
    String ID ="";
    String Pass="";
    String Nam="";
    String Link="";

    public SuaTK() {
        super();
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String MaSV = request.getParameter("Ma");
        ResultSet rs;
        try {
            rs = new MyConnectDB().chonDuLieuTuDTB("select * from data where Ma='" + MaSV + "'");
            while (rs.next()) {
                TenFile= rs.getString(2);
                Size = rs.getString(3);
                Location = rs.getString(4);
                ID =rs.getString(6);
                Pass = rs.getString(7);
                Nam = rs.getString(5);
                Link = rs.getString(8);
             
            }
            response.setContentType("text/html");
            ServletContext context = this.getServletContext();
            context.setAttribute("Ma", MaSV);
            context.setAttribute("TenFile", TenFile);
            context.setAttribute("Size", Size);
            context.setAttribute("Location", Location);
            context.setAttribute("ID", ID);
            context.setAttribute("Pass", Pass);
            context.setAttribute("Nam", Nam);
            context.setAttribute("Link", Link);
            //context.setAttribute("HocBong", HocBong);

            response.sendRedirect("SuaTaiKhoan.jsp");

        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setCharacterEncoding("utf-8");
        request.setCharacterEncoding("utf-8");
       
        String TenFile = request.getParameter("TenFil");
        String Size = request.getParameter("Size");
        String Location = request.getParameter("Location");
        String ID = request.getParameter("ID");
        String Pass = request.getParameter("Pass");
        String Nam = request.getParameter("Nam");
         String Link = request.getParameter("Link");
        
        response.setContentType("text/html");
        ServletContext context = getServletContext();
       String MaSV =  (String) context.getAttribute("Ma");

        try {
            new MyConnectDB().thucThiCauLenhSQL("update data set Ma='" + MaSV + "',TenFile='" + TenFile + "',Size='" + Size + "',Location='" + Location + "',Nam='" + Nam + "',Id='" + ID + "',Pass='" + Pass + "',Link='" + Link + "' where Ma='" + MaSV + "'");
            response.sendRedirect("index.jsp");
        } catch (Exception e) {
          PrintWriter pw = response.getWriter();
				pw.println("ko sua được");
           ;
        }

    }

}
