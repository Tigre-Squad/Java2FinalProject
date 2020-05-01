import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;

import javax.swing.JComponent;

////////////////////////////////////////////////////////////////////// class Die
public class Die extends JComponent {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    // ======================================================= instance variables
    private int _faceValue; // value that shows on face of die
    private int multiple;

    // ============================================================== constructor
    /** Initialize to white background and 60x60 pixels. Initial roll. */
    public Die(int _diceVall) {
        // -- Preferred size is set, but layout may change it.
        setPreferredSize(new Dimension(60, 60));
        multiple = _diceVall;
        roll(); // Set to random initial value
    }

    // ============================================================== method roll
    /**
     * Produce random roll in range 1-6. Causes repaint().
     * 
     * @return Result of roll (1-20).
     */
    public int roll() {
        if(multiple == 100){
            int val = (int) ((multiple/10) * Math.random() + 1); // Range 1-6
            setValue(val);
            System.out.println(_faceValue);

            return val;
        }else{
            int val = (int) (multiple * Math.random() + 1); // Range 1-6
            setValue(val);
            System.out.println(_faceValue);

            return val;
        }
    }

    // ========================================================== method getValue
    /** Returns result of last roll. */
    public int getValue() {
        return _faceValue;
    }

    // ========================================================== method setValue
    /**
     * Sets the value of the Die. Causes repaint().
     * 
     * @param num Number from 1-20.
     */
    public void setValue(int num) {
        _faceValue = num;
        repaint(); // Value has changed, must repaint
    }

    // ==================================================== method paintComponent
    /** Draws spots of die face. */
    @Override
    public void paintComponent(Graphics g) {
        int w = getWidth(); // Get height and width
        int h = getHeight();
        // ... Change to Graphic2D for smoother spots.
        Graphics2D g2 = (Graphics2D) g;
        Graphics2D g3 = g2; // See note below
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        // ... Paint background
        g2.setColor(Color.WHITE);
        g2.fillRect(0, 0, w, h);
        g2.setColor(Color.BLACK);
        g2.drawRect(0, 0, w - 1, h - 1); // Draw border
        if (multiple == 4) {
            g3.drawString("D4", (w / 2) -6, (h / 2) -15);
            // g2.drawPolygon(new int[] {15, 30, 50-3}, new int[] {40, 15, 40}, 3);
        } else if (multiple == 6) {
            g3.drawString("D6",  (w / 2) -6, (h / 2) -15);
            // g2.drawRect(20-3, 12+5, 25, 25); // Draw border
        } else if (multiple == 8) {
            g3.drawString("D8", (w / 2) -6, (h / 2) -15);
            // g2.drawPolygon(new int[] {18, 21, 24, 27, 33, 36, 39, 42}, new int[] {12, 9,
            // 6, 3, 27, 24, 21 ,18}, 8);
        } else if (multiple == 10) {
            g3.drawString("D10(0-9)", (w / 2) -20, (h / 2) -15);
        } else if (multiple == 100) {
            g3.drawString("D10(00-90)", (w / 2) -30, (h / 2) -15);
        } else if (multiple == 12) {
            g3.drawString("D12", (w / 2) -7, (h / 2) -15);
        } else if (multiple == 20) {
            g3.drawString("D20", (w / 2) -7, (h / 2) -15);
        }
        switch (_faceValue) {
            case 1:
                if (multiple == 10) {
                    g3.drawString("0", (w / 2) - 3, (h / 2) + 5);
                } else if (multiple == 100) {
                    g3.drawString("00", (w / 2) - 3, (h / 2) + 5);
                } else {
                    g3.drawString("1", (w / 2) - 3, (h / 2) + 5);
                }
                break;
            case 2:
                if (multiple == 10) {
                    g3.drawString("1", (w / 2) - 3, (h / 2) + 5);
                } else if (multiple == 100) {
                    g3.drawString("10", (w / 2) - 3, (h / 2) + 5);
                } else {
                    g3.drawString("2", (w / 2) - 3, (h / 2) + 5);
                }
                break;
            case 3:
                if (multiple == 10) {
                    g3.drawString("2", (w / 2) - 3, (h / 2) + 5);
                } else if (multiple == 100) {
                    g3.drawString("20", (w / 2) - 3, (h / 2) + 5);
                } else {
                    g3.drawString("3", (w / 2) - 3, (h / 2) + 5);
                }
                break;
            case 4:
                if (multiple == 10) {
                    g3.drawString("3", (w / 2) - 3, (h / 2) + 5);
                } else if (multiple == 100) {
                    g3.drawString("30", (w / 2) - 3, (h / 2) + 5);
                } else {
                    g3.drawString("4", (w / 2) - 3, (h / 2) + 5);
                }
                break;
            case 5:
                if (multiple == 10) {
                    g3.drawString("4", (w / 2) - 3, (h / 2) + 5);
                } else if (multiple == 100) {
                    g3.drawString("40", (w / 2) - 3, (h / 2) + 5);
                } else {
                    g3.drawString("5", (w / 2) - 3, (h / 2) + 5);
                }
                break;
            case 6:
                if (multiple == 10) {
                    g3.drawString("5", (w / 2) - 3, (h / 2) + 5);
                } else if (multiple == 100) {
                    g3.drawString("50", (w / 2) - 3, (h / 2) + 5);
                } else {
                    g3.drawString("6", (w / 2) - 3, (h / 2) + 5);
                }
                break;
            case 7:
                if (multiple == 10) {
                    g3.drawString("6", (w / 2) - 3, (h / 2) + 5);
                } else if (multiple == 100) {
                    g3.drawString("60", (w / 2) - 3, (h / 2) + 5);
                } else {
                    g3.drawString("7", (w / 2) - 3, (h / 2) + 5);
                }
                break;
            case 8:
                if (multiple == 10) {
                    g3.drawString("7", (w / 2) - 3, (h / 2) + 5);
                } else if (multiple == 100) {
                    g3.drawString("70", (w / 2) - 3, (h / 2) + 5);
                } else {
                    g3.drawString("8", (w / 2) - 3, (h / 2) + 5);
                }
                break;
            case 9:
                if (multiple == 10) {
                    g3.drawString("8", (w / 2) - 3, (h / 2) + 5);
                } else if (multiple == 100) {
                    g3.drawString("80", (w / 2) - 3, (h / 2) + 5);
                } else {
                    g3.drawString("9", (w / 2) - 3, (h / 2) + 5);
                }
                break;
            case 10:
                if (multiple == 10) {
                    g3.drawString("9", (w / 2) - 4, (h / 2) + 5);
                } else if (multiple == 100) {
                    g3.drawString("90", (w / 2) - 4, (h / 2) + 5);
                } else {
                    g3.drawString("10", (w / 2) - 4, (h / 2) + 5);
                }
                break;
            case 11:
                g3.drawString("11",(w / 2) - 4, (h / 2) + 5);
                break;
            case 12:
                g3.drawString("12",(w / 2) - 4, (h / 2) + 5);
                break;
            case 13:
                g3.drawString("13",(w / 2) - 4, (h / 2) + 5);
                break;
            case 14:
                g3.drawString("14",(w / 2) - 4, (h / 2) + 5);
                break;
            case 15:
                g3.drawString("15",(w / 2) - 4, (h / 2) + 5);
                break;
            case 16:
                g3.drawString("16",(w / 2) - 4, (h / 2) + 5);
                break;
            case 17:
                g3.drawString("17",(w / 2) - 4, (h / 2) + 5);
                break;
            case 18:
                g3.drawString("18",(w / 2) - 4, (h / 2) + 5);
                break;
            case 19:
                g3.drawString("19",(w / 2) - 4, (h / 2) + 5);
                break;
            case 20:
                g3.drawString("20",(w / 2) - 4, (h / 2) + 5);
                break;

        }
    }
}