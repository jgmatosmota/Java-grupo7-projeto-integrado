/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.jframe.hemera.tech;

import org.apache.commons.dbcp2.BasicDataSource;
import org.springframework.jdbc.core.JdbcTemplate;

/**
 *
 * @author jgmat
 */
public class ConexaoBanco {
   private JdbcTemplate connection;
   public  ConexaoBanco() {

    BasicDataSource dataSource = new BasicDataSource();

    dataSource​.setDriverClassName("com.microsoft.sqlserver.jdbc.SQLServerDriver");

    dataSource​.setUrl("jdbc:h2:file:/banco_teste");
//    dataSource​.setUrl("jdbc:sqlserver://");
    //("jdbc:mysql://localhost:3306/teste123")

    dataSource​.setUsername("x");

    dataSource​.setPassword("x");  

    this.connection = new JdbcTemplate(dataSource);

}

public JdbcTemplate getConnection() {

  return connection;

}
}