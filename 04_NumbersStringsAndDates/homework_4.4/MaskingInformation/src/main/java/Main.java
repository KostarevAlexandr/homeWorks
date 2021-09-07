public class Main {

    public static void main(String[] args) {

        String safe = searchAndReplaceDiamonds("Номер кредитной карты: <4854> 3463 <5543> 5457","***");
        System.out.println(safe);
    }
    public static String searchAndReplaceDiamonds(String text, String placeholder) {
        int spaceIndex1 = text.indexOf('<');
        int spaceIndex2 = text.indexOf('>');
        int spaceIndex3 = text.lastIndexOf('<');
        int spaceIndex4 = text.lastIndexOf('>');
       String holder1 = text.substring(spaceIndex1, spaceIndex2+1);
       text = text.replace(holder1,placeholder);
           if (spaceIndex1 != spaceIndex3 && spaceIndex2 != spaceIndex4)
            {
           String holder2 = text.substring(spaceIndex3-3,spaceIndex4-2);
           text = text.replace(holder2,placeholder);
            }
        return text;
    }
}