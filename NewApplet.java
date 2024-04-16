/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.applet.Applet; 
import java.awt.Graphics;

/**
 *
 * @author user
 */
public class NewApplet extends Applet {

    /**
     * Initialization method that will be called after the applet is loaded into
     * the browser.
     */
    public void init() {
        // TODO start asynchronous download of heavy resources 
        resize(300,300);
    } 
    public void paint(Graphics g){ 
        g.drawString("hello Kalai!", 150, 150);
    }

    // TODO overwrite start(), stop() and destroy() methods
}
