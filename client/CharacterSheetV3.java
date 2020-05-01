import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.UnsupportedEncodingException;

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

/**
 * @author Julian Mato-Hernandez
 * @author Sofia Grytsenko
 * @version 3
 */
public class CharacterSheetV3 extends JFrame {

   /**
    *
    */
   private static final long serialVersionUID = 1L;
   // all variables

   /**
    * @category CharacterSheetLogic
    */
   CharacterSheetLogic logic;

   /**
    * @category JScrollPane
    */
   private JScrollPane scroll;

   /**
    * @category JPanel's
    */
   private JPanel menu;

   private JPanel top;
   private JPanel p1;
   private JPanel p2;
   private JPanel p3;
   private JPanel p4;
   private JPanel p5;
   private JPanel visualInterir;
   private JPanel visualExterior;

   /**
    * @category JMenu
    */
   private JMenu file;

   /**
    * @category JMenuBar
    */
   private JMenuBar mb;

   /**
    * @category JMenuItem's
    */
   private JMenuItem open;
   private JMenuItem lvlUp;
   private JMenuItem lvlDown;
   private JMenuItem update;
   private JMenuItem save;

   /**
    * @category JLabel's
    */
   private JLabel name;
   private JLabel charClass;
   private JLabel level;
   private JLabel alignment;
   private JLabel race;
   private JLabel gender;

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

   private JLabel shield;
   private JLabel armor;
   private JLabel armorClass;
   private JLabel weapon;
   private JLabel intitive;
   private JLabel speed;
   private JLabel health;
   private JLabel tempHealth;

   /**
    * @category JTextAreas
    */
   private JTextArea description;

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

   /**
    * @category JTextFields
    */
   private JTextField strengthFieldMod;
   private JTextField dexFieldMod;
   private JTextField conFieldMod;
   private JTextField intelligenceFieldMod;
   private JTextField wisdomFieldMod;
   private JTextField charismaFieldMod;

   private JTextField acroField;
   private JTextField aHField;
   private JTextField arcField;
   private JTextField athField;
   private JTextField decField;
   private JTextField hisField;
   private JTextField insightField;
   private JTextField intiField;
   private JTextField invesField;
   private JTextField medField;
   private JTextField natureField;
   private JTextField perField;
   private JTextField perfField;
   private JTextField persField;
   private JTextField relField;
   private JTextField sleightField;
   private JTextField stealthField;
   private JTextField surField;

   private JTextField healthField;
   private JTextField tempHealthField;
   private JTextField speedField;
   private JTextField initField;
   private JTextField armorClassField;

   private JTextField nameField;
   private JTextField levelField;
   private JTextField alignField;
   private JTextField genderField;
   private JTextField strengthField;
   private JTextField dexField;
   private JTextField conField;
   private JTextField intField;
   private JTextField wisField;
   private JTextField charField;

   /**
    * @category JCheckBoxes
    */
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

   /**
    * @category String arrays
    */
   private String[] races = new String[] { "Human", "Elf", "Half-Elf", "Dwarf", "Halfling", "DragonBorn", "Tiefling",
         "Half-Orc" };
   private String[] classes = new String[] { "Barbarian", "Bard", "Druid", "Cleric", "Monk" };
   private String[] armors = new String[] { "none", "Leather", "Studded Leather Armor", "Chain Shirt", "Ring Mail",
         "Plate" };
   private String[] weapons = new String[] { "none", "Short Sword", "Long Sword", "Bow", "Axe" };
   private String[] shields = new String[] { "none", "Shield" };

   /**
    * @category Strings
    */
   private String _equipment;
   private String _attacksSpellcasting;
   private String _armor;
   private String _sheild;
   private String _race;
   private String _charClass;
   private String _name;
   private String _alignment;
   private String _gender;
   private String _description;
   private String _personality;
   private String _ideals;
   private String _bonds;
   private String _flaws;
   private String _featuresTraits;
   private String _raceTraits;
   private String _otherProf;
   private String _classTraits;
   private String _notesTA;
   private String _fileName;

   /**
    * @category Integers
    */
   private int _strength;
   private int _dex;
   private int _con;
   private int _intelligence;
   private int _wisdom;
   private int _charisma;
   private int _level;
   private int _health;
   private int _ac = 0;
   private int _armorClass;
   private int _initiative;
   private int _speed;
   private int _tempHealth;
   private int _strengthMod;
   private int _dexMod;
   private int _conMod;
   private int _intelligenceMod;
   private int _wisdomMod;
   private int _charismaMod;
   private int _acrobatics;
   private int _animalHandling;
   private int _arcana;
   private int _athletics;
   private int _deception;
   private int _history;
   private int _insight;
   private int _intimidation;
   private int _investigation;
   private int _medicine;
   private int _nature;
   private int _perception;
   private int _performance;
   private int _persuasion;
   private int _religion;
   private int _sleight;
   private int _stealth;
   private int _survival;
   private int _numcantripsKnown;
   private int _numspellsKnown;
   private int _numfirstlvl;
   private int _numsecondlvl;
   private int _numthirdlvl;
   private int _numfourthlvl;
   private int _numfithlvl;
   private int _numsixthlvl;
   private int _numseventhlvl;
   private int _numeigthlvl;
   private int _numninethlvl;

   /**
    * @category boolean's
    */
   private boolean stBoxBool;
   private boolean dexBoxBool;
   private boolean conBoxBool;
   private boolean intBoxBool;
   private boolean wisBoxBool;
   private boolean charBoxBool;
   private boolean acroBoxBool;
   private boolean aHBoxBool;
   private boolean arcBoxBool;
   private boolean athBoxBool;
   private boolean decBoxBool;
   private boolean hisBoxBool;
   private boolean insightBoxBool;
   private boolean intiBoxBool;
   private boolean invesBoxBool;
   private boolean medBoxBool;
   private boolean natureBoxBool;
   private boolean perBoxBool;
   private boolean perfBoxBool;
   private boolean persBoxBool;
   private boolean relBoxBool;
   private boolean sleightBoxBool;
   private boolean stealthBoxBool;
   private boolean surBoxBool;

   public CharacterSheetV3(String __name, String __charClass, int __level, String __alignment, String __race,
         String __gender, String __description, String __personality, String __ideals, String __bonds, String __flaws,
         String __featuresTraits, String __raceTraits, String __classTraits, int __armorClass, int __initiative,
         int __speed, int __health, int __tempHealth, String __attacksSpellcasting, int __numcantripsKnown,
         int __numspellsKnown, int __numfirstlvl, int __numsecondlvl, int __numthirdlvl, int __numfourthlvl,
         int __numfithlvl, int __numsixthlvl, int __numseventhlvl, int __numeigthlvl, int __numninethlvl,
         String __armor, String __shield, String __equipment, int __strength, int __dex, int __con, int __intelligence,
         int __wisdom, int __charisma, int __strengthMod, int __dexMod, int __conMod, int __intelligenceMod,
         int __wisdomMod, int __charismaMod, int __acrobatics, int __animalHandling, int __arcana, int __athletics,
         int __deception, int __history, int __insight, int __intimidation, int __investigation, int __medicine,
         int __nature, int __perception, int __performance, int __persuasion, int __religion, int __sleight,
         int __stealth, int __survival, boolean __strengthModProficiency, boolean __dexModProficiency,
         boolean __conModProficiency, boolean __intelligenceModProficiency, boolean __wisdomModProficiency,
         boolean __charismaModProficiency, boolean __acrobaticsProficiency, boolean __animalHandlingProficiency,
         boolean __arcanaProficiency, boolean __athleticsProficiency, boolean __deceptionProficiency,
         boolean __historyProficiency, boolean __insightProficiency, boolean __intimidationProficiency,
         boolean __investigationProficiency, boolean __medicineProficiency, boolean __natureProficiency,
         boolean __perceptionProficiency, boolean __performanceProficiency, boolean __persuasionProficiency,
         boolean __religionProficiency, boolean __sleightProficiency, boolean __stealthProficiency,
         boolean __survivalProficiency, String __notesTA) {
      /*
       * String name; String charClass; int level; String alignment; String race;
       * String gender; String description; String personality; String ideals; String
       * bonds; String flaws; String featuresTraits; String raceTraits; String
       * classTraits;
       * 
       * int armorClass; int initiative; int speed; int health; int tempHealth;
       * 
       * String attacksSpellcasting; int numcantripsKnown; int numspellsKnown; int
       * numfirstlvl; int numsecondlvl; int numthirdlvl; int numfourthlvl; int
       * numfithlvl; int numsixthlvl; int numseventhlvl; int numeigthlvl; int
       * numninethlvl;
       * 
       * String armor; String shield; String equipment;
       * 
       * int strength; int dex; int con; int intelligence; int wisdom; int charisma;
       * 
       * int strengthMod; int dexMod; int conMod; int intelligenceMod; int wisdomMod;
       * int charismaMod;
       * 
       * int acrobatics; int animalHandling; int arcana; int athletics; int deception;
       * int history; int insight; int intimidation; int investigation; int medicine;
       * int nature; int perception; int performance; int persuasion; int religion;
       * int sleight; int stealth; int survival;
       * 
       * boolean strengthModProficiency; boolean dexModProficiency; boolean
       * conModProficiency; boolean intelligenceModProficiency; boolean
       * wisdomModProficiency; boolean charismaModProficiency;
       * 
       * boolean acrobaticsProficiency; boolean animalHandlingProficiency; boolean
       * arcanaProficiency; boolean athleticsProficiency; boolean
       * deceptionProficiency; boolean historyProficiency; boolean insightProficiency;
       * boolean intimidationProficiency; boolean investigationProficiency; boolean
       * medicineProficiency; boolean natureProficiency; boolean
       * perceptionProficiency; boolean performanceProficiency; boolean
       * persuasionProficiency; boolean religionProficiency; boolean
       * sleightProficiency; boolean stealthProficiency; boolean survivalProficiency;
       * String notesTA;
       */

      String _name = __name;
      String _charClass = __charClass;
      int _level = __level;
      String _alignment = __alignment;
      String _race = __race;

      String _gender = __gender;
      String _description = __description;
      String _personality = __personality;
      String _ideals = __ideals;
      String _bonds = __bonds;
      String _flaws = __flaws;

      String _featuresTraits = __featuresTraits;
      String _raceTraits = __raceTraits;
      String _classTraits = __classTraits;
      int _armorClass = __armorClass;
      int _initiative = __initiative;

      int _speed = __speed;
      int _health = __health;
      int _tempHealth = __tempHealth;
      String _attacksSpellcasting = __attacksSpellcasting;
      int _numcantripsKnown = __numcantripsKnown;

      int _numspellsKnown = __numspellsKnown;
      int _numfirstlvl = __numfirstlvl;
      int _numsecondlvl = __numsecondlvl;
      int _numthirdlvl = __numthirdlvl;
      int _numfourthlvl = __numfourthlvl;

      int _numfithlvl = __numfithlvl;
      int _numsixthlvl = __numsixthlvl;
      int _numseventhlvl = __numseventhlvl;
      int _numeigthlvl = __numeigthlvl;
      int _numninethlvl = __numninethlvl;

      String _armor = __armor;
      String _shield = __shield;
      String _equipment = __equipment;

      int _strength = __strength;
      int _dex = __dex;
      int _con = __con;
      int _intelligence = __intelligence;
      int _wisdom = __wisdom;
      int _charisma = __charisma;

      int _strengthMod = __strengthMod;
      int _dexMod = __dexMod;
      int _conMod = __conMod;
      int _intelligenceMod = __intelligenceMod;

      int _wisdomMod = __wisdomMod;
      int _charismaMod = __charismaMod;
      int _acrobatics = __acrobatics;
      int _animalHandling = __animalHandling;
      int _arcana = __arcana;
      int _athletics = __athletics;

      int _deception = __deception;
      int _history = __history;
      int _insight = __insight;
      int _intimidation = __intimidation;
      int _investigation = __investigation;
      int _medicine = __medicine;

      int _nature = __nature;
      int _perception = __perception;
      int _performance = __performance;
      int _persuasion = __persuasion;
      int _religion = __religion;
      int _sleight = __sleight;

      int _stealth = __stealth;
      int _survival = __survival;
      boolean _strengthModProficiency = __strengthModProficiency;
      boolean _dexModProficiency = __dexModProficiency;

      boolean _conModProficiency = __conModProficiency;
      boolean _intelligenceModProficiency = __intelligenceModProficiency;
      boolean _wisdomModProficiency = __wisdomModProficiency;

      boolean _charismaModProficiency = __charismaModProficiency;
      boolean _acrobaticsProficiency = __acrobaticsProficiency;
      boolean _animalHandlingProficiency = __animalHandlingProficiency;

      boolean _arcanaProficiency = __arcanaProficiency;
      boolean _athleticsProficiency = __athleticsProficiency;
      boolean _deceptionProficiency = __deceptionProficiency;

      boolean _historyProficiency = __historyProficiency;
      boolean _insightProficiency = __insightProficiency;
      boolean _intimidationProficiency = __intimidationProficiency;

      boolean _investigationProficiency = __investigationProficiency;
      boolean _medicineProficiency = __medicineProficiency;
      boolean _natureProficiency = __natureProficiency;

      boolean _perceptionProficiency = __perceptionProficiency;
      boolean _performanceProficiency = __performanceProficiency;
      boolean _persuasionProficiency = __persuasionProficiency;

      boolean _religionProficiency = __religionProficiency;
      boolean _sleightProficiency = __sleightProficiency;
      boolean _stealthProficiency = __stealthProficiency;

      boolean _survivalProficiency = __survivalProficiency;
      String _notesTA = __notesTA;
      ///
      GUI();
      JFrame myFrame2;
      myFrame2 = new JFrame();
      myFrame2.setBackground(Color.BLACK);
      myFrame2.setTitle("Character Sheet");
      myFrame2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      myFrame2.add(scroll);
      visualInterir.setVisible(true);
      visualExterior.setVisible(true);
      scroll.setVisible(true);
      myFrame2.setVisible(true);
      myFrame2.pack();
      myFrame2.setSize(1400, 600);
      myFrame2.setLocationRelativeTo(null);

      healthField.setText(String.valueOf(logic.health));
      armorClassField.setText(String.valueOf(logic.armorClass));
      speedField.setText(String.valueOf(logic.speed));

      if (_strengthMod < 0) {
         strengthFieldMod.setText(String.valueOf(_strengthMod));
      } else {
         strengthFieldMod.setText("+" + String.valueOf(_strengthMod));
      }

      if (_dexMod < 0) {
         dexFieldMod.setText(String.valueOf(_dexMod));
      } else {
         dexFieldMod.setText("+" + String.valueOf(_dexMod));
      }

      if (_conMod < 0) {
         conFieldMod.setText(String.valueOf(_conMod));
      } else {
         conFieldMod.setText("+" + String.valueOf(_conMod));
      }

      if (_intelligenceMod < 0) {
         intelligenceFieldMod.setText(String.valueOf(_intelligenceMod));
      } else {
         intelligenceFieldMod.setText("+" + String.valueOf(_intelligenceMod));
      }

      if (_wisdomMod < 0) {
         wisdomFieldMod.setText(String.valueOf(_wisdomMod));
      } else {
         wisdomFieldMod.setText("+" + String.valueOf(_wisdomMod));
      }

      if (_charismaMod < 0) {
         charismaFieldMod.setText(String.valueOf(_charismaMod));
      } else {
         charismaFieldMod.setText("+" + String.valueOf(_charismaMod));
      }

      if (_dexMod < 0) {
         acroField.setText(String.valueOf(_dexMod));
      } else {
         acroField.setText("+" + String.valueOf(_dexMod));
      }

      if (_wisdomMod < 0) {
         aHField.setText(String.valueOf(_wisdomMod));
      } else {
         aHField.setText("+" + String.valueOf(_wisdomMod));
      }

      if (_intelligenceMod < 0) {
         arcField.setText(String.valueOf(_intelligenceMod));
      } else {
         arcField.setText("+" + String.valueOf(_intelligenceMod));
      }

      if (logic.strengthMod < 0) {
         athField.setText(String.valueOf(logic.strengthMod));
      } else {
         athField.setText("+" + String.valueOf(logic.strengthMod));
      }

      if (_charismaMod < 0) {
         decField.setText(String.valueOf(_charismaMod));
      } else {
         decField.setText("+" + String.valueOf(_charismaMod));
      }

      if (_intelligenceMod < 0) {
         hisField.setText(String.valueOf(_intelligenceMod));
      } else {
         hisField.setText("+" + String.valueOf(_intelligenceMod));
      }

      if (_wisdomMod < 0) {
         insightField.setText(String.valueOf(_wisdomMod));
      } else {
         insightField.setText("+" + String.valueOf(_wisdomMod));
      }

      if (_charismaMod < 0) {
         intiField.setText(String.valueOf(_charismaMod));
      } else {
         intiField.setText("+" + String.valueOf(_charismaMod));
      }

      if (_intelligenceMod < 0) {
         invesField.setText(String.valueOf(_intelligenceMod));
      } else {
         invesField.setText("+" + String.valueOf(_intelligenceMod));
      }

      if (_wisdomMod < 0) {
         medField.setText(String.valueOf(_wisdomMod));
      } else {
         medField.setText("+" + String.valueOf(_wisdomMod));
      }

      if (_intelligenceMod < 0) {
         natureField.setText(String.valueOf(_intelligenceMod));
      } else {
         natureField.setText("+" + String.valueOf(_intelligenceMod));
      }

      if (_wisdomMod < 0) {
         perField.setText(String.valueOf(_wisdomMod));
      } else {
         perField.setText("+" + String.valueOf(_wisdomMod));
      }

      if (_charismaMod < 0) {
         perfField.setText(String.valueOf(_charismaMod));
      } else {
         perfField.setText("+" + String.valueOf(_charismaMod));
      }

      if (_charismaMod < 0) {
         persField.setText(String.valueOf(_charismaMod));
      } else {
         persField.setText("+" + String.valueOf(_charismaMod));
      }

      if (_intelligenceMod < 0) {
         relField.setText(String.valueOf(_intelligenceMod));
      } else {
         relField.setText("+" + String.valueOf(_intelligenceMod));
      }

      if (_dexMod < 0) {
         sleightField.setText(String.valueOf(_dexMod));
      } else {
         sleightField.setText("+" + String.valueOf(_dexMod));
      }

      if (_dexMod < 0) {
         stealthField.setText(String.valueOf(_dexMod));
      } else {
         stealthField.setText("+" + String.valueOf(_dexMod));
      }

      if (_wisdomMod < 0) {
         surField.setText(String.valueOf(_wisdomMod));
      } else {
         surField.setText("+" + String.valueOf(_wisdomMod));
      }
      repaint();
   }

   public CharacterSheetV3() {
      GUI();
      JFrame myFrame1;
      myFrame1 = new JFrame();
      myFrame1.setBackground(Color.BLACK);
      myFrame1.setTitle("Character Sheet");
      myFrame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      myFrame1.add(scroll);
      visualInterir.setVisible(true);
      visualExterior.setVisible(true);
      scroll.setVisible(true);
      myFrame1.setVisible(true);
      myFrame1.pack();
      myFrame1.setSize(1400, 600);
      myFrame1.setLocationRelativeTo(null);
   }

   public void GUI() {
      // main frame

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

      // All components for p1
      p1 = new JPanel(new GridLayout(4, 2));

      p1.add(name = new JLabel("Name: ", JLabel.RIGHT));
      p1.add(nameField = new JTextField(10));

      p1.add(charClass = new JLabel("Class: ", JLabel.RIGHT));
      JComboBox classCombo = new JComboBox(classes);
      p1.add(classCombo);
      _charClass = (String) classCombo.getSelectedItem();

      p1.add(level = new JLabel("Level: ", JLabel.RIGHT));
      p1.add(levelField = new JTextField(10));
      levelField.setEditable(false);
      levelField.setText("1");

      p1.add(alignment = new JLabel("Alignment: ", JLabel.RIGHT));
      p1.add(alignField = new JTextField(10));

      p1.add(gender = new JLabel("Gender: ", JLabel.RIGHT));
      p1.add(genderField = new JTextField(10));

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

      p2.add(strength = new JLabel("Strength: ", JLabel.RIGHT));
      p2.add(strengthField = new JTextField(5));
      strengthField.setPreferredSize(new Dimension(small));

      p2.add(dex = new JLabel("Dexterity: ", JLabel.RIGHT));
      p2.add(dexField = new JTextField(5));
      dexField.setPreferredSize(new Dimension(small));

      p2.add(con = new JLabel("Constitution: ", JLabel.RIGHT));
      p2.add(conField = new JTextField(5));
      conField.setPreferredSize(new Dimension(small));

      p2.add(intelligence = new JLabel("Intelligence: ", JLabel.RIGHT));
      p2.add(intField = new JTextField(5));
      intField.setPreferredSize(new Dimension(small));

      p2.add(wisdom = new JLabel("Wisdom: ", JLabel.RIGHT));
      p2.add(wisField = new JTextField(5));
      wisField.setPreferredSize(new Dimension(small));

      p2.add(charisma = new JLabel("Charisma: ", JLabel.RIGHT));
      p2.add(charField = new JTextField(5));
      charField.setPreferredSize(new Dimension(small));

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

      JComboBox SheildField;
      p7.add(shield = new JLabel("Sheild: ", JLabel.RIGHT));
      p7.add(SheildField = new JComboBox(shields));
      SheildField.setPreferredSize(new Dimension(statBlock));

      JComboBox weaponField;
      p7.add(weapon = new JLabel("Weapons: ", JLabel.RIGHT));
      p7.add(weaponField = new JComboBox(weapons));
      weaponField.setPreferredSize(new Dimension(statBlock));

      logic = new CharacterSheetLogic(_charClass, _level, _race, _strength, _dex, _con, _intelligence, _wisdom,
            _charisma, _equipment, _armor, _health, _ac, _sheild);

      p7.add(armorClass = new JLabel("Armor Class: ", JLabel.RIGHT));
      p7.add(armorClassField = new JTextField(3));
      armorClassField.setPreferredSize(new Dimension(statBlock));
      armorClassField.setText(String.valueOf(logic.armorClass));

      p7.add(intitive = new JLabel("Intitive: ", JLabel.RIGHT));
      p7.add(initField = new JTextField(3));
      initField.setPreferredSize(new Dimension(statBlock));
      initField.setPreferredSize(new Dimension(small));

      p7.add(speed = new JLabel("Speed: ", JLabel.RIGHT));
      p7.add(speedField = new JTextField(3));
      speedField.setPreferredSize(new Dimension(statBlock));
      speedField.setText(String.valueOf(logic.speed));

      p7.add(health = new JLabel("Max Health Points: ", JLabel.RIGHT));
      p7.add(healthField = new JTextField(3));
      healthField.setPreferredSize(new Dimension(statBlock));
      healthField.setText(String.valueOf(logic.health));

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

      p6.add(dexMod = new JLabel("Dexterity: ", JLabel.RIGHT));
      p6.add(dexFieldMod = new JTextField(5));
      dexFieldMod.setEditable(false);
      dexBox = new JCheckBox("");
      p6.add(dexBox);

      p6.add(conMod = new JLabel("Constitution: ", JLabel.RIGHT));
      p6.add(conFieldMod = new JTextField(5));
      conFieldMod.setEditable(false);
      conBox = new JCheckBox("");
      p6.add(conBox);

      p6.add(intelligenceMod = new JLabel("Intelligence: ", JLabel.RIGHT));
      p6.add(intelligenceFieldMod = new JTextField(5));
      intelligenceFieldMod.setEditable(false);
      intBox = new JCheckBox("");
      p6.add(intBox);

      p6.add(wisdomMod = new JLabel("Wisdom: ", JLabel.RIGHT));
      p6.add(wisdomFieldMod = new JTextField(5));
      wisdomFieldMod.setEditable(false);
      wisBox = new JCheckBox("");
      p6.add(wisBox);

      p6.add(charismaMod = new JLabel("Charisma: ", JLabel.RIGHT));
      p6.add(charismaFieldMod = new JTextField(5));
      charismaFieldMod.setEditable(false);
      charBox = new JCheckBox("");
      p6.add(charBox);

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

      p6.add(animalHandling = new JLabel("Animal \nHandling: ", JLabel.RIGHT));
      p6.add(aHField = new JTextField(3));
      aHField.setEditable(false);
      aHBox = new JCheckBox("");
      p6.add(aHBox);

      p6.add(arcana = new JLabel("Arcana: ", JLabel.RIGHT));
      p6.add(arcField = new JTextField(3));
      arcField.setEditable(false);
      arcBox = new JCheckBox("");
      p6.add(arcBox);

      p6.add(athletics = new JLabel("Atheltics: ", JLabel.RIGHT));
      p6.add(athField = new JTextField(3));
      athField.setEditable(false);
      athBox = new JCheckBox("");
      p6.add(athBox);

      p6.add(deception = new JLabel("Deception: ", JLabel.RIGHT));
      p6.add(decField = new JTextField(3));
      decField.setEditable(false);
      decBox = new JCheckBox("");
      p6.add(decBox);

      p6.add(history = new JLabel("History: ", JLabel.RIGHT));
      p6.add(hisField = new JTextField(3));
      hisField.setEditable(false);
      hisBox = new JCheckBox("");
      p6.add(hisBox);

      p6.add(insight = new JLabel("Insight: ", JLabel.RIGHT));
      p6.add(insightField = new JTextField(3));
      insightField.setEditable(false);
      insightBox = new JCheckBox("");
      p6.add(insightBox);

      p6.add(intimidation = new JLabel("Intimidation: ", JLabel.RIGHT));
      p6.add(intiField = new JTextField(3));
      intiField.setEditable(false);
      intiBox = new JCheckBox("");
      p6.add(intiBox);

      p6.add(intimidation = new JLabel("Intimidation: ", JLabel.RIGHT));
      p6.add(invesField = new JTextField(3));
      invesField.setEditable(false);
      invesBox = new JCheckBox("");
      p6.add(invesBox);

      p6.add(medicine = new JLabel("Medicine: ", JLabel.RIGHT));
      p6.add(medField = new JTextField(3));
      medField.setEditable(false);
      medBox = new JCheckBox("");
      p6.add(medBox);

      p6.add(nature = new JLabel("Nature: ", JLabel.RIGHT));
      p6.add(natureField = new JTextField(3));
      natureField.setEditable(false);
      natureBox = new JCheckBox("");
      p6.add(natureBox);

      p6.add(perception = new JLabel("Perception: ", JLabel.RIGHT));
      p6.add(perField = new JTextField(3));
      perField.setEditable(false);
      perBox = new JCheckBox("");
      p6.add(perBox);

      p6.add(performance = new JLabel("Performance: ", JLabel.RIGHT));
      p6.add(perfField = new JTextField(3));
      perfField.setEditable(false);
      perfBox = new JCheckBox("");
      p6.add(perfBox);

      p6.add(persuasion = new JLabel("Persuasion: ", JLabel.RIGHT));
      p6.add(persField = new JTextField(3));
      persField.setEditable(false);
      persBox = new JCheckBox("");
      p6.add(persBox);

      p6.add(religion = new JLabel("Religion: ", JLabel.RIGHT));
      p6.add(relField = new JTextField(3));
      relField.setEditable(false);
      relBox = new JCheckBox("");
      p6.add(relBox);

      p6.add(sleight = new JLabel("Sleight Of \nHand: ", JLabel.RIGHT));
      p6.add(sleightField = new JTextField(3));
      sleightField.setEditable(false);
      sleightBox = new JCheckBox("");
      p6.add(sleightBox);

      p6.add(stealth = new JLabel("Stealth: ", JLabel.RIGHT));
      p6.add(stealthField = new JTextField(3));
      stealthField.setEditable(false);
      stealthBox = new JCheckBox("");
      p6.add(stealthBox);

      p6.add(survival = new JLabel("Survival: ", JLabel.RIGHT));
      p6.add(surField = new JTextField(3));
      surField.setEditable(false);
      surBox = new JCheckBox("");
      p6.add(surBox);
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
      visualExterior.add(mb);
      visualExterior.add(visualInterir, BorderLayout.CENTER);
      scroll = new JScrollPane(visualExterior);
      scroll.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
      scroll.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
      scroll.getVerticalScrollBar().setUnitIncrement(16);
      scroll.setSize(1400, 600);

      file.setBackground(Color.BLACK);
      temp1.setBackground(Color.BLACK);
      visualInterir.setBackground(Color.BLACK);
      scroll.setBackground(Color.BLACK);
      visualExterior.setBackground(Color.BLACK);
      p1.setBackground(Color.BLACK);
      p2.setBackground(Color.BLACK);
      p3.setBackground(Color.BLACK);
      p4.setBackground(Color.BLACK);
      p5.setBackground(Color.BLACK);
      p6.setBackground(Color.BLACK);
      p7.setBackground(Color.BLACK);

      acroField.setBackground(Color.BLACK);
      aHField.setBackground(Color.BLACK);
      arcField.setBackground(Color.BLACK);
      athField.setBackground(Color.BLACK);
      decField.setBackground(Color.BLACK);
      hisField.setBackground(Color.BLACK);
      insightField.setBackground(Color.BLACK);
      intiField.setBackground(Color.BLACK);
      invesField.setBackground(Color.BLACK);
      medField.setBackground(Color.BLACK);
      natureField.setBackground(Color.BLACK);
      perField.setBackground(Color.BLACK);
      perfField.setBackground(Color.BLACK);
      persField.setBackground(Color.BLACK);
      relField.setBackground(Color.BLACK);
      sleightField.setBackground(Color.BLACK);
      stealthField.setBackground(Color.BLACK);
      surField.setBackground(Color.BLACK);
      healthField.setBackground(Color.BLACK);
      tempHealthField.setBackground(Color.BLACK);
      speedField.setBackground(Color.BLACK);
      initField.setBackground(Color.BLACK);
      armorClassField.setBackground(Color.BLACK);

      stBox.setBackground(Color.BLACK);
      dexBox.setBackground(Color.BLACK);
      conBox.setBackground(Color.BLACK);
      intBox.setBackground(Color.BLACK);
      wisBox.setBackground(Color.BLACK);
      charBox.setBackground(Color.BLACK);
      acroBox.setBackground(Color.BLACK);
      aHBox.setBackground(Color.BLACK);
      arcBox.setBackground(Color.BLACK);
      athBox.setBackground(Color.BLACK);
      decBox.setBackground(Color.BLACK);
      hisBox.setBackground(Color.BLACK);
      insightBox.setBackground(Color.BLACK);
      intiBox.setBackground(Color.BLACK);
      invesBox.setBackground(Color.BLACK);
      medBox.setBackground(Color.BLACK);
      natureBox.setBackground(Color.BLACK);
      perBox.setBackground(Color.BLACK);
      perfBox.setBackground(Color.BLACK);
      persBox.setBackground(Color.BLACK);
      relBox.setBackground(Color.BLACK);
      sleightBox.setBackground(Color.BLACK);
      stealthBox.setBackground(Color.BLACK);
      surBox.setBackground(Color.BLACK);

      strengthFieldMod.setBackground(Color.BLACK);
      dexFieldMod.setBackground(Color.BLACK);
      conFieldMod.setBackground(Color.BLACK);
      intelligenceFieldMod.setBackground(Color.BLACK);
      wisdomFieldMod.setBackground(Color.BLACK);
      charismaFieldMod.setBackground(Color.BLACK);

      mb.setBackground(Color.BLACK);
      open.setBackground(Color.BLACK);
      lvlUp.setBackground(Color.BLACK);
      // lvlDown.setBackground(Color.BLACK);
      description.setBackground(Color.BLACK);

      update.setBackground(Color.BLACK);
      save.setBackground(Color.BLACK);
      menu.setBackground(Color.BLACK);

      personality.setBackground(Color.BLACK);
      ideals.setBackground(Color.BLACK);
      bonds.setBackground(Color.BLACK);
      flaws.setBackground(Color.BLACK);
      featuresTraits.setBackground(Color.BLACK);

      otherProf.setBackground(Color.BLACK);
      equipment.setBackground(Color.BLACK);
      attacksSpellcasting.setBackground(Color.BLACK);
      raceTraits.setBackground(Color.BLACK);
      classTraits.setBackground(Color.BLACK);
      notesTA.setBackground(Color.BLACK);

      CharacterSheetLogic test = new CharacterSheetLogic(_charClass, _level, _race, _strength, _dex, _con,
            _intelligence, _wisdom, _charisma);

      ActionListener updateListener = new ActionListener() {
         @Override
         public void actionPerformed(ActionEvent e) {

            stBoxBool = stBox.isSelected();
            dexBoxBool = dexBox.isSelected();
            conBoxBool = conBox.isSelected();
            intBoxBool = intBox.isSelected();
            wisBoxBool = wisBox.isSelected();
            charBoxBool = charBox.isSelected();
            acroBoxBool = acroBox.isSelected();
            aHBoxBool = aHBox.isSelected();
            arcBoxBool = arcBox.isSelected();
            athBoxBool = athBox.isSelected();
            decBoxBool = decBox.isSelected();
            hisBoxBool = hisBox.isSelected();
            insightBoxBool = insightBox.isSelected();
            intiBoxBool = intiBox.isSelected();
            invesBoxBool = invesBox.isSelected();
            medBoxBool = medBox.isSelected();
            natureBoxBool = natureBox.isSelected();
            perBoxBool = perBox.isSelected();
            perfBoxBool = perfBox.isSelected();
            persBoxBool = persBox.isSelected();
            relBoxBool = relBox.isSelected();
            sleightBoxBool = sleightBox.isSelected();
            stealthBoxBool = stealthBox.isSelected();
            surBoxBool = surBox.isSelected();

            try {
               _health = Integer.parseInt(healthField.getText());
            } catch (NumberFormatException nfe) {
            }
            try {
               _charClass = (String) classCombo.getSelectedItem();
            } catch (NumberFormatException nfe) {
            }
            try {
               _level = Integer.parseInt(levelField.getText());
            } catch (NumberFormatException nfe) {
            }
            try {
               _race = (String) raceCombo.getSelectedItem();
            } catch (NumberFormatException nfe) {
            }
            try {
               _armorClass = Integer.parseInt(armorClassField.getText());
            } catch (NumberFormatException nfe) {
            }
            try {
               _initiative = Integer.parseInt(initField.getText());
            } catch (NumberFormatException nfe) {
            }
            try {
               _speed = Integer.parseInt(speedField.getText());
            } catch (NumberFormatException nfe) {
            }
            try {
               _tempHealth = Integer.parseInt(tempHealthField.getText());
            } catch (NumberFormatException nfe) {
            }
            try {
               _personality = personality.getText();
            } catch (NumberFormatException nfe) {
            }
            try {
               _ideals = ideals.getText();
            } catch (NumberFormatException nfe) {
            }
            try {
               _bonds = bonds.getText();
            } catch (NumberFormatException nfe) {
            }
            try {
               _flaws = flaws.getText();
            } catch (NumberFormatException nfe) {
            }
            try {
               _featuresTraits = featuresTraits.getText();
            } catch (NumberFormatException nfe) {
            }
            try {
               _otherProf = otherProf.getText();
            } catch (NumberFormatException nfe) {
            }
            try {
               _raceTraits = raceTraits.getText();
            } catch (NumberFormatException nfe) {
            }
            try {
               _classTraits = classTraits.getText();
            } catch (NumberFormatException nfe) {
            }
            try {
               _notesTA = notesTA.getText();
            } catch (NumberFormatException nfe) {
            }

            try {
               _survival = Integer.parseInt(surField.getText());
            } catch (NumberFormatException nfe) {
            }

            try {
               _stealth = Integer.parseInt(stealthField.getText());
            } catch (NumberFormatException nfe) {
            }

            try {
               _sleight = Integer.parseInt(sleightField.getText());
            } catch (NumberFormatException nfe) {
            }

            try {
               _religion = Integer.parseInt(relField.getText());
            } catch (NumberFormatException nfe) {
            }

            try {
               _persuasion = Integer.parseInt(persField.getText());
            } catch (NumberFormatException nfe) {
            }

            try {
               _performance = Integer.parseInt(perfField.getText());
            } catch (NumberFormatException nfe) {
            }

            try {
               _perception = Integer.parseInt(perField.getText());
            } catch (NumberFormatException nfe) {
            }

            try {
               _nature = Integer.parseInt(natureField.getText());
            } catch (NumberFormatException nfe) {
            }

            try {
               _medicine = Integer.parseInt(medField.getText());
            } catch (NumberFormatException nfe) {
            }

            try {
               _investigation = Integer.parseInt(invesField.getText());
            } catch (NumberFormatException nfe) {
            }

            try {
               _intimidation = Integer.parseInt(intelligenceFieldMod.getText());
            } catch (NumberFormatException nfe) {
            }

            try {
               _insight = Integer.parseInt(insightField.getText());
            } catch (NumberFormatException nfe) {
            }

            try {
               _history = Integer.parseInt(hisField.getText());
            } catch (NumberFormatException nfe) {
            }

            try {
               _deception = Integer.parseInt(decField.getText());
            } catch (NumberFormatException nfe) {
            }

            try {
               _athletics = Integer.parseInt(athField.getText());
            } catch (NumberFormatException nfe) {
            }

            try {
               _arcana = Integer.parseInt(arcField.getText());
            } catch (NumberFormatException nfe) {
            }

            try {
               _animalHandling = Integer.parseInt(aHField.getText());
            } catch (NumberFormatException nfe) {
            }

            try {
               _acrobatics = Integer.parseInt(acroField.getText());
            } catch (NumberFormatException nfe) {
            }

            try {
               _charismaMod = Integer.parseInt(charField.getText());
            } catch (NumberFormatException nfe) {
            }

            try {
               _wisdomMod = Integer.parseInt(wisdomFieldMod.getText());
            } catch (NumberFormatException nfe) {
            }

            try {
               _dexMod = Integer.parseInt(dexFieldMod.getText());
            } catch (NumberFormatException nfe) {
            }

            try {
               _intelligenceMod = Integer.parseInt(intelligenceFieldMod.getText());
            } catch (NumberFormatException nfe) {
            }
            //
            try {
               _conMod = Integer.parseInt(conFieldMod.getText());
            } catch (NumberFormatException nfe) {
            }

            try {
               _strengthMod = Integer.parseInt(strengthFieldMod.getText());
            } catch (NumberFormatException nfe) {
            }

            try {
               _description = descripField.getText();
            } catch (NumberFormatException nfe) {
            }

            try {
               _gender = genderField.getText();
            } catch (NumberFormatException nfe) {
            }

            try {
               _alignment = alignField.getText();
            } catch (NumberFormatException nfe) {
            }

            try {
               _name = nameField.getText();
            } catch (NumberFormatException nfe) {
            }

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

         }
      };

      ActionListener saveListener = new ActionListener() {
         @Override
         public void actionPerformed(ActionEvent e) {
            logic.update(_charClass, _level, _race, _strength, _dex, _con, _intelligence, _wisdom, _charisma,
                  _equipment, _armor, _health, _ac, _sheild);
            try {
               JSONWriter json = new JSONWriter(_name, _charClass, _level, _alignment, _race, _gender, _description,
                     _strength, _dex, _con, _intelligence, _wisdom, _charisma, _strengthMod, _dexMod, _conMod,
                     _intelligenceMod, _wisdomMod, _charismaMod, _acrobatics, _animalHandling, _arcana, _athletics,
                     _deception, _history, _insight, _intimidation, _investigation, _medicine, _nature, _perception,
                     _performance, _persuasion, _religion, _sleight, _stealth, _survival, stBoxBool, dexBoxBool,
                     conBoxBool, intBoxBool, wisBoxBool, charBoxBool, acroBoxBool, aHBoxBool, arcBoxBool, athBoxBool,
                     decBoxBool, hisBoxBool, insightBoxBool, intiBoxBool, invesBoxBool, medBoxBool, natureBoxBool,
                     perBoxBool, perfBoxBool, persBoxBool, relBoxBool, sleightBoxBool, stealthBoxBool, surBoxBool,
                     _armorClass, _initiative, _speed, _health, _tempHealth, _personality, _ideals, _bonds, _flaws,
                     _featuresTraits, _armor, _otherProf, _equipment, _sheild, _attacksSpellcasting, _raceTraits,
                     _classTraits, _notesTA, _numcantripsKnown, _numspellsKnown, _numfirstlvl, _numsecondlvl,
                     _numthirdlvl, _numfourthlvl, _numfithlvl, _numsixthlvl, _numseventhlvl, _numeigthlvl,
                     _numninethlvl, _fileName);
            } catch (FileNotFoundException e1) {
               System.out.println("oll");
               e1.printStackTrace();
            } catch (UnsupportedEncodingException e1) {
               System.out.println("adf1`");
               e1.printStackTrace();
            }

         }
      };

      ActionListener fileOpen = new ActionListener() {
         @Override
         public void actionPerformed(ActionEvent fexplor) {
            JSONReader jsr = new JSONReader();
            // Handle open button action.
            if (fexplor.getSource() == open) {
               JFileChooser fc = new JFileChooser();
               int returnVal = fc.showOpenDialog(top);

               if (returnVal == JFileChooser.APPROVE_OPTION) {
                  File file = fc.getSelectedFile();
                  // This is where a real application would open the file.
                  System.out.println("Opening: " + file.getName() + ".");
                  jsr.Load(file.getName());
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

   public static void main(String[] args) {
      CharacterSheetV3 frame = new CharacterSheetV3();
   }

}