package org.example.ocp.Veiculos;

//OCP - Principio aberto | fechado
public interface IVeiculoCarro {

    public void configureVeiculo(String cor, String ano, double motor, int assentos);
    public void ligarVeiculo();
}
