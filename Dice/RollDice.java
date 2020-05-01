import javax.swing.JApplet;
import javax.swing.JFrame;

///////////////////////////////////////////////////////// class RollDice
public class RollDice extends JApplet {
    
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    protected int numDice;
    protected int diceVal;

    // =============================================== applet constructor
    /** Applet constructor requires putting the panel in applet.*/
    public RollDice() {
        this.setContentPane(new RollDicePanel(diceVal));
    }
    
    //====================================================== method main
    /** Create JFrame and set content pane to a RollDicePanel. */
    public static void main(String[] args) {
        JFrame window = new JFrame("Dice");
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setContentPane(new RollDicePanel(20));
        window.pack();
        //System.out.println(window.getContentPane().getSize());
        window.setLocationRelativeTo(null);
        window.setVisible(true);
    }
}