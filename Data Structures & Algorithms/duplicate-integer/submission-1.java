class Solution {
    //create a new hashset, and iterate through nums. if we see a duplicate number, immediately return true, else we will add it to our hashset. once we iterate through the whole thing, 
    //we can return false
    public boolean hasDuplicate(int[] nums) {
        Set <Integer> seen = new HashSet<>();
        for (int num : nums) {
            if (seen.contains(num)) {
                return true;
            }
            seen.add(num);
        }
        return false;
    }
}

