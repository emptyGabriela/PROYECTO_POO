
import java.awt.event.KeyEvent;
import javax.swing.ImageIcon;
import javax.swing.JPanel;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */

/**
 *
 * @author david
 */

public class tablero extends javax.swing.JPanel {
    private boolean halo;
    int x,y;
    
    public tablero() {
           initComponents();   
           halo = VariableHolder.getHalo();
           panel_tablero.setFocusable(true);
           if (halo == true){
            ImageIcon ico =new ImageIcon(getClass().getResource("/Recursos/Halo.png"));
            jLabel3.setIcon(ico);
            System.out.println("Halo");
        }
        else if (halo == false){
            ImageIcon ico =new ImageIcon(getClass().getResource("/Recursos/cortan.png"));
            jLabel3.setIcon(ico);
            System.out.println("Cortana");
        }
       }
    
    public void setHalo(boolean halo2) {
        this.halo = halo2;
    }
    
   
   
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel_tablero = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        panel_tablero.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                panel_tableroKeyPressed(evt);
            }
        });
        panel_tablero.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        panel_tablero.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 510, 70, 70));

        jButton1.setText("jButton1");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        panel_tablero.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 640, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/Tablero.png"))); // NOI18N
        panel_tablero.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel_tablero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel_tablero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void panel_tableroKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_panel_tableroKeyPressed
        x=jLabel3.getX();
        y=jLabel3.getY();
        System.out.println(jLabel3.getLocation());
        switch(evt.getExtendedKeyCode()){
            case KeyEvent.VK_UP:
                jLabel3.setLocation(x,y-2);
                break;
            case KeyEvent.VK_DOWN:
                jLabel3.setLocation(x,y+2);
                break;
            case KeyEvent.VK_LEFT:
                jLabel3.setLocation(x-2,y);
                break;
            case KeyEvent.VK_RIGHT:
                jLabel3.setLocation(x+2,y);
                break;
        }
    }//GEN-LAST:event_panel_tableroKeyPressed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        
    }//GEN-LAST:event_jButton1ActionPerformed
    public void imagen(){
        if (halo == true){
            ImageIcon ico =new ImageIcon(getClass().getResource("/Recursos/Halo.png"));
            jLabel3.setIcon(ico);
            System.out.println("Halo");
        }
        else if (halo == false){
            ImageIcon ico =new ImageIcon(getClass().getResource("/Recursos/cortan.png"));
            jLabel3.setIcon(ico);
        }
    }
     public JPanel getFondo5() {
        return panel_tablero;
    }
    private void showPanel5(JPanel p){
            p.setSize(1150, 694);
            p.setLocation(0, 0);
            panel_tablero.removeAll();
            panel_tablero.add(p, new org.netbeans.lib.awtextra.AbsoluteConstraints(0,0,-1,-1));
            panel_tablero.revalidate();
            panel_tablero.repaint();
        }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel panel_tablero;
    // End of variables declaration//GEN-END:variables
}
