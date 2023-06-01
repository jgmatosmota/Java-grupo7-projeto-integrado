package com.mycompany.jframe.hemera.tech.componentes;

import com.github.britooo.looca.api.core.Looca;
import com.github.britooo.looca.api.group.discos.Disco;
import com.github.britooo.looca.api.group.discos.DiscoGrupo;
import com.github.britooo.looca.api.group.discos.Volume;
import com.github.britooo.looca.api.group.memoria.Memoria;
import com.github.britooo.looca.api.group.processador.Processador;
import com.github.britooo.looca.api.group.rede.Rede;
import com.github.britooo.looca.api.group.rede.RedeInterface;
import com.github.britooo.looca.api.group.rede.RedeInterfaceGroup;
import com.mycompany.jframe.hemera.tech.conexao.ConexaoBanco;
import com.mycompany.jframe.hemera.tech.conexao.ConexaoBancoLocal;
import com.mycompany.jframe.hemera.tech.slack.Slack;
import com.mycompany.jframe.hemera.tech.slack.SlackMensagem;
import org.json.JSONObject;
import org.springframework.jdbc.core.JdbcTemplate;

import java.io.IOException;
import java.util.ArrayList;
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
            (rede) -> rede.getBytesEnviados() > 0 && rede.getBytesRecebidos() > 0).toList();
    private RedeInterface redeDaVez = ListRedesComDados.get(0);
    private SlackMensagem msgSlack = new SlackMensagem();

    //Uso cpu%, uso memoria %, uso discos%, download mbs upload mbs
    private static Double byteConverterGiga(long bytes){return (double) bytes / (1024 * 1024 * 1024);}
    private static Double byteConverterMega(long bytes){return (double) bytes / (1024 * 1024);}

    public Double getUsoCpu() throws IOException, InterruptedException {
        Double uso = looca.getProcessador().getUso();
        Double resposta = uso <= 10.0 ? uso * 10 : uso;
        msgSlack.mandarMsgPorcentagem(resposta, "down");
        return resposta;
    }
    public Double getUsoRam() throws IOException, InterruptedException{
        Double resposta = ( objtMemoria.getEmUso().doubleValue() / objtMemoria.getTotal().doubleValue()) * 100;
        msgSlack.mandarMsgPorcentagem(resposta, "ram");
        return resposta;
    }
    public Double getUsoDisco() throws IOException, InterruptedException{
        Double resposta = ((volumeA.getTotal().doubleValue() - volumeA.getDisponivel().doubleValue()) / volumeA.getTotal().doubleValue()) * 100;
        msgSlack.mandarMsgPorcentagem(resposta, "ssd");
        return resposta;
    }

    public Double getDownload() throws IOException, InterruptedException {
        long bytesRecebidosA = redeDaVez.getBytesRecebidos();
        TimeUnit.SECONDS.sleep(1);
        long bytesRecebidosB = redeDaVez.getBytesRecebidos();
        long byteRecS = bytesRecebidosB - bytesRecebidosA;
        Double resposta = byteConverterMega(byteRecS);
        msgSlack.mandarMsgPorcentagem(resposta, "down");
        return resposta;
    }

    public Double getUpload() throws IOException, InterruptedException{
        long bytesEnviadosA = redeDaVez.getBytesEnviados();
        TimeUnit.SECONDS.sleep(1);
        long bytesEnviadosB = redeDaVez.getBytesEnviados();
        long bytesEnvS = bytesEnviadosB - bytesEnviadosA;
        Double resposta = byteConverterMega(bytesEnvS);
        msgSlack.mandarMsgPorcentagem(resposta, "up");
        return resposta;

    }
    public String getMacAddress(){
        return redeDaVez.getEnderecoMac();
    }



    ConexaoBancoLocal conexaoBancoLocal = new ConexaoBancoLocal();
    JdbcTemplate conexao = conexaoBancoLocal.getConnection();
    ConexaoBanco conexaoBancoNuvem = new ConexaoBanco();
    JdbcTemplate conexaoNuvem = conexaoBancoNuvem.getConnection();


    public void RegistroMaquinaLocal(Integer idComputador, Integer idEmpresa) throws IOException, InterruptedException {
        String sql = "INSERT INTO RegistroMaquina (uso_cpu, utilizado_memoria, utilizado_armazenamento, download_rede, upload_rede, idComputador, MacAdress, idEmpresa) VALUES (?, ?, ?, ?, ?, ?, ?, ?)";
        conexao.update(sql, this.getUsoCpu(), this.getUsoRam(), this.getUsoDisco(), this.getDownload(), this.getUpload(), idComputador, getMacAddress(), idEmpresa);
    }
    public void RegistroMaquinaNuvem(Integer idComputador, Integer idEmpresa) throws IOException, InterruptedException {
        String sql = "INSERT INTO Registros (uso_cpu, utilizado_memoria, utilizado_armazenamento, download_rede, upload_rede, idComputador, MacAddress, idEmpresa) VALUES (?, ?, ?, ?, ?, ?, ?, ?)";
        conexaoNuvem.update(sql, this.getUsoCpu(), this.getUsoRam(), this.getUsoDisco(), this.getDownload(), this.getUpload(), idComputador, getMacAddress(), idEmpresa);
    }





}
