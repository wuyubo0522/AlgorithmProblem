package search;

/**
 * 类说明：整合算法的测试类
 * User: 裕博
 * Date: 2019/12/17
 * Time: 23:36
 */
public class TestSearchIntegration {
    public static void main(String[] args) {
        SearchIntegration mSearchIntegration = new SearchIntegration();
        mSearchIntegration.add(1);
        mSearchIntegration.add(2);
        mSearchIntegration.add(3);
        mSearchIntegration.add(4);
        mSearchIntegration.add(5);
        mSearchIntegration.add(6);
        // 调试线性查找算法
        int index = mSearchIntegration.linearSearch(4);
        System.out.println("index:"+index);
        // 调试二分查找（折半查找）算法
        int index2 = mSearchIntegration.binarySearch(4);
        System.out.println("index2:"+index2);
    }
}
