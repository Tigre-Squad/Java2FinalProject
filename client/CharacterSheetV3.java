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
   private JPanel p6;
   private JPanel p7;
   private JPanel temp1;
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

   private JLabel savingThrows;
   private JLabel strengthMod;
   private JLabel dexMod;
   private JLabel conMod;
   private JLabel intelligenceMod;
   private JLabel wisdomMod;
   private JLabel charismaMod;

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

   private JLabel descripField;
   private JLabel personalityLabel;
   private JLabel idealLabel;
   private JLabel bondLabel;
   private JLabel flawLabel;
   private JLabel ftLabel;

   JLabel empty1;
   JLabel skillField;
   JLabel savingThrowField;

   JLabel langLabel;
   JLabel equipmentLabel;
   JLabel attackLabel;
   JLabel raceLabel;
   JLabel classLabel;
   JLabel notesLabel;

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

   JComboBox armorField;
   JComboBox SheildField;
   JComboBox weaponField;
   JComboBox classCombo;
   JComboBox raceCombo;

   /**
    * @category Dimension's
    */
   Dimension small;
   Dimension middleboxes;
   Dimension statBlock;

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

   private int localLevelTracker = 1;

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

   protected boolean strengthModProficiency;
   protected boolean dexModProficiency;
   protected boolean conModProficiency;
   protected boolean intelligenceModProficiency;
   protected boolean wisdomModProficiency;
   protected boolean charismaModProficiency;

   protected boolean acrobaticsProficiency;
   protected boolean animalHandlingProficiency;
   protected boolean arcanaProficiency;
   protected boolean athleticsProficiency;
   protected boolean deceptionProficiency;
   protected boolean historyProficiency;
   protected boolean insightProficiency;
   protected boolean intimidationProficiency;
   protected boolean investigationProficiency;
   protected boolean medicineProficiency;
   protected boolean natureProficiency;
   protected boolean perceptionProficiency;
   protected boolean performanceProficiency;
   protected boolean persuasionProficiency;
   protected boolean religionProficiency;
   protected boolean sleightProficiency;
   protected boolean stealthProficiency;
   protected boolean survivalProficiency;

   protected boolean lvlOne = false;
   protected boolean lvlTwo = false;
   protected boolean lvlThree = false;
   protected boolean lvlFour = false;
   protected boolean lvlFive = false;
   protected boolean lvlSix = false;
   protected boolean lvlSeven = false;
   protected boolean lvlEight = false;
   protected boolean lvlNine = false;
   protected boolean lvlTen = false;
   protected boolean lvlEleven = false;
   protected boolean lvlTwelve = false;
   protected boolean lvlThirteen = false;
   protected boolean lvlFourteen = false;
   protected boolean lvlFifteen = false;
   protected boolean lvlSixteen = false;
   protected boolean lvlSeventeen = false;
   protected boolean lvlEighteen = false;
   protected boolean lvlNineteen = false;
   protected boolean lvlTwenty = false;

   protected boolean armorRST = false;

   public CharacterSheetV3(String __name, String __charClass, int __level, String __alignment, String __race,
         String __gender, String __description, String __personality, String __ideals, String __bonds, String __flaws,
         String __featuresTraits, String __raceTraits, String __classTraits, int __ac, int __initiative, int __speed,
         int __health, int __tempHealth, String __attacksSpellcasting, int __numcantripsKnown, int __numspellsKnown,
         int __numfirstlvl, int __numsecondlvl, int __numthirdlvl, int __numfourthlvl, int __numfithlvl,
         int __numsixthlvl, int __numseventhlvl, int __numeigthlvl, int __numninethlvl, String __armor, String __shield,
         String __equipment, int __strength, int __dex, int __con, int __intelligence, int __wisdom, int __charisma,
         int __strengthMod, int __dexMod, int __conMod, int __intelligenceMod, int __wisdomMod, int __charismaMod,
         int __acrobatics, int __animalHandling, int __arcana, int __athletics, int __deception, int __history,
         int __insight, int __intimidation, int __investigation, int __medicine, int __nature, int __perception,
         int __performance, int __persuasion, int __religion, int __sleight, int __stealth, int __survival,
         boolean __strengthModProficiency, boolean __dexModProficiency, boolean __conModProficiency,
         boolean __intelligenceModProficiency, boolean __wisdomModProficiency, boolean __charismaModProficiency,
         boolean __acrobaticsProficiency, boolean __animalHandlingProficiency, boolean __arcanaProficiency,
         boolean __athleticsProficiency, boolean __deceptionProficiency, boolean __historyProficiency,
         boolean __insightProficiency, boolean __intimidationProficiency, boolean __investigationProficiency,
         boolean __medicineProficiency, boolean __natureProficiency, boolean __perceptionProficiency,
         boolean __performanceProficiency, boolean __persuasionProficiency, boolean __religionProficiency,
         boolean __sleightProficiency, boolean __stealthProficiency, boolean __survivalProficiency, String __notesTA) {
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
      int _ac = __ac;
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

      levelField.setText(Integer.toString(_level));

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
      temp1 = new JPanel();
      visualInterir = new JPanel();
      visualExterior = new JPanel();
      JPanel p4s = new JPanel();
      JPanel notesJPanel = new JPanel();
      JPanel filPanel= new JPanel();

      file = new JMenu("File");
      open = new JMenuItem("Open File");
      update = new JMenuItem("Update");
      save = new JMenuItem("Save File");
      lvlUp = new JMenuItem("Level Up");
      lvlDown = new JMenuItem("Level Down");
      mb = new JMenuBar();

      p1 = new JPanel(new GridLayout(4, 2));
      p2 = new JPanel(new GridLayout(0, 1));
      p3 = new JPanel(new GridLayout(0, 1));
      p4 = new JPanel(new GridLayout(2, 3));
      p5 = new JPanel(new GridLayout(0, 2));
      p6 = new JPanel(new GridLayout(0, 3));
      p7 = new JPanel(new GridLayout(0, 2));

      mb.setBounds(0, 0, 260, 20);

      stBox = new JCheckBox("");
      dexBox = new JCheckBox("");
      conBox = new JCheckBox("");
      intBox = new JCheckBox("");
      wisBox = new JCheckBox("");
      charBox = new JCheckBox("");
      acroBox = new JCheckBox("");
      aHBox = new JCheckBox("");
      arcBox = new JCheckBox("");
      athBox = new JCheckBox("");
      decBox = new JCheckBox("");
      hisBox = new JCheckBox("");
      insightBox = new JCheckBox("");
      intiBox = new JCheckBox("");
      invesBox = new JCheckBox("");
      medBox = new JCheckBox("");
      natureBox = new JCheckBox("");
      perBox = new JCheckBox("");
      perfBox = new JCheckBox("");
      persBox = new JCheckBox("");
      relBox = new JCheckBox("");
      sleightBox = new JCheckBox("");
      stealthBox = new JCheckBox("");
      surBox = new JCheckBox("");

      classCombo = new JComboBox(classes);
      raceCombo = new JComboBox(races);
      armorField = new JComboBox(armors);
      SheildField = new JComboBox(shields);
      weaponField = new JComboBox(weapons);

      small = new Dimension(30, 30);
      middleboxes = new Dimension(200, 100);
      statBlock = new Dimension(10, 10);

      charField = new JTextField(5);
      wisField = new JTextField(5);
      intField = new JTextField(5);
      conField = new JTextField(5);
      dexField = new JTextField(5);
      strengthField = new JTextField(5);

      empty1 = new JLabel("", JLabel.RIGHT);
      name = new JLabel("Name: ", JLabel.RIGHT);
      charClass = new JLabel("Class: ", JLabel.RIGHT);
      level = new JLabel("Level: ", JLabel.RIGHT);
      alignment = new JLabel("Alignment: ", JLabel.RIGHT);
      gender = new JLabel("Gender: ", JLabel.RIGHT);
      race = new JLabel("Race: ", JLabel.RIGHT);
      descripField = new JLabel("Description: ", JLabel.RIGHT);
      strength = new JLabel("Strength: ", JLabel.RIGHT);
      dex = new JLabel("Dexterity: ", JLabel.RIGHT);
      con = new JLabel("Constitution: ", JLabel.RIGHT);
      intelligence = new JLabel("Intelligence: ", JLabel.RIGHT);
      wisdom = new JLabel("Wisdom: ", JLabel.RIGHT);
      charisma = new JLabel("Charisma: ", JLabel.RIGHT);
      personalityLabel = new JLabel("Personality: ", JLabel.RIGHT);
      idealLabel = new JLabel("Ideals: ", JLabel.RIGHT);
      bondLabel = new JLabel("Bonds: ", JLabel.RIGHT);
      flawLabel = new JLabel("Flaws: ", JLabel.RIGHT);
      ftLabel = new JLabel("Features & Traits: ", JLabel.RIGHT);
      langLabel = new JLabel("Other Skills and Languages", JLabel.CENTER);
      equipmentLabel = new JLabel("Equipment", JLabel.CENTER);
      attackLabel = new JLabel("Attacks and Spellcasting", JLabel.CENTER);
      raceLabel = new JLabel("Race Traits", JLabel.CENTER);
      classLabel = new JLabel("Class Traits", JLabel.CENTER);
      notesLabel = new JLabel("Notes", JLabel.CENTER);
      armor = new JLabel("Armor: ", JLabel.RIGHT);
      shield = new JLabel("Sheild: ", JLabel.RIGHT);
      weapon = new JLabel("Weapons: ", JLabel.RIGHT);
      armorClass = new JLabel("Armor Class: ", JLabel.RIGHT);
      intitive = new JLabel("Intitive: ", JLabel.RIGHT);
      speed = new JLabel("Speed: ", JLabel.RIGHT);
      health = new JLabel("Max Health Points: ", JLabel.RIGHT);
      tempHealth = new JLabel("Temp. Health Points: ", JLabel.RIGHT);
      savingThrows = new JLabel("Saving Throws: ", JLabel.CENTER);
      savingThrowField = new JLabel("", JLabel.RIGHT);
      strengthMod = new JLabel("Strength: ", JLabel.RIGHT);
      dexMod = new JLabel("Dexterity: ", JLabel.RIGHT);
      conMod = new JLabel("Constitution: ", JLabel.RIGHT);
      intelligenceMod = new JLabel("Intelligence: ", JLabel.RIGHT);
      wisdomMod = new JLabel("Wisdom: ", JLabel.RIGHT);
      charismaMod = new JLabel("Charisma: ", JLabel.RIGHT);
      skills = new JLabel("Skills: ", JLabel.CENTER);
      skillField = new JLabel("", JLabel.RIGHT);
      acrobatics = new JLabel("Acrobatics: ", JLabel.RIGHT);
      animalHandling = new JLabel("Animal \nHandling: ", JLabel.RIGHT);
      arcana = new JLabel("Arcana: ", JLabel.RIGHT);
      athletics = new JLabel("Atheltics: ", JLabel.RIGHT);
      deception = new JLabel("Deception: ", JLabel.RIGHT);
      history = new JLabel("History: ", JLabel.RIGHT);
      insight = new JLabel("Insight: ", JLabel.RIGHT);
      intimidation = new JLabel("Intimidation: ", JLabel.RIGHT);
      investigation = new JLabel("Investigation: ", JLabel.RIGHT);
      medicine = new JLabel("Medicine: ", JLabel.RIGHT);
      nature = new JLabel("Nature: ", JLabel.RIGHT);
      perception = new JLabel("Perception: ", JLabel.RIGHT);
      performance = new JLabel("Performance: ", JLabel.RIGHT);
      persuasion = new JLabel("Persuasion: ", JLabel.RIGHT);
      religion = new JLabel("Religion: ", JLabel.RIGHT);
      sleight = new JLabel("Sleight Of \nHand: ", JLabel.RIGHT);
      stealth = new JLabel("Stealth: ", JLabel.RIGHT);
      survival = new JLabel("Survival: ", JLabel.RIGHT);

      personality = new JTextArea(40, 20);
      ideals = new JTextArea(40, 20);
      bonds = new JTextArea(40, 20);
      flaws = new JTextArea(40, 20);
      featuresTraits = new JTextArea(40, 20);
      equipment = new JTextArea(3, 5);
      otherProf = new JTextArea(3, 5);
      attacksSpellcasting = new JTextArea(3, 5);
      raceTraits = new JTextArea(3, 5);
      classTraits = new JTextArea(3, 5);
      notesTA = new JTextArea(3, 5);
      description = new JTextArea(1, 2);

      nameField = new JTextField(10);
      levelField = new JTextField(10);
      alignField = new JTextField(10);
      genderField = new JTextField(10);
      armorClassField = new JTextField(3);
      initField = new JTextField(3);
      speedField = new JTextField(3);
      healthField = new JTextField(3);
      tempHealthField = new JTextField(3);
      strengthFieldMod = new JTextField(5);
      dexFieldMod = new JTextField(5);
      conFieldMod = new JTextField(5);
      intelligenceFieldMod = new JTextField(5);
      wisdomFieldMod = new JTextField(5);
      charismaFieldMod = new JTextField(5);
      acroField = new JTextField(3);
      aHField = new JTextField(3);
      arcField = new JTextField(3);
      athField = new JTextField(3);
      decField = new JTextField(3);
      hisField = new JTextField(3);
      insightField = new JTextField(3);
      intiField = new JTextField(3);
      invesField = new JTextField(3);
      medField = new JTextField(3);
      natureField = new JTextField(3);
      perField = new JTextField(3);
      perfField = new JTextField(3);
      persField = new JTextField(3);
      relField = new JTextField(3);
      sleightField = new JTextField(3);
      stealthField = new JTextField(3);
      surField = new JTextField(3);

      charField.setPreferredSize(new Dimension(small));
      wisField.setPreferredSize(new Dimension(small));
      intField.setPreferredSize(new Dimension(small));
      conField.setPreferredSize(new Dimension(small));
      dexField.setPreferredSize(new Dimension(small));
      strengthField.setPreferredSize(new Dimension(small));
      equipment.setPreferredSize(new Dimension(middleboxes));
      otherProf.setPreferredSize(new Dimension(middleboxes));
      attacksSpellcasting.setPreferredSize(new Dimension(middleboxes));
      raceTraits.setPreferredSize(new Dimension(middleboxes));
      classTraits.setPreferredSize(new Dimension(middleboxes));
      notesTA.setPreferredSize(new Dimension(middleboxes));
      armorField.setPreferredSize(new Dimension(statBlock));
      SheildField.setPreferredSize(new Dimension(statBlock));
      weaponField.setPreferredSize(new Dimension(statBlock));
      armorClassField.setPreferredSize(new Dimension(statBlock));
      initField.setPreferredSize(new Dimension(statBlock));
      speedField.setPreferredSize(new Dimension(statBlock));
      healthField.setPreferredSize(new Dimension(statBlock));

      levelField.setEditable(false);
      strengthFieldMod.setEditable(false);
      dexFieldMod.setEditable(false);
      conFieldMod.setEditable(false);
      intelligenceFieldMod.setEditable(false);
      wisdomFieldMod.setEditable(false);
      charismaFieldMod.setEditable(false);
      acroField.setEditable(false);
      aHField.setEditable(false);
      arcField.setEditable(false);
      athField.setEditable(false);
      decField.setEditable(false);
      hisField.setEditable(false);
      insightField.setEditable(false);
      intiField.setEditable(false);
      invesField.setEditable(false);
      medField.setEditable(false);
      natureField.setEditable(false);
      perField.setEditable(false);
      perfField.setEditable(false);
      persField.setEditable(false);
      relField.setEditable(false);
      sleightField.setEditable(false);
      stealthField.setEditable(false);
      surField.setEditable(false);

      levelField.setText("1");

      /**
       * Add to p1
       */
      p1.add(name); // JLabel
      p1.add(nameField); // JTextField
      p1.add(charClass); // JLabel
      p1.add(classCombo); // JComboBox
      p1.add(level); // JLabel
      p1.add(levelField); // JTextField
      p1.add(alignment); // JLabel
      p1.add(alignField); // JTextField
      p1.add(gender); // JLabel
      p1.add(genderField); // JTextField
      p1.add(race); // JLabel
      p1.add(raceCombo); // JComboBox
      p1.add(descripField); // JLabel
      p1.add(description); // JTextField

      /**
       * Add to p2
       */
      p2.add(strength); // JLabel
      p2.add(strengthField); // JTextField
      p2.add(dex); // JLabel
      p2.add(dexField); // JTextField
      p2.add(con); // JLabel
      p2.add(conField); // JTextField
      p2.add(intelligence); // JLabel
      p2.add(intField); // JTextField
      p2.add(wisdom); // JLabel
      p2.add(wisField); // JTextField
      p2.add(charisma); // JLabel
      p2.add(charField); // JTextField

      /**
       * Add to p3
       */
      p3.add(personalityLabel); // JLabel
      p3.add(personality); // JTextArea
      p3.add(idealLabel); // JLabel
      p3.add(ideals); // JTextArea
      p3.add(bondLabel); // JLabel
      p3.add(bonds); // JTextArea
      p3.add(flawLabel); // JLabel
      p3.add(flaws); // JTextArea
      p3.add(ftLabel); // JLabel
      p3.add(featuresTraits); // JTextArea
      // end of p3

      // All components for p4
      JPanel x1 = new JPanel();
      x1.setPreferredSize(new Dimension(2000, 500));
      x1.setMaximumSize(new Dimension(2000, 700));
      classTraits.setPreferredSize(new Dimension(2000, 500));
      classTraits.setMaximumSize(new Dimension(2000, 700));
      x1.add(classTraits);

      JPanel x2 = new JPanel();
      x2.setPreferredSize(new Dimension(1000, 400));
      x2.setMaximumSize(new Dimension(2000, 700));
      raceTraits.setPreferredSize(new Dimension(1000, 400));
      raceTraits.setMaximumSize(new Dimension(2000, 700));
      x2.add(raceTraits);

      JPanel x3 = new JPanel();
      x3.setPreferredSize(new Dimension(1000, 400));
      x3.setMaximumSize(new Dimension(2000, 700));
      otherProf.setPreferredSize(new Dimension(1000, 400));
      otherProf.setMaximumSize(new Dimension(2000, 700));
      x3.add(otherProf);

      JScrollPane scroll2 = new JScrollPane(x3, JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED, JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
      JScrollPane scroll3 = new JScrollPane(x2, JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED, JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
      JScrollPane scroll4 = new JScrollPane(x1, JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED, JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
      scroll2.setPreferredSize(new Dimension(600, 300));
      scroll2.setMaximumSize(new Dimension(600, 500));
      scroll3.setPreferredSize(new Dimension(600, 300));
      scroll3.setMinimumSize(new Dimension(600, 300));
      scroll3.setMaximumSize(new Dimension(600, 500));
      scroll4.setPreferredSize(new Dimension(600, 300));
      scroll4.setMaximumSize(new Dimension(600, 500));

      p4.setLayout(new BorderLayout());
      p4.add(scroll2, BorderLayout.WEST);
      p4.add(scroll3, BorderLayout.CENTER);
      p4.add(scroll4, BorderLayout.EAST);
      

      p4s.setLayout(new BorderLayout());
      p4s.add(p4, BorderLayout.NORTH);
      p4s.add(langLabel, BorderLayout.WEST); // JLabel
      p4s.add(raceLabel, BorderLayout.CENTER); // JLabel
      p4s.add(classLabel, BorderLayout.EAST); // JLabel
      //p4.add(notesLabel); // JLabel
      // end of p4

      // All components for p7

      p7.add(armor); // JLabel
      p7.add(armorField); // JComboBox
      p7.add(shield); // JLabel
      p7.add(SheildField); // JComboBox
      p7.add(weapon); // JLabel
      p7.add(weaponField); // JComboBox
      p7.add(armorClass); // JLabel
      p7.add(armorClassField); // JTextField
      p7.add(intitive); // JLabel
      p7.add(initField); // JTextField
      p7.add(speed); // JLabel
      p7.add(speedField); // JTextField
      p7.add(health); // JLabel
      p7.add(healthField); // JTextField
      p7.add(tempHealth); // JLabel
      p7.add(tempHealthField); // JTextField
      // end of p7

      // All components for p6
      //p6.add(savingThrows); // JLabel
      //p6.add(savingThrowField);
      p6.add(strengthMod); // JLabel
      p6.add(strengthFieldMod); // JTextField
      p6.add(stBox); // JCheckBox
      p6.add(dexMod); // JLabel
      p6.add(dexFieldMod); // JTextField
      p6.add(dexBox); // JCheckBox
      p6.add(conMod); // JLabel
      p6.add(conFieldMod); // JTextField
      p6.add(conBox); // JCheckBox
      p6.add(intelligenceMod); // JLabel
      p6.add(intelligenceFieldMod); // JTextField
      p6.add(intBox); // JCheckBox
      p6.add(wisdomMod); // JLabel
      p6.add(wisdomFieldMod); // JTextField
      p6.add(wisBox); // JCheckBox
      p6.add(charismaMod); // JLabel
      p6.add(charismaFieldMod); // JTextField
      p6.add(charBox); // JCheckBox
      p6.add(skills); // JLabel
      p6.add(skillField); // JLabel
      p6.add(empty1); // JCheckBox
      p6.add(acrobatics); // JLabel
      p6.add(acroField); // JTextField
      p6.add(acroBox); // JCheckBox
      p6.add(animalHandling); // JLabel
      p6.add(aHField); // JTextField
      p6.add(aHBox); // JCheckBox
      p6.add(arcana); // JLabel
      p6.add(arcField); // JTextField
      p6.add(arcBox); // JCheckBox
      p6.add(athletics); // JLabel
      p6.add(athField); // JTextField
      p6.add(athBox); // JCheckBox
      p6.add(deception); // JLabel
      p6.add(decField); // JTextField
      p6.add(decBox); // JCheckBox
      p6.add(history); // JLabel
      p6.add(hisField); // JTextField
      p6.add(hisBox); // JCheckBox
      p6.add(insight); // JLabel
      p6.add(insightField); // JTextField
      p6.add(insightBox); // JCheckBox
      p6.add(intimidation); // JLabel
      p6.add(intiField); // JTextField
      p6.add(intiBox); // JCheckBox
      p6.add(investigation); // JLabel
      p6.add(invesField); // JTextField
      p6.add(invesBox); // JCheckBox
      p6.add(medicine); // JLabel
      p6.add(medField); // JTextField
      p6.add(medBox); // JCheckBox
      p6.add(nature); // JLabel
      p6.add(natureField); // JTextField
      p6.add(natureBox); // JCheckBox
      p6.add(perception); // JLabel
      p6.add(perField); // JTextField
      p6.add(perBox); // JCheckBox
      p6.add(performance); // JLabel
      p6.add(perfField); // JTextField
      p6.add(perfBox); // JCheckBox
      p6.add(persuasion); // JLabel
      p6.add(persField); // JTextField
      p6.add(persBox); // JCheckBox
      p6.add(religion); // JLabel
      p6.add(relField); // JTextField
      p6.add(relBox); // JCheckBox
      p6.add(sleight); // JLabel
      p6.add(sleightField); // JTextField
      p6.add(sleightBox); // JCheckBox
      p6.add(stealth); // JLabel
      p6.add(stealthField); // JTextField
      p6.add(stealthBox); // JCheckBox
      p6.add(survival); // JLabel
      p6.add(surField); // JTextField
      p6.add(surBox); // JCheckBox
      p5.add(p6); // JPanel
      p5.add(p7); // JPanel

      logic = new CharacterSheetLogic(_charClass, _level, _race, _strength, _dex, _con, _intelligence, _wisdom,
            _charisma, _equipment, _armor, _health, _ac, _sheild);

      /**
       * Assemble GUI
       */
      file.add(save);
      file.add(open);
      mb.add(file);
      mb.add(update);
      mb.add(lvlUp);
      mb.add(lvlDown);
      top.add(menu, BorderLayout.NORTH);
      top.add(p1, BorderLayout.CENTER);
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
      p4.setPreferredSize(new Dimension(1200, 150));
      p4.setMaximumSize(new Dimension(1900, 250));
      p4s.setPreferredSize(new Dimension(1200, 250));
      p4s.setMaximumSize(new Dimension(1900, 250));
      visualInterir.add(p4s);
      p3.setAlignmentX(Component.LEFT_ALIGNMENT);
      p3.setPreferredSize(new Dimension(450, 800));
      p3.setMaximumSize(new Dimension(450, 1000));
      visualInterir.add(p3);
      notesJPanel.setPreferredSize(new Dimension(1000, 400));
      notesJPanel.setMaximumSize(new Dimension(2000, 700));
      notesTA.setPreferredSize(new Dimension(1000, 400));
      notesTA.setMaximumSize(new Dimension(2000, 700));
      notesJPanel.setLayout(new BorderLayout());
      filPanel.setPreferredSize(new Dimension(50, 50));
      notesJPanel.add(notesLabel, BorderLayout.NORTH);
      notesJPanel.add(notesTA, BorderLayout.EAST);
      JScrollPane notesJScrollPane = new JScrollPane(notesJPanel, JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED, JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
      notesJScrollPane.setBorder(BorderFactory.createTitledBorder(""));
      notesJScrollPane.setPreferredSize(new Dimension(600, 300));
      notesJScrollPane.setMaximumSize(new Dimension(600, 500));
      notesJScrollPane.setAlignmentY(Component.RIGHT_ALIGNMENT);
      notesJScrollPane.setAlignmentX(Component.LEFT_ALIGNMENT);
      visualInterir.add(notesJScrollPane);
      visualExterior.setSize(1500, 600);
      visualExterior.setLayout(new BorderLayout());
      visualExterior.add(mb);
      visualExterior.add(visualInterir, BorderLayout.CENTER);
      scroll = new JScrollPane(visualExterior);

      scroll.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
      scroll.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
      scroll.getVerticalScrollBar().setUnitIncrement(16);
      scroll.setSize(1400, 600);

      /*
       * file.setBackground(Color.BLACK); temp1.setBackground(Color.BLACK);
       * visualInterir.setBackground(Color.BLACK); scroll.setBackground(Color.BLACK);
       * visualExterior.setBackground(Color.BLACK); p1.setBackground(Color.BLACK);
       * p2.setBackground(Color.BLACK); p3.setBackground(Color.BLACK);
       * p4.setBackground(Color.BLACK); p5.setBackground(Color.BLACK);
       * p6.setBackground(Color.BLACK); p7.setBackground(Color.BLACK);
       * 
       * acroField.setBackground(Color.BLACK); aHField.setBackground(Color.BLACK);
       * arcField.setBackground(Color.BLACK); athField.setBackground(Color.BLACK);
       * decField.setBackground(Color.BLACK); hisField.setBackground(Color.BLACK);
       * insightField.setBackground(Color.BLACK);
       * intiField.setBackground(Color.BLACK); invesField.setBackground(Color.BLACK);
       * medField.setBackground(Color.BLACK); natureField.setBackground(Color.BLACK);
       * perField.setBackground(Color.BLACK); perfField.setBackground(Color.BLACK);
       * persField.setBackground(Color.BLACK); relField.setBackground(Color.BLACK);
       * sleightField.setBackground(Color.BLACK);
       * stealthField.setBackground(Color.BLACK); surField.setBackground(Color.BLACK);
       * healthField.setBackground(Color.BLACK);
       * tempHealthField.setBackground(Color.BLACK);
       * speedField.setBackground(Color.BLACK); initField.setBackground(Color.BLACK);
       * armorClassField.setBackground(Color.BLACK);
       * 
       * stBox.setBackground(Color.BLACK); dexBox.setBackground(Color.BLACK);
       * conBox.setBackground(Color.BLACK); intBox.setBackground(Color.BLACK);
       * wisBox.setBackground(Color.BLACK); charBox.setBackground(Color.BLACK);
       * acroBox.setBackground(Color.BLACK); aHBox.setBackground(Color.BLACK);
       * arcBox.setBackground(Color.BLACK); athBox.setBackground(Color.BLACK);
       * decBox.setBackground(Color.BLACK); hisBox.setBackground(Color.BLACK);
       * insightBox.setBackground(Color.BLACK); intiBox.setBackground(Color.BLACK);
       * invesBox.setBackground(Color.BLACK); medBox.setBackground(Color.BLACK);
       * natureBox.setBackground(Color.BLACK); perBox.setBackground(Color.BLACK);
       * perfBox.setBackground(Color.BLACK); persBox.setBackground(Color.BLACK);
       * relBox.setBackground(Color.BLACK); sleightBox.setBackground(Color.BLACK);
       * stealthBox.setBackground(Color.BLACK); surBox.setBackground(Color.BLACK);
       * 
       * strengthFieldMod.setBackground(Color.BLACK);
       * dexFieldMod.setBackground(Color.BLACK);
       * conFieldMod.setBackground(Color.BLACK);
       * intelligenceFieldMod.setBackground(Color.BLACK);
       * wisdomFieldMod.setBackground(Color.BLACK);
       * charismaFieldMod.setBackground(Color.BLACK);
       * 
       * mb.setBackground(Color.BLACK); open.setBackground(Color.BLACK);
       * lvlUp.setBackground(Color.BLACK); // lvlDown.setBackground(Color.BLACK);
       * description.setBackground(Color.BLACK);
       * 
       * update.setBackground(Color.BLACK); save.setBackground(Color.BLACK);
       * menu.setBackground(Color.BLACK);
       * 
       * personality.setBackground(Color.BLACK); ideals.setBackground(Color.BLACK);
       * bonds.setBackground(Color.BLACK); flaws.setBackground(Color.BLACK);
       * featuresTraits.setBackground(Color.BLACK);
       * 
       * otherProf.setBackground(Color.BLACK); equipment.setBackground(Color.BLACK);
       * attacksSpellcasting.setBackground(Color.BLACK);
       * raceTraits.setBackground(Color.BLACK);
       * classTraits.setBackground(Color.BLACK); notesTA.setBackground(Color.BLACK);
       */

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
               _ac = Integer.parseInt(armorClassField.getText());
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

            try {
               _conMod = Integer.parseInt(conFieldMod.getText());
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
                  _equipment, _armor, _health, _ac, _sheild, localLevelTracker, lvlOne, lvlTwo, lvlThree, lvlFour,
                  lvlFive, lvlSix, lvlSeven, lvlEight, lvlNine, lvlTen, lvlEleven, lvlTwelve, lvlThirteen, lvlFourteen,
                  lvlFifteen, lvlSixteen, lvlSeventeen, lvlEighteen, lvlNineteen, lvlTwenty, armorRST, acroBoxBool,
                  aHBoxBool, arcBoxBool, athBoxBool, decBoxBool, hisBoxBool, insightBoxBool, intiBoxBool, invesBoxBool,
                  medBoxBool, natureBoxBool, perBoxBool, perfBoxBool, persBoxBool, relBoxBool, sleightBoxBool,
                  stealthBoxBool, surBoxBool);

            logic.RaceSelect();

            _health = logic.health;

            _strength = logic.strength;
            _dex = logic.dex;
            _con = logic.con;
            _intelligence = logic.intelligence;
            _wisdom = logic.wisdom;
            _charisma = logic.charisma;
            //
            _ac = logic.armorClass;
            _initiative = logic.initiative;
            _speed = logic.speed;
            //
            _strengthMod = logic.strengthMod;
            _dexMod = logic.dexMod;
            _conMod = logic.conMod;
            _intelligenceMod = logic.intelligenceMod;
            _wisdomMod = logic.wisdomMod;
            _charismaMod = logic.charismaMod;
            //
            _acrobatics = logic.dexMod;
            _animalHandling = logic.wisdomMod;
            _arcana = logic.intelligenceMod;
            _athletics = logic.strengthMod;
            _deception = logic.charismaMod;
            _history = logic.intelligenceMod;
            _insight = logic.wisdomMod;
            _intimidation = logic.charismaMod;
            _investigation = logic.intelligenceMod;
            _medicine = logic.wisdomMod;
            _nature = logic.intelligenceMod;
            _perception = logic.wisdomMod;
            _performance = logic.charismaMod;
            _persuasion = logic.charismaMod;
            _religion = logic.intelligenceMod;
            _sleight = logic.dexMod;
            _stealth = logic.dexMod;
            _survival = logic.wisdomMod;

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

            speedField.setText(String.valueOf(_speed));
            armorClassField.setText(String.valueOf(_ac));
            healthField.setText(String.valueOf(_health));

            if (_strength > 30) {
               strengthField.setText(String.valueOf(30));
               logic.strength = 30;
            } else {
               strengthField.setText(String.valueOf(_strength));
            }
            if (_dex > 30) {
               dexField.setText(String.valueOf(30));
               logic.dex = 30;
            } else {
               dexField.setText(String.valueOf(_dex));
            }
            if (_con > 30) {
               conField.setText(String.valueOf(30));
               logic.con = 30;
            } else {
               conField.setText(String.valueOf(_con));
            }
            if (_intelligence > 30) {
               intField.setText(String.valueOf(30));
               logic.intelligence = 30;
            } else {
               intField.setText(String.valueOf(_intelligence));
            }
            if (_wisdom > 30) {
               wisField.setText(String.valueOf(30));
               logic.wisdom = 30;
            } else {
               wisField.setText(String.valueOf(_wisdom));
            }
            if (_charisma > 30) {
               charField.setText(String.valueOf(30));
               logic.charisma = 30;
            } else {
               charField.setText(String.valueOf(_charisma));
            }

            if (_strengthMod < 0) {
               if (stBoxBool == true) {
                  _strengthMod = _strengthMod + logic.proficiencyBonus;
                  if (_strengthMod < 0) {
                     strengthFieldMod.setText(String.valueOf(_strengthMod));
                  } else if (_strengthMod > 0) {
                     strengthFieldMod.setText("+" + String.valueOf(_strengthMod));
                  }
               } else {
                  strengthFieldMod.setText(String.valueOf(_strengthMod));
               }
            } else if (_strengthMod > 0) {
               if (stBoxBool == true) {
                  _strengthMod = _strengthMod + logic.proficiencyBonus;
                  strengthFieldMod.setText("+" + String.valueOf(_strengthMod));
               } else {
                  strengthFieldMod.setText("+" + String.valueOf(_strengthMod));
               }
            }

            if (_dexMod < 0) {
               if (dexBoxBool == true) {
                  _dexMod = _dexMod + logic.proficiencyBonus;
                  if (_dexMod < 0) {
                     dexFieldMod.setText(String.valueOf(_dexMod));
                  } else if (_dexMod > 0) {
                     dexFieldMod.setText("+" + String.valueOf(_dexMod));
                  }
               } else {
                  dexFieldMod.setText(String.valueOf(_dexMod));
               }
            } else if (_dexMod > 0) {
               if (dexBoxBool == true) {
                  _dexMod = _dexMod + logic.proficiencyBonus;
                  dexFieldMod.setText("+" + String.valueOf(_dexMod));
               } else {
                  dexFieldMod.setText("+" + String.valueOf(_dexMod));
               }
            }

            if (_conMod < 0) {
               if (conBoxBool == true) {
                  _conMod = _conMod + logic.proficiencyBonus;
                  if (_conMod < 0) {
                     conFieldMod.setText(String.valueOf(_conMod));
                  } else if (_conMod > 0) {
                     conFieldMod.setText("+" + String.valueOf(_conMod));
                  }
               } else {
                  conFieldMod.setText(String.valueOf(_conMod));
               }
            } else if (_conMod > 0) {
               if (conBoxBool == true) {
                  _conMod = _conMod + logic.proficiencyBonus;
                  conFieldMod.setText("+" + String.valueOf(_conMod));
               } else {
                  conFieldMod.setText("+" + String.valueOf(_conMod));
               }
            }

            if (_intelligenceMod < 0) {
               if (intBoxBool == true) {
                  _intelligenceMod = _intelligenceMod + logic.proficiencyBonus;
                  if (_intelligenceMod < 0) {
                     intelligenceFieldMod.setText(String.valueOf(_intelligenceMod));
                  } else if (_intelligenceMod > 0) {
                     intelligenceFieldMod.setText("+" + String.valueOf(_intelligenceMod));
                  }
               } else {
                  intelligenceFieldMod.setText(String.valueOf(_intelligenceMod));
               }
            } else if (_intelligenceMod > 0) {
               if (intBoxBool == true) {
                  _intelligenceMod = _intelligenceMod + logic.proficiencyBonus;
                  intelligenceFieldMod.setText("+" + String.valueOf(_intelligenceMod));
               } else {
                  intelligenceFieldMod.setText("+" + String.valueOf(_intelligenceMod));
               }
            }

            if (_wisdomMod < 0) {
               if (wisBoxBool == true) {
                  _wisdomMod = _wisdomMod + logic.proficiencyBonus;
                  if (_wisdomMod < 0) {
                     wisdomFieldMod.setText(String.valueOf(_wisdomMod));
                  } else if (_wisdomMod > 0) {
                     wisdomFieldMod.setText("+" + String.valueOf(_wisdomMod));
                  }
               } else {
                  wisdomFieldMod.setText(String.valueOf(_wisdomMod));
               }
            } else if (_wisdomMod > 0) {
               if (wisBoxBool == true) {
                  _wisdomMod = _wisdomMod + logic.proficiencyBonus;
                  wisdomFieldMod.setText("+" + String.valueOf(_wisdomMod));
               } else {
                  wisdomFieldMod.setText("+" + String.valueOf(_wisdomMod));
               }
            }

            if (_charismaMod < 0) {
               if (charBoxBool == true) {
                  _charismaMod = _charismaMod + logic.proficiencyBonus;
                  if (_charismaMod < 0) {
                     charismaFieldMod.setText(String.valueOf(_charismaMod));
                  } else if (_charismaMod > 0) {
                     charismaFieldMod.setText("+" + String.valueOf(_charismaMod));
                  }
               } else {
                  charismaFieldMod.setText(String.valueOf(_charismaMod));
               }
            } else if (_charismaMod > 0) {
               if (charBoxBool == true) {
                  _charismaMod = _charismaMod + logic.proficiencyBonus;
                  charismaFieldMod.setText("+" + String.valueOf(_charismaMod));
               } else {
                  charismaFieldMod.setText("+" + String.valueOf(_charismaMod));
               }
            }
            ////////////////////////////////////////////////////////////////////////////////////////////
            if (_acrobatics < 0) {
               if (acroBoxBool == true) {
                  _acrobatics = _acrobatics + logic.proficiencyBonus;
                  if (_acrobatics < 0) {
                     acroField.setText(String.valueOf(_acrobatics));
                  } else if (_acrobatics > 0) {
                     acroField.setText("+" + String.valueOf(_acrobatics));
                  }
               } else {
                  acroField.setText(String.valueOf(_acrobatics));
               }
            } else if (_acrobatics > 0) {
               if (acroBoxBool == true) {
                  _acrobatics = _acrobatics + logic.proficiencyBonus;
                  acroField.setText("+" + String.valueOf(_acrobatics));
               } else {
                  acroField.setText("+" + String.valueOf(_acrobatics));
               }
            }

            if (_animalHandling < 0) {
               if (aHBoxBool == true) {
                  _animalHandling = _animalHandling + logic.proficiencyBonus;
                  if (_animalHandling < 0) {
                     aHField.setText(String.valueOf(_animalHandling));
                  } else if (_animalHandling > 0) {
                     aHField.setText("+" + String.valueOf(_animalHandling));
                  }
               } else {
                  aHField.setText(String.valueOf(_animalHandling));
               }
            } else if (_animalHandling > 0) {
               if (aHBoxBool == true) {
                  _animalHandling = _animalHandling + logic.proficiencyBonus;
                  aHField.setText("+" + String.valueOf(_animalHandling));
               } else {
                  aHField.setText("+" + String.valueOf(_animalHandling));
               }
            }

            if (_arcana < 0) {
               if (arcBoxBool == true) {
                  _arcana = _arcana + logic.proficiencyBonus;
                  if (_arcana < 0) {
                     arcField.setText(String.valueOf(_arcana));
                  } else if (_arcana > 0) {
                     arcField.setText("+" + String.valueOf(_arcana));
                  }
               } else {
                  arcField.setText(String.valueOf(_arcana));
               }
            } else if (_arcana > 0) {
               if (arcBoxBool == true) {
                  _arcana = _arcana + logic.proficiencyBonus;
                  arcField.setText("+" + String.valueOf(_arcana));
               } else {
                  arcField.setText("+" + String.valueOf(_arcana));
               }
            }

            if (_athletics < 0) {
               if (athBoxBool == true) {
                  _athletics = _athletics + logic.proficiencyBonus;
                  if (_athletics < 0) {
                     athField.setText(String.valueOf(_athletics));
                  } else if (_athletics > 0) {
                     athField.setText("+" + String.valueOf(_athletics));
                  }
               } else {
                  athField.setText(String.valueOf(_athletics));
               }
            } else if (_athletics > 0) {
               if (athBoxBool == true) {
                  _athletics = _athletics + logic.proficiencyBonus;
                  athField.setText("+" + String.valueOf(_athletics));
               } else {
                  athField.setText("+" + String.valueOf(_athletics));
               }
            }

            if (_deception < 0) {
               if (decBoxBool == true) {
                  _deception = _deception + logic.proficiencyBonus;
                  if (_deception < 0) {
                     decField.setText(String.valueOf(_deception));
                  } else if (_deception > 0) {
                     decField.setText("+" + String.valueOf(_deception));
                  }
               } else {
                  decField.setText(String.valueOf(_deception));
               }
            } else if (_deception > 0) {
               if (decBoxBool == true) {
                  _deception = _deception + logic.proficiencyBonus;
                  decField.setText("+" + String.valueOf(_deception));
               } else {
                  decField.setText("+" + String.valueOf(_deception));
               }
            }

            if (_history < 0) {
               if (hisBoxBool == true) {
                  _history = _history + logic.proficiencyBonus;
                  if (_history < 0) {
                     hisField.setText(String.valueOf(_history));
                  } else if (_history > 0) {
                     hisField.setText("+" + String.valueOf(_history));
                  }
               } else {
                  hisField.setText(String.valueOf(_history));
               }
            } else if (_history > 0) {
               if (hisBoxBool == true) {
                  _history = _history + logic.proficiencyBonus;
                  hisField.setText("+" + String.valueOf(_history));
               } else {
                  hisField.setText("+" + String.valueOf(_history));
               }
            }

            if (_insight < 0) {
               if (insightBoxBool == true) {
                  _insight = _insight + logic.proficiencyBonus;
                  if (_insight < 0) {
                     insightField.setText(String.valueOf(_insight));
                  } else if (_insight > 0) {
                     insightField.setText("+" + String.valueOf(_insight));
                  }
               } else {
                  insightField.setText(String.valueOf(_insight));
               }
            } else if (_insight > 0) {
               if (insightBoxBool == true) {
                  _insight = _insight + logic.proficiencyBonus;
                  insightField.setText("+" + String.valueOf(_insight));
               } else {
                  insightField.setText("+" + String.valueOf(_insight));
               }
            }

            if (_intimidation < 0) {
               intiField.setText(String.valueOf(_intimidation));
            } else {
               intiField.setText("+" + String.valueOf(_intimidation));
            }
            if (_intimidation < 0) {
               if (intiBoxBool == true) {
                  _intimidation = _intimidation + logic.proficiencyBonus;
                  if (_intimidation < 0) {
                     intiField.setText(String.valueOf(_intimidation));
                  } else if (_intimidation > 0) {
                     intiField.setText("+" + String.valueOf(_intimidation));
                  }
               } else {
                  intiField.setText(String.valueOf(_intimidation));
               }
            } else if (_intimidation > 0) {
               if (intiBoxBool == true) {
                  _intimidation = _intimidation + logic.proficiencyBonus;
                  intiField.setText("+" + String.valueOf(_intimidation));
               } else {
                  intiField.setText("+" + String.valueOf(_intimidation));
               }
            }

            if (_investigation < 0) {
               if (invesBoxBool == true) {
                  _investigation = _investigation + logic.proficiencyBonus;
                  if (_investigation < 0) {
                     invesField.setText(String.valueOf(_investigation));
                  } else if (_investigation > 0) {
                     invesField.setText("+" + String.valueOf(_investigation));
                  }
               } else {
                  invesField.setText(String.valueOf(_investigation));
               }
            } else if (_investigation > 0) {
               if (invesBoxBool == true) {
                  _investigation = _investigation + logic.proficiencyBonus;
                  invesField.setText("+" + String.valueOf(_investigation));
               } else {
                  invesField.setText("+" + String.valueOf(_investigation));
               }
            }

            if (_medicine < 0) {
               if (medBoxBool == true) {
                  _medicine = _medicine + logic.proficiencyBonus;
                  if (_medicine < 0) {
                     medField.setText(String.valueOf(_medicine));
                  } else if (_medicine > 0) {
                     medField.setText("+" + String.valueOf(_medicine));
                  }
               } else {
                  medField.setText(String.valueOf(_medicine));
               }
            } else if (_medicine > 0) {
               if (medBoxBool == true) {
                  _medicine = _medicine + logic.proficiencyBonus;
                  medField.setText("+" + String.valueOf(_medicine));
               } else {
                  medField.setText("+" + String.valueOf(_medicine));
               }
            }

            if (_nature < 0) {
               if (natureBoxBool == true) {
                  _nature = _nature + logic.proficiencyBonus;
                  if (_nature < 0) {
                     natureField.setText(String.valueOf(_nature));
                  } else if (_nature > 0) {
                     natureField.setText("+" + String.valueOf(_nature));
                  }
               } else {
                  natureField.setText(String.valueOf(_nature));
               }
            } else if (_nature > 0) {
               if (natureBoxBool == true) {
                  _nature = _nature + logic.proficiencyBonus;
                  natureField.setText("+" + String.valueOf(_nature));
               } else {
                  natureField.setText("+" + String.valueOf(_nature));
               }
            }

            if (_perception < 0) {
               if (perBoxBool == true) {
                  _perception = _perception + logic.proficiencyBonus;
                  if (_perception < 0) {
                     perField.setText(String.valueOf(_perception));
                  } else if (_perception > 0) {
                     perField.setText("+" + String.valueOf(_perception));
                  }
               } else {
                  perField.setText(String.valueOf(_perception));
               }
            } else if (_perception > 0) {
               if (perBoxBool == true) {
                  _perception = _perception + logic.proficiencyBonus;
                  perField.setText("+" + String.valueOf(_perception));
               } else {
                  perField.setText("+" + String.valueOf(_perception));
               }
            }

            if (_performance < 0) {
               if (perfBoxBool == true) {
                  _performance = _performance + logic.proficiencyBonus;
                  if (_performance < 0) {
                     perfField.setText(String.valueOf(_performance));
                  } else if (_performance > 0) {
                     perfField.setText("+" + String.valueOf(_performance));
                  }
               } else {
                  perfField.setText(String.valueOf(_performance));
               }
            } else if (_performance > 0) {
               if (perfBoxBool == true) {
                  _performance = _performance + logic.proficiencyBonus;
                  perfField.setText("+" + String.valueOf(_performance));
               } else {
                  perfField.setText("+" + String.valueOf(_performance));
               }
            }

            if (_persuasion < 0) {
               if (persBoxBool == true) {
                  _persuasion = _persuasion + logic.proficiencyBonus;
                  if (_persuasion < 0) {
                     persField.setText(String.valueOf(_persuasion));
                  } else if (_persuasion > 0) {
                     persField.setText("+" + String.valueOf(_persuasion));
                  }
               } else {
                  persField.setText(String.valueOf(_persuasion));
               }
            } else if (_persuasion > 0) {
               if (persBoxBool == true) {
                  _persuasion = _persuasion + logic.proficiencyBonus;
                  persField.setText("+" + String.valueOf(_persuasion));
               } else {
                  persField.setText("+" + String.valueOf(_persuasion));
               }
            }

            if (_religion < 0) {
               if (relBoxBool == true) {
                  _religion = _religion + logic.proficiencyBonus;
                  if (_religion < 0) {
                     relField.setText(String.valueOf(_religion));
                  } else if (_religion > 0) {
                     relField.setText("+" + String.valueOf(_religion));
                  }
               } else {
                  relField.setText(String.valueOf(_religion));
               }
            } else if (_religion > 0) {
               if (relBoxBool == true) {
                  _religion = _religion + logic.proficiencyBonus;
                  relField.setText("+" + String.valueOf(_religion));
               } else {
                  relField.setText("+" + String.valueOf(_religion));
               }
            }

            if (_sleight < 0) {
               if (sleightBoxBool == true) {
                  _sleight = _sleight + logic.proficiencyBonus;
                  if (_sleight < 0) {
                     sleightField.setText(String.valueOf(_sleight));
                  } else if (_sleight > 0) {
                     sleightField.setText("+" + String.valueOf(_sleight));
                  }
               } else {
                  sleightField.setText(String.valueOf(_sleight));
               }
            } else if (_sleight > 0) {
               if (sleightBoxBool == true) {
                  _sleight = _sleight + logic.proficiencyBonus;
                  sleightField.setText("+" + String.valueOf(_sleight));
               } else {
                  sleightField.setText("+" + String.valueOf(_sleight));
               }
            }

            if (_stealth < 0) {
               if (stealthBoxBool == true) {
                  _stealth = _stealth + logic.proficiencyBonus;
                  if (_stealth < 0) {
                     stealthField.setText(String.valueOf(_stealth));
                  } else if (_stealth > 0) {
                     stealthField.setText("+" + String.valueOf(_stealth));
                  }
               } else {
                  stealthField.setText(String.valueOf(_stealth));
               }
            } else if (_stealth > 0) {
               if (stealthBoxBool == true) {
                  _stealth = _stealth + logic.proficiencyBonus;
                  stealthField.setText("+" + String.valueOf(_stealth));
               } else {
                  stealthField.setText("+" + String.valueOf(_stealth));
               }
            }

            if (_survival < 0) {
               if (surBoxBool == true) {
                  _survival = _survival + logic.proficiencyBonus;
                  if (_survival < 0) {
                     surField.setText(String.valueOf(_survival));
                  } else if (_survival > 0) {
                     surField.setText("+" + String.valueOf(_survival));
                  }
               } else {
                  surField.setText(String.valueOf(_survival));
               }
            } else if (_survival > 0) {
               if (surBoxBool == true) {
                  _survival = _survival + logic.proficiencyBonus;
                  surField.setText("+" + String.valueOf(_survival));
               } else {
                  surField.setText("+" + String.valueOf(_survival));
               }
            }
            String t1 = "Armor Proficiencies: ";
            for(int i = 0; i < logic.armorProficencies.size(); i++){
               String local = logic.armorProficencies.get(i);
               if(i == logic.armorProficencies.size() - 1){
                  t1 = t1 + local;
               }else{
                  t1 = t1 + local + ", ";
               }
            }

            String t2 = "Class Features: ";
            for(int i = 0; i < logic.classFeatures.length; i++){
               String local;
               local = logic.classFeatures[i];
               if(local != null){
                  t2 = t2 + "\n   -- " + local;
               }
            }
            classTraits.setText(t2);

            String t3 = "Race Traits: ";
            for(int i = 0; i < logic.raceTrait.size(); i++){
               String local = logic.raceTrait.get(i);
                  t3 = t3 + "\n   -- " + local;
            }
            raceTraits.setText(t3);

            String t4 = "Known Languages: ";
            for(int i = 0; i < logic.languages.size(); i++){
               String local = logic.languages.get(i);
               t4 = t4 + "\n   -- " + local;
            }
            otherProf.setText(t4);

            lvlOne = true;
            armorRST = true;
         }
      };

      ActionListener saveListener = new ActionListener() {
         @Override
         public void actionPerformed(ActionEvent fexplor) {
            String _fileName = "";

            logic.update(_charClass, _level, _race, _strength, _dex, _con, _intelligence, _wisdom, _charisma,
                  _equipment, _armor, _health, _ac, _sheild, localLevelTracker, lvlOne, lvlTwo, lvlThree, lvlFour,
                  lvlFive, lvlSix, lvlSeven, lvlEight, lvlNine, lvlTen, lvlEleven, lvlTwelve, lvlThirteen, lvlFourteen,
                  lvlFifteen, lvlSixteen, lvlSeventeen, lvlEighteen, lvlNineteen, lvlTwenty, armorRST, acroBoxBool,
                  aHBoxBool, arcBoxBool, athBoxBool, decBoxBool, hisBoxBool, insightBoxBool, intiBoxBool, invesBoxBool,
                  medBoxBool, natureBoxBool, perBoxBool, perfBoxBool, persBoxBool, relBoxBool, sleightBoxBool,
                  stealthBoxBool, surBoxBool);

            if (fexplor.getSource() == save) {
               JFileChooser fc = new JFileChooser();
               fc.setDialogTitle("Specify a file to save"); 
               int userSelection = fc.showSaveDialog(top);

               if (userSelection == JFileChooser.APPROVE_OPTION) {
                  // This is where a real application would open the file.
                     File fileToSave = fc.getSelectedFile();
                     _fileName = fileToSave.getAbsolutePath();
                     System.out.println("Save as file: " + fileToSave.getAbsolutePath());

                  try {
                     JSONWriter json = new JSONWriter(_name, _charClass, _level, _alignment, _race, _gender,
                           _description, _strength, _dex, _con, _intelligence, _wisdom, _charisma, _strengthMod,
                           _dexMod, _conMod, _intelligenceMod, _wisdomMod, _charismaMod, _acrobatics, _animalHandling,
                           _arcana, _athletics, _deception, _history, _insight, _intimidation, _investigation,
                           _medicine, _nature, _perception, _performance, _persuasion, _religion, _sleight, _stealth,
                           _survival, stBoxBool, dexBoxBool, conBoxBool, intBoxBool, wisBoxBool, charBoxBool,
                           acroBoxBool, aHBoxBool, arcBoxBool, athBoxBool, decBoxBool, hisBoxBool, insightBoxBool,
                           intiBoxBool, invesBoxBool, medBoxBool, natureBoxBool, perBoxBool, perfBoxBool, persBoxBool,
                           relBoxBool, sleightBoxBool, stealthBoxBool, surBoxBool, _ac, _initiative, _speed, _health,
                           _tempHealth, _personality, _ideals, _bonds, _flaws, _featuresTraits, _armor, _otherProf,
                           _equipment, _sheild, _attacksSpellcasting, _raceTraits, _classTraits, _notesTA,
                           _numcantripsKnown, _numspellsKnown, _numfirstlvl, _numsecondlvl, _numthirdlvl, _numfourthlvl,
                           _numfithlvl, _numsixthlvl, _numseventhlvl, _numeigthlvl, _numninethlvl, _fileName);
                  } catch (FileNotFoundException e1) {
                     System.out.println("oll");
                     e1.printStackTrace();
                  } catch (UnsupportedEncodingException e1) {
                     System.out.println("adf1`");
                     e1.printStackTrace();
                  }
               }
            }
            System.out.println("last"); // testing

         }
      };

      ActionListener fileOpen = new ActionListener() {
         @Override
         public void actionPerformed(ActionEvent fexplor) {
            JSONReader jsr = new JSONReader();
            // Handle open button action.
            System.out.println(fexplor.getSource()); // testing
            if (fexplor.getSource() == open) {
               JFileChooser fc = new JFileChooser();
               int returnVal = fc.showOpenDialog(top);

               if (returnVal == JFileChooser.APPROVE_OPTION) {
                  File file = fc.getSelectedFile();
                  // This is where a real application would open the file.
                  System.out.println("Opening: " + file.getName() + ".");
                  jsr.Load(file.getAbsolutePath());
               }
            }
         }
      };

      ActionListener levelUp = new ActionListener() {
         @Override
         public void actionPerformed(ActionEvent lvl) {

            int temp = Integer.parseInt(levelField.getText());
            System.out.println(temp); // testing
            System.out.println(lvlOne); // testing

            if (temp < 20) {
               try {
                  levelField.setText(String.valueOf(temp + 1));
               } catch (NumberFormatException nfe) {
               }
               localLevelTracker++;
               if (temp >= 1) {
                  update.doClick();
                  if (temp == 0) {
                     System.out.println("OWO fucky wucky");
                  }
               }
            } else {
               System.out.println("UvU stop weveling youwu are alwady mwax!!!!");
            }
            switch (localLevelTracker) {
               case 2:
                  lvlTwo = true;
                  break;
               case 3:
                  lvlThree = true;
                  break;
               case 4:
                  lvlFour = true;
                  break;
               case 5:
                  lvlFive = true;
                  break;
               case 6:
                  lvlSix = true;
                  break;
               case 7:
                  lvlSeven = true;
                  break;
               case 8:
                  lvlEight = true;
                  break;
               case 9:
                  lvlNine = true;
                  break;
               case 10:
                  lvlTen = true;
                  break;
               case 11:
                  lvlEleven = true;
                  break;
               case 12:
                  lvlTwelve = true;
                  break;
               case 13:
                  lvlThirteen = true;
                  break;
               case 14:
                  lvlFourteen = true;
                  break;
               case 15:
                  lvlFifteen = true;
                  break;
               case 16:
                  lvlSixteen = true;
                  break;
               case 17:
                  lvlSeventeen = true;
                  break;
               case 18:
                  lvlEighteen = true;
                  break;
               case 19:
                  lvlNineteen = true;
                  break;
               case 20:
                  lvlTwenty = true;
                  break;
            }

            CharacterSheetLogic LL = new CharacterSheetLogic(_charClass, _level, _race, _strength, _dex, _con,
                  _intelligence, _wisdom, _charisma); // testing
            temp = Integer.parseInt(levelField.getText());

            System.out.println(temp); // testing
            System.out.println(lvlOne); // testing
         }
      };

      ActionListener levelDown = new ActionListener() {
         @Override
         public void actionPerformed(ActionEvent lvl) {
            int temp = Integer.parseInt(levelField.getText());

            if (temp > 1) {
               levelField.setText(String.valueOf(temp - 1));
               localLevelTracker--;

            } else {
               System.out.println("UvU stop weveling youwu are alwady min!!!!");
            }
            update.doClick();
            switch (localLevelTracker) {
               case 2:
                  lvlTwo = false;
                  break;
               case 3:
                  lvlThree = false;
                  break;
               case 4:
                  lvlFour = false;
                  break;
               case 5:
                  lvlFive = false;
                  break;
               case 6:
                  lvlSix = false;
                  break;
               case 7:
                  lvlSeven = false;
                  break;
               case 8:
                  lvlEight = false;
                  break;
               case 9:
                  lvlNine = false;
                  break;
               case 10:
                  lvlTen = false;
                  break;
               case 11:
                  lvlEleven = false;
                  break;
               case 12:
                  lvlTwelve = false;
                  break;
               case 13:
                  lvlThirteen = false;
                  break;
               case 14:
                  lvlFourteen = false;
                  break;
               case 15:
                  lvlFifteen = false;
                  break;
               case 16:
                  lvlSixteen = false;
                  break;
               case 17:
                  lvlSeventeen = false;
                  break;
               case 18:
                  lvlEighteen = false;
                  break;
               case 19:
                  lvlNineteen = false;
                  break;
               case 20:
                  lvlTwenty = false;
                  break;
            }

         }
      };

      ActionListener rstForClassChainge = new ActionListener() {
         @Override
         public void actionPerformed(ActionEvent e) {
            lvlOne = false;
            levelField.setText(String.valueOf(1));
            System.out.println(lvlOne);

         }
      };

      ActionListener armorReset = new ActionListener() {
         @Override
         public void actionPerformed(ActionEvent e) {
            armorRST = false;
            levelField.setText(String.valueOf(1));
            System.out.println(lvlOne);

         }
      };

      update.addActionListener(updateListener);
      save.addActionListener(saveListener);
      open.addActionListener(fileOpen);
      lvlUp.addActionListener(levelUp);
      lvlDown.addActionListener(levelDown);
      classCombo.addActionListener(rstForClassChainge);
      armorField.addActionListener(armorReset);

   }

   public static void main(String[] args) {
      CharacterSheetV3 frame = new CharacterSheetV3();
   }

}