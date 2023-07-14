import java.util.List;

public class Task implements TaskRepository{

@Override
    public void AddTsk(List<String> list, String value) {
list.add(value);
    System.out.println(list);
    }


    @Override
    public void DeleteTsk(List<String> list, String value) {
        list.remove(value);
        list.add(value);
        System.out.println(list);
    }
    @Override
    public void ChangeTsk(List<String> list, String value, Integer index) {
        list.set(index,value);
        System.out.println(list);
    }
}
