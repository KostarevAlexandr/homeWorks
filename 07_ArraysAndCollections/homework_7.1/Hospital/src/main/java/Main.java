public class Main {
    public static void main(String[] args) {

        float[] temperatureData = Hospital.generatePatientsTemperatures(5);
        System.out.println(Hospital.getReport(temperatureData));
    }
}
