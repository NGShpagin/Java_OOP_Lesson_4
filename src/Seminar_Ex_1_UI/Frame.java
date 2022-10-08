package Seminar_Ex_1_UI;

import java.util.ArrayList;

public class Frame extends Component {
    private ArrayList<Component> components;

    public Frame(String text) {
        super(text);
        components = new ArrayList<>();
    }

    public void addComponent(Component c) {
        if (c == this) new Exception();
        components.add(c);
    }
}
