package Class9;

public class MathLibrary {
    public int addTwo (int num1, int num2) {
        return num1 +num2;
    }
    public int subTwo (int num1, int num2) {
        return num1 - num2;
    }
    public int multiplyTwo (int num1 , int num2){
        return num1 * num2;
    }
    public double divideTwo (double num1, double num2){
        double result = num1/num2;
        if (num2 == 0) {
            return 0.00;
        }
        return result;
    }

}
