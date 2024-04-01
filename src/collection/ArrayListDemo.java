package collection;

import java.util.ArrayList;

public class ArrayListDemo {
    public static void main(String[] args) {
        // 创建一个集合
        ArrayList<String> list = new ArrayList<String>();
        // 添加元素
        list.add("王二");
        list.add("沉默");
        list.add("陈清扬");

        System.out.println("================================");
        // 遍历集合 for 循环
        for (int i = 0; i < list.size(); i++) {
            String s = list.get(i);
            System.out.println(s);
        }
        System.out.println("================================");
        // 遍历集合 for each
        for (String s : list) {
            System.out.println(s);
        }
        System.out.println("================After Delete================");
        // 删除元素
        list.remove(1);
        // 遍历集合
        for (String s : list) {
            System.out.println(s);
        }
        System.out.println("================After Modify================");
        // 修改元素
        list.set(1, "王二狗");
        // 遍历集合
        for (String s : list) {
            System.out.println(s);
        }
    }
}
