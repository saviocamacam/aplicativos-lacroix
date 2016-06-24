package view;
import java.awt.CardLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class FrameResetPeriodo {
    JFrame frame;
    
    public FrameResetPeriodo() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    private void initComponents() {
        frame = new JFrame();
        frame.setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        frame.setMinimumSize(new java.awt.Dimension(840, 600));
        frame.setPreferredSize(new java.awt.Dimension(840, 600));	
    }
    
    public static void main(String args[]) {
        
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FrameResetPeriodo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrameResetPeriodo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrameResetPeriodo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrameResetPeriodo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                FrameResetPeriodo window = new FrameResetPeriodo();
                window.frame.setTitle("Cadastro Periodo");
                PanelResetPeriodo panelResetPeriodo = new PanelResetPeriodo();
				window.frame.add(panelResetPeriodo);
				window.frame.pack();
				//window.frame.setVisible(true);
            }
        });
    }
}