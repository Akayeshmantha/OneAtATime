class NumArray {

    private int[] arr;

    public NumArray(int[] nums) {
        arr = nums;
        for (int i = 0; i < nums.length; i++) {
            arr[i] = (i - 1) < 0 ? arr[i] : (arr[i - 1] + arr[i]);

        }

    }

    public int sumRange(int left, int right) {
        int sum = 0;
        if (left == 0) {
            return arr[right];
        }

        return arr[right] - arr[left - 1];
    }
}