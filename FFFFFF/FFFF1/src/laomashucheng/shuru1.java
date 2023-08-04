package laomashucheng;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class shuru1 {
    public static void main(String[] args) throws IOException {
        File f = new File("E:\\20230712\\FFFFFF\\FFFF1\\src\\laomashucheng\\nn.txt");
        FileReader fr = new FileReader(f);
        int n = fr.read();
        while (n != -1){
            System.out.println(n);
            n = fr.read();
        }
        fr.close();
    }
}
