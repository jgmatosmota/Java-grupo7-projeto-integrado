package com.mycompany.jframe.hemera.tech;

import com.github.britooo.looca.api.core.Looca;
import com.github.britooo.looca.api.group.discos.Disco;
import com.github.britooo.looca.api.group.discos.DiscoGrupo;
import com.github.britooo.looca.api.group.discos.Volume;
import com.github.britooo.looca.api.group.memoria.Memoria;
import com.github.britooo.looca.api.group.processador.Processador;
import com.github.britooo.looca.api.group.rede.Rede;
import com.github.britooo.looca.api.group.rede.RedeInterface;
import com.github.britooo.looca.api.group.rede.RedeInterfaceGroup;
import com.github.britooo.looca.api.group.sistema.Sistema;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class ComponentesMaquinaRegistro {
    private Looca looca = new Looca();
    private Processador objtProcessador = new Processador();
    private Memoria objtMemoria = new Memoria();
    private DiscoGrupo objtDiscoGrupo = looca.getGrupoDeDiscos();
    private  List<Volume> volumes = objtDiscoGrupo.getVolumes();
    private Volume volumeA = volumes.get(0);
    private List<Disco> discos = objtDiscoGrupo.getDiscos();
    private Disco discoA = discos.get(0);
    private Long memoriaArmazenamento = discoA.getTamanho();
    private Rede rede = looca.getRede();
    private RedeInterfaceGroup gruposDeInterface = rede.getGrupoDeInterfaces();
    private List<RedeInterface> interfaces = gruposDeInterface.getInterfaces();
    private List<RedeInterface> ListRedesComDados = interfaces.stream().filter(
            rede -> rede.getBytesEnviados() > 0 && rede.getBytesRecebidos() > 0).toList();
    private RedeInterface redeDaVez = ListRedesComDados.get(0);

    //Uso cpu%, uso memoria %, uso discos%, download mbs upload mbs
    private static Double byteConverterGiga(long bytes){
        return (double) bytes /(1024 * 1024 * 1024);
    }
    private static Double byteConverterMega(long bytes){
        return (double) bytes / (1024 * 1024);
    }
    public Double getUsoCpu(){
        return objtProcessador.getUso();
    }
    public Double getUsoRam(){
        return (objtMemoria.getTotal().doubleValue() / objtMemoria.getEmUso().doubleValue()) * 100;
    }
    public Double getUsoDisco(){
        return (volumeA.getTotal().doubleValue() / (volumeA.getTotal().doubleValue() - volumeA.getDisponivel().doubleValue())) * 100;
    }

    public Double getDownload() throws InterruptedException {
        long bytesRecebidosA = redeDaVez.getBytesRecebidos();
        TimeUnit.SECONDS.sleep(1);
        long bytesRecebidosB = redeDaVez.getBytesRecebidos();
        long byteRecS = bytesRecebidosB - bytesRecebidosA;
        return byteConverterMega(byteRecS);
    }

    public Double getUpload() throws InterruptedException{
        long bytesEnviadosA = redeDaVez.getBytesEnviados();
        TimeUnit.SECONDS.sleep(1);
        long bytesEnviadosB = redeDaVez.getBytesEnviados();
        long bytesEnvS = bytesEnviadosB - bytesEnviadosA;
        return byteConverterMega(bytesEnvS);

    }




}
