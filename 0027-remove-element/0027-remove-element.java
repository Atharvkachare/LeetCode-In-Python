class Solution {
    public int removeElement(int[] nums, int val) {
         int validElementIndex = 0;
      
        // Iterate through each element in the array
        for (int currentElement : nums) {
            // If current element is not the value to be removed
            if (currentElement != val) {
                // Place it at the next valid position and increment the index
                nums[validElementIndex] = currentElement;
                validElementIndex++;
            }
        }
      
        // Return the count of valid elements (elements not equal to val)
        return validElementIndex;
    }
    
}