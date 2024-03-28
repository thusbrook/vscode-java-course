import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class ListDemo {
    public static void main(String[] args) {
        int[] anArray = new int[] { 1, 2, 3, 4, 5 };

        List<Integer> aList = new ArrayList<Integer>();
        for (int element : anArray) {
            aList.add(element);
        }
        System.out.println(aList);
        for (Integer integer : aList) {
            System.out.println(integer);
        }

        List<int[]> bList = Arrays.asList(anArray);

        System.out.println(bList);
        for (int[] integer : bList) {
            System.out.println(integer);
        }

        List<Integer> cList = Arrays.stream(anArray).boxed().collect(Collectors.toList());
        System.out.println(cList);
        for (Integer integer : cList) {
            System.out.println(integer);
        }

        String[] otherArray = new String[] { "沉默王二", "一枚有趣的程序员", "好好珍重他" };
        Stream<String> aStream = Arrays.stream(otherArray);
        System.out.println(aStream.collect(Collectors.toList()));

        int[] an2Array = new int[] { 5, 2, 1, 4, 8 };
        Arrays.sort(an2Array);
        System.out.println(Arrays.stream(an2Array).boxed().collect(Collectors.toList()));

        // 只对 1-3 位置上的元素进行反序，所以结果如下所示：
        String[] yetAnotherArray = new String[] { "A", "E", "Z", "B", "C" };
        Arrays.sort(yetAnotherArray, 1, 3,
                Comparator.comparing(String::toString).reversed());
        System.out.println(Arrays.stream(yetAnotherArray).collect(Collectors.toList()));

        // 查找某个元素
        int[] an3Array = new int[] { 5, 2, 1, 4, 8 };
        for (int i = 0; i < an3Array.length; i++) {
            if (anArray[i] == 4) {
                System.out.println("找到了 " + i);
                break;
            }
        }

        // 如果数组提前进行了排序，就可以使用二分查找法，这样效率就会更高一些。Arrays.binarySearch()
        // 方法可供我们使用，它需要传递一个数组，和要查找的元素。
        int[] an4Array = new int[] { 5, 2, 1, 4, 8 };
        int index = Arrays.binarySearch(an4Array, 4);
        System.out.println("找到了 " + index);

        //  数组复制
        
    }
}
