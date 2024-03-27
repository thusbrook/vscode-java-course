
abstract class Animal {
    abstract void makeSound();

    public void sleep() {
        System.out.println("The animal is sleeping.");
    }
}

class Dog extends Animal {
    void makeSound() {
        System.out.println("The dog barks.");
    }

    public void bark() {
        System.out.println("狗在汪汪叫");
    }
}

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        // 1. abstract 抽象类
        Dog dog = new Dog();
        dog.makeSound();
        // 2. boolean
        boolean isStudent = true;

        if (isStudent) {
            System.out.println("This person is a student.");
        } else {
            System.out.println("This person is not a student.");
        }
        // 3. break ...
        // 4. byte
        // 用于表示一个 8 位（1 字节）有符号整数。它的值范围是 -128（-2^7）到 127（2^7 - 1）。
        // 由于 byte 类型占用的空间较小，它通常用于处理大量的数据，如文件读写、网络传输等场景，以节省内存空间。

        byte minByte = -128;
        byte maxByte = 127;
        System.err.println(minByte);
        System.err.println(maxByte);

        // 5. switch case ...
        // 6. catch ...
        // 7. char ...
        // 用于声明一个字符类型的变量。char 类型的变量可以存储任意的 Unicode 字符，可以使用单引号将字符括起来来表示。
        char c = 'A';
        System.err.println(c);
        // 8. class
        Person person = new Person("Tom", 18);
        person.sayHello();
        // 9. continue ...
        // 10. default ...
        // 11. do while ...
        // 12. double
        // 用于声明一个双精度浮点类型的变量。
        double da = 3.14;
        double db = 2.0;
        double dc = da + db;
        System.err.println(dc);
        // 13. if esle
        // 14. enum
        // 用于定义一组固定的常量
        System.err.println(PlayerType.BASKETBALL);
        // 15. extends
        Dog dog2 = new Dog();
        dog2.sleep();
        dog2.bark();
        // 16. final ...
        // 17. try catch finally ...
        // 18. float
        // 表示单精度浮点数。
        float f1 = 3.14f; // 注意要在数字后面加上 f 表示这是一个 float 类型
        float f2 = 1.23e-4f; // 科学计数法表示小数
        System.err.println(f1);
        System.err.println(f2);
        // 19. for
        // 20. if
        // 21. implements
        // [Java接口，看这一篇就够了，简单易懂 | 二哥的Java进阶之路](https://javabetter.cn/oo/interface.html)
    }
}
