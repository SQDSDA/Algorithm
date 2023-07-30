package test04duotai;

public class Play {
    // 如果这里有100个动物，小女孩要和100个动物玩需要写100个函数，因此用多抬来节省
    public void play(Dog d){
        d.shout();
    }

    public void play(Cat c){
        c.shout();
    }
}
