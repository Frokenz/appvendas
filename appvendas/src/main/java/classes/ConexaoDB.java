/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classes;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author SUPORTE-TI
 */
public class ConexaoDB {
    public static Connection conectar(){
        Connection conn = null;
        try{
            String url ="jdbc:sqlite:src/database/db_appvendas.db"; // caminho do arquivo
            conn = DriverManager.getConnection(url);
            System.out.println("Conexão Estabelecida!");
        }
        catch(SQLException e){
            System.out.println(e.getMessage());
        }
        return conn;
    }
}
