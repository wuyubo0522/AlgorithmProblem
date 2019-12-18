package stack;

/**
 * 类说明：栈类型的数据结构
 * User: 裕博
 * Date: 2019/12/19
 * Time: 6:36
 */
public class CreateStack {
    // 栈的底层用数组来存储数据
    int[] elements;

    public CreateStack() {
        elements = new int[0];
    }

    // 压入元素
    public void push(int element) {
        // 创建一个新的数组
        int[] newArr = new int[elements.length + 1];
        // 把原数组中的元素复制到新数组中
        System.arraycopy(elements, 0, newArr, 0, elements.length);
        // 把添加的元素放入新数组中
        newArr[elements.length] = element;
        // 使用新数组替换旧数组
        elements = newArr;
    }

    // 取出栈顶元素
    public int pop() {
        // 栈中没有元素
        if (elements.length == 0) {
            throw new RuntimeException("stack is empty");
        }
        // 取出数组最后一个元素
        int element = elements[elements.length - 1];
        // 创建一个新的数组
        int[] newArr = new int[elements.length - 1];
        // 原数组中除了最后一个元素的其他元素都放入新数组中
        System.arraycopy(elements, 0, newArr, 0, elements.length - 1);
        // 替换数组
        elements = newArr;
        return element;
    }

    // 查看栈顶元素
    public int peek() {
        // 栈中没有元素
        if (elements.length == 0) {
            throw new RuntimeException("stack is empty");
        }
        return elements[elements.length - 1];
    }

    // 判断栈是否为空
    public boolean isEmpty() {
        return elements.length == 0;
    }
}
