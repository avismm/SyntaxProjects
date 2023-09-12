package Class20Polymorphism;

import javazoom.jl.decoder.JavaLayerException;
import javazoom.jl.player.Player;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class E3AudioPlayer {
    public static void main(String[] args) throws FileNotFoundException, JavaLayerException {
        FileInputStream fis=new FileInputStream("C:\\Users\\LENOVO\\IdeaProjects\\SyntaxProjects\\src\\main\\java\\Class20Polymorphism\\Ambient-music-free.mp3");
        Player mp3Player=new Player(fis);
        mp3Player.play();
    }
}
