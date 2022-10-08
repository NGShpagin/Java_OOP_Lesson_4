package Homewok_Ex_1_Planner;

public class App {
    public static void main(String[] args) {
        Task task1 = new Task("Clean My House");
        task1.addItem("clean Toilet");
        task1.addItem("clean Kitchen");
        task1.addItem("clean Living room");
        task1.setDueDate(12, 10, 2022);
        task1.setPriority(Task.Priority.High);
        System.out.println(task1);
    }
}
