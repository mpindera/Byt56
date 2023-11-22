package Calc;

public class Main {
    public static void main(String[] args) {
        Chain add = new Add(1, 0);
        add.show();
        Chain subtract = new Subtract(3, 1);
        subtract.show();
        Chain divide = new Divide(9, 3);
        divide.show();
        Chain multiply = new Multiply(2, 2);
        multiply.show();
    }
}