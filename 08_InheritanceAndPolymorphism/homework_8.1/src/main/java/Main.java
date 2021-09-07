import java.util.Scanner;

public class Main {

      public static BankAccount bankAccount = new BankAccount();
      public static CardAccount cardAccount = new CardAccount();
      public static DepositAccount depositAccount = new DepositAccount();




    public static void main(String[] args) {

        System.out.println("Добрый день! Какой у вас счет?");
        System.out.println("1 - Банковский счет" + "\n2 - Карта"+"\n3 - Депозит");
        Scanner scanner =new Scanner(System.in);
        String account = scanner.nextLine();

        while (true)
        {
                System.out.println("Выбирите действие:");
                System.out.println("1 - Баланс"+"\n2 - Положить" + "\n3 - Снять" + "\n4 - Перевод" + "\n5 - Выход");
                Scanner in =new Scanner(System.in);
                String command = in.nextLine();
                if (command.equals("1")){
                    if (account.equals("1")){
                    System.out.println("Денег на счете: " + bankAccount.getAmount());}
                    else if (account.equals("2")){
                        System.out.println("Денег на счете: " + cardAccount.getAmount());
                    }
                    else if (account.equals("3")){
                        System.out.println("Денег на счете: " + depositAccount.getAmount());
                    }
                }

                if (command.equals("2")) {
                    System.out.println("Введите сумму для зачисления:");
                    Scanner scanner1 = new Scanner(System.in);
                    double sum = scanner1.nextDouble();

                    if (account.equals("1")){
                        bankAccount.put(sum);
                    }
                    else if (account.equals("2")){
                        cardAccount.put(sum);
                    }
                    else if (account.equals("3")){
                        depositAccount.put(sum);
                    }
                }

                if (command.equals("3")) {
                    System.out.println("Введите сумму для снятия:");
                    Scanner scanner1 =new Scanner(System.in);
                    double sum = scanner1.nextDouble();

                    if (account.equals("1")){
                        bankAccount.take(sum);
                       }
                    else if (account.equals("2")){
                        cardAccount.take(sum);

                    }
                    else if (account.equals("3")){
                        depositAccount.take(sum);
                    }
                }
            if (command.equals("4") ) {
                System.out.println("На какой счет перевести?");
                System.out.println("1 - Банковский счет" + "\n2 - Карта"+"\n3 - Депозит");
                Scanner scanner1 =new Scanner(System.in);
                String acc = scanner1.nextLine();
                System.out.println("Введите сумму для перевода:");
                Scanner scanner2 = new Scanner(System.in);
                double sum = scanner2.nextDouble();

                 if (acc.equals("1")){
                     if (account.equals("2")){
                         cardAccount.send(bankAccount,sum);}
                     else if (account.equals("3")){
                         depositAccount.send(bankAccount,sum);}
                     else {
                         System.out.println("Перевод невозможен");
                     }
                 }
                else if (acc.equals("2")){
                     if (account.equals("1")){
                         bankAccount.send(cardAccount,sum);}
                     else if (account.equals("3")){
                         depositAccount.send(cardAccount,sum);}
                     else {
                         System.out.println("Перевод невозможен");
                     }
                }
                 else if (acc.equals("3")){
                     if (account.equals("1")){
                         bankAccount.send(depositAccount,sum);}
                     else if (account.equals("2")){
                         cardAccount.send(depositAccount,sum);}
                     else {
                         System.out.println("Перевод невозможен");
                     }
                 }

            }
                if (command.equals("5")) { break; }
        }
    }
}
