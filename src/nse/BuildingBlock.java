package nse;

public abstract class BuildingBlock<T, R> {

    private BuildingBlock<R, ?> next;

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

    protected final void setNext(BuildingBlock<R, ?> next) {
        this.next = next;
    }

    protected final BuildingBlock<R, ?> getNext() {
        return this.next;
    }

}
