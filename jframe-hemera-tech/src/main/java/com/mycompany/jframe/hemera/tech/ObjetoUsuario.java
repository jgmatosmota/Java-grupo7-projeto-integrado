/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.jframe.hemera.tech;

/**
 *
 * @author jgmat
 */
public class ObjetoUsuario {
    //    tem que ter atributos com as informações que quero puxar do banco
    //    private Integer idUsuario;
    private String email;
    private String senha;
    
    public ObjetoUsuario(String email, String senha){
        this.email = email;
        this.senha = senha;
    }
    // Para o sql funcionar precisamos desse construtor vazio(não sei porquê)
    public ObjetoUsuario(){
        
    }

    

    public String getEmailUsuario() {
        return email;
    }

    public String getSenhaUsuario() {
        return senha;
    }

   

    public void setEmail(String email) {
        this.email = email;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
    
   
}
