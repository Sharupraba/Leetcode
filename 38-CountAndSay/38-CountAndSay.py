# Last updated: 2/13/2026, 10:11:41 AM
class Solution:
    def countAndSay(self, n: int) -> str:
        if n == 1:
            return "1"
        countArray = "1"
        def countArr(inp):
            i = 0
            res = ""
            while i < len(inp):
                count = 1
                while i+1 < len(inp) and inp[i] == inp[i+1]:
                    count+=1
                    i+=1
                res+=str(count)+inp[i]
                i+=1
            return res

        for i in range(n-1):
            countArray = countArr(countArray)
        return countArray