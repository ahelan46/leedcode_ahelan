# Last updated: 8/11/2026, 3:58:01 PM
class Solution:
    def secondsBetweenTimes(self, startTime: str, endTime: str) -> int:
        def toSecond(time):
            h,m,s=map(int, time.split(":"))
            return h*3600+m*60+s

        return toSecond(endTime) - toSecond(startTime)
        