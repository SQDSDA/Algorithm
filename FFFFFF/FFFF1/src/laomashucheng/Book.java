package laomashucheng;

public class Book {// 书籍
    // 属性
    // 书籍编号：
    private int bNo;
    private String bName;
    private String bAuthor;

    public int getbNo() {
        return bNo;
    }

    public String getbName() {
        return bName;
    }

    public String getbAuthor() {
        return bAuthor;
    }

    public void setbNo(int bno) {
        this.bNo = bno;
    }

    public void setbName(String bName) {
        this.bName = bName;
    }

    public void setbAuthor(String bAuthor) {
        this.bAuthor = bAuthor;
    }

    public Book(int bno, String bName, String bAuthor) {
        this.bNo = bno;
        this.bName = bName;
        this.bAuthor = bAuthor;
    }
}
