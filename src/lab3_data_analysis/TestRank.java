package lab3_data_analysis;

import java.util.ArrayList;

public class TestRank {
    public static void main(String[] args) {
        ArrayList<Struct> arr = new ArrayList<>();
        arr.add(new Struct(4.0, 0));
        arr.add(new Struct(4.0, 1));
        arr.add(new Struct(2.0, 2));
        arr.add(new Struct(3.0, 3));
        arr.add(new Struct(4.0, 4));
        arr.add(new Struct(7.0, 5));
        arr.add(new Struct(6.0, 6));
        arr.add(new Struct(5.0, 7));
        for(Struct d : arr){
            System.out.print("  "+d.number);
        }
        System.out.println("");
        Rank.sort(arr, 0, arr.size()-1);
        for(Struct d : arr){
            System.out.print("  "+d.number);
        }
        System.out.println("");
        ArrayList<Double> tmp = Rank.getRank(arr);
        for(Double d : tmp){
            System.out.print("  "+d);
        }
        System.out.println("");
    }
}
