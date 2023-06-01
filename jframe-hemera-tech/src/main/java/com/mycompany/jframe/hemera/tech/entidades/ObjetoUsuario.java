/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.jframe.hemera.tech.entidades;

/**
 *
 * @author jgmat
 */
public class ObjetoUsuario {
    //    tem que ter atributos com as informações que quero puxar do banco
    private String email;
    private String senha;
    private Integer idEmpresa;

    public Integer getIdEmpresa() {
        return idEmpresa;
    }

    public void setIdEmpresa(Integer idEmpresa) {
        this.idEmpresa = idEmpresa;
    }

    public ObjetoUsuario(String email, String senha, Integer idEmpresa){
        this.email = email;
        this.senha = senha;
        this.idEmpresa = idEmpresa;
    }
    // Para o sql funcionar precisamos desse construtor vazio(não sei porquê)
    public ObjetoUsuario(){
        
    }


    public void setEmail(String email) {
        this.email = email;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
    
   
}
