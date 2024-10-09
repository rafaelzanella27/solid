package org.example.dip.model;

//dip - Principio de inversao de dependencia - sempre vamos programar direcionado a abstração
//tanto modulo de alto nível - quanto modulo de baixo nivel
public interface IDbProduct {
    public String getProductById(String productID);
}
