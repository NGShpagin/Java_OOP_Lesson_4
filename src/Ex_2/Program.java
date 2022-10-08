package Ex_2;

public class Program {
    public static void main(String[] args) {
        Worker w = new Worker(
                28,
                "firstName",
                "lastName",
                27,
                22500);

        //#region ParameterizedWorker

        ParameterizedWorker<Integer> w1 = new ParameterizedWorker<>(
                1890,
                "firstName1",
                "lastName",
                20,
                18923);

        ParameterizedWorker<String> w2 = new ParameterizedWorker<>(
                "1990",
                "firstName1",
                "lastName",
                20,
                18923);

        //#endregion
    }
}
