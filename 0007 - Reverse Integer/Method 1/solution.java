class Solution(object):
    def reverse(self, x):
        """
        :type x: int
        :rtype: int
        """
        rev =0
        y = x
        if y<0:
            y *=-1
        max = (2**31) - 1
        min = -(2**31) 
        while y>0:
            rem = y%10
            rev = rev*10+rem