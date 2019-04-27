package adapter;

// 参考了Gitchat课程【经典设计模式实战演练】
// https://gitbook.cn/gitchat/column/5b1e3647294fb04d7c22b783/topic/5b1fa4f252823b711103339d

public class AdapterPattern {

    public static void main(String[] args) {
        MusicPlayer musicPlayer = new PlayerAdapter();
        musicPlayer.play("mp3", "song.mp3~~");
        musicPlayer.play("wma", "song.wma~~");
    }
}
