package Ex_5;

public class Program {
    public static void main(String[] args) {
        Team<Intern> team1 = new Team<>("Vorob");
        team1.add(Gb.CreateIntern());
        team1.add(Gb.CreateIntern());
        System.out.println(team1);

        Team<Intern> team2 = new Team<>("Hleb");
        team2.add(Gb.CreateIntern());
        team2.add(Gb.CreateIntern());
//        team2.add(Gb.CreateMiddle());
        System.out.println(team2);

        var o = new Olympiad<Intern>(team1, team2);
        o.start();
        System.out.println("st1 vs st2");

        //#region
//        var st1 = new Team<String>("string team 1");
//        var st2 = new Team<String>("string team 2");
//
//        Olympiad<String> o1 = new Olympiad<>(st1, st2);
//        o1.start();
        //#endregion
    }
}
