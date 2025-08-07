/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classes;

import java.sql.SQLException;
import models.UsuarioModel;
import java.sql.Connection;
import java.sql.PreparedStatement;

/**
 *
 * @author SUPORTE-TI
 */
public class UsuarioDAO {
    
    public boolean inserirUsuario(UsuarioModel usuario)throws SQLException{
        String sql = "INSERT INTO Usuarios(Login, Senha) VALUES(?, ?)";
        
        try (Connection conn = ConexaoDB.conectar();
            PreparedStatement stmt = conn.prepareStatement(sql)){
            
            stmt.setString(1, usuario.getLogin());
            stmt.setString(2, usuario.getSenha());
            
            stmt.executeUpdate();
            return true;
        }
        catch (SQLException e){
            e.printStackTrace();
            return false;
        }
        
        
    }
}
