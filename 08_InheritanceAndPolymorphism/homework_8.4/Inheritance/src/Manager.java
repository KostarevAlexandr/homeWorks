public class Manager implements Employee {

    private int fixedPart = 20000;
    private int income = (int) (Math.random() * (140000 - 115000)) + 115000;


    @Override
    public int getMonthSalary() {
        fixedPart = fixedPart + (income * 5)/100;
        return fixedPart;
    }

 public int getSales(){
   return income;
 }

    }

