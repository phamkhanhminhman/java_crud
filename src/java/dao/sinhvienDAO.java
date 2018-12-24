/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.ketqua;
import model.MyConnectDB;
import model.sinhvien;

/**
 *
 * @author MinhMan
 */
public class sinhvienDAO implements ObjectDAO{
    public ArrayList<sinhvien> getListthanhvien() throws SQLException {
        Connection connection = MyConnectDB.getConnection();
        String sql = "SELECT * FROM data";
        PreparedStatement ps = (PreparedStatement) connection.prepareStatement(sql);
        ResultSet rs = ps.executeQuery();
        ArrayList<sinhvien> list = new ArrayList<>();
            while (rs.next()) {
              sinhvien category = new sinhvien();
              category.setLink(rs.getString("Link"));
         //     category.setTenFile(rs.getString("TenFile"));
              list.add(category);  
            }
         return list;
    }
    
  public static void main(String[] args) throws SQLException{
      sinhvienDAO dao = new sinhvienDAO();
      for(sinhvien ds : dao.getListthanhvien()){
          System.out.println(ds.getLink());
      }
  }

 /*   @Override
    public boolean add(Object obj) {
        HOATDONG tv = (HOATDONG) obj;
        try {
            new MyConnectDB().thucThiCauLenhSQL("insert into hoatdong values("+tv.getMaHD()+","+tv.getTenHD()+","+tv.getMoTaHD()+")");
        } catch (Exception ex) {
            Logger.getLogger(sinhvienDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    @Override
    public boolean edit(Object obj, String MaHD) {
        HOATDONG tv = (HOATDONG) obj;
        try {
			new MyConnectDB().thucThiCauLenhSQL("update hoatdong set TenHD='"+tv.getTenHD()+"',MoTaHD='"+tv.getMoTaHD()+"',NgayGioBD='"+tv.getNgayGioBD()+"' where id='"+MaHD+"'");
			return true;
		} catch (Exception e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		return false;
    }*/

    @Override
    public boolean del(String MaTV) {
        try {
			new MyConnectDB().thucThiCauLenhSQL("delete from data where Ma='"+MaTV+"'");
			return true;
		} catch (Exception e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		return false;
	}
    public String link(String Ma) {
        try {
			new MyConnectDB().thucThiCauLenhSQL("select Ma from data ");
			return Ma;
		} catch (Exception e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		return Ma;
    }
    @Override
    public boolean add(Object obj) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean edit(Object obj, String id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    }

