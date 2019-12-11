package simple;

/**
 * 类说明：实现从1累加到100的求和算法
 *
 * @author 裕博
 */
public class AddOneToHundred {
    public static void main(String[] args) {
        int total = 0;
        int end = 100;

        // 使用for循环计算
//        for (int i = 0; i < 101; i++) {
//            total += i;
//        }

        // 直接计算
        total = (1 + end) * end / 2;

        // 控制台输出结果
        System.out.println("计算的结果是："+total);
    }
}
