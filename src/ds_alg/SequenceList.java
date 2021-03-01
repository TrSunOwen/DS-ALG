// 顺序表

package ds_alg;

public class SequenceList<T> {
    // 存储元素的数组
    private T[] eles;
    //记录当前表中元素的个数
    private int N;

    public SequenceList(int capacity) {
        // 初始化数组
        this.eles = (T[]) new Object[capacity];
        // 初始化长度
        this.N = 0;

    }

    // 将一个线性表重置为空表
    public void clear() {
        this.N = 0;
    }

    // 判断当前线性表是否为空表
    public boolean isEmpty() {
        return (N == 0);
    }

    //获得线性表长度
    public int length() {
        return N;
    }

    // 获得指定位置的元素
    public T get(int i) {
        return eles[i];
    }

    // 向线性表中添加元素t
     public void add(T t) {
        eles[N++] = t;
     }

     // 在i元素处插入元素t
    public void insert(int i, T t) {
        // 先把i索引处元素及其后面的元素全部向后移动一位
        for(int index = (N-1); index > i; index--) {
            eles[index] = eles[index-1];
        }
        // 将t元素放入i索引处
        eles[i] = t;
    }

    // 删除指定i索引处的元素，并返回该元素
    public T remove(int i) {
        // 记录i索引的值
        T current = eles[i];
        // 索引i后面的元素依次向前移动一位
        for(int index = i; index < (N-1); index++) {
            eles[index] = eles[index+1];
        }
        // 元素个数减1
        N--;
        // 返回被删元素
        return current;
    }

    // 查找指定元素第一次出现的位置
    public int indexOf(T t) {
        for(int i = 0; i < N; i++) {
            if(eles[i].equals(t)) {
                return i;
            }
        }
        // 如果没有找到，返回-1
        return -1;
    }
}
