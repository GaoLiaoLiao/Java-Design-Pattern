package adapter;

public class PlayerAdapter implements MusicPlayer {
    private ExistPlayer player;
    public PlayerAdapter() {
        player = new ExistPlayer();
    }

    @Override
    public void play(String type, String filename) {
        if(type == "mp3") {
            player.playMp3(filename);
        } else if(type == "wma") {
            player.playWma(filename);
        }
    }
}
