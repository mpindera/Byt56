package Calc;

public interface Chain {
    Float calculate();

    default void show(){
        System.out.println(calculate());
    }
}
