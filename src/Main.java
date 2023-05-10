public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        int massKg = 98;
        double heightM = 1.87;
        int bmi = service.calculate(massKg, heightM);
        System.out.println(bmi);
        }
    }