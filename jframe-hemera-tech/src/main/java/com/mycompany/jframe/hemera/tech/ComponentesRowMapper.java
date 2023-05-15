/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.jframe.hemera.tech;

/**
 *
 * @author jgmat
 */
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class ComponentesRowMapper implements RowMapper<Componentes> {
    @Override
    public Componentes mapRow(ResultSet rs, int rowNum) throws SQLException {
        Componentes componentes = new Componentes();

        // email em string é o nome da coluna do banco de dados
        componentes.setId(rs.getInt("id"));
        componentes.setSistemaOperacional(rs.getString("SistemaOperacional"));
        componentes.setModeloProcessador(rs.getString("ModeloProcessador"));
        componentes.setHostName(rs.getString("MacAddress"));
        componentes.setMemoriaTotal(rs.getString("MemoriaTotal"));
        componentes.setMemoriaArmazenamento(rs.getString("MemoriaArmazenamento"));
        componentes.setEmailUsuario(rs.getString("EmailUsuario"));
//        objetoUsuario.setEmail(rs.getString("email"));
//        objetoUsuario.setSenha(rs.getString("senha"));

        return componentes;
    }
}