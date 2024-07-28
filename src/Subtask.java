public class Subtask extends Task {

    private Epic epic;

    public Subtask(String name, String description,TaskStatus status) {
        super(name, description, status);
    }

    @Override
    public String toString() {
        return "SubTask{" +
                "status=" + getStatus() +
                ", name='" + getName() + '\'' +
                ", description='" + getDescription()+"}"
                ;
    }

    public void setEpic(Epic epic) {
        this.epic = epic;
    }

    @Override
    public TaskType getType() {
        return TaskType.SUBTASK;
    }


    public Epic getEpic() {
        return epic;
    }

    public int getEpicId() {
        return epic.getId();
    }

}

