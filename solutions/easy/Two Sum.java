// Title: Two Sum
            // Difficulty: Easy
            // Language: Java
            // Link: https://leetcode.com/problems/two-sum/

        i and j
        //         }
        //     }
        // }
        // return new int[]{};//creates a new empty array []

        //optimal using O(n)
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(map.containsKey(target-nums[i])){//means does the map contains 
            element in which if we will add current number then it will give target
                return new int[]{map.get(target-nums[i]),i};//means return index of 
                current element and of the element which we found
        //             return new int[]{i,j};//it creates new array with values as 
        //     for(int j=i+1;j<n;j++){//we are choosing i+1 here to prevent 
        repetation of index beacuse we do not want [1,1] ets
        //         int sum = nums[i]+nums[j];
        //         if(sum==target){
class Solution {
    public int[] twoSum(int[] nums, int target) {
        //brute force approach 
        // int n = nums.length;
        // for(int i=0;i<n;i++){
