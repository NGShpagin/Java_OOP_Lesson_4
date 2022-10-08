package Seminar_Ex_1_UI;

import java.util.ArrayList;

public abstract class Component {
    String text;
    protected int width;
    protected int height;
    protected int top;
    protected int left;
    protected ArrayList<Action> actions;

    public Component(String text) {
        this.text = text;
        actions = new ArrayList<>();
    }

    public void setBounds(int top, int left, int width, int height) {
        this.top = top;
        this.left = left;
        this.width = width;
        this.height = height;
    }

    public void addActionListener(Action action) {
        actions.add(action);
    }

    public void click() {
    }
}
