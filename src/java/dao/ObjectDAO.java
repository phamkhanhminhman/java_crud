/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

/**
 *
 * @author MinhMan
 */
public interface ObjectDAO {
    public boolean add(Object obj);
    public boolean edit(Object obj, String id);
    public boolean del(String MaTV);
}
