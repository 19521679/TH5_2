package com.mycompany.th5_2.dao;

import com.mycompany.th5_2.database.Database;
import com.mycompany.th5_2.model.DichVu;
import com.mycompany.th5_2.model.KhamBenh;
import com.mycompany.th5_2.model.ThuPhi;

import javax.swing.*;
import java.math.BigInteger;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;

public class ThuPhiDAO {
    static Connection connection = Database.getConnection();

    public static boolean insertDatabase(KhamBenh kb, HashMap<DichVu, Integer> map) {

        String query = "insert into THUPHI( MAKB, MADV, SOLUONG) values(?,?,?)";

        PreparedStatement ps = null;
        try {
            ps = connection.prepareStatement(query);
            Set<DichVu> keySet = map.keySet();
            for (DichVu key : keySet) {
                ps.setString(1, kb.getMAKB());
                ps.setString(2, key.getMADV());
                ps.setInt(3, map.get(key));

                ps.executeUpdate();
            }

            return true;
        } catch (SQLException ex) {

            return false;
        }
    }

    public static ArrayList<ThuPhi> queryByMAKB(String makb) {
        ArrayList<ThuPhi> list =new ArrayList<>();
        String sqlQuery = "SELECT * from THUPHI where MAKB = ? ";
        try {
            //MABN, MABS, NGAYKHAM, YEUCAUKHAM, KETLUAN, THANHTOAN
            PreparedStatement preparedStatementShow = connection.prepareStatement(sqlQuery);
            preparedStatementShow.setString(1, makb);
            ResultSet rs = preparedStatementShow.executeQuery();

            while (rs.next()) {

                String madv = rs.getString("MADV");
                Integer soluong =rs.getInt("SOLUONG");
                BigInteger thanhtien =BigInteger.valueOf(rs.getInt("THANHTIEN"));
                list.add( new ThuPhi(makb,madv,soluong,thanhtien));



            }
        } catch (SQLException e) {
        }
        return list;
    }
}
