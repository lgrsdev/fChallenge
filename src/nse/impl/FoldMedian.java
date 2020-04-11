package nse.impl;

import nse.BuildingBlock;

import java.util.Arrays;

public class FoldMedian extends BuildingBlock<int[], Integer> {

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
