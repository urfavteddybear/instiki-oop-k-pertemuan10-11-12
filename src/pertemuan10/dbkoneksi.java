/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pertemuan10;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Wahyu
 */
public class dbkoneksi {
    static String JDBC_DRIVER="com.mysql.cj.jdbc.Driver";
    static String DB_URL="jdbc:mysql://100.99.1.1/bukualamat";
    static String DB_USER="root";
    static String DB_PASS = "";
    static Connection koneksi;
    
    public static Connection koneksi(){
     try{
         Class.forName(JDBC_DRIVER);
         return DriverManager.getConnection(DB_URL, DB_USER, DB_PASS);
     }catch(ClassNotFoundException | SQLException e){
         System.out.println("Koneksi ke database gagal");
     }   
     return null;
    }  
}
