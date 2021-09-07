public abstract class Client {
    private double money =0;

    public double getAmount() {
        return money;
    }

    public void put(double amountToPut) {
        if (amountToPut<=0){
            System.out.println("Сумма ниже нуля, повторите.");
        }else {
            money=money+amountToPut;
            System.out.println("Сумма зачислена");
        }
    }

    public void take(double amountToTake) {
        if (amountToTake<money && amountToTake>0){
            money= money-amountToTake;
            System.out.println("Сумма снята");
        }
    }
    public abstract void conditions();


}
