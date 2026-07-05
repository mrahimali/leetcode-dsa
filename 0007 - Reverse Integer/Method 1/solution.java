            y *=-1
        max = (2**31) - 1
        min = -(2**31) 
        while y>0:
            rem = y%10
            rev = rev*10+rem
        if y<0:
        y = x
        rev =0
            if rev<min or rev>max:
                return 0
            y=y//10
        if x<0:
            rev *=-1
        return rev
            