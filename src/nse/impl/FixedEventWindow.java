package nse.impl;

import nse.BuildingBlock;

public class FixedEventWindow extends BuildingBlock<Integer, int[]> {

    private int size;
    private int index;
    private int[] array;

    public FixedEventWindow(int size) {
        this.size = size;
        this.index = 0;
        this.array = new int[size];
    }

    @Override
    protected int[] doProcess(Integer integer) {
        this.array[index] = integer;
        if (this.index == this.size -1) {
            index = 0;
            return this.array;
        }
        index++;
        return null;
    }
}
