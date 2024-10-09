package org.example.dip.payment;


import org.example.dip.factory.DbProductFactory;
import org.example.dip.model.Db;
import org.example.dip.model.IDbProduct;


public class Payment {
    public void pay(String productID){

        IDbProduct dbProduct = DbProductFactory.create(Db.MONGODB);
        String product = dbProduct.getProductById(productID);
        System.out.println(product);
    }
}
