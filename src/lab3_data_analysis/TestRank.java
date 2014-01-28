package lab3_data_analysis;

import java.util.ArrayList;

public class TestRank {
    public static void main(String[] args) {
        ArrayList<Double> arr = new ArrayList<>();
        arr.add(4.0);
        arr.add(4.0);
        arr.add(2.0);
        arr.add(7.0);
        arr.add(6.0);
        arr.add(4.0);
        arr.add(3.0);
        arr.add(5.0);
        for(Double d : arr){
            System.out.print("  "+d);
        }
        System.out.println("");
        Rank.sort(arr, 0, arr.size()-1);
        for(Double d : arr){
            System.out.print("  "+d);
        }
        System.out.println("");
        ArrayList<Double> tmp = Rank.getRank(arr);
        for(Double d : tmp){
            System.out.print("  "+d);
        }
        System.out.println("");
    }
}
