package org.example.ocp;

public class Veiculo {
    private String cor;
    private String ano;
    private double motor;
    private int assentos;

    public Veiculo(String cor, String ano, double motor, int assentos){
        this.cor = cor;
        this.ano = ano;
        this.motor = motor;
        this.assentos = assentos;
    }

    void carro(){
        System.out.println("Criando um carro: "+ cor + ano + motor + " com " + assentos + " assentos");
        ligarVeiculo();
    }

    void ligarVeiculo(){
        System.out.println("Ligando os motores");
    }

    void moto(){
        System.out.println("Criando uma moto: " + ano + " "+ motor + " cilindradas");
    }
}
