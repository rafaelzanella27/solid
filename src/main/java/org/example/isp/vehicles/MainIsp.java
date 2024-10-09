package org.example.isp.vehicles;

public class MainIsp {
    private static String type;
    public static void main(String[] args) {

        type= "Car";

        if (type == "Car"){
            Car car = new Car("Cinza", "2023", 2.0, 4);
        }else {
            Motorcycle motorcycle = new Motorcycle("Laranja", "2018", 600);
        }

    }
}
