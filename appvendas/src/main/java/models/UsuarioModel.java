/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models;

/**
 *
 * @author SUPORTE-TI
 */
public class UsuarioModel {
    private int IdUsuario;
    private String Login;
    private String Senha;

public UsuarioModel(){
    
}

// COnstrutor sem ID (para cadastro)
public UsuarioModel(String Login, String Senha){
    this.Login = Login;
    this.Senha = Senha;
}


// getters
public int getIdUsuario(){
    return IdUsuario;
}

public String getLogin(){
    return Login;
}

public String getSenha(){
    return Senha;
}


//setters
public void setIdUsuario(int IdUsuario){
    this.IdUsuario = IdUsuario;
}

public void setLogin(String Login){
    this.Login = Login;
}

public void setSenha(String Senha){
    this.Senha = Senha;
}



}

