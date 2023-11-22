package Calc;

public class Add implements Chain {
    float firstNum;
    float secondNum;

    public Add(float firstNum, float secondNum) {
        this.firstNum = firstNum;
        this.secondNum = secondNum;
    }

    @Override
    public Float calculate() {
        return firstNum + secondNum;
    }

}
