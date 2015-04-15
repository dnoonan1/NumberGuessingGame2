package frame;

import javax.swing.JOptionPane;
import javax.swing.UIManager;

/**
 *
 * @author dnoonan1
 */
public class App {

    private static final String ERROR_TITLE = "Error";
    private static final String LF_ERROR_MSG =
            "System look and feel unavailable. Using default instead.";
    
    public static void main(String[] args) {
        
        try {
            // Set System L&F
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, LF_ERROR_MSG, ERROR_TITLE,
                    JOptionPane.ERROR_MESSAGE);
        }
        
        // Start up game window
        java.awt.EventQueue.invokeLater(() -> {
            new NumberGuessingGame().setVisible(true);
        });
        
    }
    
}
