package stack;

/**
 * 类说明：测试定义的栈的数据结构类
 * User: 裕博
 * Date: 2019/12/19
 * Time: 6:39
 */
public class TestCreateStack {
    public static void main(String[] args) {
        // 创建一个栈
        CreateStack ms = new CreateStack();
        // 压入元素
        ms.push(9);
        ms.push(8);
        ms.push(7);
        // 查看栈顶元素
        System.out.println(ms.peek());
        // 判断栈是否为空
        System.out.println(ms.isEmpty());
        // 取出栈顶元素
        System.out.println(ms.pop());
    }
}
