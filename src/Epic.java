import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Epic extends Task{

    private final Map<Integer, Subtask> subTasks = new HashMap<>();

    public Epic(String name, String description) {
        super(name, description);
    }

    public Map<Integer, Subtask> getSubtasks() {
        return subTasks;
    }

    @Override
    public TaskType getType() {
        return TaskType.EPIC;
    }

    public List<Integer> getSubtaskIds() {
        return new ArrayList<>(subTasks.keySet());
    }

    public void removeSubtask(int id) {
        subTasks.remove(id);
    }

    public void cleanSubtaskIds() {
        subTasks.clear();
    }

    @Override
    public String toString() {
        return "Epic{" +
                "status=" + getStatus() +
                ", name='" + getName() + '\'' +
                ", description='" + getDescription()  +
                ", {subTasks=" + subTasks+"}}";
    }
}
