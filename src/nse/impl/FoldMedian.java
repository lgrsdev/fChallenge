package nse.impl;

import nse.BuildingBlock.AbstractBuildingBlock;

import java.util.Arrays;

public class FoldMedian extends AbstractBuildingBlock<int[], Integer> {

    public FoldMedian(AbstractBuildingBlock<Integer, ?> next) {
        super(next);
    }

    @Override
    protected Integer doProcess(int[] array) {
        Arrays.sort(array);
        if (array.length % 2 == 0) {
            return (array[array.length / 2] + array[array.length / 2 - 1]) / 2;
        }
        else {
            return array[array.length / 2];
        }
    }
}
