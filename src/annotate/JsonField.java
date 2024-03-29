package annotate;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/* 
“注解的生命周期有 3 种策略，定义在 RetentionPolicy 枚举中。”

1）SOURCE：在源文件中有效，被编译器丢弃。
2）CLASS：在编译器生成的字节码文件中有效，但在运行时会被处理类文件的 JVM 丢弃。
3）RUNTIME：在运行时有效。这也是注解生命周期中最常用的一种策略，它允许程序通过反射的方式访问注解，并根据注解的定义执行相应的代码。

“然后我们来讲注解装饰的目标。”我看三妹还在线，就继续说。

注解的目标定义了注解将适用于哪一种级别的 Java 代码上，有些注解只适用于方法，有些只适用于成员变量，有些只适用于类，有些则都适用。
截止到 Java 9，注解的类型一共有 11 种，定义在 ElementType 枚举中。

1）TYPE：用于类、接口、注解、枚举
2）FIELD：用于字段（类的成员变量），或者枚举常量
3）METHOD：用于方法
4）PARAMETER：用于普通方法或者构造方法的参数
5）CONSTRUCTOR：用于构造方法
6）LOCAL_VARIABLE：用于变量
7）ANNOTATION_TYPE：用于注解
8）PACKAGE：用于包
9）TYPE_PARAMETER：用于泛型参数
10）TYPE_USE：用于声明语句、泛型或者强制转换语句中的类型
11）MODULE：用于模块
*/

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
public @interface JsonField {
    public String value() default "";
}