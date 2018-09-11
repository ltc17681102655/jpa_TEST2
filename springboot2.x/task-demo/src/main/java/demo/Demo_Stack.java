package demo;

import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.List;
import java.util.Stack;

public class Demo_Stack {

    @Test
    public void demo1() {
        /**
         *
         序号	方法描述
         1	boolean empty()
         测试堆栈是否为空。
         2	Object peek( )
         查看堆栈顶部的对象，但不从堆栈中移除它。
         3	Object pop( )
         移除堆栈顶部的对象，并作为此函数的值返回该对象。
         4	Object push(Object element)
         把项压入堆栈顶部。
         5	int search(Object element)
         返回对象在堆栈中的位置，以 1 为基数
         */
        Stack<Integer> stacks = new Stack<>();

        stacks.push(1);
        stacks.push(2);
        stacks.push(3);

        System.out.println(stacks);
        /**
         * 3
         * pop
         * [1, 2]
         * 移除堆栈顶部的对象，并作为此函数的值返回该对象
         */
        //System.out.println(stacks.pop());
        System.out.println(stacks.empty());
        /**
         * 3
         * peek
         * [1, 2, 3]
         * 查看堆栈顶部的对象，但不从堆栈中移除它。
         */
//        System.out.println(stacks.peek());
        /**
         * search
         * 2
         * 返回对象在堆栈中的位置，以 1 为基数
         */
        System.out.println(stacks.search(2));
        System.out.println(stacks);
    }


    @Test
    public void demo2() {
        HashMap<String, List<Integer>> stringStringHashMap = new HashMap<>();

        stringStringHashMap.put(null, null);
        stringStringHashMap.put(null, null);
        stringStringHashMap.put(null, null);
        stringStringHashMap.put(null, null);
        System.out.println(stringStringHashMap);
    }


    @Test
    public void demo3() {
        Hashtable<String, String> stringStringHashMap = new Hashtable<>();

        /**
         * 非null-key AND 非null-value
         */
//        stringStringHashMap.put(null,"123");
//        stringStringHashMap.put("123",null);

        System.out.println(stringStringHashMap);
    }

}
