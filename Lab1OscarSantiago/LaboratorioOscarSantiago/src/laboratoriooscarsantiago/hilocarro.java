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
public class hilocarro extends Thread{
    static String ganadores;
    static boolean termine1=true;
    static boolean termine2=true;
    static boolean termine3=true;
    public void run(){

        
    }
    
 
    
    void car1(){
        int movimiento1;
        while(inicio.carro1.getLocation().x<1000){
            movimiento1=(int) (Math.random()*5+1);
            try {
                Thread.sleep(10);
            } catch (InterruptedException ex) {}
            inicio.carro1.setLocation(inicio.carro1.getLocation().x+movimiento1, inicio.carro1.getLocation().y);
        }
     //   calcular();
    }
    void car2(){
        int movimiento1;
        while(inicio.carro2.getLocation().x<1000){
            movimiento1=(int) (Math.random()*5+1);
            try {
                Thread.sleep(10);
            } catch (InterruptedException ex) {}
            inicio.carro2.setLocation(inicio.carro2.getLocation().x+movimiento1, inicio.carro2.getLocation().y);
        }
      //  calcular();
    }
    void car3(){
        int movimiento1;
        while(inicio.carro3.getLocation().x<1000){
            movimiento1=(int) (Math.random()*5+1);
            try {
                Thread.sleep(10);
            } catch (InterruptedException ex) {}
            inicio.carro3.setLocation(inicio.carro3.getLocation().x+movimiento1, inicio.carro3.getLocation().y);
        }
       // calcular();
        
    }
  
}

