package nse.impl;

import nse.BuildingBlock;

import java.util.function.Predicate;

public class Filter extends BuildingBlock<Integer, Integer> {

    private Predicate<Integer> predicate;

    public Filter(Predicate<Integer> predicate) {
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
