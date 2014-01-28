package lab3_data_analysis;

import java.util.ArrayList;
import java.util.Vector;

public class Rank {
    public static ArrayList<ArrayList<Double>> countRanks(ArrayList<Vector<Double>> arr){
        int n = arr.get(0).size(); //count of elements in the series
        ArrayList<ArrayList<Double>> result = new ArrayList<>();
        ArrayList<Double> row;
        for(int i=0; i<n; i++){
            row=new ArrayList<>();
            for(Vector<Double> vec : arr){
                row.add(vec.get(i));
            }
            sort(row, 0, row.size()-1);
            result.add(Rank.getRank(row));
        }
        
        return result;
        
    }
    
    public static ArrayList<Double> getRank(ArrayList<Double> arr){
        ArrayList<Double> row = new ArrayList<>();
        int t;
        int sum = 0;
        for(int j=0; j<arr.size(); j++){
            t=j+1;
            if(t==arr.size()){
                row.add((double)t);
            }else
            if(arr.get(j).equals(arr.get(t))){
                while(arr.get(j).equals(arr.get(t))){
                    sum+=t;
                    t++;
                    if(t==arr.size()){
                        break;
                    }
                }
                sum+=t;
                int subtract = t-j;
                j=t-1;
                for(int i=0; i<subtract; i++){
                    row.add((double)sum/(double)subtract);
                }
            }else{
                row.add((double)t);
            }
        }
        return row;
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
