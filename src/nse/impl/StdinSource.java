package nse.impl;

import nse.block.AbstractBuildingBlock;

public class StdinSource extends AbstractBuildingBlock<Integer, Integer> {

    public StdinSource(AbstractBuildingBlock<Integer, ?> next) {
        super(next);
    }

    @Override
    protected Integer doProcess(Integer integer) {
        System.out.println("> " + integer);
        return integer;
    }
}