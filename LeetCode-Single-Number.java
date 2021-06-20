class Solution {
    public int singleNumber(int[] nums) {
        Arrays.sort(nums);
        int i=0;
        for( i=0;i<nums.length-1;i+=2)
        {
            if(nums[i]!=nums[i+1])
            {
                return nums[i];
            }   
        }
        if(i==nums.length-1 || nums.length==1)
        {
            return nums[nums.length-1];
        }
        return 1;
    }
}
