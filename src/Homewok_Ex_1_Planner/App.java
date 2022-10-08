package Homewok_Ex_1_Planner;

public class App {
    public static void main(String[] args) {
        Planner myTasks = new Planner("My tasks");
        Task task1 = myTasks.addTask("Clean My House");
        task1.addItem("clean Toilet");
        task1.addItem("clean Kitchen");
        task1.addItem("clean Living room");
        task1.setDueDate(12, 10, 2022);
        task1.setPriority(Task.Priority.High);
        System.out.println(task1);
        System.out.println("----------");
        task1.setState(Task.State.Done);
        System.out.println(task1);

        System.out.println("+++++++++");
        Task task2 = myTasks.addTask("Complete HomeWork");
        task2.addItem("Complete Ex_1");
        task2.addItem("Complete Ex_2");
        task2.setDueDate(12, 10, 2022);
        task2.setPriority(Task.Priority.High);
        System.out.println(task2);
        System.out.println(myTasks.getTasks());
    }
}
