package org.example.lsp;

public class CreditCard extends NubankCard{

    @Override
    public void validate() throws Exception {
        //validação do cartao de crédito
        System.out.println("Validando Limite");
        System.out.println("Limite OK");
    }
}
