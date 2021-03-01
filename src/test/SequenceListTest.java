// 顺序表测试

package test;

import ds_alg.SequenceList;

public class SequenceListTest {
    public static void main(String[] args) {
        // 创建顺序表对象
        SequenceList<String> sl = new SequenceList<>(10);
        // 测试插入
        sl.add("xiaoming");
        sl.add("xiaohong");
        sl.add("xiaozhang");

        // 测试获取
        String result = sl.get(1);
        System.out.println(result);

        // 测试按照索引插入
        sl.insert(0, "first");
        result = sl.get(0);
        System.out.println(result);

        // 测试删除
        sl.remove(0);
        result = sl.get(0);
        System.out.println(result);

        // 测试清空
        sl.clear();
        System.out.println(sl.length());
    }

}
