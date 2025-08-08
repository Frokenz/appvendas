/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classes;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
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
    
    public List<ProdutoModel> listarTodos(){
        List<ProdutoModel> lista = new ArrayList<>();
        String sql = "SELECT * FROM Produtos";
       
        try(Connection conn = ConexaoDB.conectar();
        PreparedStatement stmt = conn.prepareStatement(sql);
        ResultSet rs = stmt.executeQuery()){
           
            while (rs.next()){
                ProdutoModel p = new ProdutoModel();
                p.setIdProduto(rs.getInt("IdProduto"));
                p.setNomeProduto(rs.getString("NomeProduto"));
                p.setQuantProduto(rs.getInt("QuantProduto"));
                p.setPrecoProduto(rs.getDouble("PrecoProduto"));
                lista.add(p);
            }
        } catch (Exception e){
            e.printStackTrace();
        }
        return lista;
    }
    
    
    
    
}
