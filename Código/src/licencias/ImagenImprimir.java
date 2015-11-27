/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


package licencias;
import java.awt.Graphics;
import javafx.scene.layout.Border;
import javax.swing.ImageIcon;
import javax.swing.JPanel;
import javax.swing.border.LineBorder;
/**
 *
 * @author HARDY
 */
public class ImagenImprimir extends javax.swing.JPanel {
    int x, y; String name;

    public ImagenImprimir(JPanel jPanel1, String image_path) {
        this.x = jPanel1.getWidth();
        this.y = jPanel1.getHeight();
        this.setSize(x, y);
                
        name = image_path;
    }
    
    @Override
    public void paint(Graphics g) {
        ImageIcon Img = new ImageIcon(name);
        g.drawImage(Img.getImage(), 0, 0, x, y, null);
    }    

}
