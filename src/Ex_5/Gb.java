package Ex_5;

import java.lang.reflect.Member;

public class Gb {
//    public static Programmer CreateEmployee(int i) {
//        switch (i) {
//            case 0:
//                return new Intern();
//            case 1:
//                return new Middle();
//            default:
//                return new Principal();
//        }
//    }

    public static Intern CreateIntern() {
        return new Intern();
    }

    public static Middle CreateMiddle() {
        return new Middle();
    }

    public static Principal CreatePrincipal() {
        return new Principal();
    }
}
