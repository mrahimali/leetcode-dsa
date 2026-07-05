        :type target: int
        :rtype: List[int]
        """
        n = len(nums)
        for i in range(0,n):
            for j in range(i+1, n):
                if ((nums[i] + nums[j]) == 
                target):
                    return [i, j]
        return -1      
        :type nums: List[int]
    def twoSum(self, nums, target):
        """
class Solution(object):