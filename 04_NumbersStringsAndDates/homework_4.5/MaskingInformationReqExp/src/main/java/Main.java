import javax.sound.midi.Soundbank;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

    public static void main(String[] args) {

        System.out.println(searchAndReplaceDiamonds("Если в строке <есть ковычки> то <это нужно исправить> ", "нет ковычек"));

    }

    public static String searchAndReplaceDiamonds(String text, String placeholder) {
               Pattern check = Pattern.compile("<.*?>");
        Matcher n = check.matcher(text);

        if (n.find())
        {
           text = text.replaceAll("<.*?>", placeholder);
        }

            return text;
    }

}