package priv.huidong.sort;

/**
 * @ProjectName: nowcoder
 * @Package: priv.huidong.sort
 * @ClassName: BubbleSort
 * @Author:
 * @Description:
 * @Date: 2020/7/3 21:46
 * @Version: 1.0
 */
public class BubbleSort {
    public static void main(String[] args) {
        int [] arr ={5,3,6,3,4,1,8,23,22,66,111};
        int [] sort = bubbleSort(arr);
        for (int i:sort){
            System.out.println(i);
        }
    }

    private static void swap(int[] arr,int a,int b){
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }

    private static int[] bubbleSort(int[] array){

        if (array==null||array.length==0){
            return null;
        }

        for (int i = 0;i<array.length-1;i++){
            for (int j = 0;j<array.length-1-i;j++){
                if (array[j]>array[j+1]) {
                    swap(array, j, j + 1);
                }
            }
        }
        return array;
    }
}
