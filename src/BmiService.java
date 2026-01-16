public class BmiService {
    public int calculate(double height, int weight) {
        double result = weight / (height * height);
        int trueResult = (int) result;
        return (int) trueResult;
    }
}
