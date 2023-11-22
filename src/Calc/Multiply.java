package Calc;

public class Multiply implements Chain {
    float firstNum;
    float secondNum;

    public Multiply(float firstNum, float secondNum) {
        this.firstNum = firstNum;
        this.secondNum = secondNum;
    }

    @Override
    public Float calculate() {
        return firstNum * secondNum;
    }
}
