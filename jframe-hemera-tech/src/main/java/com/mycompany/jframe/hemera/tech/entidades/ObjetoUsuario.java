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
    private Integer idFuncionario; //VIVI: adicionei pq precisamos do idFuncionario pra tabela logAcesso;
    private String email;
    private String senha;
    private Integer idEmpresa;

    public Integer getIdEmpresa() {
        return idEmpresa;
    }

    public void setIdEmpresa(Integer idEmpresa) {
        this.idEmpresa = idEmpresa;
    }

    public ObjetoUsuario(Integer idFuncionario, String email, String senha, Integer idEmpresa){
        this.idFuncionario = idFuncionario;
        this.email = email;
        this.senha = senha;
        this.idEmpresa = idEmpresa;
    }
    // Para o sql funcionar precisamos desse construtor vazio(não sei porquê)
    public ObjetoUsuario(){
        
    }

    public Integer getIdFuncionario() {
        return idFuncionario;
    }

    public void setIdFuncionario(Integer idFuncionario) {
        this.idFuncionario = idFuncionario;
    } 

    public void setEmail(String email) {
        this.email = email;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
    
   
}
