package nse.impl;

import nse.BuildingBlock;

public class StdinSource extends BuildingBlock<Integer, Integer> {

    @Override
    protected Integer doProcess(Integer integer) {
        System.out.println("> " + integer);
        return integer;
    }
}