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
    private String emailUsuario;
    private String senhaUsuario;
    
    public ObjetoUsuario(String emailUsuario, String senhaUsuario){
        this.emailUsuario = emailUsuario;
        this.senhaUsuario = senhaUsuario;
    }
    // Para o sql funcionar precisamos desse construtor vazio(não sei porquê)
    public ObjetoUsuario(){
        
    }

    

    public String getEmailUsuario() {
        return emailUsuario;
    }

    public String getSenhaUsuario() {
        return senhaUsuario;
    }

   

    public void setEmailUsuario(String emailUsuario) {
        this.emailUsuario = emailUsuario;
    }

    public void setSenhaUsuario(String senhaUsuario) {
        this.senhaUsuario = senhaUsuario;
    }
    
   
}
