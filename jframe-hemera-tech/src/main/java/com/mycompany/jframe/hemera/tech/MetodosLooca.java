/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.jframe.hemera.tech;

import com.github.britooo.looca.api.core.Looca;
import com.github.britooo.looca.api.group.discos.Disco;
import com.github.britooo.looca.api.group.discos.Volume;
import oshi.SystemInfo;
import oshi.software.os.OSFileStore;
import oshi.hardware.NetworkIF;
import com.github.britooo.looca.api.group.memoria.Memoria;
import com.github.britooo.looca.api.group.processador.Processador;
import com.github.britooo.looca.api.group.processos.ProcessoGrupo;
import com.github.britooo.looca.api.group.rede.RedeParametros;
import com.github.britooo.looca.api.group.servicos.ServicoGrupo;
import com.github.britooo.looca.api.group.sistema.Sistema;
import com.github.britooo.looca.api.group.temperatura.Temperatura;
import oshi.hardware.HWDiskStore;
import oshi.hardware.HardwareAbstractionLayer;

/**
 *
 * @author jgmat
 */

public class MetodosLooca {
    HardwareAbstractionLayer hardware = new SystemInfo().getHardware();
    
    final Looca looca = new Looca();
    HWDiskStore disco;
    NetworkIF redeInterface;
    SystemInfo sistema = new SystemInfo();
    Sistema objtSistema = new Sistema();
    Memoria objtMemoria = new Memoria();
    Disco objtDisco = new Disco(disco);
    Processador objtProcessador = new Processador();
    Temperatura objtTemperatura = new Temperatura();
    ProcessoGrupo objtProcesso = new ProcessoGrupo();
    ServicoGrupo objtServico = new ServicoGrupo();
    RedeParametros objtRedeParametros = new RedeParametros(sistema);
   
//    private DiscoGrupo objtDiscos = new DiscoGrupo();
    //    Rede objtRede = new Rede(sistema);
    
    //Sistema Operacional
    String sistemaOperaciona = objtSistema.getSistemaOperacional();
    //ProcessadorModelo
    String modeloProcessador = objtProcessador.getNome();
    //MemoriaModelo
    //Não tem modelo!(trouxe total de memória)
    Long modeloMemoria = objtMemoria.getTotal();
    //PlacaDeRedeModelo
    //Não tem na API(Buscar fora)
    String hostMac = redeInterface.getMacaddr();
    String hostName = objtRedeParametros.getHostName();
    //DiscoModelo
    String modeloDisco = objtDisco.getNome();
    //Espaço Total Disco
    Long espacoDisco = objtDisco.getTamanho();
    
    
    
    //MemoriaUtilizada(RAM)
    long memoriaUtilizada = objtMemoria.getEmUso();
    //MemoriaTotal(RAM)
    long memoriaTotal = objtMemoria.getTotal();
    //MemoriaLivre(RAM)
    long memoriaDisponivel = objtMemoria.getDisponivel();
    //DownloadRede
    long bytesRecebidos = redeInterface.getBytesRecv();
    //UploadRede
    long bytesEnviados = redeInterface.getBytesRecv();
    //MsRede
    //TemperaturaCPU(talvez)
    Double temperaturaAtual = hardware.getSensors().getCpuTemperature();
    //UsoCPU
    Double usoCpu = objtProcessador.getUso();
    //MemoriaUtilizada(HD)
    //MemoriaTotal(HD)
    long discoTotal = objtDisco.getTamanho();
    //MemoriaLivre(HD)

   
    
}
