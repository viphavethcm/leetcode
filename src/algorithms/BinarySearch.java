package algorithms;

/*
Note:
1.Mảng ban đầu phải được sắp xếp thứ tự
2.So sánh phần tử cần tìm và phần tử chính giữa mảng để thu hẹp phạm vi tìm kiếm
3.Tuỳ vào giá trị tìm kiếm sẽ loại số lượng phần tử bên trái hay bên phải ra khỏi phạm vi tìm kiếm
4.Quay lại bước so sánh trên đến khi mảng còn 1 phần tử cuối cùng
 */
public class BinarySearch {
    public static void main(String[] args) {
        int[] nums = {1,3,5,6};
        int tar = 2;
        System.out.println(searchInsert(nums,tar));

    }

    public static int searchInsert(int[] nums, int target) {
        int left = 0;
        int right = nums.length-1;
        while (left <= right)
        {
            int mid = (left + right)/2;
            if (target == nums[mid])
                return mid;
            if (target > nums[mid])
            {
                left = mid + 1;
            }
            else if (target < nums[mid])
            {
                right = mid - 1;
            }
        }
        return left;
    }
}
