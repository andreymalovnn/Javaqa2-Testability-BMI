public class Main {
    public static void main(String[] args) {
        BmiService bmi = new BmiService();
        double index = bmi.calculate(95.5, 1.94);
        String result = String.format("%.2f", index);
        System.out.println("Индекс массы тела =  " + result);
    }
}
