
abstract class Animal {
    abstract void makeSound();

    protected String name;

    public Animal(String name) {
        this.name = name;
    }

    public Animal() {
        this("kite");
    }

    public void eat() {
        System.out.println(name + " is eating meat.");
    }

    public void sleep() {
        System.out.println("The animal is sleeping.");
    }
}

class Dog extends Animal {

    public Dog(String name) {
        super(name); // 调用父类的构造方法
    }

    public Dog() {
        super(); // 调用父类的构造方法
    }

    public void makeSound() {
        System.out.println("The dog barks.");
    }

    public void bark() {
        System.out.println("狗在汪汪叫");
    }

    public void eat() {
        super.eat(); // 调用父类的方法
        System.out.println(name + " is eating bones.");
    }
}

public class Keyword {
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
        System.out.println(minByte);
        System.out.println(maxByte);

        // 5. switch case ...
        // 6. catch ...
        // 7. char ...
        // 用于声明一个字符类型的变量。char 类型的变量可以存储任意的 Unicode 字符，可以使用单引号将字符括起来来表示。
        char c = 'A';
        System.out.println(c);
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
        System.out.println(dc);
        // 13. if esle
        // 14. enum
        // 用于定义一组固定的常量
        System.out.println(PlayerType.BASKETBALL);
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
        System.out.println(f1);
        System.out.println(f2);
        // 19. for
        // 20. if
        // 21. implements
        // [Java接口，看这一篇就够了，简单易懂 | 二哥的Java进阶之路](https://javabetter.cn/oo/interface.html)
        // 22. import
        // 23. instanceof
        // [掌握 Java instanceof关键字 |
        // 二哥的Java进阶之路](https://javabetter.cn/basic-extra-meal/instanceof.html)
        // 24. int
        // 25. interface
        // 26. long
        // 27. native
        // 用于声明一个本地方法，本地方法是指在 Java 代码中声明但在本地代码（通常是 C 或 C++
        // 代码）中实现的方法，它通常用于与操作系统或其他本地库进行交互。
        // 28. new
        // 29. null
        // 30. package
        // 用于声明类所在的包
        // 31. private
        // 32. protected
        // 33. public
        // 34. try catch finally
        // 35. return
        // 36. short
        // 用于表示短整数，占用 2 个字节（16 位）的内存空间。
        short x = 10; // 声明一个 short 类型的变量 x，赋值为 10
        short y = 20; // 声明一个 short 类型的变量 y，赋值为 20
        System.out.println(x + y);
        // 37. static
        // 38. strictfp
        /**
         * strict floating-point
         * 
         * 并不常见，通常用于修饰一个方法，用于限制浮点数计算的精度和舍入行为。当你在类、接口或方法上使用 strictfp 时，该范围内的所有浮点数计算将遵循
         * IEEE 754 标准的规定，以确保跨平台的浮点数计算的一致性。
         * 
         * 不同的硬件平台和 JVM 实现可能对浮点数计算的精度和舍入行为有差异，这可能导致在不同环境中运行相同的浮点数计算代码产生不同的结果。使用 strictfp
         * 关键字可以确保在所有平台上获得相同的浮点数计算结果，避免计算结果的不一致问题。
         * 
         * 但请注意，使用 strictfp 可能会对性能产生影响，因为可能需要更多的计算和转换来确保遵循 IEEE 754 标准。因此，在使用 strictfp
         * 时，需要权衡精度和一致性与性能之间的关系。
         */
        // 39. super
        Dog dog3 = new Dog();
        dog3.eat();
        // 40. switch
        // 41. synchronized
        // 用于指定多线程代码中的同步方法、变量或者代码块
        // 42. this
        // 可用于在方法或构造方法中引用当前对象
        // 43. throw
        // 44. throws
        // 45. transient
        // 修饰的字段不会被序列化
        // 46. void
        // 47. volatile
        // 保证不同线程对它修饰的变量进行操作时的可见性，即一个线程修改了某个变量的值，新值对其他线程来说是立即可见的。
        // 48. while
        // 49. goto 
        // 50. const == public static final
    }
}
