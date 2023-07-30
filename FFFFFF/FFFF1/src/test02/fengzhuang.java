package test02;

public class fengzhuang {
     // 封装知识点(程序追求高内聚和低耦合)
     // 高内聚：类的内部数据操作细节由自己完成，不允许外部干涉；
     // 低耦合：进对外暴露少量的方法用于使用
     // 隐藏对象内部的复杂性，只对外公开简单的接口，便于外界调用，从而提高系统的可扩展性和可维护性，提高程序的安全性；该隐藏的隐藏，该暴露的暴露
     // private是受访问控制的，可以将属性私有化，private是权限修饰符
     // 因此不能直接被调用和修改，可以不加private，直接用public就行
     private int age;

     public void setAge(int age) {
          if (age > 30) {
               this.age = 18;
          } else if (age < 30) {
               this.age = age;
          }
     }

     public int getAge(){
          return this.age;
     }
}
