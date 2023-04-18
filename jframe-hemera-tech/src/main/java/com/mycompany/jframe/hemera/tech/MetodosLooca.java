/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.jframe.hemera.tech;

import com.github.britooo.looca.api.core.Looca;
import com.github.britooo.looca.api.group.discos.Disco;
import oshi.SystemInfo;
import com.github.britooo.looca.api.group.memoria.Memoria;
import com.github.britooo.looca.api.group.processador.Processador;
import com.github.britooo.looca.api.group.processos.ProcessoGrupo;
import com.github.britooo.looca.api.group.rede.RedeParametros;
import com.github.britooo.looca.api.group.servicos.ServicoGrupo;
import com.github.britooo.looca.api.group.sistema.Sistema;
import com.github.britooo.looca.api.group.temperatura.Temperatura;
import oshi.hardware.HWDiskStore;

/**
 *
 * @author jgmat
 */

public class MetodosLooca {
    
    private final Looca looca = new Looca();
    private HWDiskStore disco;
    private SystemInfo sistema = new SystemInfo();
    private Sistema objtSistema = new Sistema();
    private Memoria objtMemoria = new Memoria();
    private Disco objtDisco = new Disco(disco);
    private Processador objtProcessador = new Processador();
    private Temperatura objtTemperatura = new Temperatura();
    private ProcessoGrupo objtProcesso = new ProcessoGrupo();
    private ServicoGrupo objtServico = new ServicoGrupo();
    private RedeParametros objtRedeParametros = new RedeParametros(sistema);
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
    String hostName = objtRedeParametros.getHostName();
    //DiscoModelo
    String modeloDisco = objtDisco.getNome();
    //Espaço Total Disco
    Long espacoDisco = objtDisco.getTamanho();
    
    
    
    //MemoriaUtilizada(RAM)
    //MemoriaTotal(RAM)
    //MemoriaLivre(RAM)
    //DownloadRede
    //UploadRede
    //MsRede
    //TemperaturaCPU(talvez)
    //UsoCPU
    //MemoriaUtilizada(HD)
    //MemoriaTotal(HD)
    //MemoriaLivre(HD)

   
    
}
