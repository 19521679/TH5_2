package com.mycompany.th5_2.dao;

import com.mycompany.th5_2.database.Database;
import com.mycompany.th5_2.model.BacSi;
import com.mycompany.th5_2.model.BenhNhan;
import com.mycompany.th5_2.model.KhamBenh;

import javax.swing.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;

public class KhamBenhDAO {
    static Connection connection = Database.getConnection();

    public static boolean insertDatabase(KhamBenh kb) {

        String query = "insert into KHAMBENH( MABN, MABS, NGAYKHAM, YEUCAUKHAM, KETLUAN, THANHTOAN) values(?,?,?,?,?,?)";
/*"KhamBenh{" +
                "MAKB='" + MAKB + '\'' +
                ", MABN='" + MABN + '\'' +
                ", MABS='" + MABS + '\'' +
                ", NGAYKHAM=" + NGAYKHAM +
                ", YEUCAUKHAM='" + YEUCAUKHAM + '\'' +
                ", KETLUAN='" + KETLUAN + '\'' +
                ", THANHTOAN=" + THANHTOAN +
                '}';*/

        PreparedStatement ps = null;
        try {


            ps = connection.prepareStatement(query);
            ps.setString(1, kb.getMABN());
            ps.setString(2, kb.getMABS());
            ps.setDate(3, new java.sql.Date(kb.getNGAYKHAM().getTime()));
            ps.setString(4, kb.getYEUCAUKHAM());
            ps.setString(5, kb.getKETLUAN());
            ps.setBoolean(6, kb.getTHANHTOAN());
            return ps.executeUpdate() > 0;
        } catch (SQLException ex) {

            return false;
        }
    }

    public static KhamBenh queryKBbyBSandDate(KhamBenh kb) {
        String sqlQuery = "SELECT * from KHAMBENH where MABS = ? AND MABN = ? AND NGAYKHAM = ? ";
        try {
            //MABN, MABS, NGAYKHAM, YEUCAUKHAM, KETLUAN, THANHTOAN
            PreparedStatement preparedStatementShow = connection.prepareStatement(sqlQuery);
            preparedStatementShow.setString(1, kb.getMABS());
            preparedStatementShow.setString(2, kb.getMABN());
            preparedStatementShow.setDate(3, new java.sql.Date(kb.getNGAYKHAM().getTime()));
            ResultSet rs = preparedStatementShow.executeQuery();

            while (rs.next()) {

                String makb = rs.getString("MAKB");
                kb.setMAKB(makb);
                return kb;


            }
        } catch (SQLException e) {
        }
        return kb;
    }

    public static KhamBenh queryKBbyBNandDate(KhamBenh kb) {
        String sqlQuery = "SELECT * from KHAMBENH where MABS = ? AND NGAYKHAM = ? ";
        try {
            //MABN, MABS, NGAYKHAM, YEUCAUKHAM, KETLUAN, THANHTOAN
            PreparedStatement preparedStatementShow = connection.prepareStatement(sqlQuery);
            preparedStatementShow.setString(1, kb.getMABS());
            preparedStatementShow.setDate(2, new java.sql.Date(kb.getNGAYKHAM().getTime()));
            ResultSet rs = preparedStatementShow.executeQuery();

            while (rs.next()) {

                String makb = rs.getString("MAKB");
                kb.setMAKB(makb);
                return kb;


            }
        } catch (SQLException e) {
        }
        return kb;
    }

    public static void updateTT(KhamBenh kb) {

        String SQL = "update THUPHI set  THANHTOAN = ? where MAKB = ?";


        PreparedStatement ps = null;
        try {
            ps = connection.prepareStatement(SQL);
            ps.setBoolean(1, true);
            ps.setString(2, kb.getMAKB());


            ps.executeUpdate();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }


    }


}
