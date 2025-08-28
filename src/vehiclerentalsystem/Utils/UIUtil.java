package vehiclerentalsystem.Utils;
import com.formdev.flatlaf.FlatClientProperties;
import javax.swing.*;
import java.awt.*;
public class UIUtil {
       /**
     * Makes a Swing component rounded using FlatLaf properties.
     * 
     * @param comp    The component to round (JPanel, JButton, etc.)
     * @param radius  The corner radius in pixels
     */
    public static void makeRounded(JComponent comp, int radius) {
        // Enable FlatLaf rounded corners
        comp.putClientProperty( FlatClientProperties.COMPONENT_ROUND_RECT, true );

        // Optional: enable background color for opaque components
          // Ensure background is painted for JPanel/JButton
        comp.setOpaque(true);

        // Repaint to force the look update
        comp.repaint();
    }
}
