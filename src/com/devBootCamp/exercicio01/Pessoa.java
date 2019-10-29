package com.devBootCamp.exercicio01;

import com.devBootCamp.Util;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import static com.devBootCamp.Util.formatarData;

public class Pessoa {
    private String nome;
    private String sobrenome;
    private String cpf;
    private LocalDate dataDeNascimento;
    private List<Endereco> enderecos = new ArrayList<>();
    private List<Telefone> telefones = new ArrayList<>();

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public LocalDate getDataDeNascimento() {
        return dataDeNascimento;
    }

    public void setDataDeNascimento(LocalDate dataDeNascimento) {
        this.dataDeNascimento = dataDeNascimento;
    }

    public List<Endereco> getEnderecos() {
        return enderecos;
    }

    public void setEnderecos(List<Endereco> enderecos) {
        this.enderecos = enderecos;
    }

    public List<Telefone> getTelefones() {
        return telefones;
    }

    public void setTelefones(List<Telefone> telefones) {
        this.telefones = telefones;
    }

    public void dadosDaPessoa() {
        System.out.println("Nome: " + nome);
        System.out.println("Sobrenome: " + sobrenome);
        System.out.println("CPF: " + cpf);
        System.out.println("Data De Nascimento: " + formatarData(dataDeNascimento));
        System.out.println("Sobrenome: " + sobrenome);
        System.out.println("Endereços: ");
        for (Endereco endereco : enderecos) {
            System.out.println("Rua: " + endereco.getEndereco());
            System.out.println("Número: " + endereco.getNumero());
            System.out.println("Bairro: " + endereco.getBairro());
        }
        System.out.println("Telefones: ");
        for (Telefone telefone : telefones) {
            System.out.println("Número: " + telefone.getNumero());
            System.out.println("Tipo: " + telefone.getTipoTelefone().getLabel());
        }
    }

//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (o == null || getClass() != o.getClass()) return false;
//        Pessoa pessoa = (Pessoa) o;
//        return Objects.equals(cpf, pessoa.cpf);
//    }
//
//    @Override
//    public int hashCode() {
//        return Objects.hash(cpf);
//    }
}
