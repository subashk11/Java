package com.oops;

class details{
    protected String fname="Peter";
    protected String lname="parker";
    protected int age =20;
}

class exPublic{
    public int x=10;
    public int y=20;
}

public class Modifiers extends details{
    private int secretKey=2345;
    public static void main(String[] args) {
        Modifiers obj1=new Modifiers();
        //public: We can access inside and outside of the class
        exPublic new1=new exPublic();
        int sum= new1.x+ new1.y;
        System.out.println("Public modifiers can be accessed anywhere in the code : "+sum);
        //private:Can be accessable only inside the declared class
        System.out.println("Can be accessed only inside the declared class "+obj1.secretKey);
        //protected:can be access only in classes and subclasses.
        System.out.println("Example of protected : "+obj1.fname+" "+obj1.lname+" "+obj1.age);
    }
}
