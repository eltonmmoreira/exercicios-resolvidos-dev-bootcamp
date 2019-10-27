package com.devBootCamp.exercicio12;

public class Carro {
    private String modelo;
    private String cor;
    private Marca marca;
//    private Integer ano;
//    private String marca;
    private String chassi;
    private Proprietario proprietario;
    private Integer velocidadeMaxima;
    private Integer velocidadeAtual;
    private Integer numeroDePortas;
    private Integer numeroDeMarchas;
    private Integer marchaAtual;
    private Double quantidadeDeCombustivel;

    public Carro(Proprietario proprietario, Double quantidadeDeCombustivel) {
        this.proprietario = proprietario;
        this.quantidadeDeCombustivel = quantidadeDeCombustivel;
        velocidadeAtual = 0;
        marchaAtual = 0;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

//    public Integer getAno() {
//        return ano;
//    }
//
//    public void setAno(Integer ano) {
//        this.ano = ano;
//    }
//
//    public String getMarca() {
//        return marca;
//    }
//
//    public void setMarca(String marca) {
//        this.marca = marca;
//    }

    public Marca getMarca() {
        return marca;
    }

    public void setMarca(Marca marca) {
        this.marca = marca;
    }

    public String getChassi() {
        return chassi;
    }

    public void setChassi(String chassi) {
        this.chassi = chassi;
    }

    public Proprietario getProprietario() {
        return proprietario;
    }

    public void setProprietario(Proprietario proprietario) {
        this.proprietario = proprietario;
    }

    public Integer getVelocidadeMaxima() {
        return velocidadeMaxima;
    }

    public void setVelocidadeMaxima(Integer velocidadeMaxima) {
        this.velocidadeMaxima = velocidadeMaxima;
    }

    public Integer getVelocidadeAtual() {
        return velocidadeAtual;
    }

    public void setVelocidadeAtual(Integer velocidadeAtual) {
        this.velocidadeAtual = velocidadeAtual;
    }

    public Integer getNumeroDePortas() {
        return numeroDePortas;
    }

    public void setNumeroDePortas(Integer numeroDePortas) {
        this.numeroDePortas = numeroDePortas;
    }

    public Integer getNumeroDeMarchas() {
        return numeroDeMarchas;
    }

    public void setNumeroDeMarchas(Integer numeroDeMarchas) {
        this.numeroDeMarchas = numeroDeMarchas;
    }

    public Double getQuantidadeDeCombustivel() {
        return quantidadeDeCombustivel;
    }

    public void setQuantidadeDeCombustivel(Double quantidadeDeCombustivel) {
        this.quantidadeDeCombustivel = quantidadeDeCombustivel;
    }

    public Integer getMarchaAtual() {
        return marchaAtual;
    }

    public void setMarchaAtual(Integer marchaAtual) {
        this.marchaAtual = marchaAtual;
    }

    public void acelera() {
        if (!velocidadeAtual.equals(velocidadeMaxima)) {
            velocidadeAtual++;
        }
    }

    public void freia() {
        velocidadeAtual = 0;
    }

    public void trocarMarcha() {
        if (!marchaAtual.equals(numeroDeMarchas)) {
            marchaAtual++;
        }
    }

    public void reduzirMarcha() {
        if (!marchaAtual.equals(0)) {
            marchaAtual--;
        }
    }

    public void marchaRe() {
        if (velocidadeAtual == 0) {
            marchaAtual = 0;
        } else {
            System.out.println("Não é possível colocar a marcha Ré com o veículo em movimento. Velocidade " + velocidadeAtual);
        }
    }

    public Double getAutonomia(Double consumoMedio) {
        return consumoMedio * quantidadeDeCombustivel;
    }
}
