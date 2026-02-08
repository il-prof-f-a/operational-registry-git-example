package operational.registry;

public class Main {
    public static void main(String[] args) {
        if (args.length < 3) {
            System.out.println("Uso: java MainSpaghetti <a> <op> <b>");
            return;
        }
        String a = args[0];
        String op = args[1];
        String b = args[2];

        System.out.println("Parametri: a = " + a + ", op = " + op + ", b = " + b);
    }
}