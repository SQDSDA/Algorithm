package laomashucheng;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class test01 implements Serializable {
    public static void main(String[] args) throws Exception {
        while (true) {
            System.out.println("欢迎来到书城");
            System.out.println("1、展示书籍");
            System.out.println("2、上新书籍");
            System.out.println("3、下架书籍");
            System.out.println("4、退出应用");
            Scanner sc = new Scanner(System.in);
            System.out.println("请输入你想要执行的功能的序号：");
            int choice = sc.nextInt(); // 键盘录入数据后，点击回车，程序才可以接受到这个数据
            if (choice == 1) {
                File f = new File("E:\\20230712\\FFFFFF\\FFFF1\\src\\laomashucheng\\demo1.txt");
                if (f.exists() == true) {
                    FileInputStream fis = new FileInputStream(f);
                    ObjectInputStream ois = new ObjectInputStream(fis);
                    ArrayList list = (ArrayList) ois.readObject();
                    System.out.println("执行展示书籍");
                    for (int i = 0; i <= list.size() - 1; i++) {
                        // 为什么这里还要来一个bookk b
                        bookk b = (bookk) list.get(i);
                        System.out.println(b.getbAuthor() + b.getbNo() + b.getbName());
                    }
                } else {
                    System.out.println("当前没有上新书籍，请先上新书籍再进行展示");
                }

                if (choice == 2) {

                    System.out.println("执行上新书籍");
                    // 每上新一本书籍，都要进行记录相关信息
                    System.out.println("请录入书籍编号");
                    int bNo = sc.nextInt();
                    System.out.println("请录入书籍名字：");
                    String bName = sc.next();
                    System.out.println("请录入书籍作者：");
                    String bAuthor = sc.next();
                    // 对照器为空时
                    bookk b = new bookk(bNo, bName, bAuthor);
                    b.setbNo(bNo);
                    b.setbName(bName);
                    b.setbAuthor(bAuthor);
                    ArrayList list = new ArrayList();
                    list.add(b);

                    // 文件
                    File f1 = new File("E:\\20230712\\FFFFFF\\FFFF1\\src\\laomashucheng\\demo1.txt");
                    if (f1.exists() == true) {
                        // 需要流

                    } else {
                        ArrayList list1 = new ArrayList();
                        list1.add(b);
                    }
                    FileOutputStream fos = new FileOutputStream(f1);
                    //
                    ObjectOutputStream oos = new ObjectOutputStream(fos);

                    // 将list写出
                    oos.writeObject(list);

                    // 关闭流
                    oos.close();
                }
                if (choice == 3) {
                    System.out.println("执行下架书籍");
                    System.out.println("请录入你要下架书籍的编号:");
                    int delNo = sc.nextInt();
                    for (int i = 0; i < list.size() - 1; i++) {
                        bookk b = (bookk) (list.get(i));
                        if (b.getbNo() == delNo) {
                            list.remove(b);
                            System.out.println("书籍下架成功");
                            break;
                        }
                    }

                }

                if (choice == 4) {
                    System.out.println("执行退出应用");
                    break; // 停止正在执行的循环
                }
            }
        }
    }
}
