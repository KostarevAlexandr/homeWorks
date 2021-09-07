public class Main {
    public static void main(String[] args) {
        String text = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";

        for (int i =0; text.length()>i; i++){
        char s = text.charAt(i);
        int code = (int) s;
        System.out.println(s +" = "+ code);
        }
    }
}
