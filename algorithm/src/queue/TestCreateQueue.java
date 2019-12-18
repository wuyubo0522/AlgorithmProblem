package queue;

/**
 * 类说明：测试队列相关的操作
 * User: 裕博
 * Date: 2019/12/19
 * Time: 6:50
 */
public class TestCreateQueue {
    public static void main(String[] args) {
        CreateQueue mq = new CreateQueue();
        // 入队操作
        mq.add(9);
        mq.add(8);
        mq.add(7);
        // 出队
        System.out.println(mq.poll());
        System.out.println(mq.poll());
        System.out.println(mq.poll());
        // 判断是否为空
        System.out.println(mq.isEmpty());
    }
}
