public class IndividualBusinessman extends Client {

    @Override
    public void put(double amountToPut) {

     double result =  amountToPut >= 1000 ?  amountToPut-amountToPut*0.005 :  amountToPut-amountToPut/100;
        super.put(result);
    }

    public void conditions(){
        System.out.println( "условие пополнения:  сумма должна быть больше 0 руб + коммиссия 1%(если сумма больше 1000руб) или 0,5% если больше 1000руб. Условие снятия: сумма должна быть меньше чем на счете. Баланс: "+getAmount());
    }
}
