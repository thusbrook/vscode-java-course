package that;

import java.util.ArrayList;
import java.util.List;

public class StaticBlockDemo {
    public static List<String> writes = new ArrayList<>();

    static {
        writes.add("沉默王二");
        writes.add("沉默王三");
        writes.add("沉默王四");

        System.out.println("第一块");
        System.out.println(writes);
    }

    static {
        writes.add("沉默王五");
        writes.add("沉默王六");

        System.out.println("第二块");
        System.out.println(writes);
    }

    public static void main(String[] args) {
        System.out.println("StaticBlockDemo");
    }
}