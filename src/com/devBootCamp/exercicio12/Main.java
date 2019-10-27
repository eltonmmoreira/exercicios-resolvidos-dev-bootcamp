package com.devBootCamp.exercicio12;

public class Main {

    public static void main(String[] args) {
        var endereco = new Endereco();
        endereco.setRua("Afonso Pena");
        endereco.setNumero("1710");
        endereco.setBairro("Sambugaro");
        endereco.setCep("123123123");
        endereco.setCidade("Pato Branco");
        endereco.setComplemento("VIASOFT");
        var proprietario = new Proprietario("11111111111", "123", endereco);
        var marca = new Marca();
        marca.setId(1);
        marca.setAnoDeFabricacao(2016);
        marca.setNome("Chevrolet");
        var veiculo = new Carro(proprietario, 25D);
        veiculo.setMarca(marca);
        veiculo.setVelocidadeMaxima(200);
        veiculo.setNumeroDeMarchas(6);

        veiculo.acelera();
        log(veiculo);
        veiculo.freia();
        log(veiculo);
        veiculo.acelera();
        log(veiculo);
        veiculo.acelera();
        log(veiculo);
        veiculo.trocarMarcha();
        log(veiculo);
        veiculo.acelera();
        log(veiculo);
        veiculo.reduzirMarcha();
        log(veiculo);
        veiculo.marchaRe();
        log(veiculo);
        veiculo.acelera();
        log(veiculo);
        veiculo.trocarMarcha();
        log(veiculo);
        veiculo.freia();
        log(veiculo);
        veiculo.marchaRe();
        System.out.println("Autonomia " + veiculo.getAutonomia(10D));
    }

    private static void log(Carro carro) {
        System.out.println("Velocidade: " + carro.getVelocidadeAtual());
        System.out.println("Marcha: " + carro.getMarchaAtual());
    }
}
