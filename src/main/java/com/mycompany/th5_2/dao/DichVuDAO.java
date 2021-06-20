package com.mycompany.th5_2.dao;

import com.mycompany.th5_2.database.Database;
import com.mycompany.th5_2.model.BenhNhan;
import com.mycompany.th5_2.model.DichVu;

import javax.swing.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;

public class DichVuDAO {

    static Connection connection = Database.getConnection();
    public static ArrayList<DichVu> queryAllDV() {
        ArrayList<DichVu> list = new ArrayList<>();
        String sqlQuery = "SELECT * from DICHVU order by MADV";
        try {
            PreparedStatement preparedStatementShow = connection.prepareStatement(sqlQuery);

            ResultSet rs = preparedStatementShow.executeQuery();

            while (rs.next()) {
                String madv = rs.getString("MADV");
                String tendv = rs.getString("TENDV");
                Integer dongia = rs.getInt("DONGIA");
                DichVu temp = new DichVu(madv, tendv, dongia);
                list.add(temp);


            }
        } catch (SQLException e) {
        }
        return list;
    }

}
