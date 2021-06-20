package com.mycompany.th5_2.dao;

import com.mycompany.th5_2.database.Database;
import com.mycompany.th5_2.model.BacSi;
import com.mycompany.th5_2.model.BenhNhan;

import javax.swing.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

public class BenhNhanDAO {


    static Connection connection = Database.getConnection();

    public static ArrayList<BenhNhan> queryAllBN() {
        ArrayList<BenhNhan> list=new ArrayList<>();
        String sqlQuery = "SELECT * from BENHNHAN order by MABN";
        try {
            PreparedStatement preparedStatementShow = connection.prepareStatement(sqlQuery);

            ResultSet rs = preparedStatementShow.executeQuery();

            while (rs.next()) {
                String mabn = rs.getString("MABN");
                String tenbn = rs.getString("TENBN");
                Date ngsinh = rs.getDate("NGSINH");
                String dchi = rs.getString("DCHI");
                String dthoai = rs.getString("DTHOAI");
                Boolean gioitinh = rs.getBoolean("GIOTINH");
                BenhNhan temp= new BenhNhan(mabn, tenbn, ngsinh, dchi, dthoai, gioitinh);
                list.add(temp);



            }
        } catch (SQLException e) {
        }
        return list;
    }

    public static ArrayList<BenhNhan> queryAllbyBSandDate(String mabs, Date date) {
        ArrayList<BenhNhan> list=new ArrayList<>();
        String sqlQuery = "SELECT DISTINCT * FROM BENHNHAN WHERE MABN IN (" +
                "SELECT MABN from KHAMBENH WHERE MABS= ? AND NGAYKHAM =? )  order by MABN";
        try {
            PreparedStatement preparedStatementShow = connection.prepareStatement(sqlQuery);
            preparedStatementShow.setString(1, mabs);
            preparedStatementShow.setDate(2, new java.sql.Date(date.getTime()));

            ResultSet rs = preparedStatementShow.executeQuery();

            while (rs.next()) {
                String mabn = rs.getString("MABN");
                String tenbn = rs.getString("TENBN");
                Date ngsinh = rs.getDate("NGSINH");
                String dchi = rs.getString("DCHI");
                String dthoai = rs.getString("DTHOAI");
                Boolean gioitinh = rs.getBoolean("GIOTINH");
                BenhNhan temp= new BenhNhan(mabn, tenbn, ngsinh, dchi, dthoai, gioitinh);
                list.add(temp);



            }
        } catch (SQLException e) {
        }
        return list;
    }

    public static BenhNhan queryBNbyMABN(String mabn) {
        String sqlQuery = "SELECT * from BENHNHAN";
        try {
            PreparedStatement preparedStatementShow = connection.prepareStatement(sqlQuery);

            ResultSet rs = preparedStatementShow.executeQuery();
 /*           "MABN='" + MABN + '\'' +
                    ", TENBN='" + TENBN + '\'' +
                    ", NGSINH=" + NGSINH +
                    ", DCHI='" + DCHI + '\'' +
                    ", DTHOAI='" + DTHOAI + '\'' +
                    ", GIOTINH=" + GIOTINH +
                    '}';*/
            while (rs.next()) {

                String tenbn = rs.getString("TENBN");
                Date ngsinh = rs.getDate("NGSINH");
                String dchi = rs.getString("DCHI");
                String dthoai = rs.getString("DTHOAI");
                Boolean gioitinh = rs.getBoolean("GIOTINH");
                return new BenhNhan(mabn, tenbn, ngsinh, dchi, dthoai, gioitinh);


            }
        } catch (SQLException e) {
        }
        return new BenhNhan();
    }

    /* "MABN='" + MABN + '\'' +
                ", TENBN='" + TENBN + '\'' +
                ", NGSINH=" + NGSINH +
                ", DCHI='" + DCHI + '\'' +
                ", DTHOAI='" + DTHOAI + '\'' +
                ", GIOTINH=" + GIOTINH +
                '}';*/

    public static boolean insertDatabase(BenhNhan bn) {

        String query = "insert into BENHNHAN( MABN, TENBN, NGSINH, DCHI, DTHOAI, GIOTINH) values(?,?,?,?,?,?)";


        PreparedStatement ps = null;
        try {


            ps = connection.prepareStatement(query);
            ps.setString(1, bn.getMABN());
            ps.setString(2, bn.getTENBN());
            ps.setDate(3, new java.sql.Date(bn.getNGSINH().getTime()));
            ps.setString(4, bn.getDCHI());
            ps.setString(5, bn.getDTHOAI());
            ps.setBoolean(6,bn.getGIOTINH());

            return ps.executeUpdate() > 0;
        } catch (SQLException ex) {

            return false;
        }
    }
}
