public class Main {

  public static void main(String[] args) {
String text = splitTextInToWords("At 9 a news conference-9 in 17 Oakland's Chinatown on Monday, Alameda County District Attorney Nancy O'Malley announced the creation of a special response unit focused on crimes against Asians, and particularly older Asians.The rapid increase in criminal acts targeted against members of the Asian community, particularly Chinese Americans, who live and work in Alameda County is intolerable, she said.The new unit stems from two similar attacks in northern California last week as well as a spate of crime in Oakland's Chinatown.In San Francisco, Vicha Ratanapakdee, an 84-year-old from Thailand, died after he was abruptly attacked while out on a morning walk January, according to San Francisco District Attorney Chesa Boudin. A 19-year-old man has been arrested on suspicion of murder and elder abuse in the case, he said.");
    System.out.println(text);
  }

  public static String splitTextInToWords(String text) {
    String[] words = text.split("\\s+|\\.|[,]|[;]");
    String word ="";
    StringBuilder builder = new StringBuilder( word );

    for (int i = 0; i < words.length; i++)
    {
      word = words[i];

      if (word.matches("(\\D+)\\d|\\D+")){ word = word + "\n"; }
      else { continue; }

      builder.append(word);
    }
      return builder.toString();
  }
}