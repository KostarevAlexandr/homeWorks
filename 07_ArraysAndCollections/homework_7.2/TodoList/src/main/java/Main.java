import java.util.Scanner;

public class Main {
    private static TodoList todoList = new TodoList();

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Введите команду: ");
            String command = scanner.nextLine();
            if (command.matches("EDIT\\s+\\d+\\s.*")){
                String[] commands = command.split("\\s+",3);
                todoList.edit(commands[2],Integer.parseInt(commands[1]));
                System.out.println("Изменено");
            }
            else if (command.matches("LIST")){
                todoList.getTodos();
                System.out.println("-----------------");
                System.out.println("Всего элементов: "+todoList.list.size());
            }
            else if (command.matches("ADD\\s+\\d+\\s.*")){
                String[] commands = command.split("\\s+",3);
                todoList.add(Integer.parseInt(commands[1]),commands[2]);
                System.out.println("Добавлено под номером "+ commands[1]);
            }
            else if (command.matches("ADD\\s+.*")){
                String[] commands = command.split("\\s+",2);
                todoList.add(commands[1]);
                System.out.println("Добавлено");
            }
            else if (command.matches("DELETE\\s+\\d+")){
                String[] commands = command.split("\\s+",2);
                todoList.delete(Integer.parseInt(commands[1]));
                System.out.println("Удалено");
            }
            else if (command.equals("EXIT")){
                break;
            }
            else {
                System.out.println("Команда введена не верно");
            }

        }
    }
}