import java.awt.BorderLayout;
import java.awt.GridLayout;

import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class CharacterSheetV2 extends JFrame {
   
   //all variables
   
   /**
    *
    */
   private static final long serialVersionUID = 79673300432404433L;
   private JLabel name;
   private JLabel charClass;
   private JLabel level;
   private JLabel alignment;
   private JLabel race;
   private JLabel gender;
   private JTextArea description;
   
   private String[] races = new String[]{"Human","Elf","Half-Elf","Dwarf","Halfling","DragonBorn","Tiefling","Half-Orc"};
   private String[] classes = new String[]{"Barbarian","Bard","Druid","Cleric","Monk"};
   
   private JLabel strength;
   private JLabel dex;
   private JLabel con;
   private JLabel intelligence;
   private JLabel wisdom;
   private JLabel charisma;

   private JLabel strengthMod;
   private JLabel dexMod;
   private JLabel conMod;
   private JLabel intelligenceMod;
   private JLabel wisdomMod;
   private JLabel charismaMod;
   
   private JLabel savingThrows;
   private JLabel skills;
   private JLabel acrobatics; 
   private JLabel animalHandling; 
   private JLabel arcana; 
   private JLabel athletics;  
   private JLabel deception; 
   private JLabel history;
   private JLabel insight;  
   private JLabel intimidation;  
   private JLabel investigation;  
   private JLabel medicine;  
   private JLabel nature;
   private JLabel perception;  
   private JLabel performance;  
   private JLabel persuasion;  
   private JLabel religion;  
   private JLabel sleight;  
   private JLabel stealth; 
   private JLabel survival;
   
   private JCheckBox stBox;
   private JCheckBox dexBox;
   private JCheckBox conBox;
   private JCheckBox intBox;
   private JCheckBox wisBox;
   private JCheckBox charBox;
   private JCheckBox acroBox;
   private JCheckBox aHBox;
   private JCheckBox arcBox;
   private JCheckBox athBox;
   private JCheckBox decBox;
   private JCheckBox hisBox;
   private JCheckBox insightBox;
   private JCheckBox intiBox;
   private JCheckBox invesBox;
   private JCheckBox medBox;
   private JCheckBox natureBox;
   private JCheckBox perBox;
   private JCheckBox perfBox;
   private JCheckBox persBox;
   private JCheckBox relBox;
   private JCheckBox sleightBox;
   private JCheckBox stealthBox;
   private JCheckBox surBox;
   
   private JLabel armor;
   private JLabel initiative;
   private JLabel speed;
   private JLabel health;
   private JLabel tempHealth;
   
   private JTextArea personality;
   private JTextArea ideals;
   private JTextArea bonds;
   private JTextArea flaws;  
   private JTextArea featuresTraits;
      
   private JTextArea otherProf;
   private JTextArea equipment;
   private JTextArea attacksSpellcasting;
   private JTextArea raceTraits;
   private JTextArea classTraits;
   private JTextArea notesTA;
      
   /*private JMenuBar menuBar;
   private JMenu file;
   private JButton enter;
   private JTextField userName;
   private JTextField password;
   private JFrame myFrame;
   private JPanel j1;
   private JPanel j2;*/
   
   private JPanel p1;
   private JPanel p2;
   private JPanel p3;
   private JPanel p4;
   private JPanel p5;
   private JFrame myFrame;
   
   public CharacterSheetV2(){    
        //main frame
        myFrame = new JFrame();
        myFrame.setTitle("Character Sheet");
        myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        //All components for p1
        p1 = new JPanel(new GridLayout(4,2));
        
        JTextField nameField;
        p1.add(name = new JLabel("Name: ", JLabel.RIGHT));
        p1.add(nameField = new JTextField(10));
        
        //JTextField classField;
        p1.add(charClass = new JLabel("Class: ", JLabel.RIGHT));
        JComboBox classCombo = new JComboBox(classes);
        p1.add(classCombo);
        
        JTextField levelField;
        p1.add(level = new JLabel("Level: ", JLabel.RIGHT));
        p1.add(levelField = new JTextField(10));
        
        JTextField alignField;
        p1.add(alignment = new JLabel("Alignment: ", JLabel.RIGHT));
        p1.add(alignField = new JTextField(10));
        
        JTextField genderField;
        p1.add(gender = new JLabel("Gender: ", JLabel.RIGHT));
        p1.add(genderField = new JTextField(10));
        
        //JTextField raceField;
        p1.add(race = new JLabel("Race: ", JLabel.RIGHT));
        JComboBox raceCombo = new JComboBox(races);
        p1.add(raceCombo);
        
        JLabel descripField;
        p1.add(descripField = new JLabel("Description: ", JLabel.RIGHT));
        p1.add(description = new JTextArea(1,2));
        
        //end of p1
        
        //All components for p2
        p2 = new JPanel(new GridLayout(0,1));
        
        JTextField strengthField;
        p2.add(strength = new JLabel("Strength: ", JLabel.RIGHT));
        p2.add(strengthField = new JTextField(5));
        
        JTextField dexField;
        p2.add(dex = new JLabel("Dexterity: ", JLabel.RIGHT));
        p2.add(dexField = new JTextField(5));
        
        JTextField conField;
        p2.add(con = new JLabel("Constitution: ", JLabel.RIGHT));
        p2.add(conField = new JTextField(5));
        
        JTextField intField;
        p2.add(intelligence = new JLabel("Intelligence: ", JLabel.RIGHT));
        p2.add(intField = new JTextField(5));
        
        JTextField wisField;
        p2.add(wisdom = new JLabel("Wisdom: ", JLabel.RIGHT));
        p2.add(wisField = new JTextField(5));
        
        JTextField charField;
        p2.add(charisma = new JLabel("Charisma: ", JLabel.RIGHT));
        p2.add(charField = new JTextField(5));
        //end of p2
         
        //All components for p3 
        p3 = new JPanel(new GridLayout(0,1));
        
        JLabel personalityLabel;
        p3.add(personalityLabel = new JLabel("Personality: ", JLabel.RIGHT));
        p3.add(personality = new JTextArea(10,5));
        
        JLabel idealLabel;
        p3.add(idealLabel = new JLabel("Ideals: ", JLabel.RIGHT));
        p3.add(ideals = new JTextArea(10,5));
        
        JLabel bondLabel;
        p3.add(bondLabel = new JLabel("Bonds: ", JLabel.RIGHT));
        p3.add(bonds = new JTextArea(10,5));
        
        JLabel flawLabel;
        p3.add(flawLabel = new JLabel("Flaws: ", JLabel.RIGHT));
        p3.add(flaws = new JTextArea(10,5));  
        
        JLabel ftLabel;
        p3.add(ftLabel = new JLabel("Features & Traits: ", JLabel.RIGHT));
        p3.add(featuresTraits = new JTextArea(10,5));
        //end of p3
        
        //All components for p4
        p4 = new JPanel(new GridLayout(2,3));
        
        p4.add(equipment = new JTextArea(3,5));
        p4.add(otherProf = new JTextArea(3,5));
        p4.add(attacksSpellcasting = new JTextArea(3,5));
        p4.add(raceTraits = new JTextArea(3,5));
        p4.add(classTraits = new JTextArea(3,5));
        p4.add(notesTA = new JTextArea(3,5));
        
        JLabel langLabel;
        p4.add(langLabel = new JLabel("Other Skills and Languages",JLabel.CENTER));
        JLabel equipmentLabel;
        p4.add(equipmentLabel = new JLabel("Equipment",JLabel.CENTER)); 
        JLabel attackLabel;
        p4.add(attackLabel = new JLabel("Attacks and Spellcasting",JLabel.CENTER)); 
        JLabel raceLabel;
        p4.add(raceLabel = new JLabel("Race Traits",JLabel.CENTER));
        JLabel classLabel;
        p4.add(classLabel = new JLabel("Class Traits",JLabel.CENTER)); 
        JLabel notesLabel;
        p4.add(notesLabel = new JLabel("Notes",JLabel.CENTER));
        //end of p4
        
        //All components for p5
        p5 = new JPanel(new GridLayout(0,2));
        
        //two inner panels for p5
        JPanel p6 = new JPanel(new GridLayout(0,3));
        JPanel p7 = new JPanel(new GridLayout(0,2));
        
        //All components for p7
        JTextField armorField;
        p7.add(armor = new JLabel("Armor: ", JLabel.RIGHT));
        p7.add(armorField = new JTextField(3));
        
        JTextField initField;
        p7.add(initiative = new JLabel("initiative: ", JLabel.RIGHT));
        p7.add(initField = new JTextField(3));
        
        JTextField speedField;
        p7.add(speed = new JLabel("Speed: ", JLabel.RIGHT));
        p7.add(speedField = new JTextField(3));
        
        JTextField healthField;
        p7.add(health = new JLabel("Current Health Points: ", JLabel.RIGHT));
        p7.add(healthField = new JTextField(3));
        
        JTextField tempHealthField;
        p7.add(tempHealth = new JLabel("Temp. Health Points: ", JLabel.RIGHT));
        p7.add(tempHealthField = new JTextField(3));
        //end of p7
        
        //All components for p6
        JLabel stField;
        JLabel empty;
        p6.add(savingThrows = new JLabel("Saving Throws: ", JLabel.CENTER));
        p6.add(stField = new JLabel("", JLabel.RIGHT));  
        p6.add(empty = new JLabel("", JLabel.RIGHT));     
        
        p6.add(strengthMod = new JLabel("Strength: ", JLabel.RIGHT));
        p6.add(strengthField = new JTextField(5));
        stBox = new JCheckBox("");
        p6.add(stBox);
        
        p6.add(dexMod = new JLabel("Dexterity: ", JLabel.RIGHT));
        p6.add(dexField = new JTextField(5));
        dexBox = new JCheckBox("");
        p6.add(dexBox);
        
        p6.add(conMod = new JLabel("Constitution: ", JLabel.RIGHT));
        p6.add(conField = new JTextField(5));
        conBox = new JCheckBox("");
        p6.add(conBox);
        
        p6.add(intelligenceMod = new JLabel("Intelligence: ", JLabel.RIGHT));
        p6.add(intField = new JTextField(5));
        intBox = new JCheckBox("");
        p6.add(intBox);
        
        p6.add(wisdomMod = new JLabel("Wisdom: ", JLabel.RIGHT));
        p6.add(wisField = new JTextField(5));
        wisBox = new JCheckBox("");
        p6.add(wisBox);
        
        p6.add(charismaMod = new JLabel("Charisma: ", JLabel.RIGHT));
        p6.add(charField = new JTextField(5));
        charBox = new JCheckBox("");
        p6.add(charBox);
        
        JLabel skillField;
        p6.add(skills = new JLabel("Skills: ", JLabel.CENTER));
        p6.add(skillField = new JLabel("", JLabel.RIGHT));
        JLabel empty1 = new JLabel("", JLabel.RIGHT);
        p6.add(empty1);
        
        JTextField acroField;
        p6.add(acrobatics = new JLabel("Acrobatics: ", JLabel.RIGHT));
        p6.add(acroField = new JTextField(3));
        acroBox = new JCheckBox("");
        p6.add(acroBox);
        
        JTextField aHField;
        p6.add(animalHandling = new JLabel("Animal \nHandling: ", JLabel.RIGHT));
        p6.add(aHField = new JTextField(3));
        aHBox = new JCheckBox("");
        p6.add(aHBox);
        
        JTextField arcField;
        p6.add(arcana = new JLabel("Arcana: ", JLabel.RIGHT));
        p6.add(arcField = new JTextField(3));
        arcBox = new JCheckBox("");
        p6.add(arcBox);
        
        JTextField athField;
        p6.add(athletics = new JLabel("Atheltics: ", JLabel.RIGHT));
        p6.add(athField = new JTextField(3));
        athBox = new JCheckBox("");
        p6.add(athBox);
        
        JTextField decField;
        p6.add(deception = new JLabel("Deception: ", JLabel.RIGHT));
        p6.add(decField = new JTextField(3));
        decBox = new JCheckBox("");
        p6.add(decBox);
        
        JTextField hisField;
        p6.add(history = new JLabel("History: ", JLabel.RIGHT));
        p6.add(hisField = new JTextField(3));
        hisBox = new JCheckBox("");
        p6.add(hisBox);
        
        JTextField insightField;
        p6.add(insight = new JLabel("Insight: ", JLabel.RIGHT));
        p6.add(insightField = new JTextField(3));
        insightBox = new JCheckBox("");
        p6.add(insightBox);
        
        JTextField intiField;
        p6.add(intimidation = new JLabel("Intimidation: ", JLabel.RIGHT));
        p6.add(intiField = new JTextField(3));
        intiBox = new JCheckBox("");
        p6.add(intiBox);
        
        JTextField invesField;
        p6.add(intimidation = new JLabel("Intimidation: ", JLabel.RIGHT));
        p6.add(invesField = new JTextField(3));
        invesBox = new JCheckBox("");
        p6.add(invesBox);

        
        JTextField medField;
        p6.add(medicine = new JLabel("Medicine: ", JLabel.RIGHT));
        p6.add(medField = new JTextField(3));
        medBox = new JCheckBox("");
        p6.add(medBox);
        
        JTextField natureField;
        p6.add(nature = new JLabel("Nature: ", JLabel.RIGHT));
        p6.add(natureField = new JTextField(3));
        natureBox = new JCheckBox("");
        p6.add(natureBox);
        
        JTextField perField;
        p6.add(perception = new JLabel("Perception: ", JLabel.RIGHT));
        p6.add(perField = new JTextField(3));
        perBox = new JCheckBox("");
        p6.add(perBox);
        
        JTextField perfField;
        p6.add(performance = new JLabel("Performance: ", JLabel.RIGHT));
        p6.add(perfField = new JTextField(3));
        perfBox = new JCheckBox("");
        p6.add(perfBox);
        
        JTextField persField;
        p6.add(persuasion = new JLabel("Persuasion: ", JLabel.RIGHT));
        p6.add(persField = new JTextField(3));
        persBox = new JCheckBox("");
        p6.add(persBox);
        
        JTextField relField;
        p6.add(religion = new JLabel("Religion: ", JLabel.RIGHT));
        p6.add(relField = new JTextField(3));
        relBox = new JCheckBox("");
        p6.add(relBox);
        
        JTextField sleightField;
        p6.add(sleight = new JLabel("Sleight Of \nHand: ", JLabel.RIGHT));
        p6.add(sleightField = new JTextField(3));
        sleightBox = new JCheckBox("");
        p6.add(sleightBox);
        
        JTextField stealthField;
        p6.add(stealth = new JLabel("Stealth: ", JLabel.RIGHT));
        p6.add(stealthField = new JTextField(3));
        stealthBox = new JCheckBox("");
        p6.add(stealthBox);
        
        JTextField surField;
        p6.add(survival = new JLabel("Survival: ", JLabel.RIGHT));
        p6.add(surField = new JTextField(3)); 
        surBox = new JCheckBox("");
        p6.add(surBox);
        //end of p6
        
        p5.add(p6); 
        p5.add(p7);
        //end of p5 
              
        myFrame.add(p1,BorderLayout.NORTH); 
        myFrame.add(p2,BorderLayout.WEST);
        myFrame.add(p3,BorderLayout.EAST);
        myFrame.add(p4,BorderLayout.SOUTH);
        myFrame.add(p5,BorderLayout.CENTER);
        myFrame.setSize(1000, 600);
        myFrame.setLocation(300,50);
        myFrame.setVisible(true);
     }
     
      public static void main(String[] args){
         CharacterSheetV2 frame = new CharacterSheetV2();
   }
        
 }
