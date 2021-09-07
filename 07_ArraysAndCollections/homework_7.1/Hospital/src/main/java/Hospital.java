import java.util.Arrays;

public class Hospital {

    public static float[] generatePatientsTemperatures(int patientsCount) {

          float [] temperature = new float[patientsCount];

           for (int i =0; i<patientsCount; i++)
           {
                temperature [i] = (float) (32+ Math.random()*8);
           }
        return temperature;
    }

    public static String getReport(float[] temperatureData) {

        float sum = 0;
        float mean = 0;
        int countHealthy =0;

        for (int i=0; i<temperatureData.length; i++)
        {
            sum= sum + temperatureData[i];
            mean = (float)Math.round((sum/ temperatureData.length)*100)/100;
            temperatureData[i] = (float) Math.round((32+ Math.random()*8)*10)/10;

            //Кол-во здоровых:
            if (temperatureData[i] >= 36.2 && temperatureData[i]<=36.9) { countHealthy++; }
        }

        String report =
                "Температуры пациентов: " + Arrays.toString(temperatureData) +
                        "\nСредняя температура: " + mean +
                        "\nКоличество здоровых: " + countHealthy;

        return report;
    }
}
