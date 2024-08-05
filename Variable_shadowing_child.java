package Polymorphism.Compile_time;

public class Variable_shadowing_child extends Variable_shadowing_parent{

    static int a=6;
    String name="guptaji";

    public static void main(String[] args) {
        Variable_shadowing_child vc=new Variable_shadowing_child();
        System.out.println(vc.name);
        System.out.println(a);
    }
    
}
