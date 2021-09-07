import java.time.LocalDate;

public class DepositAccount extends BankAccount {
   private LocalDate lastIncome;
    

    @Override
    void put(double amountToPut) {
        lastIncome = LocalDate.now();
        super.put(amountToPut);
    }

   @Override
     boolean take(double amountToTake) {
        boolean success;
       LocalDate timeTake = LocalDate.now();
       if (timeTake.isAfter(lastIncome.plusMonths(1))) {
           success =super.take(amountToTake);
         return success;
       } else {
           System.out.println("Прошло меньше месяца после зачисления");
           success =false;
       }
        return success;
   }

}

