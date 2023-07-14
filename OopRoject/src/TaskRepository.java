import java.util.ArrayList;
import java.util.List;

public interface TaskRepository {
    void AddTsk(List<String> list, String value);
    void DeleteTsk(List<String> list, String value);
    void ChangeTsk(List<String> list, String value, Integer index);
}
