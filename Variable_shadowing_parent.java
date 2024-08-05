package Polymorphism.Compile_time;

public class Variable_shadowing_parent {
    
    static int a=5;
    String name="aman";

    public static void main(String[] args) {
        Variable_shadowing_parent vp=new Variable_shadowing_parent();
        System.out.println(vp.name);
        System.out.println(a);
    }

}
