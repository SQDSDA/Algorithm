---
title: JAVA中的基础知识
category: /小书匠/日记/2023-08
grammar_cjkRuby: true
---



----------
# JAVA中的各种除法

~~~
在Java中，除法操作可以有几种不同的表现形式，取决于操作数的类型和所需的结果类型。以下是一些常见的除法形式：

1. **整数除法：** 当进行整数除法时，结果会被截断为整数部分，丢弃小数部分。

```java
int result = 10 / 3;  // 结果为 3，小数部分被丢弃
```

2. **浮点数除法：** 当使用浮点数（包括float和double）进行除法时，结果将保留小数部分。

```java
double result = 10.0 / 3.0;  // 结果为 3.333...
```

3. **取余操作：** 使用 `%` 运算符可以计算除法的余数。

```java
int remainder = 10 % 3;  // 结果为 1，余数是 10 / 3 的余数
```

4. **强制类型转换：** 如果要将整数除法的结果作为浮点数，可以使用强制类型转换。

```java
int dividend = 10;
int divisor = 3;

double result = (double) dividend / divisor;  // 结果为 3.333...
```

在整数除法中，如果希望保留小数部分，可以将其中一个操作数转换为浮点数类型。这样可以避免整数除法截断。

需要注意的是，除数不能为零。如果试图除以零，将会抛出 `ArithmeticException` 异常。在进行除法操作时，请确保除数不为零。
~~~
# JAVA生成0-100的数组
1. 示例

> 你可以使用循环语句来生成一个包含0到100之间所有整数的数组。以下是一个示例代码：

```java
public class ArrayGeneration {
    public static void main(String[] args) {
        int[] numbers = new int[101];  // 创建一个大小为101的数组，索引范围是0到100

        for (int i = 0; i <= 100; i++) {
            numbers[i] = i;  // 将当前索引的值设置为索引本身
        }

        // 打印数组中的值
        for (int i = 0; i <= 100; i++) {
            System.out.print(numbers[i] + " ");
        }
    }
}
```

在上述代码中，我们首先创建了一个大小为101的数组，然后使用循环填充数组中的每个元素，使其等于其索引值。最后，我们使用另一个循环来遍历数组并打印出数组中的值。这样你就会得到一个包含0到100的整数数组。
# JAVA中的泛型

> 在Java中，泛型（Generics）是一种编程机制，旨在增强代码的可重用性、类型安全性和封装性。它允许在编译时指定一种通用类型，而不是在运行时指定具体类型。通过使用泛型，可以编写更通用、更灵活的代码，减少代码重复，同时提高代码的可读性和维护性。

泛型在Java中主要通过以下方式实现：

1. **类泛型（Generic Classes）**：通过在类定义中使用类型参数，可以创建通用的类。类型参数用于指定类中的某些属性、方法参数、返回值等的类型。例如：

```java
public class Box<T> {
    private T value;

    public void setValue(T value) {
        this.value = value;
    }

    public T getValue() {
        return value;
    }
}
```

2. **接口泛型（Generic Interfaces）**：类似于类泛型，接口也可以使用类型参数来创建通用的接口。

```java
public interface List<T> {
    void add(T element);
    T get(int index);
}
```

3. **方法泛型（Generic Methods）**：除了类和接口，Java还支持在方法级别使用泛型。这使得方法能够在调用时接受不同类型的参数，同时保持类型安全性。

```java
public <T> T findMax(T[] array) {
    T max = array[0];
    for (T item : array) {
        if (item.compareTo(max) > 0) {
            max = item;
        }
    }
    return max;
}
```

泛型的好处包括：

- **类型安全性：** 泛型可以在编译时捕获类型错误，防止在运行时发生类型转换异常。
- **代码重用：** 泛型允许编写通用的代码，可以在不同的数据类型上工作，从而减少了代码的重复性。
- **可读性和可维护性：** 泛型使代码更加清晰和易于理解，因为类型信息在代码中得到了明确的表达。
- **性能优化：** 泛型避免了不必要的类型转换，可以提高程序的执行效率。

总之，泛型是Java中一种强大的编程特性，有助于编写更加灵活、类型安全且可重用的代码。