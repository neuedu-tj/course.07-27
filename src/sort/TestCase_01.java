package sort;

import java.util.Arrays;

public class TestCase_01 {

    //冒泡排序

    public static void main(String[] args) {
        
        int[] data = {5,4,6,3};

        // 1. 4,5,6,3
        // 2. 3,4,6,4

        for (int i = 0; i < data.length-1; i++) {
            for (int j = i+1; j < data.length ; j++) {
                if(data[i] > data[j]) {
//                    data[i] = data[i] + data[j];
//                    data[j] = data[i] - data[j];
//                    data[i] = data[i] - data[j];

                        int temp = data[i];
                        data[i] = data[j];
                        data[j] = temp;

                }
            }
        }

        System.out.println(Arrays.toString(data));
        
    }

}
