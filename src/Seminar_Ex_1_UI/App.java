package Seminar_Ex_1_UI;

public class App {
    public static void main(String[] args) {
        Frame form = new Frame("form");
        form.setBounds(0, 0, 200, 100);
        Button btn1 = new Button("btn1");
        Button btn2 = new Button("btn2");
        btn1.addActionListener(new BtnClick());
        btn2.addActionListener(new BtnClick());

        form.addComponent(btn1);
        form.addComponent(btn2);
        btn1.click();
    }
}
