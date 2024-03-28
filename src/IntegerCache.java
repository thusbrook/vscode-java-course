
public class IntegerCache {
    public static void main(String[] args) {

        /*
         * 基本数据类型的包装类除了 Float 和 Double
         * 之外，其他六个包装器类（Byte、Short、Integer、Long、Character、Boolean）都有常量缓存池。
         * 
         * Byte：-128~127，也就是所有的 byte 值
         * Short：-128~127
         * Long：-128~127
         * Character：\u0000 - \u007F
         * Boolean：true 和 false
         */
        Integer x = new Integer(18);
        Integer y = new Integer(18);
        System.out.println(x == y);

        Integer z = Integer.valueOf(18);
        Integer k = Integer.valueOf(18);
        System.out.println(z == k);

        Integer m = Integer.valueOf(300);
        Integer p = Integer.valueOf(300);
        System.out.println(m == p);

    }
}