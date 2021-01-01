package algoimpl.recursive;

import java.util.ArrayList;
import java.util.List;

public class FindAllSubsets {

    public static void fun(int[] nums, int i, int n, List<List<Integer>> res, List<Integer> arr){
        arr.add(nums[i]);
        res.add(arr);
        for(int k=i+1;k<n;k++){
            fun(nums, k, nums.length, res, new ArrayList<>(arr));
        }

    }

    public static List<List<Integer>> subsets(int[] nums) {

        List<List<Integer>> res = new ArrayList<>();
        res.add(new ArrayList<>());
        int n = nums.length;
        for(int i=0;i<n;i++){
            List<Integer> arr = new ArrayList<>();
            fun(nums, i, n, res, arr);
        }
        return res;

    }

    // Driver Code
    public static void main(String[] args)
    {
        int[]  list = new int[]{1, 2, 3};


        System.out.print(subsets(list));
    }
}
