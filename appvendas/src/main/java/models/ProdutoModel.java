/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models;

/**
 *
 * @author SUPORTE-TI
 */
public class ProdutoModel {
    private int IdProduto;
    private String NomeProduto;
    private int QuantProduto;
    private double PrecoProduto;

public ProdutoModel() {

}

// Construtor sem ID (para cadastro)
public ProdutoModel(String NomeProduto, int QuantProduto, double PrecoProduto){
    
    this.NomeProduto = NomeProduto;
    this.QuantProduto = QuantProduto;
    this.PrecoProduto = PrecoProduto;
}

public int getIdProduto() {
    return IdProduto;
}

public void setIdProduto(int IdProduto){
    this.IdProduto = IdProduto;
}

public String getNomeProduto(){
    return NomeProduto;
}

public void setNomeProduto(String NomeProduto){
    this.NomeProduto = NomeProduto;
}

public int getQuantProduto(){
    return QuantProduto;
}

public void setQuantProduto(int QuantProduto){
    this.QuantProduto = QuantProduto;
}

public double getPrecoProduto (){
    return PrecoProduto;
}

public void setPrecoProduto(double PrecoProduto){
    this.PrecoProduto = PrecoProduto;
}

}



