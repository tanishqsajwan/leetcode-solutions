class Solution:
    def minEatingSpeed(self, piles: list[int], h: int) -> int:
         mins = 1 
         maxs = 0
         for pile in piles:
            maxs = max(maxs , pile)
         while(mins < maxs):
            mid = mins +(maxs-mins)//2

            if(self.caneat(piles,h,mid)):
                maxs = mid
            else:
                mins = mid+1
         return mins
         
    def caneat(self , piles:list[int] , h:int , speed:int) -> bool:
         hours = 0
         for pile in piles:
            hours +=math.ceil(pile/speed)
         return hours <= h