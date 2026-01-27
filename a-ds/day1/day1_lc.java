// 1. two sum

class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] answer = new int[2];

        for (int i = 0; i < nums.length; i++) {
            int first = nums[i];
            for (int j = 0; j < nums.length; j++) {
                int second = nums[j];
                while (j != i) {
                    if (first + second == target) {
                        answer[0] = first;
                        answer[1] = second; 
                    }
                }
            }
        }
        return answer;
    }
}
