/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * FileTransferDisplay.java
 *
 * Created on 04-Jun-2009, 00:33:00
 */

package intranetchat.display;

import java.util.Observable;
import java.util.Observer;

/**
 * This class will only interface wiht the FileTransferSystem class
 * @author Philip
 */
public class FileTransferDisplay extends javax.swing.JDialog implements Observer {

    /** Creates new form FileTransferDisplay */
    public FileTransferDisplay(java.awt.Frame parent, boolean modal,Observable o) {
        super(parent, modal);
        initComponents();
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void update(Observable o, Object arg) {
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables

}