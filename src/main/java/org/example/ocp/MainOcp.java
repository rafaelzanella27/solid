package org.example.ocp;

import org.example.ocp.Veiculos.Carro;
import org.example.ocp.Veiculos.Moto;

public class MainOcp {

    private static TipoVeiculoEnum tipoVeiculoEnum;
    public static void main(String[] args) {
        tipoVeiculoEnum = TipoVeiculoEnum.CARRO;

        if (tipoVeiculoEnum == TipoVeiculoEnum.CARRO) {
            Carro carro = new Carro("Amarelo", "2021", 2.0, 4);
            //veiculo.carro();
        } else if (tipoVeiculoEnum == TipoVeiculoEnum.MOTO) {
            Moto moto = new Moto("branca", "2022", 250);
            //veiculo.moto();
        }
    }
}
