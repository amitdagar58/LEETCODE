class Solution {
    public void wiggleSort(int[] nums) {
        int n = nums.length;

        int[] sorted = nums.clone();
        Arrays.sort(sorted);
        int mid = (n+1)/2;

        int small = mid - 1;
        int large = n - 1;

        for(int i = 0; i<n; i+=2){
            nums[i] = sorted[small--];
        }
        for(int i = 1; i<n; i+=2){
            nums[i] = sorted[large--];
        }
    }
}