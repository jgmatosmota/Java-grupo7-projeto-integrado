/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.jframe.hemera.tech.entidades;

import java.sql.ResultSet;
import java.sql.SQLException;

import com.mycompany.jframe.hemera.tech.entidades.ObjetoUsuario;
import org.springframework.jdbc.core.RowMapper;

/**
 *
 * @author jgmat
 */
public class ObjetoUsuarioRowMapper implements RowMapper<ObjetoUsuario> {
    @Override

    // método sql RowMapper do spring boot(Java para web)
    public ObjetoUsuario mapRow(ResultSet rs, int rowNum) throws SQLException {
        ObjetoUsuario objetoUsuario = new ObjetoUsuario();
        
        // email em string é o nome da coluna do banco de dados
        objetoUsuario.setIdFuncionario(rs.getInt("idFuncionario")); 
        objetoUsuario.setEmail(rs.getString("email"));
        objetoUsuario.setSenha(rs.getString("senha"));
        objetoUsuario.setIdEmpresa(rs.getInt("idEmpresa"));
        return objetoUsuario;
    }
}
