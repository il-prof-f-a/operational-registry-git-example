package operational.registry;

public class Main {
    public static void main(String[] args) {
        if (args.length < 3) {
            System.out.println("Uso: java MainSpaghetti <a> <op> <b>");
            return;
        }
        String op = args[1];
        double a = Double.parseDouble(args[0]);
        double b = Double.parseDouble(args[2]);

        double result = 0;

        System.out.println("Parametri: a = " + a + ", op = " + op + ", b = " + b + " => " + result);
    }
}