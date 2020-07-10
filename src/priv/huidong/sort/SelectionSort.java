package priv.huidong.sort;

/**
 * @ProjectName: nowcoder
 * @Package: priv.huidong.sort
 * @ClassName: SelectionSort
 * @Author:
 * @Description:
 * @Date: 2020/7/4 12:49
 * @Version: 1.0
 */
public class SelectionSort {

    public static int [] selection(int[] arr){

        for (int i = 0;i<arr.length-1;i++){
            int temp = arr[i];
            int minindex = i;
            for (int j = i+1;j<arr.length;j++){
                if (arr[j]<temp){
                    temp = arr[j];
                    minindex = j;
                }
            }
           swap(arr,i,minindex);
        }
        return  arr;
    }
    public static void swap(int [] arr,int a,int b){
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }

    public static void main(String[] args) {
        int [] arr = {12,1212,5,9,22,59,46,121,235,458,333};
        int [] result = selection(arr);
        for (int i:result) {
            System.out.println(i);
        }
      //  System.out.println(2*-3);

    }

}
