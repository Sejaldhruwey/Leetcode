// Title: Remove Duplicates from Sorted Array
            // Difficulty: Easy
            // Language: Java
            // Link: https://leetcode.com/problems/remove-duplicates-from-sorted-array/

            
            
        // }

        // return ++idx;

        //better solution 
        if(nums.length==0) return 0;
        int idx = 1;
        for(int i=1;i<nums.length;i++){
            if(nums[i]!=nums[i-1]){
                nums[idx]=nums[i];
                idx++;
            }
        }
        return idx;
    }
}
