package search;

/**
 * 类说明：二分查找（折半查找）算法
 * @author 裕博
 * Time:2019/12/17
 */
public class BinarySearch {
    public static void main(String[] args) {
        // 目标数组
        int[] arr = new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
        // 目标元素
        int target = 5;
        // 记录开始位置
        int begin = 0;
        // 记录结束位置
        int end = arr.length - 1;
        // 记录中间位置
        int mid = (begin + end) / 2;
        // 记录目标位置
        int index = -1;
        // 循环查找
        while (true) {
            if (arr[mid] == target) {
                // 判断中间的这个元素是不是要查找的元素
                index = mid;
                break;
            } else {
                // 中间这个元素不是要查找的元素
                if (arr[mid] > target) {
                    // 判断中间这个元素比目标元素大
                    // 把结束位置调整到中间位置前一个位置
                    end = mid - 1;
                } else {
                    // 判断中间这个元素比目标元素小
                    // 把结束位置调整到中间位置后一个位置
                    begin = mid + 1;
                }
                // 取出新的中间位置
                mid = (begin + end) / 2;
            }
        }
        // 打印目标元素的位置
        System.out.println("index:" + index);
    }
}
