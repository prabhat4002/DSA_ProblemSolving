class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int count0=0;
        int count1=0;
        int maxcount=0;

        for(int i=0;i<nums.length;i++){
            if(nums[i]==1){
                count1++;
                count0=0;
            }else{
                count1=0;
                count0++;
            }
        maxcount=Math.max(maxcount,count1);

        }
        return maxcount;
        
    }
}