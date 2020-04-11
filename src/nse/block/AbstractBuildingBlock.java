package nse.block;

public abstract class AbstractBuildingBlock<T, R> {

    private AbstractBuildingBlock<R, ?> next;

    public AbstractBuildingBlock(AbstractBuildingBlock<R, ?> next) {
        this.next = next;
    }

    public final void process(T input) {
        if (input == null) {
            return;
        }
        R processedInteger = doProcess(input);
        if (next != null) {
            next.process(processedInteger);
        }
    }

    protected abstract R doProcess(T input);
}
