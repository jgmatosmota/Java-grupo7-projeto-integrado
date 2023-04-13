/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.conexao.banco;

import org.springframework.jdbc.core.JdbcTemplate;

/**
 *
 * @author jgmat
 */
public class TesteFilme {
    public static void main(String[] args) {
        Conexao conexao = new Conexao();
        JdbcTemplate con = conexao.getConnection();
        
        con.execute("CREATE TABLE filme ("

    + "id INT PRIMARY KEY AUTO_INCREMENT,"

    + "nome VARCHAR(255) NOT NULL,"

    + "ano_lancamento int NOT NULL"

    + ")");
    }
}
