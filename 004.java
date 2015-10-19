public class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int len = nums1.length + nums2.length;
        if (len % 2 == 1) {
            return findKthNum(nums1, 0, nums1.length, nums2, 0, nums2.length, len/2+1);
        } else {
            int a = findKthNum(nums1, 0, nums1.length, nums2, 0, nums2.length, len/2);
            int b = findKthNum(nums1, 0, nums1.length, nums2, 0, nums2.length, len/2+1);
            return (a + b) / 2.0;
        }
    }

    public int findKthNum(int[] A, int la, int ra, int[] B, int lb, int rb, int k) {
        if (la >= ra) return B[k+lb-1];
        if (lb >= rb) return A[k+la-1];
        int mida = (ra - la) / 2 + la, midb = (rb - lb) / 2 + lb;
        int lena = mida - la + 1, lenb = midb - lb + 1;
        if (A[mida] <= B[midb]) {
            if (k > lena+lenb-1) return findKthNum(A, mida+1, ra, B, lb, rb, k-lena);// remove A[la:mida]
            else return findKthNum(A, la, ra, B, lb, midb, k);// remove B[midb:rb)
        } else {
            if (k > lena+lenb-1) return findKthNum(A, la, ra, B, midb+1, rb, k-lenb);// remove B[lb:midb]
            else return findKthNum(A, la, mida, B, lb, rb, k);// remove A[mida:ra)
        }
    }
}
