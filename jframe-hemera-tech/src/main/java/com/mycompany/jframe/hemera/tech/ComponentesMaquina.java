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

    Looca looca = new Looca();
    Sistema objtSistema = new Sistema();
    Processador objtProcessador = new Processador();
    Memoria objtMemoria = new Memoria();
    DiscoGrupo objtDiscoGrupo = looca.getGrupoDeDiscos();
    List<Disco> discos = objtDiscoGrupo.getDiscos();
    Disco discoA = discos.get(0);
    Long memoriaArmazenamento = discoA.getTamanho();
    Rede rede = looca.getRede();
    RedeInterfaceGroup gruposDeInterface = rede.getGrupoDeInterfaces();
    List<RedeInterface> interfaces = gruposDeInterface.getInterfaces();
    List<RedeInterface> ListRedesComDados = interfaces.stream().filter(
            rede -> rede.getBytesEnviados() > 0 && rede.getBytesRecebidos() > 0).toList();
    RedeInterface redeDaVez = ListRedesComDados.get(0);
    String macAddress = redeDaVez.getEnderecoMac();
    
    public String sistemaOperacional = objtSistema.getSistemaOperacional();
    public String modeloProcessador = objtProcessador.getNome();
    public Long totalMemoriaRam = objtMemoria.getTotal();
    public String hostName;
    private String emailUsuario;
    
    public void setEmailUsuario(String email){
        this.emailUsuario = email;
    }
    
    public String getEmailUsuario(){
        return emailUsuario;
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

    public Long getMemoriaTotal() {
        return objtMemoria.getTotal();
    }

    public Long getMemoriaArmazenamento() {
        return memoriaArmazenamento;
    }
   
   
    }
