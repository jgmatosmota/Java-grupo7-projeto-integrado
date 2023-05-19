/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.jframe.hemera.tech;

import com.github.britooo.looca.api.core.Looca;
import com.github.britooo.looca.api.group.discos.Disco;
import com.github.britooo.looca.api.group.discos.DiscoGrupo;
import com.github.britooo.looca.api.group.memoria.Memoria;
import com.github.britooo.looca.api.group.processador.Processador;
import com.github.britooo.looca.api.group.rede.Rede;
import com.github.britooo.looca.api.group.rede.RedeInterface;
import com.github.britooo.looca.api.group.rede.RedeInterfaceGroup;
import com.github.britooo.looca.api.group.rede.RedeParametros;
import com.github.britooo.looca.api.group.sistema.Sistema;
import java.util.*;

/**
 *
 * @author jgmat
 */
public class ComponentesMaquina {

    private Looca looca = new Looca();
    private Sistema objtSistema = new Sistema();
    private Processador objtProcessador = new Processador();
    private Memoria objtMemoria = new Memoria();
    private DiscoGrupo objtDiscoGrupo = looca.getGrupoDeDiscos();
    private List<Disco> discos = objtDiscoGrupo.getDiscos();
    private Disco discoA = discos.get(0);
    private Long memoriaArmazenamento = discoA.getTamanho();
    private Rede rede = looca.getRede();
    private RedeInterfaceGroup gruposDeInterface = rede.getGrupoDeInterfaces();
    private List<RedeInterface> interfaces = gruposDeInterface.getInterfaces();
    private List<RedeInterface> ListRedesComDados = interfaces.stream().filter(
            rede -> rede.getBytesEnviados() > 0 && rede.getBytesRecebidos() > 0).toList();
    private RedeInterface redeDaVez = ListRedesComDados.get(0);
    private String macAddress = redeDaVez.getEnderecoMac();
    
    private String sistemaOperacional = objtSistema.getSistemaOperacional();
    private String modeloProcessador = objtProcessador.getNome();
    private Long totalMemoriaRam = objtMemoria.getTotal();

    private static Double byteConverter(long bytes){
        return (double) bytes /(1024 * 1024 * 1024);
    }
   
    public String getSistemaOperacional() {
        return sistemaOperacional;
    }

    public String getModeloProcessador() {
        return modeloProcessador;
    }

    public String getHostName() {
        return macAddress;
    }

    public String getMemoriaTotal() {
        Long memoriaTotal = objtMemoria.getTotal();
        Double memoriaTotalDouble = byteConverter(memoriaTotal);
        return Double.toString(memoriaTotalDouble);
    }

    public String getMemoriaArmazenamento() {
        Double armazenamentoTotalDouble = byteConverter(memoriaArmazenamento);
        return Double.toString(armazenamentoTotalDouble);
    }

   
    }
