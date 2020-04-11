package nse.impl;

import nse.BuildingBlock;

import java.util.Arrays;

public class FoldSum extends BuildingBlock<int[], Integer > {

    @Override
    protected Integer doProcess(int[] array) {
        return Arrays.stream(array).sum();
    }
}
