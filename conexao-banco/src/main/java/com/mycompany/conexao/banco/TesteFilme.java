/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.conexao.banco;

import java.util.List;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

/**
 *
 * @author jgmat
 */
public class TesteFilme {
    public static void main(String[] args) {
        Conexao conexao = new Conexao();
        JdbcTemplate con = conexao.getConnection();
        con.execute("drop table if exists filme");
        con.execute("CREATE TABLE filme ("

    + "id INT PRIMARY KEY AUTO_INCREMENT,"

    + "nome VARCHAR(255) NOT NULL,"

    + "ano_lancamento int NOT NULL"

    + ")");
      con.update("insert into filme(nome,ano_lancamento) values('aaaaa','1999')");
      con.update("update filme set nome = 'testefodase' where id = ?", 1);
      
      Filme novoFilme = new Filme(null ,"teste", 2055);
      con.update(String.format("insert into filme values (null , '%s', '%d')",
              novoFilme.getNome(), novoFilme.getAnoLancamento()));
      
      List<Filme> filmes = con.query("select * from filme;",new BeanPropertyRowMapper(Filme.class));
      
        System.out.println(filmes);
      
        
        
    }
    
}
