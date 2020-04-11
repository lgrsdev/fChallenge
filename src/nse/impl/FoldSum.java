package nse.impl;

import nse.block.AbstractBuildingBlock;

import java.util.Arrays;

public class FoldSum extends AbstractBuildingBlock<int[], Integer > {

    public FoldSum(AbstractBuildingBlock<Integer, ?> next) {
        super(next);
    }

    @Override
    protected Integer doProcess(int[] array) {
        return Arrays.stream(array).sum();
    }
}
