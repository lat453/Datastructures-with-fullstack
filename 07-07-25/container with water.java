class Solution {
    public int maxArea(int[] H) {
        int ans = 0, i = 0, j = H.length-1, res = 0;
        while (i < j) {
            if (H[i] <= H[j]) {
                res = H[i] * (j - i);
                i++;
            } else {
                res = H[j] * (j - i);
                j--;
            }
           
            if (res > ans) ans = res;
        }
        return ans;
    }
}
