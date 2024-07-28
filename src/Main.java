public class Main {
    public static TaskManager taskManager;

    public static void main(String[] args) {

        taskManager = new TaskManager();
        Task task1 = new Task("Задача 1", "Действие", TaskStatus.NEW);
        Task task2 = new Task("Задача 2", "Действие", TaskStatus.NEW);
        Epic epic1 = new Epic("Эпик 1", "Действие");
        Subtask subTask11 = new Subtask("Подзадача 1", "Действие", TaskStatus.DONE);
        Subtask subTask12 = new Subtask("Подзадача 2", "Действие", TaskStatus.NEW);
        Epic epic2 = new Epic("Эпик 2", "Действие");
        Subtask subTask21 = new Subtask("Подзадача 1", "Действие", TaskStatus.DONE);
        int idT1 = taskManager.taskPut(task1);
        int idT2 = taskManager.taskPut(task2);
        int idE1 = taskManager.epicsPut(epic1);
        int idSt1 = taskManager.subtaskPut(epic1, subTask11);
        int idSt2 = taskManager.subtaskPut(epic1, subTask12);
        int idE2 = taskManager.epicsPut(epic2);
        int idSt3 = taskManager.subtaskPut(epic2, subTask21);
        System.out.println(taskManager.getTasks());
        System.out.println(taskManager.getEpics());
        System.out.println(taskManager.getSubtasks());
        task1 = new Task("Задача 1", "Действие", TaskStatus.DONE);
        epic2 = new Epic("Эпик 4", "Действие");
        subTask11 = new Subtask("Подзадача 1", "Действие", TaskStatus.NEW);
        taskManager.taskReplace(idT1,task1);
        taskManager.epicReplace(idE2,epic2);
        taskManager.subtaskReplace(idSt1,epic1,subTask11);
        System.out.println();
        System.out.println(taskManager.getTasks());
        System.out.println(taskManager.getEpics());
        System.out.println(taskManager.getSubtasks());
        taskManager.deleteTask(idT1);
        taskManager.deleteEpic(idE1);
        taskManager.deleteSubtask(idSt3);
        System.out.println();
        System.out.println(taskManager.getTasks());
        System.out.println(taskManager.getEpics());
        System.out.println(taskManager.getSubtasks());
        taskManager.deleteTasks();
        taskManager.deleteEpics();
        System.out.println();
        System.out.println(taskManager.getTasks());
        System.out.println(taskManager.getEpics());
        System.out.println(taskManager.getSubtasks());

    }
}