

import javax.swing.JOptionPane;

/**
 *
 * @author Carlos
 */
public class Hilosvf {

    public static void main(String[] args) {
        String filepath = "song.wav";

        audio a1 = new audio(filepath);
        a1.start();
        
        hilo2 h2 = new hilo2();
        Thread thread = new Thread(h2);
        thread.start();

        
        JOptionPane.showMessageDialog(null, "Presiona 'Ok' para detenerse. ");
        //a1.interrupt();
        
        System.out.println("Hello World!");
    }
}
