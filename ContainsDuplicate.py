''' Given an integer array nums,
 return true if any value appears at least twice in the array,
  and return false if every element is distinct.'''

  
class Solution:
    def containsDuplicate(self, nums: List[int]) -> bool:
        hashset = set()
        for n in nums:
            if n in hashset:
                return true
            hashset.add(n)
        return false
