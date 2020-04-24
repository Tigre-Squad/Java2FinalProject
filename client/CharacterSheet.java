import java.awt.BorderLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class CharacterSheet extends JFrame {
   
   //all variables
   
   /**
    *safdq
    */
   private static final long serialVersionUID = -6068938648905891832L;
   private JLabel name;
   private JLabel charClass;
   private JLabel level;
   private JLabel alignment;
   private JLabel race;
   private JLabel gender;
   private JTextArea description;
   
   private JLabel strength;
   private JLabel dex;
   private JLabel con;
   private JLabel intelligence;
   private JLabel wisdom;
   private JLabel charisma;
   
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
   
   private JLabel armor;
   private JLabel intitive;
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
   
   private JButton update;
      
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
   
   
   String _charClass; 
   int _level;
   String _race;
   int _strength; 
   int _dex; 
   int _con;
   int _intelligence; 
   int _wisdom;
   int _charisma;
   String[] _equipment;
   String[] _attacksSpellcasting;

   
   public CharacterSheet(){
        //main fra
        myFrame = new JFrame();
        myFrame.setTitle("Character Sheet");
        myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        //All components for p1
        p1 = new JPanel(new GridLayout(4,2));
        
        JTextField nameField;
        p1.add(name = new JLabel("Name: ", JLabel.RIGHT));
        p1.add(nameField = new JTextField(10));
        
        JTextField classField;
        p1.add(charClass = new JLabel("Class: ", JLabel.RIGHT));
        p1.add(classField = new JTextField(10));
        classField.setText("Bard");
        _charClass = classField.getText();
        
        JTextField levelField;
        p1.add(level = new JLabel("Level: ", JLabel.RIGHT));
        p1.add(levelField = new JTextField(10));
        levelField.setText("1");
        _level = Integer.parseInt(levelField.getText());
        
        JTextField alignField;
        p1.add(alignment = new JLabel("Alignment: ", JLabel.RIGHT));
        p1.add(alignField = new JTextField(10));
        
        JTextField genderField;
        p1.add(gender = new JLabel("Gender: ", JLabel.RIGHT));
        p1.add(genderField = new JTextField(10));
        
        JTextField raceField;
        p1.add(race = new JLabel("Race: ", JLabel.RIGHT));
        p1.add(raceField = new JTextField(10));
        raceField.setText("Elf");
        _race = raceField.getText();
        
        JLabel descripField;
        p1.add(descripField = new JLabel("Description: ", JLabel.RIGHT));
        p1.add(description = new JTextArea(1,2));
        
        //end of p1

        //All components for p2
        p2 = new JPanel(new GridLayout(0,1));
        
        JTextField strengthField;
        p2.add(strength = new JLabel("Strength: ", JLabel.RIGHT));
        p2.add(strengthField = new JTextField(5));
        strengthField.setText("5");
        _strength = Integer.parseInt(strengthField.getText());
        
        JTextField dexField;
        p2.add(dex = new JLabel("Dexterity: ", JLabel.RIGHT));
        p2.add(dexField = new JTextField(5));
        dexField.setText("5");
        _dex = Integer.parseInt(dexField.getText());
        
        JTextField conField;
        p2.add(con = new JLabel("Constitution: ", JLabel.RIGHT));
        p2.add(conField = new JTextField(5));
        conField.setText("20");
        _con = Integer.parseInt(conField.getText());
        
        JTextField intField;
        p2.add(intelligence = new JLabel("Intelligence: ", JLabel.RIGHT));
        p2.add(intField = new JTextField(5));
        intField.setText("5");
        _intelligence = Integer.parseInt(intField.getText());
        
        JTextField wisField;
        p2.add(wisdom = new JLabel("Wisdom: ", JLabel.RIGHT));
        p2.add(wisField = new JTextField(5));
        wisField.setText("15");
        _wisdom = Integer.parseInt(wisField.getText());
        
        JTextField charField;
        p2.add(charisma = new JLabel("Charisma: ", JLabel.RIGHT));
        p2.add(charField = new JTextField(5));
        charField.setText("25");
        _charisma = Integer.parseInt(charField.getText());
        
        
        //end of p2

       
         
        CharacterSheetLogic logic = new CharacterSheetLogic(_charClass, _level, _race, _strength, _dex, _con, _intelligence, _wisdom, _charisma, _equipment, _attacksSpellcasting);
         
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
        
        JLabel langLabel;
        p4.add(langLabel = new JLabel("Other Profiencies \nand Languages",JLabel.CENTER));
        JLabel equipmentLabel;
        p4.add(equipmentLabel = new JLabel("Equipment",JLabel.RIGHT)); 
        JLabel attackLabel;
        p4.add(attackLabel = new JLabel("Attacks and Spellcasting",JLabel.RIGHT));
        //end of p4
        
        //All components for p5
        p5 = new JPanel(new GridLayout(0,2));
        
        //two inner panels for p5
        JPanel p6 = new JPanel(new GridLayout(0,2));
        JPanel p7 = new JPanel(new GridLayout(0,2));
        
        //All components for p7
        JTextField armorField;
        p7.add(armor = new JLabel("Armor: ", JLabel.RIGHT));
        p7.add(armorField = new JTextField(3));
        
        JTextField initField;
        p7.add(intitive = new JLabel("Intitive: ", JLabel.RIGHT));
        p7.add(initField = new JTextField(3));
        initField.setText(String.valueOf(logic.Intitive));
        
        JTextField speedField;
        p7.add(speed = new JLabel("Speed: ", JLabel.RIGHT));
        p7.add(speedField = new JTextField(3));
        speedField.setText(String.valueOf(logic.speed));
        
        JTextField healthField;
        p7.add(health = new JLabel("Current Health Points: ", JLabel.RIGHT));
        p7.add(healthField = new JTextField(3));
        healthField.setText(String.valueOf(logic.health));
        
        JTextField tempHealthField;
        p7.add(tempHealth = new JLabel("Temp. Health Points: ", JLabel.RIGHT));
        p7.add(tempHealthField = new JTextField(3));
        //end of p7
        
        //All components for p6
        JLabel stField;
        p6.add(savingThrows = new JLabel("Saving Throws: ", JLabel.CENTER));
        p6.add(stField = new JLabel("", JLabel.RIGHT));
        
        p6.add(strength = new JLabel("Strength: ", JLabel.RIGHT));
        p6.add(strengthField = new JTextField(5));
        strengthField.setEditable(false);
        if(logic.strengthMod<0){
            strengthField.setText(String.valueOf(logic.strengthMod));
        }else{
            strengthField.setText("+" + String.valueOf(logic.strengthMod));
        }
        
        p6.add(dex = new JLabel("Dexterity: ", JLabel.RIGHT));
        p6.add(dexField = new JTextField(5));
        dexField.setEditable(false);
        if(logic.dexMod<0){
            dexField.setText(String.valueOf(logic.dexMod));
        }else{
            dexField.setText("+" + String.valueOf(logic.dexMod));
        }
        
        p6.add(con = new JLabel("Constitution: ", JLabel.RIGHT));
        p6.add(conField = new JTextField(5));
        conField.setEditable(false);
        if(logic.conMod<0){
            conField.setText(String.valueOf(logic.conMod));
        }else{
            conField.setText("+" + String.valueOf(logic.conMod));
        }
        
        p6.add(intelligence = new JLabel("Intelligence: ", JLabel.RIGHT));
        p6.add(intField = new JTextField(5));
        intField.setEditable(false);
        if(logic.intelligenceMod<0){
            intField.setText(String.valueOf(logic.intelligenceMod));
        }else{
            intField.setText("+" + String.valueOf(logic.intelligenceMod));
        }
        
        p6.add(wisdom = new JLabel("Wisdom: ", JLabel.RIGHT));
        p6.add(wisField = new JTextField(5));
        wisField.setEditable(false);
        if(logic.wisdomMod<0){
            wisField.setText(String.valueOf(logic.wisdomMod));
        }else{
            wisField.setText("+" + String.valueOf(logic.wisdomMod));
        }
        
        p6.add(charisma = new JLabel("Charisma: ", JLabel.RIGHT));
        p6.add(charField = new JTextField(5));
        charField.setEditable(false);
        if(logic.charismaMod<0){
            charField.setText(String.valueOf(logic.charismaMod));
        }else{
            charField.setText("+" + String.valueOf(logic.charismaMod));
        }
        
        JLabel skillField;
        p6.add(skills = new JLabel("Skills: ", JLabel.CENTER));
        p6.add(skillField = new JLabel("", JLabel.RIGHT));
        
        JTextField acroField;
        p6.add(acrobatics = new JLabel("Acrobatics: ", JLabel.RIGHT));
        p6.add(acroField = new JTextField(3));
        acroField.setEditable(false);
        if(logic.dexMod<0){
            acroField.setText(String.valueOf(logic.dexMod));
        }else{
            acroField.setText("+" + String.valueOf(logic.dexMod));
        }
        
        JTextField aHField;
        p6.add(animalHandling = new JLabel("Animal \nHandling: ", JLabel.RIGHT));
        p6.add(aHField = new JTextField(3));
        aHField.setEditable(false);
        if(logic.wisdomMod<0){
            aHField.setText(String.valueOf(logic.wisdomMod));
        }else{
            aHField.setText("+" + String.valueOf(logic.wisdomMod));
        }
        
        JTextField arcField;
        p6.add(arcana = new JLabel("Arcana: ", JLabel.RIGHT));
        p6.add(arcField = new JTextField(3));
        arcField.setEditable(false);
        if(logic.intelligenceMod<0){
            arcField.setText(String.valueOf(logic.intelligenceMod));
        }else{
            arcField.setText("+" + String.valueOf(logic.intelligenceMod));
        }
        
        JTextField athField;
        p6.add(athletics = new JLabel("Atheltics: ", JLabel.RIGHT));
        p6.add(athField = new JTextField(3));
        athField.setEditable(false);
        if(logic.strengthMod<0){
            athField.setText(String.valueOf(logic.strengthMod));
        }else{
            athField.setText("+" + String.valueOf(logic.strengthMod));
        }
        
        JTextField decField;
        p6.add(deception = new JLabel("Deception: ", JLabel.RIGHT));
        p6.add(decField = new JTextField(3));
        decField.setEditable(false);
        if(logic.charismaMod<0){
            decField.setText(String.valueOf(logic.charismaMod));
        }else{
            decField.setText("+" + String.valueOf(logic.charismaMod));
        }
        
        JTextField hisField;
        p6.add(history = new JLabel("History: ", JLabel.RIGHT));
        p6.add(hisField = new JTextField(3));
        hisField.setEditable(false);
        if(logic.intelligenceMod<0){
            hisField.setText(String.valueOf(logic.intelligenceMod));
        }else{
            hisField.setText("+" + String.valueOf(logic.intelligenceMod));
        }
        
        JTextField insightField;
        p6.add(insight = new JLabel("Insight: ", JLabel.RIGHT));
        p6.add(insightField = new JTextField(3));
        insightField.setEditable(false);
        if(logic.wisdomMod<0){
            insightField.setText(String.valueOf(logic.wisdomMod));
        }else{
            insightField.setText("+" + String.valueOf(logic.wisdomMod));
        }
        
        JTextField intiFIeld;
        p6.add(intimidation = new JLabel("Intimidation: ", JLabel.RIGHT));
        p6.add(intiFIeld = new JTextField(3));
        intiFIeld.setEditable(false);
        if(logic.charismaMod<0){
            intiFIeld.setText(String.valueOf(logic.charismaMod));
        }else{
            intiFIeld.setText("+" + String.valueOf(logic.charismaMod));
        }
        
        JTextField invesField;
        p6.add(investigation = new JLabel("Investigation: ", JLabel.RIGHT));
        p6.add(invesField = new JTextField(3));
        invesField.setEditable(false);
        if(logic.intelligenceMod<0){
            invesField.setText(String.valueOf(logic.intelligenceMod));
        }else{
            invesField.setText("+" + String.valueOf(logic.intelligenceMod));
        }
        
        JTextField medField;
        p6.add(medicine = new JLabel("Medicine: ", JLabel.RIGHT));
        p6.add(medField = new JTextField(3));
        medField.setEditable(false);
        if(logic.wisdomMod<0){
            medField.setText(String.valueOf(logic.wisdomMod));
        }else{
            medField.setText("+" + String.valueOf(logic.wisdomMod));
        }
        
        JTextField natureField;
        p6.add(nature = new JLabel("Nature: ", JLabel.RIGHT));
        p6.add(natureField = new JTextField(3));
        natureField.setEditable(false);
        if(logic.intelligenceMod<0){
            natureField.setText(String.valueOf(logic.intelligenceMod));
        }else{
            natureField.setText("+" + String.valueOf(logic.intelligenceMod));
        }
        
        JTextField perField;
        p6.add(perception = new JLabel("Perception: ", JLabel.RIGHT));
        p6.add(perField = new JTextField(3));
        perField.setEditable(false);
        if(logic.wisdomMod<0){
            perField.setText(String.valueOf(logic.wisdomMod));
        }else{
            perField.setText("+" + String.valueOf(logic.wisdomMod));
        }

        
        JTextField perfField;
        p6.add(performance = new JLabel("Performance: ", JLabel.RIGHT));
        p6.add(perfField = new JTextField(3));
        perfField.setEditable(false);
        if(logic.charismaMod<0){
            perfField.setText(String.valueOf(logic.charismaMod));
        }else{
            perfField.setText("+" + String.valueOf(logic.charismaMod));
        }
        
        JTextField persField;
        p6.add(persuasion = new JLabel("Persuasion: ", JLabel.RIGHT));
        p6.add(persField = new JTextField(3));
        persField.setEditable(false);
        if(logic.charismaMod<0){
            persField.setText(String.valueOf(logic.charismaMod));
        }else{
            persField.setText("+" + String.valueOf(logic.charismaMod));
        }
                
        JTextField relField;
        p6.add(religion = new JLabel("Religion: ", JLabel.RIGHT));
        p6.add(relField = new JTextField(3));
        relField.setEditable(false);
        if(logic.intelligenceMod<0){
            relField.setText(String.valueOf(logic.intelligenceMod));
        }else{
            relField.setText("+" + String.valueOf(logic.intelligenceMod));
        }
        
        JTextField sleightField;
        p6.add(sleight = new JLabel("Sleight Of \nHand: ", JLabel.RIGHT));
        p6.add(sleightField = new JTextField(3));
        sleightField.setEditable(false);
        if(logic.dexMod<0){
            sleightField.setText(String.valueOf(logic.dexMod));
        }else{
            sleightField.setText("+" + String.valueOf(logic.dexMod));
        }
        
        JTextField stealthField;
        p6.add(stealth = new JLabel("Stealth: ", JLabel.RIGHT));
        p6.add(stealthField = new JTextField(3));
        stealthField.setEditable(false);
        if(logic.dexMod<0){
            stealthField.setText(String.valueOf(logic.dexMod));
        }else{
            stealthField.setText("+" + String.valueOf(logic.dexMod));
        }
        
        JTextField surField;
        p6.add(survival = new JLabel("Survival: ", JLabel.RIGHT));
        p6.add(surField = new JTextField(3)); 
        surField.setEditable(false);
        if(logic.wisdomMod<0){
            surField.setText(String.valueOf(logic.wisdomMod));
        }else{
            surField.setText("+" + String.valueOf(logic.wisdomMod));
        }
        //end of p6
        
        p5.add(p6); 
        p5.add(p7);
        //end of p5 
        
        myFrame.add(p1,BorderLayout.NORTH); 
        myFrame.add(p2,BorderLayout.WEST);
        myFrame.add(p3,BorderLayout.EAST);
        myFrame.add(p4,BorderLayout.SOUTH);
        myFrame.add(p5,BorderLayout.CENTER);
        myFrame.setSize(600, 600);
        myFrame.setLocationRelativeTo(null);
        myFrame.setVisible(true);
        
            }
     
      public static void main(String[] args){
         CharacterSheet frame = new CharacterSheet();

   }
        
 }
