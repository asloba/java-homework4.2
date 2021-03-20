public class BmiService {
    public float calculate(long weight, float height) {
        float bmi;
        bmi = weight / (height * height);
        return bmi;
    }
}
