package com.mycompany.jframe.hemera.tech.slack;

import org.json.JSONObject;

import java.io.IOException;

public class SlackMensagem {
    public void mandarMsgPorcentagem(Double valor, String tipo) throws IOException, InterruptedException {
        JSONObject json = new JSONObject();
        if(valor >= 90 && tipo.equals("cpu")){
            json.put("text", "O processador passou dos 90% de uso, se isso for frequente recomendamos a instalação de um novo processador!");
        }else if(valor >= 90 && tipo.equals("ram")){
            json.put("text", "A memória RAM passou dos 90% de uso, se isso for frequente recomendamos aumentar a capacidade de memória RAM!");
        }else if(valor >= 90 && tipo.equals("ssd")){
            json.put("text", "O seu armazenamento já atingiu 90% de capacidade, recomendamos a exclusão de arquivos inutilizados ou upgrade de armazenamento!");
        }else if(valor >= 40.0 && tipo.equals("down")){
            json.put("text", "Velocidade de download acima de 40MB/s, se este aviso for recorrente em uma máquina específica recomendamos verificar a utilização da mesma!");
        }else if(valor >= 40.0 && tipo.equals("up")){
            json.put("text", "Velocidade de upload acima de 40MB/s, se este aviso for recorrente em uma máquina específica recomendamos verificar a utilização da mesma!");
        }

        Slack.sendMessage(json);

    }
}
