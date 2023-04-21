/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.jframe.hemera.tech;

import com.github.britooo.looca.api.core.Looca;
import com.github.britooo.looca.api.group.discos.Disco;
import oshi.SystemInfo;
import oshi.hardware.NetworkIF;
import com.github.britooo.looca.api.group.memoria.Memoria;
import com.github.britooo.looca.api.group.processador.Processador;
import com.github.britooo.looca.api.group.processos.ProcessoGrupo;
import com.github.britooo.looca.api.group.rede.RedeParametros;
import com.github.britooo.looca.api.group.servicos.ServicoGrupo;
import com.github.britooo.looca.api.group.sistema.Sistema;
import com.github.britooo.looca.api.group.temperatura.Temperatura;
import java.util.List;
import oshi.hardware.HWDiskStore;
import oshi.hardware.HardwareAbstractionLayer;

/**
 *
 * @author jgmat
 */

public class MetodosLooca {
    
    HardwareAbstractionLayer hardware = new SystemInfo().getHardware();
    List<HWDiskStore> diskStores = hardware.getDiskStores();
    HWDiskStore disco = diskStores != null && !diskStores.isEmpty() ? diskStores.get(0) : null;
    
    NetworkIF redeInterface;
    SystemInfo sistema = new SystemInfo();
    Sistema objtSistema = new Sistema();
    Memoria objtMemoria = new Memoria();
    Disco objtDisco = disco != null ? new Disco(disco) : null;
    Processador objtProcessador = new Processador();
    Temperatura objtTemperatura = new Temperatura();
    ProcessoGrupo objtProcesso = new ProcessoGrupo();
    ServicoGrupo objtServico = new ServicoGrupo();
    RedeParametros objtRedeParametros = new RedeParametros(sistema);
    
    public NetworkIF getRedeInterface() {
        List<NetworkIF> networkIFs = hardware.getNetworkIFs();
        NetworkIF redeInterface = null;
        if (!networkIFs.isEmpty()) {
            // Seleciona a primeira interface de rede disponível
            redeInterface = networkIFs.get(0);
        }
        return redeInterface;
    }

    //Sistema Operacional
    String sistemaOperacional = objtSistema.getSistemaOperacional();
    //ProcessadorModelo
    String modeloProcessador = objtProcessador.getNome();
    //MemoriaModelo
    Long modeloMemoria = objtMemoria.getTotal();
    //Host Name
    String hostName = objtRedeParametros.getHostName();
    //DiscoModelo
    String modeloDisco = objtDisco != null ? objtDisco.getNome() : "Unknown";
    //Espaço Total Disco
    Long espacoDisco = objtDisco != null ? objtDisco.getTamanho() : 0L;
    
    //MemoriaUtilizada(RAM)
    long memoriaUtilizada = objtMemoria.getEmUso();
    //MemoriaTotal(RAM)
    long memoriaTotal = objtMemoria.getTotal();
    //MemoriaLivre(RAM)
    long memoriaDisponivel = objtMemoria.getDisponivel();

    //DownloadRede
    long bytesRecebidos = redeInterface != null ? redeInterface.getBytesRecv() : 0L;
    //UploadRede
    long bytesEnviados = redeInterface != null ? redeInterface.getBytesRecv() : 0L;

    //TemperaturaCPU(talvez)
    Double temperaturaAtual = hardware.getSensors().getCpuTemperature();
    //UsoCPU
    Double usoCpu = objtProcessador.getUso();
    //MemoriaTotal(HD)
    long discoTotal = objtDisco != null ? objtDisco.getTamanho() : 0L;
}

