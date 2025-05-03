class RemoveSameElements {
    public int removeDuplicates(int[] nums) {

        int[] result = new int[nums.length];
        int temp = -264;
        int index = 0;

        for (int i=0 ; i < nums.length ; i++) {
            if (nums[i] == temp) {
                continue;
            } else {
                nums[index] = nums[i];
                temp = nums[i];
                index++;
            }
        }

        return index;
    }
}