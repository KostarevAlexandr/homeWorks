public class PhysicalPerson extends Client {


    public void conditions(){
        System.out.println("условие пополнения:  сумма должна быть больше 0 руб. Условие снятия: сумма должна быть меньше чем на счете. Баланс: "+getAmount());

    }
}
