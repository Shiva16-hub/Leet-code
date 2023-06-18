class Solution {
    public int[] twoSum(int[] nums, int target) {
        // for(int i=0;i<nums.length;i++){
        //     for(int j=i+1;j<nums.length;j++){
        //         if(nums[i] + nums[j] == target){
        //             int a[] = {i,j};
        //             return a;
        //         }
        //     }
        // }
        // return null;

        HashMap<Integer,Integer> map = new HashMap();
        for(int i=0;i<nums.length;i++){
            map.put(nums[i],i);
        } 

        // searching 
        for(int i=0;i<nums.length;i++){
            int num = nums[i];
            int rem = target - num;
            if(map.containsKey(rem))
            {
                int index = map.get(rem);
                if(index == i){
                    continue;
                }
                return new int[]{i,index};
            }
        }
        return new int[]{};
    }
}