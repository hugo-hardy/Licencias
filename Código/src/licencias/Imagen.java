/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


package licencias;
import java.awt.Graphics;
import javax.swing.ImageIcon;
import javax.swing.JPanel;

public class Imagen extends javax.swing.JPanel {
    int x, y; String name;

    public Imagen(JPanel jPanel1, String image_name) {
        this.x = jPanel1.getWidth();
        this.y = jPanel1.getHeight();
        this.setSize(x, y);
        name = image_name;
    }
    
    @Override
    public void paint(Graphics g) {
        ImageIcon Img = new ImageIcon(getClass().getResource("/Imagenes/"+name));
        g.drawImage(Img.getImage(), 0, 0, x, y, null);
    }    

}
