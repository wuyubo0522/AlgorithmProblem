package search;

/**
 * 类说明：线性查找算法示例
 * @author 裕博
 */
public class LinearSearch {

    public static void main(String[] args) {
        int[] arr = new int[] {2,3,5,6,8,4,9,0};
        // 目标元素
        int target = 8;
        // 目标元素所在的下标
        int index = -1;
        // 遍历数组
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                index = i;
                break;
            }
        }
        // 打印目标元素的下标
        System.out.println("目标元素的下标是:"+index);
    }
}
