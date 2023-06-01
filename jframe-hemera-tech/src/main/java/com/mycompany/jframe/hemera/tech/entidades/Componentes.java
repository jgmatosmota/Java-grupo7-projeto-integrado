package com.mycompany.jframe.hemera.tech.entidades;

public class Componentes {
    //SistemaOperacional varchar(45), ModeloProcessador varchar(45), HostName varchar(45)), MemoriaTotal varchar(45), MemoriaArmazenamento varchar(45));"
    private Integer idComputador;
    private String SistemaOperacional;
    private String ModeloProcessador;
    private String HostName;
    private String MemoriaTotal;
    private String MemoriaArmazenamento;
    private Integer idEmpresa;


    public Integer getId() {
        return idComputador;
    }

    public void setId(Integer id) {
        this.idComputador = id;
    }

    public Componentes(Integer id,String sistemaOperacional, String modeloProcessador, String hostName, String memoriaTotal, String memoriaArmazenamento,Integer idE) {
        idComputador = id;
        SistemaOperacional = sistemaOperacional;
        ModeloProcessador = modeloProcessador;
        HostName = hostName;
        MemoriaTotal = memoriaTotal;
        MemoriaArmazenamento = memoriaArmazenamento;
        idEmpresa = idE;
    }
    public Componentes(){

    }

    public String getSistemaOperacional() {
        return SistemaOperacional;
    }

    public void setSistemaOperacional(String sistemaOperacional) {
        SistemaOperacional = sistemaOperacional;
    }

    public String getModeloProcessador() {
        return ModeloProcessador;
    }

    public void setModeloProcessador(String modeloProcessador) {
        ModeloProcessador = modeloProcessador;
    }

    public String getHostName() {
        return HostName;
    }

    public void setHostName(String hostName) {
        HostName = hostName;
    }

    public String getMemoriaTotal() {
        return MemoriaTotal;
    }

    public void setMemoriaTotal(String memoriaTotal) {
        MemoriaTotal = memoriaTotal;
    }

    public String getMemoriaArmazenamento() {
        return MemoriaArmazenamento;
    }

    public void setMemoriaArmazenamento(String memoriaArmazenamento) {
        MemoriaArmazenamento = memoriaArmazenamento;
    }

    public Integer getIdEmpresa() {
        return idEmpresa;
    }

    public void setIdEmpresa(Integer idEmpresa) {
        this.idEmpresa = idEmpresa;
    }

    @Override
    public String toString() {
        return "Componentes{" +
                "id=" + idComputador +
                ", SistemaOperacional='" + SistemaOperacional + '\'' +
                ", ModeloProcessador='" + ModeloProcessador + '\'' +
                ", HostName='" + HostName + '\'' +
                ", MemoriaTotal='" + MemoriaTotal + '\'' +
                ", MemoriaArmazenamento='" + MemoriaArmazenamento + '\'' +
                ", idEmpresa=" + idEmpresa +
                '}';
    }
}
