package org.example.ocp.Veiculos;

public class Moto extends Veiculo{
    public Moto(String cor, String ano, double motor){
        this.cor = cor;
        this.ano = ano;
        this.motor = motor;

        configureMoto();

    }

    public void configureMoto(){
        System.out.println("Criando uma moto: " + ano + " "+ motor + " cilindradas");
        ligarVeiculo();
    }
}
