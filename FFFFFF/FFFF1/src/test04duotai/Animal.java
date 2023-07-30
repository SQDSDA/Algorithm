package test04duotai;

public class Animal {
    public void shout() {
        System.out.println("动物-喊叫");
    }
    public void play(Animal an) {
        an.shout();
    }
}
