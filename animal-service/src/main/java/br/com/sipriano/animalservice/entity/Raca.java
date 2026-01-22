package br.com.sipriano.animalservice.entity;

import br.com.sipriano.animalservice.entity.enums.TipoAnimal;
import jakarta.persistence.*;

@Entity
public class Raca {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(nullable = false)
    private String nome;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private TipoAnimal tipoAnimal;

    public Raca() {
    }

    public Raca(String nome, TipoAnimal tipoAnimal) {
        this.nome = nome;
        this.tipoAnimal = tipoAnimal;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public TipoAnimal getTipoAnimal() {
        return tipoAnimal;
    }

    public void setTipoAnimal(TipoAnimal tipoAnimal) {
        this.tipoAnimal = tipoAnimal;
    }
}
