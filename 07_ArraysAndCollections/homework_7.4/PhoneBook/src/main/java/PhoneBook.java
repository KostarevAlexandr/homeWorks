import java.util.*;

public class PhoneBook {

    TreeMap<String, String> book =new TreeMap<>();

    public void addContact(String phone, String name) {

        if (!book.containsValue(phone) && !phone.equals("") && !phone.equals(name) && !name.equals("")){
        book.put(name, phone);
        }else if (book.containsValue(phone) && !phone.equals("") && !phone.equals(name) && !name.equals("")){
            for ( String key : book.keySet()){
                if (book.get(key).equals(phone)){
                    book.remove(key);
                }
            }
            book.put(name,phone);
                System.out.println("Абонент переименован");
            }
    }

    public String getNameByPhone(String phone) {
        String name="";
        if (book.containsValue(phone)){
            System.out.println("Конакт найден:");
            for ( String key : book.keySet()){
               if (book.get(key).equals(phone)){name = key;
               System.out.println(name + " - "+ phone);}
            }
            }else {
            System.out.println("Такого номера нет");
            System.out.println("Введите имя для абонента "+ phone);
            Scanner scanner = new Scanner(System.in);
            name = scanner.nextLine();
                if (name.matches("^[А-Я][а-я]+")){
            addContact(phone,name);
            System.out.println("Контакт сохранен!");}
                else{System.out.println("не верный формат ввода"); }
            }
        return name + " - "+ phone;
    }

    public Set<String> getPhonesByName(String name) {
        HashSet<String> output = new HashSet<>();
        if (book.containsKey(name))
        {
            System.out.println("Контакт найден:");
            output.add(name + " - "+ book.get(name));
            System.out.println(output);
        }

        else
        {
            System.out.println("Такого имени нет");
            System.out.println("Введите номер для абонента " + name);
            Scanner scanner = new Scanner(System.in);
            String phone = scanner.nextLine();
            if (phone.matches("^(7)\\d{10}")){
            addContact(phone,name);
            System.out.println("Контакт сохранен!");}
            else {
                System.out.println("не верный формат ввода");}
        }
        return output;
    }

    public Set<String> getAllContacts() {
        TreeSet<String> output = new TreeSet<>();
        if (!book.isEmpty()){
        for (String key : book.keySet()){
            output.add( key + " - "+ book.get(key));
             }
            System.out.println(output );
        }else {
            System.out.println("Книга пуста");
        }
        return output;
    }

}