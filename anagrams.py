''' Given an array of strings, group the anagrams together. 
    So find words that have the same characters and group them
     into one list ''' 

class Solution:
    def groupAnagrams(self, strs: List[str]) -> List[List[str]]:
        # Use dictionary with an empty list as a default value
        ans = collections.defaultdict(list)

    # For each word in the input list 
        for s in strs:
            # initialize a list with 26 elements set to zero
            count = [0] * 26
            for c in s:
            #for each letter calculate the possition of the letter in alfabet
                count[ord(c) - ord("a")] += 1
            ans[tuple(count)].append(s)

        return ans.values()