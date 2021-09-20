package AverageArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class Average {
    public static void average(ArrayList<Integer> list){
        Integer avarage=0;
        for (int i = 0; i < list.size(); i++) {
                avarage+=list.get(i);
        }
        System.out.println("avarage = " + avarage/ list.size());
    }

    public static void main(String[] args) {
        Integer[] arr={2,3,5};
       average(new ArrayList<>(Arrays.asList(arr)));
    }
}
