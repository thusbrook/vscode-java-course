package annotate;

public class JsonFieldTest {
    public static void main(String[] args) throws IllegalAccessException {
        Writer cmower = new Writer(18, "沉默王二", "Web全栈开发进阶之路");
        System.out.println(JsonSerializer.serialize(cmower));
    }
}