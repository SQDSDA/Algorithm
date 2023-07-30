package laomashucheng;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class io {
    // 为什么要throws IOException？
    public static void main(String[] args) throws IOException {
        // 对文件进行操作，必须将文件封装为具体的File对象
        File f1 = new File("");
        FileReader fr = new FileReader(f1);
        int n = fr.read();
        // java for循环的理解
        //
        while (n!=-1){
            System.out.println(n);
            n = fr.read();
        }
        fr.close();

    }
}
