public class LegalPerson extends Client {


    @Override
    public void take(double amountToTake) {
        super.take(amountToTake+(amountToTake/100));
    }

    public void conditions(){
        System.out.println("условие пополнения:  сумма должна быть больше 0 руб. Условие снятия: сумма должна быть меньше чем на счете + комиссия 1%. Баланс: "+getAmount());
    }
}
