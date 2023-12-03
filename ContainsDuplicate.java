class Solution {

    /*Given an integer array nums,
    return true if any value appears at least twice in the array,
    and return false if every element is distinct */

    public boolean containsDuplicate(int[] nums) {
        Set<Integer> uniques = new HashSet<>();
        for (int i =0; i < nums.length; i++){
            if(uniques.contains(nums[i])){
                return true 
            }
            uniques.add(nums[i]);
        }
        return false;

    }
}