public class Main {
    public static void main(String[] args) {
     char[][] size = TwoDimensionalArray.getTwoDimensionalArray(5);

        for(int i = 0; i < size.length; i++)
        {
            for(int j = 0; j < size[i].length; j++)
            {
                System.out.print(size[i][j]);
            }
            System.out.println();
        }
    }
}
