package Polymorphism.Compile_time;

public class Method_shadowing_child extends Method_shadowing_parent{

    public static void m1(){
        System.out.println("This is a static method of child class..");
    }

    public static void main(String[] args) {
        Method_shadowing_parent mp=new Method_shadowing_parent();
        mp.m1();

        Method_shadowing_child mc=new Method_shadowing_child();
        mc.m1();
    }
    
}
