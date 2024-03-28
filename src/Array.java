public class Array {
    public static void main(String[] args) {
        /* 1. 数组初始化创建 */
        int[] array = new int[5];
        array[0] = 1;
        array[1] = 2;
        array[2] = 3;
        array[3] = 4;
        array[4] = 5;
        System.out.println(array.length);
        for (int i : array) {
            System.out.println("current is:" + i);
        }
        /* 2. 数组初始化创建 */
        int anOtherArray[] = new int[] { 1, 2, 3 };
        System.out.println(anOtherArray.length);
        for (int i : anOtherArray) {
            System.out.println("current is:" + i);
        }
    }
}
