public class StringDemo {
    public static void main(String[] args) {
        String text1 = "沉默王二";
        String text2 = "沉默王二";

        // 计算字符串 text1 的哈希值，此时会进行计算并缓存哈希值
        int hashCode1 = text1.hashCode();
        System.out.println("第一次计算 text1 的哈希值: " + hashCode1);

        // 再次计算字符串 text1 的哈希值，此时直接返回缓存的哈希值
        int hashCode1Cached = text1.hashCode();
        System.out.println("第二次计算: " + hashCode1Cached);

        // 计算字符串 text2 的哈希值，由于字符串常量池的存在，实际上 text1 和 text2 指向同一个字符串对象
        // 所以这里直接返回缓存的哈希值
        int hashCode2 = text2.hashCode();
        System.out.println("text2 直接使用缓存: " + hashCode2);

        System.out.println("===String.intern===");
        String s1 = new String("二哥三妹");
        String s2 = s1.intern();
        System.out.println(s1 == s2);

        String s3 = new String("二") + new String("三");
        String s4 = s3.intern();
        System.out.println(s3 == s4);


        StringBuilder sb = new StringBuilder();
        for (int i = 1; i < 10; i++) {
            String chenmo = "沉默";
            String wanger = "王二";
            sb.append(chenmo);
            sb.append(wanger);
        }
        System.out.println(sb);
    }
}
