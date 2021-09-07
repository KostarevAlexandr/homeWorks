import java.lang.reflect.Array;
import java.util.Arrays;

public class ReverseArray {

       public static String[] reverse (String[] strings){

            String temp;
           for (int i =0; i< strings.length/2; i++)
           {
               temp = strings[strings.length-i-1]; //первая половина
               strings[strings.length-i-1] = strings[i]; //вторая половина
               strings[i] =temp;
           }
       return strings;
    }
}
