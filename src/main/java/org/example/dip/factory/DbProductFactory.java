package org.example.dip.factory;

import org.example.dip.model.Db;
import org.example.dip.model.IDbProduct;
import org.example.dip.model.MongoDBProduct;
import org.example.dip.model.MySQLProduct;

public class DbProductFactory {

    public static IDbProduct create(Db type) {
        if (type == Db.MYSQL) {
            return new MySQLProduct();
        }else {
            return new MongoDBProduct();
        }
    }

}
