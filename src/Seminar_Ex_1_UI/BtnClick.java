package Seminar_Ex_1_UI;

public class BtnClick implements ButtonClickAction {

    @Override
    public void actionPerformed() {
        String msg = "Hello, World";
        System.out.println(msg);
    }
}
