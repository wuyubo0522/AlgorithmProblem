package queue;

/**
 * 类说明：对列类型的数据结构，它的特点与栈想法，它是先进先出
 * User: 裕博
 * Date: 2019/12/19
 * Time: 6:47
 */
public class CreateQueue {

    int[] elements;

    public CreateQueue() {
        elements = new int[0];
    }

    // 入队
    public void add(int element) {
        // 创建一个新的数组
        int[] newArr = new int[elements.length + 1];
        // 把原数组中的元素复制到新数组中
        System.arraycopy(elements, 0, newArr, 0, elements.length);
        // 把添加的元素放入新数组中
        newArr[elements.length] = element;
        // 使用新数组替换旧数组
        elements = newArr;
    }

    // 出队
    public int poll() {
        // 把数组中第0个元素取出来
        int element	= elements[0];
        // 创建一个新的数组
        int[] newArr = new int[elements.length-1];
        // 复制原数组中的元素到新数组中
        System.arraycopy(elements, 1, newArr, 0, newArr.length);
        // 替换数组
        elements = newArr ;
        return element;
    }

    // 判断队列是否为空
    public boolean isEmpty() {
        return elements.length == 0;
    }
}
