/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package metodos.api.grupo7;

import com.github.britooo.looca.api.core.Looca;
import com.github.britooo.looca.api.group.discos.DiscoGrupo;
import com.github.britooo.looca.api.group.memoria.Memoria;
import com.github.britooo.looca.api.group.processador.Processador;
import com.github.britooo.looca.api.group.processos.ProcessoGrupo;
import com.github.britooo.looca.api.group.servicos.ServicoGrupo;
import com.github.britooo.looca.api.group.sistema.Sistema;
import com.github.britooo.looca.api.group.temperatura.Temperatura;

/**
 *
 * @author jgmat
 */
public class MetodosLooca {
    public static void main(String[] args) {
        // após configurar a dependência do Looca no arquivo pom.xml na aba "Project Files"
        //DICA: quando escrever o código objeto Looca "Looca objtLooca = new Looca();" apert CTRL + SHIFT + I que o import vem automático
        // criamos um objeto "objtLooca" que é composto por vários objetos, sendo cada componente um objeto 
        Looca objtLooca = new Looca();
        // após criarmos esse objeto iremos criar os objetos de cada componentes
        Sistema objtSistema = new Sistema();
        Memoria objtMemoria = new Memoria();
        Processador objtProcessador = new Processador();
        Temperatura objtTemperatura = new Temperatura();
        ProcessoGrupo objtProcesso = new ProcessoGrupo();
        ServicoGrupo objtServico = new ServicoGrupo();
        DiscoGrupo objtDiscos = new DiscoGrupo();
        
//        JanelaGrupo objtJanela = new ;
        // cada objeto(Sistema,Memoria,Temperatura e etc) tem diversos métodos de GET sobre cada informação dos componentes
        //Exemplos métodos do disco
        Integer objetoDiscosQtdDiscos = objtDiscos.getQuantidadeDeDiscos();
        Integer objetoDiscosQtdVolumes = objtDiscos.getQuantidadeDeVolumes();
        Integer objetoDiscos = objtDiscos.getQuantidadeDeVolumes();
        
        
    }
}
