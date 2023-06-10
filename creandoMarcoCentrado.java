//Humberto Duarte C.I 30425622
//Modificado agregado el icono
package graficos;

import java.awt.Dimension;
import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.JFrame;

import java.awt.Toolkit;

public class creandoMarcoCentrado {

	public static void main(String[] args) {
		      MarcoCentrado miMarco= new MarcoCentrado();
		      miMarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		      miMarco.setVisible(true);
		      miMarco.setTitle("Computacion grafica");

	}

}

class MarcoCentrado extends JFrame{
	
	public MarcoCentrado() {
		Toolkit miPantalla= Toolkit.getDefaultToolkit();
		
		Dimension tamanioPantalla= miPantalla.getScreenSize();
		
		int alturaPantalla= tamanioPantalla.height;
		int anchoPantalla= tamanioPantalla.width;
		
		setSize(anchoPantalla/2,alturaPantalla/2);
		setLocation(anchoPantalla/4,alturaPantalla/4);
		Image miIcono= miPantalla.getImage("C://Users//valen//eclipse-workspace//computacionGraficaHumbertoDuarte//src//graficos/Ok.png");
		setIconImage(miIcono);
	}
}
