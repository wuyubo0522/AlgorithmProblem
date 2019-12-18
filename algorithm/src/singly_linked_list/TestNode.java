package singly_linked_list;

/**
 * 类说明：测试节点类实现单链表。
 *
 * 数据结构说明：单链表是一种链式存取的数据结构，用一组地址任意的存储单元存放线性表中的数据元素。链表中的数据是以结点来表示的，
 * 每个结点的构成：元素(数据元素的映象) + 指针(指示后继元素存储位置)，元素就是存储数据的存储单元，指针就是连接每个结点的地址数据。
 *
 * User: 裕博
 * Date: 2019/12/19
 * Time: 6:56
 */
public class TestNode {
    public static void main(String[] args) {
        Node n1 = new Node(1);
        Node n2 = new Node(2);
        Node n3 = new Node(3);
        // 追加节点
        n1.append(n2).append(n3).append(new Node(4));
        // 取出下一个节点
//		System.out.println(n1.next().next().next().getDate());
        // 判断节点是否为最后一个节点x
//		System.out.println(n1.isLast());
//		System.out.println(n1.next().next().next().isLast());
        // 显示所有节点信息
        n1.show();
        // 删除一个节点
//		n1.next().removeNext();
        // 显示所有节点信息
//		n1.show();
        System.out.println();
        // 插入一个新节点
        Node node = new Node(5);
        n1.next().after(node);
        n1.show();
    }
}
