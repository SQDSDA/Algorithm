package laomashucheng;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class shuchu1 {
    public static void main(String[] args) throws IOException {
        String str = "abc你好";
        File f = new File("E:\\20230712\\FFFFFF\\FFFF1\\src\\laomashucheng\\demo.txt");
        FileWriter fw = new FileWriter(f);
        fw.write(str);
        fw.close();
    }
}
