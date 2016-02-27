/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package laboratoriooscarsantiago;

import static java.lang.Thread.sleep;

/**
 *
 * @author Oscar
 */
public class hilocarro3 extends Thread{
    public void run(){
        int movimiento1;
        while(inicio.carro3.getLocation().x<800){
            movimiento1=(int) (Math.random()*5+1);
            try {
                sleep(10);
            } catch (InterruptedException ex) {}
            inicio.fram.carro3.setLocation(inicio.carro3.getLocation().x+movimiento1, inicio.fram.carro3.getLocation().y);
        }
        inicio.fram.puesto++;
        String texto=inicio.fram.txtResultados1.getText()+inicio.fram.puesto+". "+this.getName()+"\n";
        inicio.fram.txtResultados1.setText(texto);
     //   hiloinicio hil=new hiloinicio(this.getName());
    }
}
