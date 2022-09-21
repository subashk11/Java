package com.oops;

public class Constructor {
    int manu_year;
    String CarName;
    public Constructor(int year, String carName){
        manu_year=year;
        CarName=carName;
    }
    public static void main(String[] args) {
        Constructor car1=new Constructor(1956,"BMW");
        System.out.println(car1.manu_year+" "+car1.CarName);

        Constructor car2=new Constructor(1934,"TATA");
        System.out.println(car2.manu_year+" "+car2.CarName);
    }
}
