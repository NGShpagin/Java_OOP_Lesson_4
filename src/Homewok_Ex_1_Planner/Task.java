package Homewok_Ex_1_Planner;

import java.util.*;

public class Task {
    private static int id;
    String name;
    List<String> items = new ArrayList<>();
    Priority priority;
    State state = State.InWork;
    Calendar dueDate = new GregorianCalendar();
    private final Date originated = (new GregorianCalendar()).getTime();

    String string = "";

    private int i = 1;
    private String itemList = "\nItems:\n";

    static {
        Task.id = 0;
    }

    enum Priority {Low, Middle, High};
    enum State {Done, InWork, Cancelled}

    public Task(String name) {
        this.name = name;
        string += String.format("Id: %d\nName: %s\n", ++id, name);
    }

    public void addItem(String item) {
        items.add(item);
        itemList += String.format("  %d. %s\n", i++, item);
    }

    public void setPriority(Priority priority) {
        this.priority = priority;
        string += String.format("Priority: %s\n", priority);
    }

    public void setState(State state) {
        this.state = state;
    }

    public void setDueDate(int day, int month, int year) {
        dueDate.set(year, month, day);
        string += String.format("Due date: %s.%s.%s\n", dueDate.get(Calendar.DAY_OF_MONTH), dueDate.get(Calendar.MONTH),
                dueDate.get(Calendar.YEAR));
    }

    public void setDueDate(int day, int month, int year, int hour, int minutes) {
        dueDate.set(day, month, year, hour, minutes);
        string += String.format("Due date: %s.%s.%s %s:%s\n", dueDate.get(Calendar.DAY_OF_MONTH), dueDate.get(Calendar.MONTH),
                dueDate.get(Calendar.YEAR), dueDate.get(Calendar.HOUR_OF_DAY), dueDate.get(Calendar.MINUTE));
    }

    @Override
    public String toString() {
        return string + ("State: " + state) + itemList + ("Originated: " + originated);
    }
}
