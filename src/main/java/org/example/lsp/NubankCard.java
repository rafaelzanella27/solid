package org.example.lsp;

abstract public class NubankCard implements IPaymentInstrument{

    @Override
    public void validate() throws Exception {
        //validação básica
    }

    @Override
    public void collectPayment() {
        System.out.println("Pagamento Realizadom,m");
    }
}
