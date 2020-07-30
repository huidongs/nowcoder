package priv.huidong.sort;

/**
 * @ProjectName: nowcoder
 * @Package: priv.huidong.sort
 * @ClassName: ShellSort
 * @Author: huidong
 * @Description: 希尔排序、
 * @Date: 2020/7/30 11:19
 * @Version: 1.0
 */
public class ShellSort {
    public static int[] shellSort(int[] arr) {
        int len = arr.length;
        for (int gap = len / 2; gap > 0; gap = gap / 2) {
            //实际操作是多个分组交替执行，也就是说是下标递增依次执行
            for (int i = gap; i < len; i++) {
                int j = i;
                int current = arr[i];
                while (j-gap>=0&&current<arr[j-gap]){
                    arr[j]=arr[j-gap];
                    j=j-gap;
                }
                arr[j]=current;
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] arr = new int[]{11, 23, 24, 444, 5435, 443, 23, 11, 67, 554, 9};
        int[] array = shellSort(arr);
        for (int i: array
             ) {
            System.out.println(i);
        }
    }
}
