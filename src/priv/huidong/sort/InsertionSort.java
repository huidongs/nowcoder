package priv.huidong.sort;

/**
 * @ProjectName: nowcoder
 * @Package: priv.huidong.sort
 * @ClassName: InsectionSort
 * @Author: huidong
 * @Description:
 * @Date: 2020/7/29 17:02
 * @Version: 1.0
 */
public class InsertionSort {
    public static int[] insertionSort(int[] arr){
        int arr_len = arr.length;
        int preIndex,current;
        for (int i = 1;i<arr_len;i++){
            preIndex=i-1;
            current = arr[i];
            while (preIndex>=0&&arr[preIndex]>current){
                arr[preIndex+1]=arr[preIndex];
                preIndex--;
            }
            arr[preIndex+1]=current;
        }
        return arr;
    }
    public static void main(String[] args) {
        int[] arr = new int[]{11,22,23,1,333,323,1111,121,2,88,788,67};
        int [] array = insertionSort(arr);
        for (int i:array
             ) {
            System.out.println(i);
        }
    }
}
