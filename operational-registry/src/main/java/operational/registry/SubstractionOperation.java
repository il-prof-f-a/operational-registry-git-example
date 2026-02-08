package operational.registry;

public class SubstractionOperation extends BinaryOperation {
    public SubstractionOperation(Notifier notifier) {
        super(notifier);
    }

    @Override
    protected double compute(double a, double b) {
        return a - b;
    }

    @Override
    protected String getSymbol() {
        return "-";
    }
}
