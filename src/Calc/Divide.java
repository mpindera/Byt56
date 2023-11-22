package Calc;

public class Divide implements Chain {
    float firstNum;
    float secondNum;

    public Divide(float firstNum, float secondNum) {
        this.firstNum = firstNum;
        this.secondNum = secondNum;
    }

    @Override
    public Float calculate() {
        if (secondNum != 0) {
            return firstNum / secondNum;
        } else {
            throw new ArithmeticException("Cannot divide by zero");
        }
    }

}
