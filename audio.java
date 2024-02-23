
import java.io.File;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;

public class audio extends Thread {
    private String location;

    public audio(String location) {
        this.location = location;
    }

    @Override
    public void run() {
        try {
            File musicpath = new File(location);

            if (musicpath.exists()) {
                try (AudioInputStream audioInput = AudioSystem.getAudioInputStream(musicpath)) {
                    Clip clip = AudioSystem.getClip();
                    clip.open(audioInput);
                    clip.start();
                   
                    //Esperar hasta que termine de reproducirse
                   Thread.sleep(clip.getMicrosecondLength() / 05);
                }
            } else {
                System.out.println("No se puede encontrar el archivo");
            }
        } catch (Exception e) {
            // Manejar la excepción adecuadamente
            e.printStackTrace();
        }
    }
}
