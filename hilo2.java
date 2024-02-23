
import java.util.Calendar;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JTextField;

/**
 *
 * @author "el profe Ariel"
 */
public class hilo2 implements Runnable{
     
    
    public void run(){
        while(true){
            try {
                Calendar c=Calendar.getInstance();
                int hora=c.get(Calendar.HOUR);
                int minutos=c.get(Calendar.MINUTE);
                int segundos=c.get(Calendar.SECOND);
                //hh:mm:ss
                String tiempo=hora +":" + minutos + ":" + segundos ;                
                System.out.println(tiempo);
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
                System.out.println("Se ha generado un error");
            }
        }                
    }
}


