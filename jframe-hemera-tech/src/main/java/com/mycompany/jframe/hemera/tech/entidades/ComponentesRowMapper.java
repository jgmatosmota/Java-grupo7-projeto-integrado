package com.mycompany.jframe.hemera.tech.entidades;


import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class ComponentesRowMapper implements RowMapper<Componentes> {
    @Override
    public Componentes mapRow(ResultSet rs, int rowNum) throws SQLException {
        Componentes componentes = new Componentes();

        // email em string é o nome da coluna do banco de dados
        componentes.setId(rs.getInt("idComputador"));
        componentes.setSistemaOperacional(rs.getString("sistema_operacional"));
        componentes.setModeloProcessador(rs.getString("modelo"));
        componentes.setHostName(rs.getString("MacAddress"));
        componentes.setMemoriaTotal(rs.getString("total_memoria"));
        componentes.setMemoriaArmazenamento(rs.getString("total_armazenamento"));
        componentes.setIdEmpresa(rs.getInt("idEmpresa"));
//        objetoUsuario.setEmail(rs.getString("email"));
//        objetoUsuario.setSenha(rs.getString("senha"));

        return componentes;
    }
}