package priv.huidong.javastudy;

import java.lang.reflect.Array;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @ProjectName: nowcoder
 * @Package: priv.huidong.javastudy
 * @ClassName: ArrayToList
 * @Author:
 * @Description:
 * @Date: 2020/7/10 18:26
 * @Version: 1.0
 */
public class ArrayToList {
    public static void main(String[] args) {
        String sss = "1ww";
        //=========================================数组转list========================================
        String[] str = new String[]{"hello","world"};
        //方式一：使用for循环把数组元素加进list
        List<String> list = new ArrayList<String>();
        for (String string : str){
            list.add(string);
        }
        System.out.println(list);

        //方式二
        List<String> list1 = new ArrayList<String>(Arrays.asList(str));
        System.out.println(list1);

        //方式三
        List<String> list2 = Arrays.asList(str);
//        list2.add(1,"1");
//        System.out.println(list2);

        //方法四使用collection.addAll();
        List<String> list3 =new ArrayList<String>(str.length);
        Collections.addAll(list3,str);
        System.out.println(list3);

        //方法五:使用Stream中的Collection收集器
        List<String> list4 = Stream.of(str).collect(Collectors.toList());
        System.out.println(list4);

        //=========================================list转数组========================================
        System.out.println("=========================================");
        List<String> list0 = new ArrayList<String>();
        list0.add("hello");
        list0.add("world");
        //方式一：使用for循环
        String [] str1 = new String[list.size()];
        for (int i=0; i<list.size();i++){
            str1[i]=list0.get(i);
        }
        for (String string:str1
             ) {
            System.out.println(string);
        }
        //方式二：使用toArray()方法
        String[] str2 = list0.toArray(new String[list0.size()]);
        for (String string:str2){
            System.out.println(string);
        }
    }
}
