package org.example.lsp;


//LSP - Princípio da Substituição de Liskov
public interface IPaymentInstrument {

    void validate() throws Exception;
    void collectPayment();
}
