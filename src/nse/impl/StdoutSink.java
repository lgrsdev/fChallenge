package nse.impl;

import nse.BuildingBlock;

public class StdoutSink extends BuildingBlock<Integer, Void> {

    @Override
    protected Void doProcess(Integer integer) {
        System.out.println(integer);
        return null;
    }
}
