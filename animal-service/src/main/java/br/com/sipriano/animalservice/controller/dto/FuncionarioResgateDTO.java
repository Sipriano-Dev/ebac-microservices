package br.com.sipriano.animalservice.controller.dto;

public class FuncionarioResgateDTO {

    private String nomeFuncionario;
    private Long quantidadeAnimais;

    public FuncionarioResgateDTO(String nomeFuncionario, Long quantidadeAnimais) {
        this.nomeFuncionario = nomeFuncionario;
        this.quantidadeAnimais = quantidadeAnimais;
    }

    public String getNomeFuncionario() {
        return nomeFuncionario;
    }

    public Long getQuantidadeAnimais() {
        return quantidadeAnimais;
    }
}
