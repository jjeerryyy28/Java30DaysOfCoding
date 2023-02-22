package day2;


import java.util.ArrayList;
import java.util.List;

//Leetcode
public class PascalTriangle {
    public List<List<Integer>> generate(int numRows){
        List<List<Integer>> res = new ArrayList<List<Integer>>();
        List<Integer>row, pre=null;
        for(int i=0;i<numRows;++i){
            row = new ArrayList<Integer>();
            for (int j=0;j<=i;++j)
                if(j==0 || j==i)
                    row.add(1);
                else
                    row.add(pre.get(j-1)+pre.get(j));

            pre=row;
            res.add(row);
        }
        return  res;
    }
    public static void main(String[] args){
        PascalTriangle pt = new PascalTriangle();
        List<List<Integer>> result1 = pt.generate(5);
        System.out.println("Pascal Triangle for numRows = 5: ");
        for(List<Integer>row : result1){
            System.out.println(row);
        }
        List<List<Integer>> result2 = pt.generate(0);
        System.out.println("Pascal Triangle for numRows=0: ");
        for(List<Integer>row: result2){
            System.out.println(row);
        }
    }
}
