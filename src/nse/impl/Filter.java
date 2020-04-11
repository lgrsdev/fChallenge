package nse.impl;

import nse.block.AbstractBuildingBlock;

import java.util.function.Predicate;

public class Filter extends AbstractBuildingBlock<Integer, Integer> {

    private Predicate<Integer> predicate;

    public Filter(Predicate<Integer> predicate, AbstractBuildingBlock<Integer, ?> next) {
        super(next);
        this.predicate = predicate;
    }

    @Override
    protected Integer doProcess(Integer integer) {
        if (predicate.test(integer)) {
            return integer;
        }
        return null;
    }
}
