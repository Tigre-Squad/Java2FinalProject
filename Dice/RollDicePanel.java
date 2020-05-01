import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;

//////////////////////////////////////////////////////////// class RollDicePanel
public class RollDicePanel extends JPanel {
    /**
     *
     */
    private static final long serialVersionUID = 1L;
    // ======================================================= instance variables
    private Die dieObj;     // component for one die 
    JPanel base = new JPanel();
    JPanel dice = new JPanel();
    JMenu file = new JMenu("File");
    JMenuBar mb = new JMenuBar();
    JMenuItem diceSetings = new JMenuItem("dice Setings");

    int _numDice;
    int _diceVall;

    //============================================================== constructor
    /** Create border layout panel with one button and two dice. */
    public RollDicePanel(int _diceValll) {
        //... Create the dice
        _diceVall = _diceValll;
        //...Create the button to roll the dice
        JButton rollButton = new JButton("Roll");
        rollButton.setFont(new Font("Sansserif", Font.PLAIN, 24));
        
        //... Add listener.
        rollButton.addActionListener(new RollListener());
        
        //... Layout components
        this.setLayout(new BorderLayout(5, 5));
        file.add(diceSetings);
        mb.setBounds(0, 0, 30, 20);
        mb.add(file);
        //dice.setLayout();
        this.add(mb, BorderLayout.NORTH);
        this.add(rollButton, BorderLayout.CENTER);
        this.add(dice ,BorderLayout.SOUTH);
        
        this.setBorder(BorderFactory.createEmptyBorder(5,5,5,5));


        diceSetings.addActionListener(diceSet);
    }

    public void repaint(){
        this.revalidate();
        //this.repaint();
    }
    
    ActionListener diceSet = new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            Die dieObj2 = new Die(_diceVall);
            dice.add(dieObj2);
            //repaint();
        }
    };
    ////////////////////////////////////////// inner listener class RollListener
    private class RollListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            dieObj.roll();
        }
    }
}