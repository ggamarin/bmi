public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        double weight = 76;
        double height = 1.76; //height in meters
        double bmi = service.calculate(height, weight);
        System.out.printf("BMI is " + bmi);

    }
}
