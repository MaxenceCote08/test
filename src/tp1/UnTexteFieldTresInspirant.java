/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp1;

import javax.swing.JTextField;
import javax.swing.text.Document;

/**
 *
 * @author maxen
 */
public class UnTexteFieldTresInspirant extends JTextField
{

    public UnTexteFieldTresInspirant() {
    }

    public UnTexteFieldTresInspirant(String text) {
        super(text);
    }

    public UnTexteFieldTresInspirant(int columns) {
        super(columns);
    }

    public UnTexteFieldTresInspirant(String text, int columns) {
        super(text, columns);
    }

    public UnTexteFieldTresInspirant(Document doc, String text, int columns) {
        super(doc, text, columns);
    }
    
    public void changementDeTexteDansLeTexteFieldTresInspirant()
    {
        this.setText("");
    }
}
