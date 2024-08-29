package br.com.ebac.animais_service.entidades;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class Funcionario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Column(nullable = false)
    private String nome;

    @Column(nullable = false)
    private int idade;

    @Column
    private Integer numeroAnimaisRecebidos;

    @OneToMany(mappedBy = "funcionario")
    private List<Animal> animais;

    public void setAnimal(List<Animal> animais) {
        this.animais = animais;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public Integer getNumeroAnimaisRecebidos() {
        if (animais == null){
            return 0;
        }
        return animais.size();
    }

    public void setNumeroAnimaisRecebidos(Integer numeroAnimaisRecebidos) {
        this.numeroAnimaisRecebidos = numeroAnimaisRecebidos;
    }

    public List<Animal> getAnimal() {
        return animais;
    }



}
