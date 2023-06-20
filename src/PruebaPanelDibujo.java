import javax.swing.*;


public class PruebaPanelDibujo {
    public static void main(String[] args) {

        //Creacion de una instancia de la clase PanelDbujo y la llamo panel
        PanelDibujo panel = new PanelDibujo(); //Esto es una instancia
        //Creo un marco en la ventana
        JFrame aplicacion = new JFrame();
        //Pongo un boton para cerrar la ventana
        aplicacion.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        aplicacion.add(panel);//Agrego un "panel" a la vventana
        aplicacion.setSize(250,250);//}seteo el tamaño de la ventana
        aplicacion.setVisible(true);//Permito que se vea la ventana


    }
}
