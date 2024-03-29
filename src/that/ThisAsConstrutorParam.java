package that;

public class ThisAsConstrutorParam {
    int count = 10;

    ThisAsConstrutorParam() {
        Data data = new Data(this);
        data.out();
    }

    public static void main(String[] args) {
        new ThisAsConstrutorParam();
    }
}