class Solution {
    public int maxArea(int[] heights) {
     int i = 0;
     int j = heights.length -1;

     int containerCapacity = 0;

     while(i < j) {
        int width = (j - i);
        int minHeight = heights[i] <= heights[j] ? heights[i] : heights[j];
        int currContainerCapacity = width * minHeight;

        if(currContainerCapacity > containerCapacity) {
            containerCapacity = currContainerCapacity;
        }

        if(heights[i] < heights[j]) {
            i++;
        }else if(heights[i] > heights[j]) {
            j--;
        }else {
            i++;
            j--;
        }
     }   

     return containerCapacity;
    }
}
