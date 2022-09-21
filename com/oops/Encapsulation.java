package com.oops;

class example{
    //Cannot acces outside the class
    private int passcode;

    //Encapsulation allows to use it by getter and setter method
    public int getcode(){
        return passcode;
    }
    //Using this set function to store the values of the private attribute outside the class
    public void setCode(int code){
        this.passcode=code;
    }
}
public class Encapsulation {
    public static void main(String[] args) {
        example newOne=new example();
        newOne.setCode(2345);
        System.out.println("This getter function is used to retirve the stored value of the private attribute :"+newOne.getcode());
    }
}
