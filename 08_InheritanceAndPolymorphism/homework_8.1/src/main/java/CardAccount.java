public class CardAccount extends BankAccount {


    @Override
     boolean take(double amountToTake) {
       return super.take(amountToTake+(amountToTake/100));
    }
}
