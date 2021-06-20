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

public class BacSiDAO {


    static Connection connection = Database.getConnection();




    public static ArrayList<BacSi> queryAllBS() {
        ArrayList<BacSi> list = new ArrayList<>();
        String sqlQuery = "SELECT * from BACSI";
        try {

            PreparedStatement preparedStatementShow = connection.prepareStatement(sqlQuery);

            ResultSet rs = preparedStatementShow.executeQuery();

            while (rs.next()) {

                String mabs = rs.getString("MABS");

                String tenbn = rs.getString("TENBS");
                BacSi bs = new BacSi(mabs, tenbn);
                list.add(bs);


            }
        } catch (SQLException e) {
        }
        return list;
    }
}
