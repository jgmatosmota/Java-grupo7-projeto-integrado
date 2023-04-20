/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.jframe.hemera.tech;

import java.util.List;
import java.util.Scanner;
import org.springframework.jdbc.core.JdbcTemplate;

/**
 *
 * @author jgmat
 */
public class TesteBanco {
    public static void main(String[] args) {
        ConexaoBanco conexaoBanco = new ConexaoBanco();
        JdbcTemplate conexao = new JdbcTemplate();
        Scanner leitor = new Scanner(System.in);
        Integer opcao;
        do{
            System.out.println("-".repeat(30));
            System.out.println("1 - testar conexão");
            System.out.println("0 - sair");
            opcao = leitor.nextInt();
            switch(opcao){
               
                case 1:
                    System.out.println("login");
                    String login = leitor.nextLine();
                    System.out.println("senha");
                    String senha = leitor.nextLine();
                    
                    // O simbolo ? na query vão ser substituidas por 
                    List<ObjetoUsuario> listaObjetoUsuario = conexao.query("select 1 from gestao_acesso where email = ? and senha = ?", 
                    new ObjetoUsuarioRowMapper(), login, senha);
                    
                    //Validação de login com método.isEmpty() só que negado, ou seja, se ele retornar 1 usuário ele conseguiu logar;
                    if(!listaObjetoUsuario.isEmpty()){
                        System.out.println("Login deu certo!");
                    }else{
                        System.out.println("Deu errado");
                    }
                
                
            }
        
        
        }while(opcao != 0);
        
        
        
        
    }
}
