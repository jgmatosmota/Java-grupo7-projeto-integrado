/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.jframe.hemera.tech;

import oshi.hardware.NetworkIF;

/**
 *
 * @author jgmat
 */
public class ListaHardware {
    public static void main(String[] args) {
        MetodosLooca looca = new MetodosLooca();
        NetworkIF redeInterface = looca.getRedeInterface();
        long bytesRecebidos;
        long bytesEnviados;
        if (redeInterface != null) {
            redeInterface.updateAttributes();
            bytesRecebidos = redeInterface.getBytesRecv();
            bytesEnviados = redeInterface.getBytesSent();
            // ...
            // Use os valores de bytesRecebidos e bytesEnviados conforme necessário
            // ...
        }
        
        //Sistema Operacional
        System.out.println("Sistema Operacional");
        System.out.println(looca.sistemaOperacional);
        //ProcessadorModelo
        System.out.println("ProcessadorModelo");
        System.out.println(looca.modeloProcessador);
        //MemoriaModelo
        System.out.println("MemoriaModelo");
        System.out.println(looca.memoriaTotal);
        //Não tem modelo!(trouxe total de memória)
        //info rede
        System.out.println("info rede");
        System.out.println(looca.hostName);
        //DiscoModelo
//        System.out.println(looca.modeloDisco);
        //Espaço Total Disco
//        System.out.println(looca.discoTotal);
        System.out.println("-".repeat(30));
        
        
        //MemoriaUtilizada(RAM)
        System.out.println("//MemoriaUtilizada(RAM)");
        System.out.println(looca.memoriaUtilizada);
        //MemoriaTotal(RAM)
        System.out.println("MemoriaTotal(RAM)");
        System.out.println(looca.memoriaTotal);
        //MemoriaLivre(RAM)
        System.out.println("MemoriaLivre(RAM)");
        System.out.println(looca.memoriaDisponivel);
        //DownloadRede
        System.out.println("DownloadRede");
        System.out.println(redeInterface.getBytesRecv());
        //UploadRede
        System.out.println("UploadRede");
        System.out.println(redeInterface.getBytesSent());
        //TemperaturaCPU(talvez)
        System.out.println("TemperaturaCPU");
        System.out.println(looca.temperaturaAtual);
        //UsoCPU
        System.out.println("UsoCPU");
        System.out.println(looca.usoCpu);
        //MemoriaTotal(HD)
        System.out.println("MemoriaTotal(HD)");
        System.out.println(looca.espacoDisco);
         
    }
}
