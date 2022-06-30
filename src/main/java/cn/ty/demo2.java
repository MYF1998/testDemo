package cn.ty;

import java.util.Arrays;

public class demo2 {
    public static void main(String[] args) {
        demo1 demo1 = new demo1();
        int[] a = new int[]{89,3,88,8,12};
        demo1.bubbleSort(a);
        System.out.println(Arrays.toString(a));
    }
}
