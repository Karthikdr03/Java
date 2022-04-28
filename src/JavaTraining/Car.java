package JavaTraining;

public class Car {
    int mod;
    int wheel;
    public static void main(String[]args){
        Car a = new Car();   //Object of Car is new Car, a, b , c represent reference of cars
        Car b = new Car();
        Car c = new Car() ;

        a.mod = 2015;
        a.wheel = 4;

        b.mod = 2014;
        b.wheel = 4;

        System.out.println( a.mod);
        System.out.println( b.mod);



    }
}

