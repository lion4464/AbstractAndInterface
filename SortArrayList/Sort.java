package SortArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class Sort {
    public static void sort(ArrayList<Number> list){
        int[] listInt=new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            listInt[i]=list.get(i).intValue();
        }
        Arrays.sort(listInt);
        for (int i = 0; i < listInt.length; i++) {
            System.out.print(listInt[i]+" ");
        }
    }

    public static void main(String[] args) {
        Integer[] arr={4,78,98,101,5,3,10,1};
        ArrayList<Number> array=new ArrayList<>(Arrays.asList(arr));
        sort(array);
    }
}
