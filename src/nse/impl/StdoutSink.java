package nse.impl;

import nse.BuildingBlock.AbstractBuildingBlock;

public class StdoutSink extends AbstractBuildingBlock<Integer, Void> {

    public StdoutSink() {
        super(null);
    }

    @Override
    protected Void doProcess(Integer integer) {
        System.out.println(integer);
        return null;
    }
}
