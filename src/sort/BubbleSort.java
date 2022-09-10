package sort;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = new int[]{8,5,6,34,22,1};
        int n = arr.length;
        for (int i = 0;i < n-1;i++)
        {
            for (int j = n - 1;j > i;j --)
            {
                if (arr[j] < arr[j-1])
                {
                    int tmp = arr[j-1];
                    arr[j-1] = arr[j];
                    arr[j] = tmp;
                }
            }
        }
        for (int i = 0;i < arr.length;i++)
            System.out.println(arr[i]);
    }
}
