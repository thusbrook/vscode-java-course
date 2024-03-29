package that;

public class ThisChain {
    ThisChain getThisAsMethodResult() {
        return this;
    }

    ThisChain out() {
        System.out.println("hello");
        return this;
    }

    ThisChain finish() {
        System.out.println("finish");
        return this;
    }

    public static void main(String[] args) {
        new ThisChain().getThisAsMethodResult().out().finish();
    }
}