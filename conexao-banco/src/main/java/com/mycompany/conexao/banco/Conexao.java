/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.conexao.banco;

import org.apache.commons.dbcp2.BasicDataSource;
import org.springframework.jdbc.core.JdbcTemplate;

/**
 *
 * @author jgmat
 */
public class Conexao {
    private JdbcTemplate connection;
    public Conexao() {

  BasicDataSource dataSource = new BasicDataSource();

  dataSource​.setDriverClassName("org.h2.Driver");

  dataSource​.setUrl("jdbc:h2:file:./banco_teste");
  //("jdbc:mysql://localhost:3306:teste123")

  dataSource​.setUsername("sa");

  dataSource​.setPassword("");  

  this.connection = new JdbcTemplate(dataSource);

}

public JdbcTemplate getConnection() {

  return connection;

}
}
