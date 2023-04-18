/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.conexao.banco;

/**
 *
 * @author jgmat
 */
public class Filme {
    private Integer id;
    private String nome;
    private Integer anoLancamento;
    
    public Filme(Integer id, String nome, Integer anoLancamento){
        this.anoLancamento = anoLancamento;
        this.id = id;
        this.nome=nome;
    }
    public Filme(){
        
    }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getAnoLancamento() {
        return anoLancamento;
    }

    public void setAnoLancamento(int anoLancamento) {
        this.anoLancamento = anoLancamento;
    }
    

    @Override
    public String toString() {
        return "Filme{" + "id=" + id + ", nome=" + nome + ", anoLancamento=" + anoLancamento + '}';
    }
}
