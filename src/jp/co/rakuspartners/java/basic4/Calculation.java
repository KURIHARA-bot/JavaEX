package jp.co.rakuspartners.java.basic4;

public class Calculation {

    static int execute(int firstNum, char operator, int secondNum) {
        if (operator == '+') {
            return firstNum + secondNum;
        } else if (operator == '-') {
            return firstNum - secondNum;
        } else if (operator == '*') {
            return firstNum * secondNum;
        } else if (operator == '/') {
            return firstNum / secondNum;
        } else {
            throw new java.lang.ArithmeticException("");
        }

    }

}
