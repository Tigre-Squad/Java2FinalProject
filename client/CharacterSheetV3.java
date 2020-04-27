
import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.LayoutManager;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class CharacterSheetV3 extends JFrame {

   /**
    *
    */
   private static final long serialVersionUID = 1L;
   // all variables
   JMenuBar mb;
   JMenuItem open;
   JMenuItem lvlUp;
   JMenuItem lvlDown;
   JTextArea ta;

   CharacterSheetLogic logic;

   private JLabel name;
   private JLabel charClass;
   private JLabel level;
   private JLabel alignment;
   private JLabel race;
   private JLabel gender;
   private JTextArea description;

   private String[] races = new String[] { "Human", "Elf", "Half-Elf", "Dwarf", "Halfling", "DragonBorn", "Tiefling",
         "Half-Orc" };
   private String[] classes = new String[] { "Barbarian", "Bard", "Druid", "Cleric", "Monk" };
   private String[] armors = new String[] { "none", "Leather", "Studded Leather Armor", "Chain Shirt", "Ring Mail",
         "Plate" };
   private String[] weapons = new String[] { "none", "Short Sword", "Long Sword", "Bow", "Axe" };
   private String[] shields = new String[] { "none", "Shield" };

   private String[] _equipment;
   private String[] _attacksSpellcasting;
   private String _armor;
   private String _sheild;

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

   private JTextField strengthFieldMod;
   private JTextField dexFieldMod;
   private JTextField conFieldMod;
   private JTextField intelligenceFieldMod;
   private JTextField wisdomFieldMod;
   private JTextField charismaFieldMod;

   private int _strength;
   private int _dex;
   private int _con;
   private int _intelligence;
   private int _wisdom;
   private int _charisma;

   String _race;
   int _level;
   String _charClass;
   int _health;
   int _ac = 0;

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

   protected JCheckBox stBox;
   protected JCheckBox dexBox;
   protected JCheckBox conBox;
   protected JCheckBox intBox;
   protected JCheckBox wisBox;
   protected JCheckBox charBox;
   protected JCheckBox acroBox;
   protected JCheckBox aHBox;
   protected JCheckBox arcBox;
   protected JCheckBox athBox;
   protected JCheckBox decBox;
   protected JCheckBox hisBox;
   protected JCheckBox insightBox;
   protected JCheckBox intiBox;
   protected JCheckBox invesBox;
   protected JCheckBox medBox;
   protected JCheckBox natureBox;
   protected JCheckBox perBox;
   protected JCheckBox perfBox;
   protected JCheckBox persBox;
   protected JCheckBox relBox;
   protected JCheckBox sleightBox;
   protected JCheckBox stealthBox;
   protected JCheckBox surBox;

   JTextField acroField;
   JTextField aHField;
   JTextField arcField;
   JTextField athField;
   JTextField decField;
   JTextField hisField;
   JTextField insightField;
   JTextField intiField;
   JTextField invesField;
   JTextField medField;
   JTextField natureField;
   JTextField perField;
   JTextField perfField;
   JTextField persField;
   JTextField relField;
   JTextField sleightField;
   JTextField stealthField;
   JTextField surField;

   private JLabel shield;
   private JLabel armor;
   private JLabel armorClass;
   private JLabel weapon;
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
   private JTextArea raceTraits;
   private JTextArea classTraits;
   private JTextArea notesTA;

   private JMenuBar menuBar;
   private JMenu file;
   private JMenuItem update;
   private JMenuItem save;
   private JPanel menu;

   private JPanel top;
   private JPanel p1;
   private JPanel p2;
   private JPanel p3;
   private JPanel p4;
   private JPanel p5;
   private JPanel visualInterir;
   private JPanel visualExterior;
   private JScrollPane scroll;
   private JFrame myFrame;

   public CharacterSheetV3(int i) {

   }

   public CharacterSheetV3() {
      // main frame
      myFrame = new JFrame();
      myFrame.setTitle("Character Sheet");
      myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

      top = new JPanel(new BorderLayout());
      menu = new JPanel();

      file = new JMenu("File");
      open = new JMenuItem("Open File");
      update = new JMenuItem("Update File");
      save = new JMenuItem("Save File");
      lvlUp = new JMenuItem("Level Up");
      file.add(update);
      file.add(save);
      file.add(open);
      file.add(lvlUp);
      mb = new JMenuBar();
      mb.setBounds(0, 0, 30, 20);
      mb.add(file);
      top.add(mb);

      // All components for p1
      p1 = new JPanel(new GridLayout(4, 2));

      JTextField nameField;
      p1.add(name = new JLabel("Name: ", JLabel.RIGHT));
      p1.add(nameField = new JTextField(10));

      // JTextField classField;
      p1.add(charClass = new JLabel("Class: ", JLabel.RIGHT));
      JComboBox classCombo = new JComboBox(classes);
      p1.add(classCombo);
      _charClass = (String) classCombo.getSelectedItem();

      JTextField levelField;
      p1.add(level = new JLabel("Level: ", JLabel.RIGHT));
      p1.add(levelField = new JTextField(10));
      levelField.setEditable(false);
      levelField.setText("1");
      try {
         _level = Integer.parseInt(levelField.getText());
      } catch (NumberFormatException nfe) {
      }

      JTextField alignField;
      p1.add(alignment = new JLabel("Alignment: ", JLabel.RIGHT));
      p1.add(alignField = new JTextField(10));

      JTextField genderField;
      p1.add(gender = new JLabel("Gender: ", JLabel.RIGHT));
      p1.add(genderField = new JTextField(10));

      // JTextField raceField;
      p1.add(race = new JLabel("Race: ", JLabel.RIGHT));
      JComboBox raceCombo = new JComboBox(races);
      p1.add(raceCombo);
      _race = (String) raceCombo.getSelectedItem();

      JLabel descripField;
      p1.add(descripField = new JLabel("Description: ", JLabel.RIGHT));
      p1.add(description = new JTextArea(1, 2));

      top.add(menu, BorderLayout.NORTH);
      top.add(p1, BorderLayout.CENTER);
      // end of p1

      // All components for p2
      p2 = new JPanel(new GridLayout(0, 1));
      Dimension small = new Dimension(30, 30);
      JTextField strengthField;
      p2.add(strength = new JLabel("Strength: ", JLabel.RIGHT));
      p2.add(strengthField = new JTextField(5));
      strengthField.setPreferredSize(new Dimension(small));
      try {
         _strength = Integer.parseInt(strengthField.getText());
      } catch (NumberFormatException nfe) {
      }

      JTextField dexField;
      p2.add(dex = new JLabel("Dexterity: ", JLabel.RIGHT));
      p2.add(dexField = new JTextField(5));
      dexField.setPreferredSize(new Dimension(small));
      try {
         _dex = Integer.parseInt(dexField.getText());
      } catch (NumberFormatException nfe) {
      }

      JTextField conField;
      p2.add(con = new JLabel("Constitution: ", JLabel.RIGHT));
      p2.add(conField = new JTextField(5));
      conField.setPreferredSize(new Dimension(small));
      try {
         _con = Integer.parseInt(conField.getText());
      } catch (NumberFormatException nfe) {
      }

      JTextField intField;
      p2.add(intelligence = new JLabel("Intelligence: ", JLabel.RIGHT));
      p2.add(intField = new JTextField(5));
      intField.setPreferredSize(new Dimension(small));

      try {
         _intelligence = Integer.parseInt(intField.getText());
      } catch (NumberFormatException nfe) {
      }

      JTextField wisField;
      p2.add(wisdom = new JLabel("Wisdom: ", JLabel.RIGHT));
      p2.add(wisField = new JTextField(5));
      wisField.setPreferredSize(new Dimension(small));
      try {
         _wisdom = Integer.parseInt(wisField.getText());
      } catch (NumberFormatException nfe) {
      }

      JTextField charField;
      p2.add(charisma = new JLabel("Charisma: ", JLabel.RIGHT));
      p2.add(charField = new JTextField(5));
      charField.setPreferredSize(new Dimension(small));
      try {
         _charisma = Integer.parseInt(charField.getText());
      } catch (NumberFormatException nfe) {
      }

      // end of p2

      // All components for p3
      p3 = new JPanel(new GridLayout(0, 1));

      JLabel personalityLabel;
      p3.add(personalityLabel = new JLabel("Personality: ", JLabel.RIGHT));
      p3.add(personality = new JTextArea(40, 20));

      JLabel idealLabel;
      p3.add(idealLabel = new JLabel("Ideals: ", JLabel.RIGHT));
      p3.add(ideals = new JTextArea(40, 20));

      JLabel bondLabel;
      p3.add(bondLabel = new JLabel("Bonds: ", JLabel.RIGHT));
      p3.add(bonds = new JTextArea(40, 20));

      JLabel flawLabel;
      p3.add(flawLabel = new JLabel("Flaws: ", JLabel.RIGHT));
      p3.add(flaws = new JTextArea(40, 20));

      JLabel ftLabel;
      p3.add(ftLabel = new JLabel("Features & Traits: ", JLabel.RIGHT));
      p3.add(featuresTraits = new JTextArea(40, 20));
      // end of p3

      // All components for p4
      p4 = new JPanel(new GridLayout(2, 3));

      Dimension middleboxes = new Dimension(200, 100);

      p4.add(equipment = new JTextArea(3, 5));
      equipment.setPreferredSize(new Dimension(middleboxes));
      p4.add(otherProf = new JTextArea(3, 5));
      otherProf.setPreferredSize(new Dimension(middleboxes));
      p4.add(attacksSpellcasting = new JTextArea(3, 5));
      attacksSpellcasting.setPreferredSize(new Dimension(middleboxes));
      p4.add(raceTraits = new JTextArea(3, 5));
      raceTraits.setPreferredSize(new Dimension(middleboxes));
      p4.add(classTraits = new JTextArea(3, 5));
      classTraits.setPreferredSize(new Dimension(middleboxes));
      p4.add(notesTA = new JTextArea(3, 5));
      notesTA.setPreferredSize(new Dimension(middleboxes));

      JLabel langLabel;
      p4.add(langLabel = new JLabel("Other Skills and Languages", JLabel.CENTER));
      JLabel equipmentLabel;
      p4.add(equipmentLabel = new JLabel("Equipment", JLabel.CENTER));
      JLabel attackLabel;
      p4.add(attackLabel = new JLabel("Attacks and Spellcasting", JLabel.CENTER));
      JLabel raceLabel;
      p4.add(raceLabel = new JLabel("Race Traits", JLabel.CENTER));
      JLabel classLabel;
      p4.add(classLabel = new JLabel("Class Traits", JLabel.CENTER));
      JLabel notesLabel;
      p4.add(notesLabel = new JLabel("Notes", JLabel.CENTER));
      // end of p4

      // All components for p5
      p5 = new JPanel(new GridLayout(0, 2));

      // two inner panels for p5
      JPanel p6 = new JPanel(new GridLayout(0, 3));
      JPanel p7 = new JPanel(new GridLayout(0, 2));

      // All components for p7
      Dimension statBlock = new Dimension(10, 10);
      JComboBox armorField;
      p7.add(armor = new JLabel("Armor: ", JLabel.RIGHT));
      p7.add(armorField = new JComboBox(armors));
      armorField.setPreferredSize(new Dimension(statBlock));
      try {
         _armor = (String) armorField.getSelectedItem();
      } catch (NumberFormatException nfe) {
      }

      JComboBox SheildField;
      p7.add(shield = new JLabel("Sheild: ", JLabel.RIGHT));
      p7.add(SheildField = new JComboBox(shields));
      SheildField.setPreferredSize(new Dimension(statBlock));
      try {
         _sheild = (String) armorField.getSelectedItem();
      } catch (NumberFormatException nfe) {
      }

      JComboBox weaponField;
      p7.add(weapon = new JLabel("Weapons: ", JLabel.RIGHT));
      p7.add(weaponField = new JComboBox(weapons));
      weaponField.setPreferredSize(new Dimension(statBlock));

      logic = new CharacterSheetLogic(_charClass, _level, _race, _strength, _dex, _con, _intelligence, _wisdom,
            _charisma, _equipment, _armor, _health, _ac, _sheild);

      JTextField armorClassField;
      p7.add(armorClass = new JLabel("Armor Class: ", JLabel.RIGHT));
      p7.add(armorClassField = new JTextField(3));
      armorClassField.setPreferredSize(new Dimension(statBlock));
      armorClassField.setText(String.valueOf(logic.armorClass));

      JTextField initField;
      p7.add(intitive = new JLabel("Intitive: ", JLabel.RIGHT));
      p7.add(initField = new JTextField(3));
      initField.setPreferredSize(new Dimension(statBlock));
      initField.setPreferredSize(new Dimension(small));

      JTextField speedField;
      p7.add(speed = new JLabel("Speed: ", JLabel.RIGHT));
      p7.add(speedField = new JTextField(3));
      speedField.setPreferredSize(new Dimension(statBlock));
      speedField.setText(String.valueOf(logic.speed));

      JTextField healthField;
      p7.add(health = new JLabel("Max Health Points: ", JLabel.RIGHT));
      p7.add(healthField = new JTextField(3));
      healthField.setPreferredSize(new Dimension(statBlock));
      healthField.setText(String.valueOf(logic.health));
      try {
         _health = Integer.parseInt(healthField.getText());
      } catch (NumberFormatException nfe) {
      }

      JTextField tempHealthField;
      p7.add(tempHealth = new JLabel("Temp. Health Points: ", JLabel.RIGHT));
      p7.add(tempHealthField = new JTextField(3));
      // end of p7

      // All components for p6
      JLabel stField;
      JLabel empty;
      p6.add(strengthMod = new JLabel("Strength: ", JLabel.RIGHT));
      p6.add(strengthFieldMod = new JTextField(5));
      strengthFieldMod.setEditable(false);
      stBox = new JCheckBox("");
      p6.add(stBox);
      if (logic.strengthMod < 0) {
         strengthFieldMod.setText(String.valueOf(logic.strengthMod));
      } else {
         strengthFieldMod.setText("+" + String.valueOf(logic.strengthMod));
      }

      p6.add(dexMod = new JLabel("Dexterity: ", JLabel.RIGHT));
      p6.add(dexFieldMod = new JTextField(5));
      dexFieldMod.setEditable(false);
      dexBox = new JCheckBox("");
      p6.add(dexBox);
      if (logic.dexMod < 0) {
         dexFieldMod.setText(String.valueOf(logic.dexMod));
      } else {
         dexFieldMod.setText("+" + String.valueOf(logic.dexMod));
      }

      p6.add(conMod = new JLabel("Constitution: ", JLabel.RIGHT));
      p6.add(conFieldMod = new JTextField(5));
      conFieldMod.setEditable(false);
      conBox = new JCheckBox("");
      p6.add(conBox);
      if (logic.conMod < 0) {
         conFieldMod.setText(String.valueOf(logic.conMod));
      } else {
         conFieldMod.setText("+" + String.valueOf(logic.conMod));
      }

      p6.add(intelligenceMod = new JLabel("Intelligence: ", JLabel.RIGHT));
      p6.add(intelligenceFieldMod = new JTextField(5));
      intelligenceFieldMod.setEditable(false);
      intBox = new JCheckBox("");
      p6.add(intBox);
      if (logic.intelligenceMod < 0) {
         intelligenceFieldMod.setText(String.valueOf(logic.intelligenceMod));
      } else {
         intelligenceFieldMod.setText("+" + String.valueOf(logic.intelligenceMod));
      }

      p6.add(wisdomMod = new JLabel("Wisdom: ", JLabel.RIGHT));
      p6.add(wisdomFieldMod = new JTextField(5));
      wisdomFieldMod.setEditable(false);
      wisBox = new JCheckBox("");
      p6.add(wisBox);
      if (logic.wisdomMod < 0) {
         wisdomFieldMod.setText(String.valueOf(logic.wisdomMod));
      } else {
         wisdomFieldMod.setText("+" + String.valueOf(logic.wisdomMod));
      }

      p6.add(charismaMod = new JLabel("Charisma: ", JLabel.RIGHT));
      p6.add(charismaFieldMod = new JTextField(5));
      charismaFieldMod.setEditable(false);
      charBox = new JCheckBox("");
      p6.add(charBox);
      if (logic.charismaMod < 0) {
         charismaFieldMod.setText(String.valueOf(logic.charismaMod));
      } else {
         charismaFieldMod.setText("+" + String.valueOf(logic.charismaMod));
      }

      JLabel skillField;
      p6.add(skills = new JLabel("Skills: ", JLabel.CENTER));
      p6.add(skillField = new JLabel("", JLabel.RIGHT));
      JLabel empty1 = new JLabel("", JLabel.RIGHT);
      p6.add(empty1);

      p6.add(acrobatics = new JLabel("Acrobatics: ", JLabel.RIGHT));
      p6.add(acroField = new JTextField(3));
      acroField.setEditable(false);
      acroBox = new JCheckBox("");
      p6.add(acroBox);
      if (logic.dexMod < 0) {
         acroField.setText(String.valueOf(logic.dexMod));
      } else {
         acroField.setText("+" + String.valueOf(logic.dexMod));
      }

      p6.add(animalHandling = new JLabel("Animal \nHandling: ", JLabel.RIGHT));
      p6.add(aHField = new JTextField(3));
      aHField.setEditable(false);
      aHBox = new JCheckBox("");
      p6.add(aHBox);
      if (logic.wisdomMod < 0) {
         aHField.setText(String.valueOf(logic.wisdomMod));
      } else {
         aHField.setText("+" + String.valueOf(logic.wisdomMod));
      }

      p6.add(arcana = new JLabel("Arcana: ", JLabel.RIGHT));
      p6.add(arcField = new JTextField(3));
      arcField.setEditable(false);
      arcBox = new JCheckBox("");
      p6.add(arcBox);
      if (logic.intelligenceMod < 0) {
         arcField.setText(String.valueOf(logic.intelligenceMod));
      } else {
         arcField.setText("+" + String.valueOf(logic.intelligenceMod));
      }

      p6.add(athletics = new JLabel("Atheltics: ", JLabel.RIGHT));
      p6.add(athField = new JTextField(3));
      athField.setEditable(false);
      athBox = new JCheckBox("");
      p6.add(athBox);
      if (logic.strengthMod < 0) {
         athField.setText(String.valueOf(logic.strengthMod));
      } else {
         athField.setText("+" + String.valueOf(logic.strengthMod));
      }

      p6.add(deception = new JLabel("Deception: ", JLabel.RIGHT));
      p6.add(decField = new JTextField(3));
      decField.setEditable(false);
      decBox = new JCheckBox("");
      p6.add(decBox);
      if (logic.charismaMod < 0) {
         decField.setText(String.valueOf(logic.charismaMod));
      } else {
         decField.setText("+" + String.valueOf(logic.charismaMod));
      }

      p6.add(history = new JLabel("History: ", JLabel.RIGHT));
      p6.add(hisField = new JTextField(3));
      hisField.setEditable(false);
      hisBox = new JCheckBox("");
      p6.add(hisBox);
      if (logic.intelligenceMod < 0) {
         hisField.setText(String.valueOf(logic.intelligenceMod));
      } else {
         hisField.setText("+" + String.valueOf(logic.intelligenceMod));
      }

      p6.add(insight = new JLabel("Insight: ", JLabel.RIGHT));
      p6.add(insightField = new JTextField(3));
      insightField.setEditable(false);
      insightBox = new JCheckBox("");
      p6.add(insightBox);
      if (logic.wisdomMod < 0) {
         insightField.setText(String.valueOf(logic.wisdomMod));
      } else {
         insightField.setText("+" + String.valueOf(logic.wisdomMod));
      }

      p6.add(intimidation = new JLabel("Intimidation: ", JLabel.RIGHT));
      p6.add(intiField = new JTextField(3));
      intiField.setEditable(false);
      intiBox = new JCheckBox("");
      p6.add(intiBox);
      if (logic.charismaMod < 0) {
         intiField.setText(String.valueOf(logic.charismaMod));
      } else {
         intiField.setText("+" + String.valueOf(logic.charismaMod));
      }

      p6.add(intimidation = new JLabel("Intimidation: ", JLabel.RIGHT));
      p6.add(invesField = new JTextField(3));
      invesField.setEditable(false);
      invesBox = new JCheckBox("");
      p6.add(invesBox);
      if (logic.intelligenceMod < 0) {
         invesField.setText(String.valueOf(logic.intelligenceMod));
      } else {
         invesField.setText("+" + String.valueOf(logic.intelligenceMod));
      }

      p6.add(medicine = new JLabel("Medicine: ", JLabel.RIGHT));
      p6.add(medField = new JTextField(3));
      medField.setEditable(false);
      medBox = new JCheckBox("");
      p6.add(medBox);
      if (logic.wisdomMod < 0) {
         medField.setText(String.valueOf(logic.wisdomMod));
      } else {
         medField.setText("+" + String.valueOf(logic.wisdomMod));
      }

      p6.add(nature = new JLabel("Nature: ", JLabel.RIGHT));
      p6.add(natureField = new JTextField(3));
      natureField.setEditable(false);
      natureBox = new JCheckBox("");
      p6.add(natureBox);
      if (logic.intelligenceMod < 0) {
         natureField.setText(String.valueOf(logic.intelligenceMod));
      } else {
         natureField.setText("+" + String.valueOf(logic.intelligenceMod));
      }

      p6.add(perception = new JLabel("Perception: ", JLabel.RIGHT));
      p6.add(perField = new JTextField(3));
      perField.setEditable(false);
      perBox = new JCheckBox("");
      p6.add(perBox);
      if (logic.wisdomMod < 0) {
         perField.setText(String.valueOf(logic.wisdomMod));
      } else {
         perField.setText("+" + String.valueOf(logic.wisdomMod));
      }

      p6.add(performance = new JLabel("Performance: ", JLabel.RIGHT));
      p6.add(perfField = new JTextField(3));
      perfField.setEditable(false);
      perfBox = new JCheckBox("");
      p6.add(perfBox);
      if (logic.charismaMod < 0) {
         perfField.setText(String.valueOf(logic.charismaMod));
      } else {
         perfField.setText("+" + String.valueOf(logic.charismaMod));
      }

      p6.add(persuasion = new JLabel("Persuasion: ", JLabel.RIGHT));
      p6.add(persField = new JTextField(3));
      persField.setEditable(false);
      persBox = new JCheckBox("");
      p6.add(persBox);
      if (logic.charismaMod < 0) {
         persField.setText(String.valueOf(logic.charismaMod));
      } else {
         persField.setText("+" + String.valueOf(logic.charismaMod));
      }

      p6.add(religion = new JLabel("Religion: ", JLabel.RIGHT));
      p6.add(relField = new JTextField(3));
      relField.setEditable(false);
      relBox = new JCheckBox("");
      p6.add(relBox);
      if (logic.intelligenceMod < 0) {
         relField.setText(String.valueOf(logic.intelligenceMod));
      } else {
         relField.setText("+" + String.valueOf(logic.intelligenceMod));
      }

      p6.add(sleight = new JLabel("Sleight Of \nHand: ", JLabel.RIGHT));
      p6.add(sleightField = new JTextField(3));
      sleightField.setEditable(false);
      sleightBox = new JCheckBox("");
      p6.add(sleightBox);
      if (logic.dexMod < 0) {
         sleightField.setText(String.valueOf(logic.dexMod));
      } else {
         sleightField.setText("+" + String.valueOf(logic.dexMod));
      }

      p6.add(stealth = new JLabel("Stealth: ", JLabel.RIGHT));
      p6.add(stealthField = new JTextField(3));
      stealthField.setEditable(false);
      stealthBox = new JCheckBox("");
      p6.add(stealthBox);
      if (logic.dexMod < 0) {
         stealthField.setText(String.valueOf(logic.dexMod));
      } else {
         stealthField.setText("+" + String.valueOf(logic.dexMod));
      }

      p6.add(survival = new JLabel("Survival: ", JLabel.RIGHT));
      p6.add(surField = new JTextField(3));
      surField.setEditable(false);
      surBox = new JCheckBox("");
      p6.add(surBox);
      if (logic.wisdomMod < 0) {
         surField.setText(String.valueOf(logic.wisdomMod));
      } else {
         surField.setText("+" + String.valueOf(logic.wisdomMod));
      }
      // end of p6

      // end of p5
      p5.add(p6);
      p5.add(p7);

      JPanel temp1 = new JPanel();
      visualInterir = new JPanel();
      visualInterir.setLayout(new BoxLayout(visualInterir, BoxLayout.PAGE_AXIS));
      top.setPreferredSize(new Dimension(500, 100));
      top.setMaximumSize(new Dimension(500, 100));
      top.setAlignmentY(Component.TOP_ALIGNMENT);
      top.setAlignmentX(Component.RIGHT_ALIGNMENT);
      visualInterir.add(top);

      temp1.add(p2);

      temp1.add(p5);
      temp1.setBorder(BorderFactory.createTitledBorder(""));
      visualInterir.add(temp1);

      p4.setPreferredSize(new Dimension(1350, 100));
      p4.setMaximumSize(new Dimension(1350, 600));
      visualInterir.add(p4);

      p3.setAlignmentX(Component.LEFT_ALIGNMENT);
      p3.setPreferredSize(new Dimension(450, 800));
      p3.setMaximumSize(new Dimension(450, 1000));
      visualInterir.add(p3);

      visualExterior = new JPanel();
      visualExterior.setSize(1400, 600);
      visualExterior.setLayout(new BorderLayout());
      visualExterior.add(visualInterir, BorderLayout.CENTER);
      scroll = new JScrollPane(visualInterir);
      scroll.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
      scroll.setSize(1400, 600);

      // myFrame.add(scroll);
      myFrame.add(scroll);
      visualInterir.setVisible(true);
      visualExterior.setVisible(true);
      scroll.setVisible(true);
      myFrame.setVisible(true);
      myFrame.pack();
      myFrame.setSize(1400, 600);
      myFrame.setLocationRelativeTo(null);

      CharacterSheetLogic test = new CharacterSheetLogic(_charClass, _level, _race, _strength, _dex, _con,
            _intelligence, _wisdom, _charisma);

      ActionListener updateListener = new ActionListener() {
         @Override
         public void actionPerformed(ActionEvent e) {

            _charClass = (String) classCombo.getSelectedItem();
            _level = Integer.parseInt(levelField.getText());
            _race = (String) raceCombo.getSelectedItem();

            try {
               _strength = Integer.parseInt(strengthField.getText());
            } catch (NumberFormatException nfe) {
            }

            try {
               _dex = Integer.parseInt(dexField.getText());
            } catch (NumberFormatException nfe) {
            }

            try {
               _con = Integer.parseInt(conField.getText());
            } catch (NumberFormatException nfe) {
            }

            try {
               _intelligence = Integer.parseInt(intField.getText());
            } catch (NumberFormatException nfe) {
            }

            try {
               _wisdom = Integer.parseInt(wisField.getText());
            } catch (NumberFormatException nfe) {
            }

            try {
               _charisma = Integer.parseInt(charField.getText());
            } catch (NumberFormatException nfe) {
            }
            try {
               _armor = (String) armorField.getSelectedItem();
            } catch (NumberFormatException nfe) {
            }

            logic.update(_charClass, _level, _race, _strength, _dex, _con, _intelligence, _wisdom, _charisma,
                  _equipment, _armor, _health, _ac, _sheild);

            logic.RaceSelect();

            healthField.setText(String.valueOf(logic.health));
            armorClassField.setText(String.valueOf(logic.armorClass));
            speedField.setText(String.valueOf(logic.speed));

            if (logic.strengthMod < 0) {
               strengthFieldMod.setText(String.valueOf(logic.strengthMod));
            } else {
               strengthFieldMod.setText("+" + String.valueOf(logic.strengthMod));
            }

            if (logic.dexMod < 0) {
               dexFieldMod.setText(String.valueOf(logic.dexMod));
            } else {
               dexFieldMod.setText("+" + String.valueOf(logic.dexMod));
            }

            if (logic.conMod < 0) {
               conFieldMod.setText(String.valueOf(logic.conMod));
            } else {
               conFieldMod.setText("+" + String.valueOf(logic.conMod));
            }

            if (logic.intelligenceMod < 0) {
               intelligenceFieldMod.setText(String.valueOf(logic.intelligenceMod));
            } else {
               intelligenceFieldMod.setText("+" + String.valueOf(logic.intelligenceMod));
            }

            if (logic.wisdomMod < 0) {
               wisdomFieldMod.setText(String.valueOf(logic.wisdomMod));
            } else {
               wisdomFieldMod.setText("+" + String.valueOf(logic.wisdomMod));
            }

            if (logic.charismaMod < 0) {
               charismaFieldMod.setText(String.valueOf(logic.charismaMod));
            } else {
               charismaFieldMod.setText("+" + String.valueOf(logic.charismaMod));
            }

            if (logic.dexMod < 0) {
               acroField.setText(String.valueOf(logic.dexMod));
            } else {
               acroField.setText("+" + String.valueOf(logic.dexMod));
            }

            if (logic.wisdomMod < 0) {
               aHField.setText(String.valueOf(logic.wisdomMod));
            } else {
               aHField.setText("+" + String.valueOf(logic.wisdomMod));
            }

            if (logic.intelligenceMod < 0) {
               arcField.setText(String.valueOf(logic.intelligenceMod));
            } else {
               arcField.setText("+" + String.valueOf(logic.intelligenceMod));
            }

            if (logic.strengthMod < 0) {
               athField.setText(String.valueOf(logic.strengthMod));
            } else {
               athField.setText("+" + String.valueOf(logic.strengthMod));
            }

            if (logic.charismaMod < 0) {
               decField.setText(String.valueOf(logic.charismaMod));
            } else {
               decField.setText("+" + String.valueOf(logic.charismaMod));
            }

            if (logic.intelligenceMod < 0) {
               hisField.setText(String.valueOf(logic.intelligenceMod));
            } else {
               hisField.setText("+" + String.valueOf(logic.intelligenceMod));
            }

            if (logic.wisdomMod < 0) {
               insightField.setText(String.valueOf(logic.wisdomMod));
            } else {
               insightField.setText("+" + String.valueOf(logic.wisdomMod));
            }

            if (logic.charismaMod < 0) {
               intiField.setText(String.valueOf(logic.charismaMod));
            } else {
               intiField.setText("+" + String.valueOf(logic.charismaMod));
            }

            if (logic.intelligenceMod < 0) {
               invesField.setText(String.valueOf(logic.intelligenceMod));
            } else {
               invesField.setText("+" + String.valueOf(logic.intelligenceMod));
            }

            if (logic.wisdomMod < 0) {
               medField.setText(String.valueOf(logic.wisdomMod));
            } else {
               medField.setText("+" + String.valueOf(logic.wisdomMod));
            }

            if (logic.intelligenceMod < 0) {
               natureField.setText(String.valueOf(logic.intelligenceMod));
            } else {
               natureField.setText("+" + String.valueOf(logic.intelligenceMod));
            }

            if (logic.wisdomMod < 0) {
               perField.setText(String.valueOf(logic.wisdomMod));
            } else {
               perField.setText("+" + String.valueOf(logic.wisdomMod));
            }

            if (logic.charismaMod < 0) {
               perfField.setText(String.valueOf(logic.charismaMod));
            } else {
               perfField.setText("+" + String.valueOf(logic.charismaMod));
            }

            if (logic.charismaMod < 0) {
               persField.setText(String.valueOf(logic.charismaMod));
            } else {
               persField.setText("+" + String.valueOf(logic.charismaMod));
            }

            if (logic.intelligenceMod < 0) {
               relField.setText(String.valueOf(logic.intelligenceMod));
            } else {
               relField.setText("+" + String.valueOf(logic.intelligenceMod));
            }

            if (logic.dexMod < 0) {
               sleightField.setText(String.valueOf(logic.dexMod));
            } else {
               sleightField.setText("+" + String.valueOf(logic.dexMod));
            }

            if (logic.dexMod < 0) {
               stealthField.setText(String.valueOf(logic.dexMod));
            } else {
               stealthField.setText("+" + String.valueOf(logic.dexMod));
            }

            if (logic.wisdomMod < 0) {
               surField.setText(String.valueOf(logic.wisdomMod));
            } else {
               surField.setText("+" + String.valueOf(logic.wisdomMod));
            }

            CharacterSheetLogic LL = new CharacterSheetLogic(_charClass, _level, _race, _strength, _dex, _con,
                  _intelligence, _wisdom, _charisma);
            CharacterSheetLogic test = new CharacterSheetLogic(_charClass, _level, _race, _strength, _dex, _con,
                  _intelligence, _wisdom, _charisma);

         }
      };

      ActionListener saveListener = new ActionListener() {
         @Override
         public void actionPerformed(ActionEvent e) {
            System.out.println("Insert Constructor for JSON");

         }
      };

      ActionListener fileOpen = new ActionListener() {
         @Override
         public void actionPerformed(ActionEvent fexplor) {
            if (fexplor.getSource() == open) {
               JFileChooser fc = new JFileChooser();
               int i = fc.showSaveDialog(top);
               if (i == JFileChooser.APPROVE_OPTION) {
                  File f = fc.getSelectedFile();
                  String filepath = f.getPath();
                  try {
                     BufferedReader br = new BufferedReader(new FileReader(filepath));
                     String s1 = "", s2 = "";
                     while ((s1 = br.readLine()) != null) {
                        s2 += s1 + "\n";
                     }
                     br.close();
                  } catch (Exception ex) {
                     ex.printStackTrace();
                  }
               }
            }

         }
      };

      ActionListener levelUp = new ActionListener() {
         @Override
         public void actionPerformed(ActionEvent lvl) {

            // levelField.setEditable(true);
            int temp = Integer.parseInt(levelField.getText());
            if (temp < 20) {
               try {
                  levelField.setText(String.valueOf(temp + 1));
               } catch (NumberFormatException nfe) {
               }
               if (temp == 1) {
                  update.doClick();
                  if (temp == 0) {
                     System.out.println("OWO fucky wucky");
                  }
               }
               update.doClick();
            } else {
               System.out.println("UvU stop weveling youwu are alwady mwax!!!!");
            }
         }
      };

      update.addActionListener(updateListener);
      save.addActionListener(saveListener);
      open.addActionListener(fileOpen);
      lvlUp.addActionListener(levelUp);

   }

   private LayoutManager BorderLayout() {
      return null;
   }

   public static void main(String[] args) {
      CharacterSheetV3 frame = new CharacterSheetV3();
   }

}
