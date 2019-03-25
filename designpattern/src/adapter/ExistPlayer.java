package adapter;

// 假设ExistPlayer是一个第三方提供的类，我们只能使用，不能修改。
public class ExistPlayer {

    public void playMp3(String filename) {
        System.out.println("play map3: " + filename);
    }

    public void playWma(String filename) {
        System.out.println("play wma: " + filename);
    }
}
