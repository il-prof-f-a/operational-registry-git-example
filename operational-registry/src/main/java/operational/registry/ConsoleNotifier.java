package operational.registry;

public class ConsoleNotifier implements Notifier {
    @Override
    public void notifyResult(String message) {
        System.out.println("[RISULTATO] " + message);
    }
}
