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
        // EXEMPLO POC(PROOF OF CONCEPT) DA CONEXÃO COM BANCO DE DADOS
        Scanner leitorB = new Scanner(System.in);
        ConexaoBanco conexaoBanco = new ConexaoBanco();
        JdbcTemplate conexao = conexaoBanco.getConnection();
        Scanner leitor = new Scanner(System.in);
        Integer opcao;
        do {
            System.out.println("-".repeat(30));
            System.out.println("1 - testar conexão");
            System.out.println("0 - sair");
            System.out.println("-".repeat(30));
            opcao = leitor.nextInt();
            switch (opcao) {
                case 1:
                    System.out.println("login");
                    String email = leitorB.nextLine();
                    System.out.println("senha");
                    String senha = leitorB.nextLine();
                    // O simbolo ? na query vão ser substituidos pelas variáveis "login" e "senha"
                   
                    List<ObjetoUsuario> listaObjetoUsuario = conexao.query("select * from teste where email = ? and senha = ?", 
                    new ObjetoUsuarioRowMapper(), email, senha);
                   
                    if(listaObjetoUsuario.size() > 0){
                        System.out.println("Login deu certo!");
                    }else{
                        System.out.println("Deu errado");
                    }
                    break;
                default:
                    System.out.println("digite uma opção válida!");
            }
        } while (opcao != 0);
    }
}
