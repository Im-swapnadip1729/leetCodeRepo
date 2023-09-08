class Solution {
    public int[] twoSum(int[] nums, int target) {
      HashMap<Integer,Integer> map = new HashMap();
        //Arra --> HM Put
        for(int i=0; i<nums.length; i++){
            map.put(nums[i],i);
        }

        //Search
        for(int i=0; i<nums.length; i++){
            int a = nums[i];
            int remaning = target-a;
            if(map.containsKey(remaning)){
                int index = map.get(remaning);
                if(index == i)continue;
                return new int[]{i,index};
            } 
        }
        return new int[]{};
    
    }
}