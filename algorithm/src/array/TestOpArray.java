package array;

import java.util.Arrays;

/**
 * 类说明： 为数组添加元素
 * @author 裕博
 */
public class TestOpArray {
    public static void main(String[] args) {
        // 解决数组长度不可变的问题
        int[] arr = new int[] {9,8,7};
        // 快速查看数组中的元素
        System.out.println(Arrays.toString(arr));
        // 要加入数组的目标元素
        int dst = 6;

        // 创建一个新的数组，长度是原数组长度+1
        int[] newArr = new int[arr.length+1];
        // 把原数组中的数据全部复制到新数组中
//        for (int i = 0; i < arr.length; i++) {
//            newArr[i] = arr[i];
//        }
        System.arraycopy(arr, 0, newArr, 0, arr.length);

        // 把目标元素放入新数组的最后
        newArr[arr.length] = dst;
        // 新数组替换原数组
        arr = newArr;
        // 查看原数组元素，看是否替换替换成功
        System.out.println(Arrays.toString(newArr));
    }
}
