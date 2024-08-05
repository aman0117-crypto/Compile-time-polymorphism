package Polymorphism.Compile_time;

public class Method_overloading extends Constructor_overloading {

    /*In this program there are two
    methods of same name but differ in 
    formal argument called Method Overloading*/

    public static void m1(){
        System.out.println("Hello Aman!!");
    }

    public static void m1(int a){
        System.out.println(a);
    }

    public static void main(String[] args) {
        m1();
        m1(5);
        
    }

}
