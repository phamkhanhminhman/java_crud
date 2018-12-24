package controller;

import java.io.IOException;
import java.sql.ResultSet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.MyConnectDB;


@WebServlet("/ThemTK")
public class ThemTK extends HttpServlet {
	private static final long serialVersionUID = 1L;
    public ThemTK() {
        super();
    }

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String Ma =request.getParameter("Ma");
		String TenFile =request.getParameter("TenFile");
		String Size =request.getParameter("Size");
                String Location =request.getParameter("Location");
		String ID =request.getParameter("ID");
		String PASS =request.getParameter("PASS");
		String Nam =request.getParameter("Nam");
		String Link =request.getParameter("Link");
                String Mota=request.getParameter("Mota");
	
		try {
			ResultSet rs = new MyConnectDB().chonDuLieuTuDTB("select * from data");
			while(rs.next()){
				String s = rs.getString(1);
				//stt=Integer.parseInt(s)+1+"";
			}
			new MyConnectDB().thucThiCauLenhSQL("insert into data values('"+Ma+"','"+TenFile+"','"+Size+"','"+Location+"','"+Nam+"','"+ID+"','"+PASS+"','"+Link+"','"+Mota+"')");
			response.sendRedirect("index.jsp");
		} catch (Exception ex) {
			ex.printStackTrace();
		}
		
		
	}

}
