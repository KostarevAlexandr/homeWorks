import java.util.ArrayList;

public class TodoList {
    ArrayList<String> list = new ArrayList<>();

    public void add(String todo)
    {
            list.add(todo);
    }

    public void add(int index, String todo)
    {
             list.add(index,todo);
    }

    public void edit(  String todo, int index)
    {
              list.set(index,todo);
    }

    public void delete(int index)
    {
           list.remove(index);
    }


    public ArrayList<String> getTodos()
    {
        for (int i =0; i<list.size();i++)
        {
            System.out.println(i+ " - " + list.get(i));
        }
        return list;
    }
}