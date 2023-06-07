/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.jframe.hemera.tech.entidades;

import com.mycompany.jframe.hemera.tech.componentes.ComponentesMaquina;
import com.mycompany.jframe.hemera.tech.conexao.ConexaoBanco;
import com.mycompany.jframe.hemera.tech.conexao.ConexaoBancoLocal;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import org.springframework.jdbc.core.JdbcTemplate;

/**
 *
 * @author VivianaMarca
 */
public class LogAcesso {
    ConexaoBanco conexaoBancoNuvem = new ConexaoBanco();
    JdbcTemplate conexaoNuvem = conexaoBancoNuvem.getConnection();

    private Integer idLogAcesso;
    private LocalDateTime dataHoraInicio;

    public void salvar(String email, Boolean logou) {
        dataHoraInicio = LocalDateTime.now();

        String horaAtual = String.format("%d:%02d:%02d", dataHoraInicio.getHour(), dataHoraInicio.getMinute(), dataHoraInicio.getSecond());
        String diaAtual = dataHoraInicio.toLocalDate().toString();

        //CRIA INSTANCIA DA PASTA
        File pasta = new File("logsDeAcesso");
        //SE A PASTA NAO EXISTIR ELE CRIA;
        if (!pasta.exists()) {
            pasta.mkdirs();
        }
        //CRIA O ARQUIVO NA PASTA DEFINIDA
        File arquivo = new File(pasta, diaAtual);

        try {
            arquivo.createNewFile();
            FileWriter fw = new FileWriter(arquivo, true);
            BufferedWriter escrever = new BufferedWriter(fw);

            if (logou) {
                escrever.write(diaAtual + " - " + horaAtual + " - " + email + " - " + " login feito com sucesso \n");
            } else {
                escrever.write(diaAtual + " - " + horaAtual + " - " + email + " - " + " tentativa de login não bem sucedida\n");
            }
            escrever.close();
            fw.close();
            System.out.println("Cadastrei  acesso no log");

        } catch (IOException ex) {
            System.out.println("deu erro ao criar/ escrever no arquivo log");
        }
    }

    //INSERIR INICIO DE SESSÃO NA TABELA LOGACESSO
    public void inserirLoginBanco(ObjetoUsuario usuarioLogado, Componentes componenteAtual) {
        System.out.println(usuarioLogado);
        String insertTabelaLogAcesso = "insert into LogAcesso (idFuncionario, MacAddress, idComputador, idEmpresa, horario_inicio) values( ?, ?, ?,?, ?)";
        conexaoNuvem.update(insertTabelaLogAcesso, usuarioLogado.getIdFuncionario(), componenteAtual.getHostName(), componenteAtual.getId(), componenteAtual.getIdEmpresa(), dataHoraInicio);
        System.out.println("Cadastrei esse login no banco");
    }

    //ABAIXO METODOS PARA INSERIR HORARIO FINAL DE USO DA MAQUINA 
    //DEFINIR QUANDO CHAMAR ESSES METODOS 
    public void puxarIdLogAcesso( Componentes componenteAtual) {
        //preciso puxar o id do Logacesso pra atualizar,fiz gamb A TABELA VAI MUDAR nao vai ter idLogAcesso
        String ultimoInsertDoLog = "select top 1 idLogAcesso from LogAcesso where MacAddress = ? order by horario_inicio desc";
        idLogAcesso = conexaoNuvem.queryForObject(ultimoInsertDoLog, Integer.class, componenteAtual.getHostName());
    }

    public void updateTerminarSessão(Componentes componenteAtual) {
        puxarIdLogAcesso(componenteAtual);
       // System.out.println(idLogAcesso); VAI MUDAR A TABELANAO VAI TER MAIS ID
        LocalDateTime dataHoraFinal = LocalDateTime.now();

        String updateHoraFinal = "update LogAcesso set horario_final = ? where idLogAcesso = ?";
        conexaoNuvem.update(updateHoraFinal, dataHoraFinal, idLogAcesso);
        System.out.println("deu certo");
    }

    public Integer getIdLogAcesso() {
        return idLogAcesso;
    }

    public void setIdLogAcesso(Integer idLogAcesso) {
        this.idLogAcesso = idLogAcesso;
    }
}
