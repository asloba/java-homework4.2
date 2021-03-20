public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        float bmi = service.calculate(57, 1.7f);
        System.out.println(bmi);
    }
}
