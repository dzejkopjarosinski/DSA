# Anagram is a word or phrase formed by rearranging the letters of a different word of a phrase.
#Given two strings return true if t is an anagram of s and false otherwise.


class Solution:
    def isAnagram(self, s:str, t:str) -> bool:
        # Anagram must be the same size
        if len(s) != len(t):
            return False
        
        counstS, countT = {}, {}

        for i in range(len(s)):
            # Return 
            countS[s[i]] = 1 + countS.get(s[i],0)
            countT[t[i]] = 1 + countT.get(t[i],0)
        return countS == countT 