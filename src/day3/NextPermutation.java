package day3;

import java.util.ArrayList;
import java.util.List;

public class NextPermutation {
    public void nextPermute(List<Integer> currPerm, int[] nums, boolean[] arr, List<List<Integer>> ans){
        if(currPerm.size() == nums.length){
            ans.add(new ArrayList<>(currPerm));
            return;
        }
        for(int i=0;i<nums.length;i++){
            if(!arr[i]){
                currPerm.add(nums[i]);
                arr[i] = true;
                nextPermute(currPerm, nums, arr, ans);
                arr[i] = false;
                currPerm.remove(currPerm.size()-1);
            }
        }
    }
    public List<List<Integer>> permute(int nums[]){
        List<List<Integer>> ans = new ArrayList<List<Integer>>();
        boolean[] arr = new boolean[nums.length];
        nextPermute(new ArrayList<>(), nums, arr, ans);
        return ans;
    }

    public static void main(String[] args) {
        NextPermutation np = new NextPermutation();
        int []nums = {1,2,3};
        List<List<Integer>> permutations = np.permute(nums);
        System.out.println(permutations);
    }
}
