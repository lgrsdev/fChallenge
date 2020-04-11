package nse.impl;

import nse.block.AbstractBuildingBlock;

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
