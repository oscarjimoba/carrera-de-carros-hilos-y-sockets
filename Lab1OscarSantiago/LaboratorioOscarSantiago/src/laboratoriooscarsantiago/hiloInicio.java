/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package laboratoriooscarsantiago;

/**
 *
 * @author Oscar
 */
import java.io.IOException;
import java.net.*;
import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import sun.audio.*;

public class hiloInicio extends Thread{

       
        
        public hiloInicio(){  //constructor
            
     
        }//

   
        public void run() {
       
        
            try {
                AudioStream audio;
                InputStream in;
                File ho = new File("archivo");//wav
               
                in = new FileInputStream(ho);
                audio = new AudioStream(in);
                AudioPlayer.player.start(audio);
                
            } catch (FileNotFoundException ex) {}
              catch(IOException ioe){}
	}//run
}
