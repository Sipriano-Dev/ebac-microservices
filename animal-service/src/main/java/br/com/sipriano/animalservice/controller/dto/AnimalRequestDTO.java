package br.com.sipriano.animalservice.controller.dto;

import java.sql.Date;

public class AnimalRequestDTO {

    private String nomeProvisorio;
    private String idadeEstimada;
    private Date dataEntrada;
    private Date dataAdocao;
    private String condicoesChegada;
    private String nomeRecebedor;
    private Date dataObito;
    private String porte;
    private String raca;

    public AnimalRequestDTO() {
    }

    public AnimalRequestDTO(String nomeProvisorio, String idadeEstimada, Date dataEntrada, Date dataAdocao, String condicoesChegada, String nomeRecebedor, Date dataObito, String porte, String raca) {
        this.nomeProvisorio = nomeProvisorio;
        this.idadeEstimada = idadeEstimada;
        this.dataEntrada = dataEntrada;
        this.dataAdocao = dataAdocao;
        this.condicoesChegada = condicoesChegada;
        this.nomeRecebedor = nomeRecebedor;
        this.dataObito = dataObito;
        this.porte = porte;
        this.raca = raca;
    }

    public String getNomeProvisorio() {
        return nomeProvisorio;
    }

    public void setNomeProvisorio(String nomeProvisorio) {
        this.nomeProvisorio = nomeProvisorio;
    }

    public String getIdadeEstimada() {
        return idadeEstimada;
    }

    public void setIdadeEstimada(String idadeEstimada) {
        this.idadeEstimada = idadeEstimada;
    }

    public Date getDataEntrada() {
        return dataEntrada;
    }

    public void setDataEntrada(Date dataEntrada) {
        this.dataEntrada = dataEntrada;
    }

    public Date getDataAdocao() {
        return dataAdocao;
    }

    public void setDataAdocao(Date dataAdocao) {
        this.dataAdocao = dataAdocao;
    }

    public String getCondicoesChegada() {
        return condicoesChegada;
    }

    public void setCondicoesChegada(String condicoesChegada) {
        this.condicoesChegada = condicoesChegada;
    }

    public String getNomeRecebedor() {
        return nomeRecebedor;
    }

    public void setNomeRecebedor(String nomeRecebedor) {
        this.nomeRecebedor = nomeRecebedor;
    }

    public Date getDataObito() {
        return dataObito;
    }

    public void setDataObito(Date dataObito) {
        this.dataObito = dataObito;
    }

    public String getPorte() {
        return porte;
    }

    public void setPorte(String porte) {
        this.porte = porte;
    }

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }
}
