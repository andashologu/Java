# software-engineering
https://webrewrite.com/implement-binary-search-in-java/
https://www.youtube.com/watch?v=d-nh-xBHsgM
Example 1
1. Works with sorted array
2. arr [11, 15, 16, 19, 25, 36, 67]
3. search for 15
STEP 1:
4. low = 0, high = 6 // low and high represent range of indexes (or number of columns)
5. mid = (low+high)/2 = 3; therefore arr[3] = 19; 19 is greater than 15 or the value we are searching;
STEP 2:
6. low = 0; high = mid - 1 = 3 -1 = 2
7. mid = (0+2) = 1
8. arr[1] = 15 //so we found the value its in index 1

Example 2

