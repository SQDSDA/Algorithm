package test05yichang;

public class test1 {
    public static void main(String[] args) {
        devide();
    }

    public static void devide() {
        // 主动扔住异常有两种处理方法
        int num1 = 12;
        int num2 = 3;
        if (num2 == 0) {
            // 自己在方法内部进行处理
            try {
                throw new Exception();
            } catch (Exception e) {
                System.out.println("这里的异常我用try-catch进行处理");
            }
            // 在方法外部进行处理
            
        }else{
            System.out.println("结果是");
            }
    }
}

