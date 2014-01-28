package lab3_data_analysis;

import java.util.ArrayList;
import java.util.Vector;

public class Rank {
    public static ArrayList<ArrayList<Double>> countRanks(ArrayList<Vector<Double>> arr){
        int n = arr.get(0).size(); //count of elements in the series
        ArrayList<Double> row;
        for(Vector<Double> vec : arr){
            
        }
        
        return null;
        
    }
    
    public static void sort(ArrayList<Double> list, int start, int end) {
        if (start >= end)
            return;
	int i = start, j = end;
	int cur = i - (i - j) / 2;
	while (i < j) {
            while (i < cur && (list.get(i) <= list.get(cur))) {
                i++;
            }
	while (j > cur && (list.get(cur) <= list.get(j))) {
            j--;
	}
	if (i < j) {
            Double temp = list.get(i);
            list.set(i, list.get(j));
            list.set(j, temp);
            if (i == cur)
                cur = j;
            else if (j == cur)
                cur = i;
        }
        }
        sort(list, start, cur);
        sort(list, cur+1, end);
    }
}
