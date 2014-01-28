package lab3_data_analysis;

import java.util.ArrayList;
import java.util.Vector;

public class Rank {
    public static ArrayList<ArrayList<Double>> countRanks(ArrayList<Vector<Struct>> arr){
        int n = arr.get(0).size(); //count of elements in the series
        ArrayList<ArrayList<Double>> result = new ArrayList<>();
        ArrayList<Struct> row;
        for(int t=0; t<arr.size(); t++){
            for(Struct stc : arr.get(t)){
                stc.position=t;
            }
        }
        for(int i=0; i<n; i++){
            row=new ArrayList<>();
            for(Vector<Struct> vec : arr){
                row.add(vec.get(i));
            }
            sort(row, 0, row.size()-1);
            result.add(Rank.getRank(row));
        }
        return result;  
    }
    
    public static Double getUniformityFridman(ArrayList<ArrayList<Double>> list){
        int N = list.size();
        int k = list.get(0).size();
        Double result;
        Double R = 0.0;
        for(int i=0; i<k; i++){
            R+=(long)Math.pow(getSumColRanks(list, i), 2);
        }
        Double tmp = (double)12/(double)(N*k*(k+1));
        System.out.println("tmp="+tmp);
        result = tmp*R-(3*N*(k+1));
        return result;
    }
    
    public static Double getSumColRanks(ArrayList<ArrayList<Double>> list, int index){
        Double result = 0.0;
        for(ArrayList<Double> d : list){
            result+=d.get(index);
        }
        System.out.println("col="+result);
        return result;
    }
    
    public static ArrayList<Double> getRank(ArrayList<Struct> arr){
        ArrayList<Double> row = new ArrayList<>();
        for(int k=0; k<arr.size(); k++){
            row.add(-1.0);
        }
        int t;
        int sum = 0;
        for(int j=0; j<arr.size(); j++){
            t=j+1;
            if(t==arr.size()){
                row.set(arr.get(t-1).position, (double)t);
            }else
            if(arr.get(j).number==arr.get(t).number){
                while(arr.get(j).number==arr.get(t).number){
                    sum+=t;
                    t++;
                    if(t==arr.size()){
                        break;
                    }
                }
                sum+=t;
                int subtract = t-j;
                for(int i=0; i<subtract; i++){
                    row.set(arr.get(j+i).position, (double)sum/(double)subtract);
                }
                j=t-1;
            }else{
                row.set(arr.get(j).position, (double)t);
            }
        }
        return row;
    }
    
    public static void sort(ArrayList<Struct> list, int start, int end) {
        if (start >= end)
            return;
	int i = start, j = end;
	int cur = i - (i - j) / 2;
	while (i < j) {
            while (i < cur && (list.get(i).number <= list.get(cur).number)) {
                i++;
            }
	while (j > cur && (list.get(cur).number <= list.get(j).number)) {
            j--;
	}
	if (i < j) {
            Struct temp = list.get(i);
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
