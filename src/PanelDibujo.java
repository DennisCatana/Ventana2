import javax.swing.*;
import java.awt.*;
import java.util.Scanner;
import java.util.Scanner;

public class PanelDibujo extends JPanel {
    public void paintComponent(Graphics g){
        System.out.print("Ingrese su peso en kg: ");
        Scanner ingreso = new Scanner(System.in);
        float dato;
        dato = ingreso.nextFloat();

        System.out.print("Ingrese su estatura en m: ");
        Scanner ingreso2 = new Scanner(System.in);
        float dato2;
        dato2 = ingreso.nextFloat();

        float IMC;
        IMC=dato/(dato2*2);
        String IMC2 = Float.toString(IMC);

        System.out.println("Su IMC es: "+IMC);



        super.paintComponent (g);
        int anchura=getWidth();
        int altura=getHeight();

        /*g.drawLine(10,10,100,10);
        g.drawLine(30,100,30,10);
        g.drawLine(100,100,100,10);
        g.drawLine(100,100,100,10);
        g.drawLine(10,100,100,100);*/

        g.drawString(IMC2,100,100);



    }
}
