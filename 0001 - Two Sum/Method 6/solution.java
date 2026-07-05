        :rtype: int
        """
        rev =0
        while y>=0:
            rem = y%10
            rev = rev*10+rem
        max = (2**31) - 1
        min = -(2**31) 
            if rev<min or rev>max:
                return 0
            
        
        if y<0:
            y *=-1
        y = x
        if x<0:
            rev *=-1
        return rev
        :type x: int
        """
    def reverse(self, x):
class Solution(object):
            y=y//10