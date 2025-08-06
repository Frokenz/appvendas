/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package classes;

/**
 *
 * @author SUPORTE-TI
**/


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;


public class LoginValidate {

    public boolean validarLogin(String login, String senha) {
        String sql = "SELECT * FROM usuarios WHERE login = ? AND senha = ?";
        try (Connection conn = ConexaoDB.conectar();
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setString(1, login);
            stmt.setString(2, senha);
            ResultSet rs = stmt.executeQuery();
            return rs.next();
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }
}
