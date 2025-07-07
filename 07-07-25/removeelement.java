class Solution {
    //the below line is used to enter main
    public int removeElement(int[] nums, int val) {
        int index = 0;//intialize i=0
        //use for loop to set a loop & increment(condition)
        for (int i = 0; i < nums.length; i++) {
            //use if to check num i is not equal to val
            if (nums[i] != val) {
                nums[index] = nums[i];
                index++;//index is incremented
            }
        }
        return index;//keep loops
    }
}
