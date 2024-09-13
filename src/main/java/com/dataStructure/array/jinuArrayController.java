package com.dataStructure.array;

public class jinuArrayController {
    public static void main(String[] args) throws Exception {
        JinuArray<Integer> jinuArray = new JinuArray<>(5);
        jinuArray.add(1);
        jinuArray.add(2);
        jinuArray.add(3);
        jinuArray.add(4);
        jinuArray.add(5);

        jinuArray.printArray();
    }
}
