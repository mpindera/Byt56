package Calc;

public class Subtract implements Chain {
    float firstNum;
    float secondNum;

    public Subtract(float firstNum, float secondNum) {
        this.firstNum = firstNum;
        this.secondNum = secondNum;
    }

    @Override
    public Float calculate() {
        return firstNum - secondNum;
    }
}
