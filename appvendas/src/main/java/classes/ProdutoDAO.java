/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classes;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import models.ProdutoModel;


/**
 *
 * @author SUPORTE-TI
 */
public class ProdutoDAO {
    public boolean inserirProduto(ProdutoModel produto) throws SQLException{
        String sql = "INSERT INTO Produtos(NomeProduto, QuantProduto, PrecoProduto) VALUES (?, ?, ?)";
        
        try (Connection conn = ConexaoDB.conectar();
                PreparedStatement stmt = conn.prepareStatement(sql)){
            
            stmt.setString(1, produto.getNomeProduto());
            stmt.setInt(2, produto.getQuantProduto());
            stmt.setDouble(3, produto.getPrecoProduto());
            
            stmt.executeUpdate();
            return true;
        }
        catch(SQLException e){
            e.printStackTrace();
            return false;
        }
    }
}
