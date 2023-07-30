package test04duotai;

public class Test {

    public static void main(String[] args){
        Gril g = new Gril();
        Animal an;
        Cat c = new Cat();
        an = c;
        g.play(an);
    }
}
