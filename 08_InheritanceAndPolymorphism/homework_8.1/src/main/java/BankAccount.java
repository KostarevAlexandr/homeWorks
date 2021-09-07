public class BankAccount {

  private double money =0;

  public double getAmount() {
    return money;
  }

   void put(double amountToPut) {

    if (amountToPut<=0){
      System.out.println("Сумма ниже нуля, повторите.");
    }else {
    money=money+amountToPut;
    System.out.println("Сумма зачислена");
    }
  }

   boolean take(double amountToTake)
  {
    boolean success = true;
    if (amountToTake<money && amountToTake>0){
      money=money-amountToTake;
      System.out.println("Снято: "+amountToTake +" Баланс: "+getAmount());
      }
    else {
      System.out.println("Не корректная сумма ");
      success = false;
    }
    return success;
  }

  boolean send (BankAccount receiver, double amount){
    boolean success =true;
    if (take(amount)) {
      receiver.put(amount);
    }
    else {success =false;}

   return success;
  }

}
