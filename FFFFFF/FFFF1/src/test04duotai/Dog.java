package test04duotai;

public class Dog extends Animal{ // 子类shout方法对父类shout方法不满意，相当于进行方法的重写
    // 总结起来，多态是指在父类的引用变量中可以存放不同子类对象，并且在运行时根据对象的实际类型来调用对应的方法。这种特性使得代码更加灵活，可以通过父类的统一接口来处理多种子类的对象，提高了代码的可扩展性和复用性。
    public void shout(){
        System.out.println("狗-在叫");
    }
    public void guard(){
        System.out.println("狗-在看家");
    }

}
