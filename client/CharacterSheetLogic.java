import java.util.ArrayList;
import java.util.Random;

public class CharacterSheetLogic {
   /**
    * @author Julian Mato-Hernandez
    */

   public static final char[] Intitive = null;
   private String charClass;
   private int level;
   private String race;

   protected int strength;
   protected int dex;
   protected int con;
   protected int intelligence;
   protected int wisdom;
   protected int charisma;

   protected int strengthMod;
   protected int dexMod;
   protected int conMod;
   protected int intelligenceMod;
   protected int wisdomMod;
   protected int charismaMod;

   protected int acrobatics;
   protected int animalHandling;
   protected int arcana;
   protected int athletics;
   protected int deception;
   protected int history;
   protected int insight;
   protected int intimidation;
   protected int investigation;
   protected int medicine;
   protected int nature;
   protected int perception;
   protected int performance;
   protected int persuasion;
   protected int religion;
   protected int sleight;
   protected int stealth;
   protected int survival;

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

   protected int armorClass;
   protected int initiative;
   protected int speed;
   protected int baseSpeed;
   protected int health;
   protected int baseHealth;
   protected int proficiencyBonus; // not implemented in GUI
   protected int darkvision; // not implemented in GUI

   private String armor;
   private String armorWeight; // not implemented in GUI
   protected String shield;

   protected String attacksSpellcasting;
   protected String equipment;
   protected ArrayList<String> raceTrait = new ArrayList<String>();
   protected ArrayList<String> languages = new ArrayList<String>();
   protected String[] classFeatures = new String[15];
   //protected ArrayList<String> classFeatures = new ArrayList<String>();


   protected ArrayList<String> armorProficencies = new ArrayList<String>();
   protected ArrayList<String> weaponProficencies = new ArrayList<String>();
   protected ArrayList<String> toolProficencies = new ArrayList<String>();

   protected String savingThrows; // not implemented in GUI
   protected String hitDice; // not implemented in GUI
   protected String skills; // not implemented in GUI

   /* spell data */
   protected int cantripsKnown; // not implemented in GUI
   protected int spellsKnown; // not implemented in GUI
   protected int firstlvl; // not implemented in GUI
   protected int secondlvl; // not implemented in GUI
   protected int thirdlvl; // not implemented in GUI
   protected int fourthlvl; // not implemented in GUI
   protected int fithlvl; // not implemented in GUI
   protected int sixthlvl; // not implemented in GUI
   protected int seventhlvl; // not implemented in GUI
   protected int eigthlvl; // not implemented in GUI
   protected int ninethlvl; // not implemented in GUI

   private int locallvl;

   private boolean lvlOne;
   private boolean lvlTwo;
   private boolean lvlThree;
   private boolean lvlFour;
   private boolean lvlFive;
   private boolean lvlSix;
   private boolean lvlSeven;
   private boolean lvlEight;
   private boolean lvlNine;
   private boolean lvlTen;
   private boolean lvlEleven;
   private boolean lvlTwelve;
   private boolean lvlThirteen;
   private boolean lvlFourteen;
   private boolean lvlFifteen;
   private boolean lvlSixteen;
   private boolean lvlSeventeen;
   private boolean lvlEighteen;
   private boolean lvlNineteen;
   private boolean lvlTwenty;

   private boolean armorRST;

   Random rand = new Random();

   ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

   public CharacterSheetLogic(String _charClass, int _level, String _race, int _strength, int _dex, int _con,
         int _intelligence, int _wisdom, int _charisma, String _equipment, String _armor, int health, int _ac,
         String _sheild) {

      charClass = _charClass;
      level = _level;
      race = _race;
      strength = _strength;
      dex = _dex;
      con = _con;
      intelligence = _intelligence;
      wisdom = _wisdom;
      charisma = _charisma;
      equipment = _equipment;
      // attacksSpellcasting = _attacksSpellcasting;
      armor = _armor;
      armorClass = _ac;
      shield = _sheild;
   }

   public CharacterSheetLogic(String _charClass, int _level, String _race, int _strength, int _dex, int _con,
         int _intelligence, int _wisdom, int _charisma) {

      System.out.println(_charClass + "     " + _level + "     " + _race + "     " + _strength + "     " + _dex
            + "     " + _con + "     " + _intelligence + "     " + _wisdom + "     " + _charisma);
   }

   public void update(String _charClass, int _level, String _race, int _strength, int _dex, int _con, int _intelligence,
         int _wisdom, int _charisma, String _equipment, String _armor, int health, int _ac, String _sheild,
         int _locallvl, boolean _lvlOne, boolean _lvlTwo, boolean _lvlThree, boolean _lvlFour, boolean _lvlFive,
         boolean _lvlSix, boolean _lvlSeven, boolean _lvlEight, boolean _lvlNine, boolean _lvlTen, boolean _lvlEleven,
         boolean _lvlTwelve, boolean _lvlThirteen, boolean _lvlFourteen, boolean _lvlFifteen, boolean _lvlSixteen,
         boolean _lvlSeventeen, boolean _lvlEighteen, boolean _lvlNineteen, boolean _lvlTwenty, boolean _armorRST,
         boolean _acrobaticsProficiency, boolean _animalHandlingProficiency, boolean _arcanaProficiency,
         boolean _athleticsProficiency, boolean _deceptionProficiency, boolean _historyProficiency,
         boolean _insightProficiency, boolean _intimidationProficiency, boolean _investigationProficiency,
         boolean _medicineProficiency, boolean _natureProficiency, boolean _perceptionProficiency,
         boolean _performanceProficiency, boolean _persuasionProficiency, boolean _religionProficiency,
         boolean _sleightProficiency, boolean _stealthProficiency, boolean _survivalProficiency) {
      charClass = _charClass;
      level = _level;
      race = _race;
      strength = _strength;
      dex = _dex;
      con = _con;
      intelligence = _intelligence;
      wisdom = _wisdom;
      charisma = _charisma;
      equipment = _equipment;
      // attacksSpellcasting = _attacksSpellcasting;
      armor = _armor;
      armorClass = _ac;
      shield = _sheild;

      locallvl = _locallvl;

      lvlOne = _lvlOne;
      lvlTwo = _lvlTwo;
      lvlThree = _lvlThree;
      lvlFour = _lvlFour;
      lvlFive = _lvlFive;
      lvlSix = _lvlSix;
      lvlSeven = _lvlSeven;
      lvlEight = _lvlEight;
      lvlNine = _lvlNine;
      lvlTen = _lvlTen;
      lvlEleven = _lvlEleven;
      lvlTwelve = _lvlTwelve;
      lvlThirteen = _lvlThirteen;
      lvlFourteen = _lvlFourteen;
      lvlFifteen = _lvlFifteen;
      lvlSixteen = _lvlSixteen;
      lvlSeventeen = _lvlSeventeen;
      lvlEighteen = _lvlEighteen;
      lvlNineteen = _lvlNineteen;
      lvlTwenty = _lvlTwenty;

      armorRST = _armorRST;

      acrobaticsProficiency = _acrobaticsProficiency;
      animalHandlingProficiency = _animalHandlingProficiency;
      arcanaProficiency = _arcanaProficiency;
      athleticsProficiency = _athleticsProficiency;
      deceptionProficiency = _deceptionProficiency;
      historyProficiency = _historyProficiency;
      insightProficiency = _insightProficiency;
      intimidationProficiency = _intimidationProficiency;
      investigationProficiency = _investigationProficiency;
      medicineProficiency = _medicineProficiency;
      natureProficiency = _natureProficiency;
      perceptionProficiency = _perceptionProficiency;
      performanceProficiency = _performanceProficiency;
      persuasionProficiency = _persuasionProficiency;
      religionProficiency = _religionProficiency;
      sleightProficiency = _sleightProficiency;
      stealthProficiency = _stealthProficiency;
      survivalProficiency = _survivalProficiency;

   }
   ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

   public void RaceSelect() {

      if (race.equalsIgnoreCase("Dwarf")) {
         if (level == 1) {
            Dwarf();
         } else {
            DwarfByLevel();
         }
      } else if (race.equalsIgnoreCase("Elf")) {
         if (level == 1) {
            Elf();
         } else {
            ElfByLevel();
         }
      } else if (race.equalsIgnoreCase("Halfling")) {
         if (level == 1) {
            Halfling();
         } else {
            HalflingByLevel();
         }
      } else if (race.equalsIgnoreCase("Human")) {
         if (level == 1) {
            Human();
         } else {
            HumanByLevel();
         }
      } else if (race.equalsIgnoreCase("Dragonborn")) {
         if (level == 1) {
            Dragonborn();
         } else {
            DragonbornByLevel();
         }
      } else if (race.equalsIgnoreCase("Gnome")) {
         if (level == 1) {
            Gnome();
         } else {
            GnomeByLevel();
         }
      } else if (race.equalsIgnoreCase("Half-Elf")) {
         if (level == 1) {
            HalfElf();
         } else {
            HalfElfByLevel();
         }
      } else if (race.equalsIgnoreCase("HalfOrk")) {
         if (level == 1) {
            HalfOrk();
         } else {
            HalfOrkByLevel();
         }
      } else if (race.equalsIgnoreCase("Tiefling")) {
         if (level == 1) {
            Tiefling();
         } else {
            TieflingByLevel();
         }
      }
   }
   ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

   public void Dwarf() {
      languages.clear();
      raceTrait.clear();
      raceTrait.add("Dwarven Resilience - You have advantage on saving throws against poison, and you have resistance against poison damage.");
      raceTrait.add("Dwarven Combat Training - You have proficiency with the battleaxe, handaxe, throwing hammer, and warhammer.");
      raceTrait.add("Tool Proficiency - You gain proficiency with the artisans tools of your choice: smiths tools, brewers supplies, or masons tools.");
      raceTrait.add("Stonecunning - Whenever you make an Intelligence (History) check related to the origin of stonework, you are considered proficient in the History skill and add double your proficiency bonus to the check, instead of your normal proficiency bonus.");

      con = con + 2;
      baseSpeed = 25;

      languages.add("Common");
      languages.add("Dwarvish");

      Classes();
      AbilityMods();
   }

   public void DwarfByLevel() {

      Classes();
      AbilityMods();

   }

   /*---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------*/

   public void Elf() {
      languages.clear();
      raceTrait.clear();
      raceTrait.add("Keen Senses - You have proficiency in the Perception skill.");
      raceTrait.add("Fey Ancestry - You have advantage on saving throws against being charmed, and magic cant put you to sleep.");
      raceTrait.add("Trance. Elves dont need to sleep. Instead, they meditate deeply, remaining semiconscious, for 4 hours a day. (The Common word for such meditation is trance.) While meditating, you can dream after a fashion; such dreams are actually mental exercises that have become reflexive through years o f practice. After resting in this way, you gain the same benefit that a human does from 8 hours o f sleep.");

      dex = dex + 2;
      baseSpeed = 30;
      darkvision = 60;

      languages.add("Common");
      languages.add("Elvish");

      Classes();
      AbilityMods();
   }

   public void ElfByLevel() {

      Classes();
      AbilityMods();

   }

   /*---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------*/

   public void Halfling() {
      languages.clear();
      raceTrait.clear();
      raceTrait.add("Lucky - When you roll a 1 on an attack roll, ability check, or saving throw, you can reroll the die and must use the new roll.");
      raceTrait.add("Brave - You have advantage on saving throws against being frightened.");
      raceTrait.add("Halfling Nimbleness - You can move through the space of any creature that is o f a size larger than yours.");

      dex = dex + 2;
      baseSpeed = 25;
      darkvision = 0;

      languages.add("Common");
      languages.add("Halfling");

      Classes();
      AbilityMods();
   }

   public void HalflingByLevel() {

      Classes();
      AbilityMods();

   }

   /*---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------*/

   public void Human() {
      languages.clear();
      raceTrait.clear();
      raceTrait.add("Languages - You can speak one extra language of your choice");
      if (lvlOne == false) {
         strength++;
         dex++;
         con++;
         intelligence++;
         wisdom++;
         charisma++;
      }

      baseSpeed = 30;
      darkvision = 0;


      languages.add("Common");

      Classes();
      AbilityMods();
   }

   public void HumanByLevel() {

      Classes();
      AbilityMods();

   }

   /*---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------*/

   public void Dragonborn() {
      languages.clear();
      raceTrait.clear();
      raceTrait.add("Draconic Ancestry - You have draconic ancestry. Choose one type o f dragon from the Draconic Ancestry table. Your breath weapon and damage resistance are determined by the dragon type, as shown in the table.");
      raceTrait.add("Breath Weapon - You can use your action to exhale destructive energy. Your draconic ancestry determines the size, shape, and damage type of the exhalation. When you use your breath weapon, each creature in the area o f the exhalation must make a saving throw, the type o f which is determined by your draconic ancestry. The DC for this saving throw equals 8 + your Constitution modifier + your proficiency bonus. A creature takes 2d6 damage on a failed save, and half as much damage on a successful one. The damage increases to 3d6 at 6th level, 4d6 at 11th level, and 5d6 at 16th level. After you use your breath weapon, you cant use it again until you complete a short or long rest.");
      raceTrait.add("Damage Resistance - You have resistance to the damage type associated with your draconic ancestry.");

      strength = strength + 2;
      charisma++;
      baseSpeed = 30;
      darkvision = 0;

      languages.add("Common");
      languages.add("Draconic");

      Classes();
      AbilityMods();
   }

   public void DragonbornByLevel() {

      Classes();
      AbilityMods();

   }

   /*---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------*/

   public void Gnome() {
      languages.clear();
      raceTrait.clear();
      raceTrait.add("");

      languages.add("");

      Classes();
      AbilityMods();
   }

   public void GnomeByLevel() {

      Classes();
      AbilityMods();

   }

   /*---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------*/

   public void HalfElf() {
      languages.clear();
      raceTrait.clear();
      raceTrait.add("");

      languages.add("");

      Classes();
      AbilityMods();
   }

   public void HalfElfByLevel() {

      Classes();
      AbilityMods();

   }

   /*---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------*/

   public void HalfOrk() {
      languages.clear();
      raceTrait.clear();
      raceTrait.add("");

      languages.add("");

      Classes();
      AbilityMods();
   }

   public void HalfOrkByLevel() {

      Classes();
      AbilityMods();

   }

   /*---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------*/

   public void Tiefling() {
      languages.clear();
      raceTrait.clear();
      raceTrait.add("");

      languages.add("");

      Classes();
      AbilityMods();
   }

   public void TieflingByLevel() {

      Classes();
      AbilityMods();

   }

   ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

   public void Classes() {

      if (charClass.equalsIgnoreCase("Barbarian")) {

         AbilityMods();
         armorProficencies.clear();
         weaponProficencies.clear();
         toolProficencies.clear();
         armorProficencies.add("Light armor");
         armorProficencies.add("medium armor");
         armorProficencies.add("shields");

         weaponProficencies.add("Simple weapons");
         weaponProficencies.add("Martial weapons");

         toolProficencies.add("None");

         savingThrows = "Strength, Constitution";
         skills = "Choose two from Animal Handling, Athletics, Intimidation, Nature, Perception, and Survival";

         speed = baseSpeed;

         switch (level) {
            case 1:
               if (lvlOne == false) {
                  baseHealth = 12 + conMod;
                  health = baseHealth;
               }
               proficiencyBonus = 0;
               proficiencyBonus = 2;

               hitDice = "One d12";

               switch (armor) {
                  case "none":
                     if (armorRST == false) {
                        armorClass = 10 + dexMod + conMod;
                     }
                     break;
                  case "Leather":
                     armorClass = 11;
                     armorWeight = "light";
                     break;
                  case "Studded Leather Armor":
                     armorClass = 12;
                     armorWeight = "light";
                     break;
                  case "Hide Armor":
                     armorClass = 12;
                     armorWeight = "medium";
                     break;
                  case "Chain Shirt":
                     armorClass = 13;
                     armorWeight = "medium";
                     break;
                  case "Ring Mail":
                     armorClass = 14;
                     armorWeight = "heavy";
                     break;
                  case "Plate":
                     armorClass = 18;
                     armorWeight = "heavy";
                     break;
               }

               classFeatures[0] = "Rage(2 uses & +2 damage) - In battle, you fight with primal ferocity. On your turn, you can enter a rage as a bonus action. While raging, you gain the following benefits if you aren't wearing heavy armor:    You have advantage on Strength checks and Strength saving throws. When you make a melee weapon attack using Strength, you gain a bonus to the damage roll that increases as you gain levels as a barbarian, as shown in the Rage Damage column of the Barbarian table. You have resistance to bludgeoning, piercing, and slashing damage.        If you are able to cast spells, you can't cast them or concentrate on them while raging. Your rage lasts for 1 minute. It ends early if you are knocked unconscious or if your turn ends and you haven't attacked a hostile creature since your last turn or taken damage since then. You can also end your rage on your turn as a bonus action. Once you have raged the number of times shown for your barbarian level in the Rages column of the Barbarian table, you must finish a long rest before you can rage again.";
               classFeatures[1] = "Unarmored Defense - While you are not wearing any armor, your Armor Class equals 10 + your Dexterity modifier + your Constitution modifier. You can use a shield and still gain this benefit.";
               break;
            case 2:
               if (lvlTwo == false) {
                  health = health + conMod + (rand.nextInt(11) + 1);
               }
               hitDice = "Two d12";

               switch (armor) {
                  case "none":
                     if (armorRST == false) {
                        armorClass = 10 + dexMod + conMod;
                     }
                     break;
                  case "Leather":
                     armorClass = 11;
                     armorWeight = "light";
                     break;
                  case "Studded Leather Armor":
                     armorClass = 12;
                     armorWeight = "light";
                     break;
                  case "Hide Armor":
                     armorClass = 12;
                     armorWeight = "medium";
                     break;
                  case "Chain Shirt":
                     armorClass = 13;
                     armorWeight = "medium";
                     break;
                  case "Ring Mail":
                     armorClass = 14;
                     armorWeight = "heavy";
                     break;
                  case "Plate":
                     armorClass = 18;
                     armorWeight = "heavy";
                     break;
               }

               classFeatures[2] = "Reckless Attack -You can throw aside all concern for defense to attack with fierce desperation. When you make your first attack on your turn, you can decide to attack recklessly. Doing so gives you advantage on melee weapon attack rolls using Strength during this turn, but attack rolls against you have advantage until your next turn.";
               classFeatures[3] = "Danger Sense - You gain an uncanny sense of when things nearby aren't as they should be, giving you an edge when you dodge away from danger. You have advantage on Dexterity saving throws against effects that you can see, such as traps and spells. To gain this benefit, you cant be blinded, deafened, or incapacitated.";
               break;
            case 3:
               if (lvlThree == false) {
                  health = health + conMod + (rand.nextInt(11) + 1);
               }
               hitDice = "Three d12";

               switch (armor) {
                  case "none":
                     if (armorRST == false) {
                        armorClass = 10 + dexMod + conMod;
                     }
                     break;
                  case "Leather":
                     armorClass = 11;
                     armorWeight = "light";
                     break;
                  case "Studded Leather Armor":
                     armorClass = 12;
                     armorWeight = "light";
                     break;
                  case "Hide Armor":
                     armorClass = 12;
                     armorWeight = "medium";
                     break;
                  case "Chain Shirt":
                     armorClass = 13;
                     armorWeight = "medium";
                     break;
                  case "Ring Mail":
                     armorClass = 14;
                     armorWeight = "heavy";
                     break;
                  case "Plate":
                     armorClass = 18;
                     armorWeight = "heavy";
                     break;
               }

               classFeatures[0] = "Rage(3 uses & +2 damage) - In battle, you fight with primal ferocity. On your turn, you can enter a rage as a bonus action. While raging, you gain the following benefits if you arent w earing heavy armor:          You have advantage on Strength checks and Strength saving throws.  When you make a melee weapon attack using Strength, you gain a bonus to the damage roll that increases as you gain levels as a barbarian, as shown in the Rage Damage column of the Barbarian table.  You have resistance to bludgeoning, piercing, and slashing damage.        If you are able to cast spells, you cant cast them or concentrate on them while raging. Your rage lasts for 1 minute. It ends early if you are knocked unconscious or if your turn ends and you havent attacked a hostile creature since your last turn or taken damage since then. You can also end your rage on your turn as a bonus action. Once you have raged the number of times shown for your barbarian level in the Rages column of the Barbarian table, you must finish a long rest before you can rage again.";
               break;
            case 4:

               if (lvlFour == false) {
                  health = health + conMod + (rand.nextInt(11) + 1);
               }
               hitDice = "Four d12";

               switch (armor) {
                  case "none":
                     if (armorRST == false) {
                        armorClass = 10 + dexMod + conMod;
                     }
                     break;
                  case "Leather":
                     armorClass = 11;
                     armorWeight = "light";
                     break;
                  case "Studded Leather Armor":
                     armorClass = 12;
                     armorWeight = "light";
                     break;
                  case "Hide Armor":
                     armorClass = 12;
                     armorWeight = "medium";
                     break;
                  case "Chain Shirt":
                     armorClass = 13;
                     armorWeight = "medium";
                     break;
                  case "Ring Mail":
                     armorClass = 14;
                     armorWeight = "heavy";
                     break;
                  case "Plate":
                     armorClass = 18;
                     armorWeight = "heavy";
                     break;
               }

               classFeatures[4] = "Ability Score Improvement(lvl 4) - increase one ability score of your choice by 2, or you can increase two ability scores of your choice by 1. As normal, you cant increase an ability score above 20 using this feature.";
               break;
            case 5:
               if (lvlFive == false) {
                  health = health + conMod + (rand.nextInt(11) + 1);
               }
               proficiencyBonus = 3;

               hitDice = "Five d12";

               switch (armor) {
                  case "none":
                     if (armorRST == false) {
                        armorClass = 10 + dexMod + conMod;
                     }
                     break;
                  case "Leather":
                     armorClass = 11;
                     armorWeight = "light";
                     break;
                  case "Studded Leather Armor":
                     armorClass = 12;
                     armorWeight = "light";
                     break;
                  case "Hide Armor":
                     armorClass = 12;
                     armorWeight = "medium";
                     break;
                  case "Chain Shirt":
                     armorClass = 13;
                     armorWeight = "medium";
                     break;
                  case "Ring Mail":
                     armorClass = 14;
                     armorWeight = "heavy";
                     break;
                  case "Plate":
                     armorClass = 18;
                     armorWeight = "heavy";
                     break;
               }
               if (armorWeight != "heavy") {
                  speed = baseSpeed + 10;
               }

               classFeatures[5] = "Extra Attack - You can attack twice, instead of once, whenever you take the Attack action on your turn.";
               classFeatures[6] = "Fast Movement - your speed increases by 10 feet while you arent wearing heavy armor.";
               break;
            case 6:
               if (lvlSix == false) {
                  health = health + conMod + (rand.nextInt(11) + 1);
               }
               hitDice = "Six d12";

               switch (armor) {
                  case "none":
                     if (armorRST == false) {
                        armorClass = 10 + dexMod + conMod;
                     }
                     break;
                  case "Leather":
                     armorClass = 11;
                     armorWeight = "light";
                     break;
                  case "Studded Leather Armor":
                     armorClass = 12;
                     armorWeight = "light";
                     break;
                  case "Hide Armor":
                     armorClass = 12;
                     armorWeight = "medium";
                     break;
                  case "Chain Shirt":
                     armorClass = 13;
                     armorWeight = "medium";
                     break;
                  case "Ring Mail":
                     armorClass = 14;
                     armorWeight = "heavy";
                     break;
                  case "Plate":
                     armorClass = 18;
                     armorWeight = "heavy";
                     break;
               }

               if (armorWeight != "heavy") {
                  speed = baseSpeed + 10;
               }

               classFeatures[0] = "Rage(4 uses & +2 damage) - In battle, you fight with primal ferocity. On your turn, you can enter a rage as a bonus action. While raging, you gain the following benefits if you arent w earing heavy armor:          You have advantage on Strength checks and Strength saving throws.  When you make a melee weapon attack using Strength, you gain a bonus to the damage roll that increases as you gain levels as a barbarian, as shown in the Rage Damage column of the Barbarian table.  You have resistance to bludgeoning, piercing, and slashing damage.        If you are able to cast spells, you cant cast them or concentrate on them while raging. Your rage lasts for 1 minute. It ends early if you are knocked unconscious or if your turn ends and you havent attacked a hostile creature since your last turn or taken damage since then. You can also end your rage on your turn as a bonus action. Once you have raged the number of times shown for your barbarian level in the Rages column of the Barbarian table, you must finish a long rest before you can rage again.";
               break;
            case 7:
               if (lvlSeven == false) {
                  health = health + conMod + (rand.nextInt(11) + 1);
               }
               hitDice = "Seven d12";

               switch (armor) {
                  case "none":
                     if (armorRST == false) {
                        armorClass = 10 + dexMod + conMod;
                     }
                     break;
                  case "Leather":
                     armorClass = 11;
                     armorWeight = "light";
                     break;
                  case "Studded Leather Armor":
                     armorClass = 12;
                     armorWeight = "light";
                     break;
                  case "Hide Armor":
                     armorClass = 12;
                     armorWeight = "medium";
                     break;
                  case "Chain Shirt":
                     armorClass = 13;
                     armorWeight = "medium";
                     break;
                  case "Ring Mail":
                     armorClass = 14;
                     armorWeight = "heavy";
                     break;
                  case "Plate":
                     armorClass = 18;
                     armorWeight = "heavy";
                     break;
               }

               if (armorWeight != "heavy") {
                  speed = baseSpeed + 10;
               }

               classFeatures[7] = "Feral Instinct - your instincts are so honed that you have advantage on initiative rolls. Additionally, if you are surprised at the beginning of combat and arent incapacitated, you can act normally on your first turn, but only if you enter your rage before doing anything else on that turn.";
               break;
            case 8:
               if (lvlEight == false) {
                  health = health + conMod + (rand.nextInt(11) + 1);
               }
               hitDice = "Eight d12";

               switch (armor) {
                  case "none":
                     if (armorRST == false) {
                        armorClass = 10 + dexMod + conMod;
                     }
                     break;
                  case "Leather":
                     armorClass = 11;
                     armorWeight = "light";
                     break;
                  case "Studded Leather Armor":
                     armorClass = 12;
                     armorWeight = "light";
                     break;
                  case "Hide Armor":
                     armorClass = 12;
                     armorWeight = "medium";
                     break;
                  case "Chain Shirt":
                     armorClass = 13;
                     armorWeight = "medium";
                     break;
                  case "Ring Mail":
                     armorClass = 14;
                     armorWeight = "heavy";
                     break;
                  case "Plate":
                     armorClass = 18;
                     armorWeight = "heavy";
                     break;
               }

               if (armorWeight != "heavy") {
                  speed = baseSpeed + 10;
               }

               classFeatures[8] = "Ability Score Improvement(lvl 8) - increase one ability score of your choice by 2, or you can increase two ability scores of your choice by 1. As normal, you cant increase an ability score above 20 using this feature.";
               break;
            case 9:
               if (lvlNine == false) {
                  health = health + conMod + (rand.nextInt(11) + 1);
               }
               proficiencyBonus = 4;

               hitDice = "Nine d12";

               switch (armor) {
                  case "none":
                     if (armorRST == false) {
                        armorClass = 10 + dexMod + conMod;
                     }
                     break;
                  case "Leather":
                     armorClass = 11;
                     armorWeight = "light";
                     break;
                  case "Studded Leather Armor":
                     armorClass = 12;
                     armorWeight = "light";
                     break;
                  case "Hide Armor":
                     armorClass = 12;
                     armorWeight = "medium";
                     break;
                  case "Chain Shirt":
                     armorClass = 13;
                     armorWeight = "medium";
                     break;
                  case "Ring Mail":
                     armorClass = 14;
                     armorWeight = "heavy";
                     break;
                  case "Plate":
                     armorClass = 18;
                     armorWeight = "heavy";
                     break;
               }

               if (armorWeight != "heavy") {
                  speed = baseSpeed + 10;
               }

               classFeatures[0] = "Rage(4 uses & +3 damage) - In battle, you fight with primal ferocity. On your turn, you can enter a rage as a bonus action. While raging, you gain the following benefits if you arent w earing heavy armor:          You have advantage on Strength checks and Strength saving throws.  When you make a melee weapon attack using Strength, you gain a bonus to the damage roll that increases as you gain levels as a barbarian, as shown in the Rage Damage column of the Barbarian table.  You have resistance to bludgeoning, piercing, and slashing damage.        If you are able to cast spells, you cant cast them or concentrate on them while raging. Your rage lasts for 1 minute. It ends early if you are knocked unconscious or if your turn ends and you havent attacked a hostile creature since your last turn or taken damage since then. You can also end your rage on your turn as a bonus action. Once you have raged the number of times shown for your barbarian level in the Rages column of the Barbarian table, you must finish a long rest before you can rage again.";
               classFeatures[9] = "Brutal Critical(1 dice) - you can roll one additional weapon damage die when determining the extra damage for a critical hit with a melee attack.";
               break;
            case 10:
               if (lvlTen == false) {
                  health = health + conMod + (rand.nextInt(11) + 1);
               }
               hitDice = "Ten d12";

               switch (armor) {
                  case "none":
                     if (armorRST == false) {
                        armorClass = 10 + dexMod + conMod;
                     }
                     break;
                  case "Leather":
                     armorClass = 11;
                     armorWeight = "light";
                     break;
                  case "Studded Leather Armor":
                     armorClass = 12;
                     armorWeight = "light";
                     break;
                  case "Hide Armor":
                     armorClass = 12;
                     armorWeight = "medium";
                     break;
                  case "Chain Shirt":
                     armorClass = 13;
                     armorWeight = "medium";
                     break;
                  case "Ring Mail":
                     armorClass = 14;
                     armorWeight = "heavy";
                     break;
                  case "Plate":
                     armorClass = 18;
                     armorWeight = "heavy";
                     break;
               }

               if (armorWeight != "heavy") {
                  speed = baseSpeed + 10;
               }
               break;
            case 11:
               if (lvlEleven == false) {
                  health = health + conMod + (rand.nextInt(11) + 1);
               }
               hitDice = "Eleven d12";

               switch (armor) {
                  case "none":
                     if (armorRST == false) {
                        armorClass = 10 + dexMod + conMod;
                     }
                     break;
                  case "Leather":
                     armorClass = 11;
                     armorWeight = "light";
                     break;
                  case "Studded Leather Armor":
                     armorClass = 12;
                     armorWeight = "light";
                     break;
                  case "Hide Armor":
                     armorClass = 12;
                     armorWeight = "medium";
                     break;
                  case "Chain Shirt":
                     armorClass = 13;
                     armorWeight = "medium";
                     break;
                  case "Ring Mail":
                     armorClass = 14;
                     armorWeight = "heavy";
                     break;
                  case "Plate":
                     armorClass = 18;
                     armorWeight = "heavy";
                     break;
               }

               if (armorWeight != "heavy") {
                  speed = baseSpeed + 10;
               }

               classFeatures[10] = "Relentless Rage - If you drop to 0 hit points while youre raging and dont die outright, you can make a DC 10 Constitution saving throw. If you succeed, you drop to 1 hit point instead. Each time you use this feature after the first, the DC increases by 5. When you finish a short or long rest, the DC resets to 10.";
               break;
            case 12:
               if (lvlTwelve == false) {
                  health = health + conMod + (rand.nextInt(11) + 1);
               }
               hitDice = "Twelve d12";

               switch (armor) {
                  case "none":
                     if (armorRST == false) {
                        armorClass = 10 + dexMod + conMod;
                     }
                     break;
                  case "Leather":
                     armorClass = 11;
                     armorWeight = "light";
                     break;
                  case "Studded Leather Armor":
                     armorClass = 12;
                     armorWeight = "light";
                     break;
                  case "Hide Armor":
                     armorClass = 12;
                     armorWeight = "medium";
                     break;
                  case "Chain Shirt":
                     armorClass = 13;
                     armorWeight = "medium";
                     break;
                  case "Ring Mail":
                     armorClass = 14;
                     armorWeight = "heavy";
                     break;
                  case "Plate":
                     armorClass = 18;
                     armorWeight = "heavy";
                     break;
               }

               if (armorWeight != "heavy") {
                  speed = baseSpeed + 10;
               }

               classFeatures[0] = "Rage(5 uses & +3 damage) - In battle, you fight with primal ferocity. On your turn, you can enter a rage as a bonus action. While raging, you gain the following benefits if you arent w earing heavy armor:          You have advantage on Strength checks and Strength saving throws.  When you make a melee weapon attack using Strength, you gain a bonus to the damage roll that increases as you gain levels as a barbarian, as shown in the Rage Damage column of the Barbarian table.  You have resistance to bludgeoning, piercing, and slashing damage.        If you are able to cast spells, you cant cast them or concentrate on them while raging. Your rage lasts for 1 minute. It ends early if you are knocked unconscious or if your turn ends and you havent attacked a hostile creature since your last turn or taken damage since then. You can also end your rage on your turn as a bonus action. Once you have raged the number of times shown for your barbarian level in the Rages column of the Barbarian table, you must finish a long rest before you can rage again.";
               classFeatures[11] = "Ability Score Improvement(lvl 12) - increase one ability score of your choice by 2, or you can increase two ability scores of your choice by 1. As normal, you cant increase an ability score above 20 using this feature.";

               break;
            case 13:
               if (lvlThirteen == false) {
                  health = health + conMod + (rand.nextInt(11) + 1);
               }
               proficiencyBonus = 5;

               hitDice = "Thirteen d12";

               switch (armor) {
                  case "none":
                     if (armorRST == false) {
                        armorClass = 10 + dexMod + conMod;
                     }
                     break;
                  case "Leather":
                     armorClass = 11;
                     armorWeight = "light";
                     break;
                  case "Studded Leather Armor":
                     armorClass = 12;
                     armorWeight = "light";
                     break;
                  case "Hide Armor":
                     armorClass = 12;
                     armorWeight = "medium";
                     break;
                  case "Chain Shirt":
                     armorClass = 13;
                     armorWeight = "medium";
                     break;
                  case "Ring Mail":
                     armorClass = 14;
                     armorWeight = "heavy";
                     break;
                  case "Plate":
                     armorClass = 18;
                     armorWeight = "heavy";
                     break;
               }

               if (armorWeight != "heavy") {
                  speed = baseSpeed + 10;
               }

               classFeatures[9] = "Brutal Critical(2 dice) - you can roll one additional weapon damage die when determining the extra damage for a critical hit with a melee attack.";
               break;
            case 14:
               if (lvlFourteen == false) {
                  health = health + conMod + (rand.nextInt(11) + 1);
               }
               hitDice = "Fourteen d12";

               switch (armor) {
                  case "none":
                     if (armorRST == false) {
                        armorClass = 10 + dexMod + conMod;
                     }
                     break;
                  case "Leather":
                     armorClass = 11;
                     armorWeight = "light";
                     break;
                  case "Studded Leather Armor":
                     armorClass = 12;
                     armorWeight = "light";
                     break;
                  case "Hide Armor":
                     armorClass = 12;
                     armorWeight = "medium";
                     break;
                  case "Chain Shirt":
                     armorClass = 13;
                     armorWeight = "medium";
                     break;
                  case "Ring Mail":
                     armorClass = 14;
                     armorWeight = "heavy";
                     break;
                  case "Plate":
                     armorClass = 18;
                     armorWeight = "heavy";
                     break;
               }

               if (armorWeight != "heavy") {
                  speed = baseSpeed + 10;
               }
               break;
            case 15:
               if (lvlFifteen == false) {
                  health = health + conMod + (rand.nextInt(11) + 1);
               }
               hitDice = "Fifteen d12";

               switch (armor) {
                  case "none":
                     if (armorRST == false) {
                        armorClass = 10 + dexMod + conMod;
                     }
                     break;
                  case "Leather":
                     armorClass = 11;
                     armorWeight = "light";
                     break;
                  case "Studded Leather Armor":
                     armorClass = 12;
                     armorWeight = "light";
                     break;
                  case "Hide Armor":
                     armorClass = 12;
                     armorWeight = "medium";
                     break;
                  case "Chain Shirt":
                     armorClass = 13;
                     armorWeight = "medium";
                     break;
                  case "Ring Mail":
                     armorClass = 14;
                     armorWeight = "heavy";
                     break;
                  case "Plate":
                     armorClass = 18;
                     armorWeight = "heavy";
                     break;
               }

               if (armorWeight != "heavy") {
                  speed = baseSpeed + 10;
               }

               classFeatures[12] = "Persistent Rage - your rage is so fierce that it ends early only if you fall unconscious or if you choose to end it.";
               break;
            case 16:
               if (lvlSixteen == false) {
                  health = health + conMod + (rand.nextInt(11) + 1);
               }
               hitDice = "Sixteen d12";

               switch (armor) {
                  case "none":
                     if (armorRST == false) {
                        armorClass = 10 + dexMod + conMod;
                     }
                     break;
                  case "Leather":
                     armorClass = 11;
                     armorWeight = "light";
                     break;
                  case "Studded Leather Armor":
                     armorClass = 12;
                     armorWeight = "light";
                     break;
                  case "Hide Armor":
                     armorClass = 12;
                     armorWeight = "medium";
                     break;
                  case "Chain Shirt":
                     armorClass = 13;
                     armorWeight = "medium";
                     break;
                  case "Ring Mail":
                     armorClass = 14;
                     armorWeight = "heavy";
                     break;
                  case "Plate":
                     armorClass = 18;
                     armorWeight = "heavy";
                     break;
               }

               if (armorWeight != "heavy") {
                  speed = baseSpeed + 10;
               }

               classFeatures[0] = "Rage(5 uses & +4 damage) - In battle, you fight with primal ferocity. On your turn, you can enter a rage as a bonus action. While raging, you gain the following benefits if you arent w earing heavy armor:          You have advantage on Strength checks and Strength saving throws.  When you make a melee weapon attack using Strength, you gain a bonus to the damage roll that increases as you gain levels as a barbarian, as shown in the Rage Damage column of the Barbarian table.  You have resistance to bludgeoning, piercing, and slashing damage.        If you are able to cast spells, you cant cast them or concentrate on them while raging. Your rage lasts for 1 minute. It ends early if you are knocked unconscious or if your turn ends and you havent attacked a hostile creature since your last turn or taken damage since then. You can also end your rage on your turn as a bonus action. Once you have raged the number of times shown for your barbarian level in the Rages column of the Barbarian table, you must finish a long rest before you can rage again.";
               break;
            case 17:
               if (lvlSeventeen == false) {
                  health = health + conMod + (rand.nextInt(11) + 1);
               }
               proficiencyBonus = 6;

               hitDice = "Seventeen d12";

               switch (armor) {
                  case "none":
                     if (armorRST == false) {
                        armorClass = 10 + dexMod + conMod;
                     }
                     break;
                  case "Leather":
                     armorClass = 11;
                     armorWeight = "light";
                     break;
                  case "Studded Leather Armor":
                     armorClass = 12;
                     armorWeight = "light";
                     break;
                  case "Hide Armor":
                     armorClass = 12;
                     armorWeight = "medium";
                     break;
                  case "Chain Shirt":
                     armorClass = 13;
                     armorWeight = "medium";
                     break;
                  case "Ring Mail":
                     armorClass = 14;
                     armorWeight = "heavy";
                     break;
                  case "Plate":
                     armorClass = 18;
                     armorWeight = "heavy";
                     break;
               }

               if (armorWeight != "heavy") {
                  speed = baseSpeed + 10;
               }

               classFeatures[0] = "Rage(6 uses & +4 damage) - In battle, you fight with primal ferocity. On your turn, you can enter a rage as a bonus action. While raging, you gain the following benefits if you arent w earing heavy armor:          You have advantage on Strength checks and Strength saving throws.  When you make a melee weapon attack using Strength, you gain a bonus to the damage roll that increases as you gain levels as a barbarian, as shown in the Rage Damage column of the Barbarian table.  You have resistance to bludgeoning, piercing, and slashing damage.        If you are able to cast spells, you cant cast them or concentrate on them while raging. Your rage lasts for 1 minute. It ends early if you are knocked unconscious or if your turn ends and you havent attacked a hostile creature since your last turn or taken damage since then. You can also end your rage on your turn as a bonus action. Once you have raged the number of times shown for your barbarian level in the Rages column of the Barbarian table, you must finish a long rest before you can rage again.";
               classFeatures[9] = "Brutal Critical(3 dice) - You can roll one additional weapon damage die when determining the extra damage for a critical hit with a melee attack.";
               break;
            case 18:
               if (lvlEighteen == false) {
                  health = health + conMod + (rand.nextInt(11) + 1);
               }
               hitDice = "Eighteen d12";

               switch (armor) {
                  case "none":
                     if (armorRST == false) {
                        armorClass = 10 + dexMod + conMod;
                     }
                     break;
                  case "Leather":
                     armorClass = 11;
                     armorWeight = "light";
                     break;
                  case "Studded Leather Armor":
                     armorClass = 12;
                     armorWeight = "light";
                     break;
                  case "Hide Armor":
                     armorClass = 12;
                     armorWeight = "medium";
                     break;
                  case "Chain Shirt":
                     armorClass = 13;
                     armorWeight = "medium";
                     break;
                  case "Ring Mail":
                     armorClass = 14;
                     armorWeight = "heavy";
                     break;
                  case "Plate":
                     armorClass = 18;
                     armorWeight = "heavy";
                     break;
               }

               if (armorWeight != "heavy") {
                  speed = baseSpeed + 10;
               }

               classFeatures[13] = "Indomitable Might - if your total for a Strength check is less than your Strength score, you can use that score in place o f the total.";
               break;
            case 19:
               if (lvlNineteen == false) {
                  health = health + conMod + (rand.nextInt(11) + 1);
               }
               hitDice = "Nineteen d12";

               switch (armor) {
                  case "none":
                     if (armorRST == false) {
                        armorClass = 10 + dexMod + conMod;
                     }
                     break;
                  case "Leather":
                     armorClass = 11;
                     armorWeight = "light";
                     break;
                  case "Studded Leather Armor":
                     armorClass = 12;
                     armorWeight = "light";
                     break;
                  case "Hide Armor":
                     armorClass = 12;
                     armorWeight = "medium";
                     break;
                  case "Chain Shirt":
                     armorClass = 13;
                     armorWeight = "medium";
                     break;
                  case "Ring Mail":
                     armorClass = 14;
                     armorWeight = "heavy";
                     break;
                  case "Plate":
                     armorClass = 18;
                     armorWeight = "heavy";
                     break;
               }

               if (armorWeight != "heavy") {
                  speed = baseSpeed + 10;
               }
               break;
            case 20:
               if (lvlTwenty == false) {
                  health = health + conMod + (rand.nextInt(11) + 1);
               }
               hitDice = "Twenty d12";

               strength = strength + 4;
               con = con + 4;

               switch (armor) {
                  case "none":
                     if (armorRST == false) {
                        armorClass = 10 + dexMod + conMod;
                     }
                     break;
                  case "Leather":
                     armorClass = 11;
                     armorWeight = "light";
                     break;
                  case "Studded Leather Armor":
                     armorClass = 12;
                     armorWeight = "light";
                     break;
                  case "Hide Armor":
                     armorClass = 12;
                     armorWeight = "medium";
                     break;
                  case "Chain Shirt":
                     armorClass = 13;
                     armorWeight = "medium";
                     break;
                  case "Ring Mail":
                     armorClass = 14;
                     armorWeight = "heavy";
                     break;
                  case "Plate":
                     armorClass = 18;
                     armorWeight = "heavy";
                     break;
               }

               if (armorWeight != "heavy") {
                  speed = baseSpeed + 10;
               }

               classFeatures[0] = "Rage(Unlimited uses & +4 damage) - In battle, you fight with primal ferocity. On your turn, you can enter a rage as a bonus action. While raging, you gain the following benefits if you arent w earing heavy armor:          You have advantage on Strength checks and Strength saving throws.  When you make a melee weapon attack using Strength, you gain a bonus to the damage roll that increases as you gain levels as a barbarian, as shown in the Rage Damage column of the Barbarian table.  You have resistance to bludgeoning, piercing, and slashing damage.        If you are able to cast spells, you cant cast them or concentrate on them while raging. Your rage lasts for 1 minute. It ends early if you are knocked unconscious or if your turn ends and you havent attacked a hostile creature since your last turn or taken damage since then. You can also end your rage on your turn as a bonus action. Once you have raged the number of times shown for your barbarian level in the Rages column of the Barbarian table, you must finish a long rest before you can rage again.";
               classFeatures[14] = "Primal Champion - Your Strength and Constitution scores increase by 4. Your maximum for those scores is now 24.";
               break;
         }

         /*---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------*/

      } else if (charClass.equalsIgnoreCase("Bard")) {
         armorProficencies.clear();
         weaponProficencies.clear();
         toolProficencies.clear();

         hitDice = "One d8";

         armorProficencies.add("Light armor");

         weaponProficencies.add("Simple weapons");
         weaponProficencies.add("hand crossbows");
         weaponProficencies.add("longswords");
         weaponProficencies.add("rapiers");
         weaponProficencies.add("shortswords");

         toolProficencies.add("Three musical instruments o f your choice");

         savingThrows = "Dexterity, Charisma";
         skills = "Choose any three";

         AbilityMods();

         switch (level) {
            case 1:
               if (lvlOne == false) {
                  health = 8 + conMod;
               }

               proficiencyBonus = 0;
               proficiencyBonus = 2;

               spellsKnown = 4;
               cantripsKnown = 2;
               firstlvl = 2;
               secondlvl = 0;
               thirdlvl = 0;
               fourthlvl = 0;
               fithlvl = 0;
               sixthlvl = 0;
               seventhlvl = 0;
               eigthlvl = 0;
               ninethlvl = 0;

               classFeatures[0] = "Spellcasting - Charisma is your spellcasting ability for your bard spells. Your magic comes from the heart and soul you pour into the performance o f your music or oration. You use your Charisma whenever a spell refers to your spellcasting ability. In addition, you use your Charisma modifier when setting the saving throw DC for a bard spell you cast and when making an attack roll with one. Spell save DC = 8 + your proficiency bonus + your Charisma modifier Spell attack modifier = your proficiency bonus + your Charisma modifier";
               classFeatures[1] = "Bardic Inspiration(One d6) - You can inspire others through stirring words or music. To do so, you use a bonus action on your turn to choose one creature other than yourself within 60 feet of you who can hear you. That creature gains one Bardic Inspiration die, a d6.";
               break;
            case 2:
               if (lvlTwo == false) {
                  if (lvlOne == false) {
                  health = health + conMod + (rand.nextInt(7) + 1);
               }
               }
               spellsKnown = 5;
               firstlvl = 3;

               classFeatures[2] = "jack of All Trades - Starting at 2nd level, you can add half your proficiency bonus, rounded down, to any ability check you make that doesnt already include your proficiency bonus";
               classFeatures[3] = "Song of Rest(One d6) - you can use soothing music or oration to help revitalize your wounded allies during a short rest. If you or any friendly creatures w ho can hear your performance regain hit points at the end of the short rest, each of those creatures regains an extra 1d6 hit points.";
               break;
            case 3:
               if (lvlThree == false) {
                  health = health + conMod + (rand.nextInt(7) + 1);
               }

               spellsKnown = 6;
               firstlvl = 4;
               secondlvl = 2;

               classFeatures[3] = "Expertise(lvl 3) - At 3rd level, choose two of your skill proficiencies. Your proficiency bonus is doubled for any ability check you make that uses either of the chosen proficiencies."; // needs
                                                                                                                                                                                                                             // to
                                                                                                                                                                                                                             // be
                                                                                                                                                                                                                             // implimentd
               break;
            case 4:
               if (lvlFour == false) {
                  health = health + conMod + (rand.nextInt(7) + 1);
               }

               spellsKnown = 7;
               cantripsKnown = 3;
               secondlvl = 3;

               classFeatures[4] = "Ability Score Improvement(lvl 4) - When you reach 4th level, and again at 8th, 12th, 16th, and 19th level, you can increase one ability score o f your choice by 2, or you can increase two ability s cores o f your choice by 1. As normal, you cant increase an ability score above 20 using this feature.";
               break;
            case 5:
               if (lvlFive == false) {
                  health = health + conMod + (rand.nextInt(7) + 1);
               }

               proficiencyBonus = 3;

               spellsKnown = 8;
               thirdlvl = 2;

               classFeatures[1] = "Bardic Inspiration(One d8) - You can inspire others through stirring words or music. To do so, you use a bonus action on your turn to choose one creature other than yourself within 60 feet of you who can hear you. That creature gains one Bardic Inspiration die, a d8.";
               classFeatures[5] = "Font of Inspiration - Beginning when you reach 5th level, you regain all of your expended uses o f Bardic Inspiration when you finish a short or long rest.";
               break;
            case 6:
               if (lvlSix == false) {
                  health = health + conMod + (rand.nextInt(7) + 1);
               }

               spellsKnown = 9;
               thirdlvl = 3;

               classFeatures[6] = "Countercharm - At 6th level, you gain the ability to use musical notes or words o f power to disrupt mind-influencing effects. As an action, you can start a performance that lasts until the end o f your next turn. During that time, you and any friendly creatures within 30 feet o f you have advantage on saving throws against being frightened or charmed. A creature must be able to hear you to gain this benefit. The performance ends early if you are incapacitated or silenced or if you voluntarily end it (no action required).";
               break;
            case 7:
               if (lvlSeven == false) {
                  health = health + conMod + (rand.nextInt(7) + 1);
               }

               spellsKnown = 10;
               fourthlvl = 1;

               break;
            case 8:
               if (lvlEight == false) {
                  health = health + conMod + (rand.nextInt(7) + 1);
               }

               spellsKnown = 11;
               fourthlvl = 2;

               classFeatures[7] = "Ability Score Improvement(lvl 8) - When you reach 4th level, and again at 8th, 12th, 16th, and 19th level, you can increase one ability score o f your choice by 2, or you can increase two ability s cores o f your choice by 1. As normal, you cant increase an ability score above 20 using this feature.";
               break;
            case 9:
               if (lvlNine == false) {
                  health = health + conMod + (rand.nextInt(7) + 1);
               }

               proficiencyBonus = 4;

               spellsKnown = 12;
               fourthlvl = 3;
               fithlvl = 1;

               classFeatures[3] = "Song of Rest(One d8) - Beginning at 2nd level, you can use soothing music or oration to help revitalize your wounded allies during a short rest. If you or any friendly creatures w ho can hear your performance regain hit points at the end of the short rest, each of those creatures regains an extra 1d8 hit points.";
               break;
            case 10:
               if (lvlTen == false) {
                  health = health + conMod + (rand.nextInt(7) + 1);
               }

               spellsKnown = 14;
               cantripsKnown = 4;
               fithlvl = 2;

               classFeatures[1] = "Bardic Inspiration(One d10) - You can inspire others through stirring words or music. To do so, you use a bonus action on your turn to choose one creature other than yourself within 60 feet of you who can hear you. That creature gains one Bardic Inspiration die, a d10.";
               classFeatures[8] = "Expertise(lvl 10) - At 10th level, choose two of your skill proficiencies. Your proficiency bonus is doubled for any ability check you make that uses either of the chosen proficiencies."; // needs
                                                                                                                                                                                                                               // to
                                                                                                                                                                                                                               // be
                                                                                                                                                                                                                               // implimentd
               classFeatures[9] = "Magical Secrets(lvl 10) - By 10th level, you have plundered magical knowledge from a w ide spectrum of disciplines. Choose two spells from any class, including this one. A spell you choose must be o f a level you can cast, as shown on the Bard table, or a cantrip.";
               break;
            case 11:
               if (lvlEleven == false) {
                  health = health + conMod + (rand.nextInt(7) + 1);
               }

               spellsKnown = 15;
               sixthlvl = 1;

               break;
            case 12:
               if (lvlTwelve == false) {
                  health = health + conMod + (rand.nextInt(7) + 1);
               }

               proficiencyBonus = 5;

               classFeatures[10] = "Ability Score Improvement(lvl 12) - When you reach 4th level, and again at 8th, 12th, 16th, and 19th level, you can increase one ability score o f your choice by 2, or you can increase two ability s cores o f your choice by 1. As normal, you cant increase an ability score above 20 using this feature.";
               break;
            case 13:
               if (lvlThirteen == false) {
                  health = health + conMod + (rand.nextInt(7) + 1);
               }

               spellsKnown = 16;
               seventhlvl = 1;

               classFeatures[3] = "Song of Rest(One d10) - you can use soothing music or oration to help revitalize your wounded allies during a short rest. If you or any friendly creatures who can hear your performance regain hit points at the end of the short rest, each of those creatures regains an extra 1d10 hit points.";
               break;
            case 14:
               if (lvlFourteen == false) {
                  health = health + conMod + (rand.nextInt(7) + 1);
               }

               spellsKnown = 18;

               classFeatures[11] = "Magical Secrets(lvl 14) - you have plundered magical knowledge from a w ide spectrum of disciplines. Choose two spells from any class, including this one. A spell you choose must be o f a level you can cast, as shown on the Bard table, or a cantrip.";
               break;
            case 15:
               if (lvlFifteen == false) {
                  health = health + conMod + (rand.nextInt(7) + 1);
               }

               spellsKnown = 19;
               eigthlvl = 1;

               classFeatures[1] = "Bardic Inspiration(One d12) - You can inspire others through stirring words or music. To do so, you use a bonus action on your turn to choose one creature other than yourself within 60 feet of you who can hear you. That creature gains one Bardic Inspiration die, a d12.";
               break;
            case 16:
               if (lvlSixteen == false) {
                  health = health + conMod + (rand.nextInt(7) + 1);
               }

               classFeatures[12] = "Ability Score Improvement(lvl 16) - When you reach 4th level, and again at 8th, 12th, 16th, and 19th level, you can increase one ability score o f your choice by 2, or you can increase two ability s cores o f your choice by 1. As normal, you cant increase an ability score above 20 using this feature.";
               break;
            case 17:
               if (lvlSeventeen == false) {
                  health = health + conMod + (rand.nextInt(7) + 1);
               }

               proficiencyBonus = 6;

               spellsKnown = 20;
               ninethlvl = 1;

               classFeatures[3] = "Song of Rest (d12) - you can use soothing music or oration to help revitalize your wounded allies during a short rest. If you or any friendly creatures w ho can hear your performance regain hit points at the end of the short rest, each of those creatures regains an extra 1d12 hit points.";
               break;
            case 18:
               if (lvlEighteen == false) {
                  health = health + conMod + (rand.nextInt(7) + 1);
               }

               spellsKnown = 22;
               fithlvl = 3;

               classFeatures[13] = "Magical Secrets(lvl 18) - you have plundered magical knowledge from a w ide spectrum of disciplines. Choose two spells from any class, including this one. A spell you choose must be o f a level you can cast, as shown on the Bard table, or a cantrip.";
               break;
            case 19:
               if (lvlNineteen == false) {
                  health = health + conMod + (rand.nextInt(7) + 1);
               }

               sixthlvl = 2;

               classFeatures[14] = "Ability Score Improvement(lvl 19) - When you reach 4th level, and again at 8th, 12th, 16th, and 19th level, you can increase one ability score o f your choice by 2, or you can increase two ability s cores o f your choice by 1. As normal, you cant increase an ability score above 20 using this feature.";
               break;
            case 20:
               if (lvlTwenty == false) {
                  health = health + conMod + (rand.nextInt(7) + 1);
               }

               seventhlvl = 2;

               classFeatures[15] = "Superior Inspiration - At 20th level, when you roll initiative and have no uses of Bardic Inspiration left, you regain one use.";
               break;
         }

         /*---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------*/

      } else if (charClass.equalsIgnoreCase("Cleric")) {
         switch (level) {
            case 1:

               break;
            case 2:

               break;
            case 3:

               break;
            case 4:

               break;
            case 5:

               break;
            case 6:

               break;
            case 7:

               break;
            case 8:

               break;
            case 9:

               break;
            case 10:

               break;
            case 11:

               break;
            case 12:

               break;
            case 13:

               break;
            case 14:

               break;
            case 15:

               break;
            case 16:

               break;
            case 17:

               break;
            case 18:

               break;
            case 19:

               break;
            case 20:

               break;
         }

         /*---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------*/

      } else if (charClass.equalsIgnoreCase("Druid")) {
         switch (level) {
            case 1:

               break;
            case 2:

               break;
            case 3:

               break;
            case 4:

               break;
            case 5:

               break;
            case 6:

               break;
            case 7:

               break;
            case 8:

               break;
            case 9:

               break;
            case 10:

               break;
            case 11:

               break;
            case 12:

               break;
            case 13:

               break;
            case 14:

               break;
            case 15:

               break;
            case 16:

               break;
            case 17:

               break;
            case 18:

               break;
            case 19:

               break;
            case 20:

               break;
         }

         /*---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------*/

      } else if (charClass.equalsIgnoreCase("Fighter")) {
         switch (level) {
            case 1:

               break;
            case 2:

               break;
            case 3:

               break;
            case 4:

               break;
            case 5:

               break;
            case 6:

               break;
            case 7:

               break;
            case 8:

               break;
            case 9:

               break;
            case 10:

               break;
            case 11:

               break;
            case 12:

               break;
            case 13:

               break;
            case 14:

               break;
            case 15:

               break;
            case 16:

               break;
            case 17:

               break;
            case 18:

               break;
            case 19:

               break;
            case 20:

               break;
         }

         /*---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------*/

      } else if (charClass.equalsIgnoreCase("Monk")) {
         switch (level) {
            case 1:

               break;
            case 2:

               break;
            case 3:

               break;
            case 4:

               break;
            case 5:

               break;
            case 6:

               break;
            case 7:

               break;
            case 8:

               break;
            case 9:

               break;
            case 10:

               break;
            case 11:

               break;
            case 12:

               break;
            case 13:

               break;
            case 14:

               break;
            case 15:

               break;
            case 16:

               break;
            case 17:

               break;
            case 18:

               break;
            case 19:

               break;
            case 20:

               break;
         }

         /*---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------*/

      } else if (charClass.equalsIgnoreCase("Paladin")) {
         switch (level) {
            case 1:

               break;
            case 2:

               break;
            case 3:

               break;
            case 4:

               break;
            case 5:

               break;
            case 6:

               break;
            case 7:

               break;
            case 8:

               break;
            case 9:

               break;
            case 10:

               break;
            case 11:

               break;
            case 12:

               break;
            case 13:

               break;
            case 14:

               break;
            case 15:

               break;
            case 16:

               break;
            case 17:

               break;
            case 18:

               break;
            case 19:

               break;
            case 20:

               break;
         }

         /*---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------*/

      } else if (charClass.equalsIgnoreCase("Ranger")) {
         switch (level) {
            case 1:

               break;
            case 2:

               break;
            case 3:

               break;
            case 4:

               break;
            case 5:

               break;
            case 6:

               break;
            case 7:

               break;
            case 8:

               break;
            case 9:

               break;
            case 10:

               break;
            case 11:

               break;
            case 12:

               break;
            case 13:

               break;
            case 14:

               break;
            case 15:

               break;
            case 16:

               break;
            case 17:

               break;
            case 18:

               break;
            case 19:

               break;
            case 20:

               break;
         }

         /*---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------*/

      } else if (charClass.equalsIgnoreCase("Rogue")) {
         switch (level) {
            case 1:

               break;
            case 2:

               break;
            case 3:

               break;
            case 4:

               break;
            case 5:

               break;
            case 6:

               break;
            case 7:

               break;
            case 8:

               break;
            case 9:

               break;
            case 10:

               break;
            case 11:

               break;
            case 12:

               break;
            case 13:

               break;
            case 14:

               break;
            case 15:

               break;
            case 16:

               break;
            case 17:

               break;
            case 18:

               break;
            case 19:

               break;
            case 20:

               break;
         }

         /*---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------*/

      } else if (charClass.equalsIgnoreCase("Sorcerer")) {
         switch (level) {
            case 1:

               break;
            case 2:

               break;
            case 3:

               break;
            case 4:

               break;
            case 5:

               break;
            case 6:

               break;
            case 7:

               break;
            case 8:

               break;
            case 9:

               break;
            case 10:

               break;
            case 11:

               break;
            case 12:

               break;
            case 13:

               break;
            case 14:

               break;
            case 15:

               break;
            case 16:

               break;
            case 17:

               break;
            case 18:

               break;
            case 19:

               break;
            case 20:

               break;
         }

         /*---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------*/

      } else if (charClass.equalsIgnoreCase("Warlock")) {
         switch (level) {
            case 1:

               break;
            case 2:

               break;
            case 3:

               break;
            case 4:

               break;
            case 5:

               break;
            case 6:

               break;
            case 7:

               break;
            case 8:

               break;
            case 9:

               break;
            case 10:

               break;
            case 11:

               break;
            case 12:

               break;
            case 13:

               break;
            case 14:

               break;
            case 15:

               break;
            case 16:

               break;
            case 17:

               break;
            case 18:

               break;
            case 19:

               break;
            case 20:

               break;
         }

         /*---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------*/

      } else if (charClass.equalsIgnoreCase("Wizard")) {
         switch (level) {
            case 1:

               break;
            case 2:

               break;
            case 3:

               break;
            case 4:

               break;
            case 5:

               break;
            case 6:

               break;
            case 7:

               break;
            case 8:

               break;
            case 9:

               break;
            case 10:

               break;
            case 11:

               break;
            case 12:

               break;
            case 13:

               break;
            case 14:

               break;
            case 15:

               break;
            case 16:

               break;
            case 17:

               break;
            case 18:

               break;
            case 19:

               break;
            case 20:

               break;
         }
      }
   }

   ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

   public void AbilityMods() {

      if (strength > 30) {
         strength = 30;
      }
      if (dex > 30) {
         dex = 30;
      }
      if (con > 30) {
         con = 30;
      }
      if (intelligence > 30) {
         intelligence = 30;
      }
      if (wisdom > 30) {
         wisdom = 30;
      }
      if (charisma > 30) {
         charisma = 30;
      }

      if (strength == 1) {
         strengthMod = -5;
      } else if (strength == 2 || strength == 3) {
         strengthMod = -4;
      } else if (strength == 4 || strength == 5) {
         strengthMod = -3;
      } else if (strength == 6 || strength == 7) {
         strengthMod = -2;
      } else if (strength == 8 || strength == 9) {
         strengthMod = -1;
      } else if (strength == 10 || strength == 11) {
         strengthMod = 0;
      } else if (strength == 12 || strength == 13) {
         strengthMod = 1;
      } else if (strength == 14 || strength == 15) {
         strengthMod = 2;
      } else if (strength == 16 || strength == 17) {
         strengthMod = 3;
      } else if (strength == 18 || strength == 19) {
         strengthMod = 4;
      } else if (strength == 20 || strength == 21) {
         strengthMod = 5;
      } else if (strength == 22 || strength == 23) {
         strengthMod = 6;
      } else if (strength == 24 || strength == 25) {
         strengthMod = 7;
      } else if (strength == 26 || strength == 27) {
         strengthMod = 8;
      } else if (strength == 28 || strength == 29) {
         strengthMod = 9;
      } else if (strength == 30) {
         strengthMod = 10;
      } else {
         strengthMod = 0;
      }

      /*---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------*/

      if (dex == 1) {
         dexMod = -5;
      } else if (dex == 2 || dex == 3) {
         dexMod = -4;
      } else if (dex == 4 || dex == 5) {
         dexMod = -3;
      } else if (dex == 6 || dex == 7) {
         dexMod = -2;
      } else if (dex == 8 || dex == 9) {
         dexMod = -1;
      } else if (dex == 10 || dex == 11) {
         dexMod = 0;
      } else if (dex == 12 || dex == 13) {
         dexMod = 1;
      } else if (dex == 14 || dex == 15) {
         dexMod = 2;
      } else if (dex == 16 || dex == 17) {
         dexMod = 3;
      } else if (dex == 18 || dex == 19) {
         dexMod = 4;
      } else if (dex == 20 || dex == 21) {
         dexMod = 5;
      } else if (dex == 22 || dex == 23) {
         dexMod = 6;
      } else if (dex == 24 || dex == 25) {
         dexMod = 7;
      } else if (dex == 26 || dex == 27) {
         dexMod = 8;
      } else if (dex == 28 || dex == 29) {
         dexMod = 9;
      } else if (dex == 30) {
         dexMod = 10;
      } else {
         dexMod = 0;
      }

      /*---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------*/

      if (con == 1) {
         conMod = -5;
      } else if (con == 2 || con == 3) {
         conMod = -4;
      } else if (con == 4 || con == 5) {
         conMod = -3;
      } else if (con == 6 || con == 7) {
         conMod = -2;
      } else if (con == 8 || con == 9) {
         conMod = -1;
      } else if (con == 10 || con == 11) {
         conMod = 0;
      } else if (con == 12 || con == 13) {
         conMod = 1;
      } else if (con == 14 || con == 15) {
         conMod = 2;
      } else if (con == 16 || con == 17) {
         conMod = 3;
      } else if (con == 18 || con == 19) {
         conMod = 4;
      } else if (con == 20 || con == 21) {
         conMod = 5;
      } else if (con == 22 || con == 23) {
         conMod = 6;
      } else if (con == 24 || con == 25) {
         conMod = 7;
      } else if (con == 26 || con == 27) {
         conMod = 8;
      } else if (con == 28 || con == 29) {
         conMod = 9;
      } else if (con == 30) {
         conMod = 10;
      } else {
         conMod = 0;
      }

      /*---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------*/

      if (intelligence == 1) {
         intelligenceMod = -5;
      } else if (intelligence == 2 || intelligence == 3) {
         intelligenceMod = -4;
      } else if (intelligence == 4 || intelligence == 5) {
         intelligenceMod = -3;
      } else if (intelligence == 6 || intelligence == 7) {
         intelligenceMod = -2;
      } else if (intelligence == 8 || intelligence == 9) {
         intelligenceMod = -1;
      } else if (intelligence == 10 || intelligence == 11) {
         intelligenceMod = 0;
      } else if (intelligence == 12 || intelligence == 13) {
         intelligenceMod = 1;
      } else if (intelligence == 14 || intelligence == 15) {
         intelligenceMod = 2;
      } else if (intelligence == 16 || intelligence == 17) {
         intelligenceMod = 3;
      } else if (intelligence == 18 || intelligence == 19) {
         intelligenceMod = 4;
      } else if (intelligence == 20 || intelligence == 21) {
         intelligenceMod = 5;
      } else if (intelligence == 22 || intelligence == 23) {
         intelligenceMod = 6;
      } else if (intelligence == 24 || intelligence == 25) {
         intelligenceMod = 7;
      } else if (intelligence == 26 || intelligence == 27) {
         intelligenceMod = 8;
      } else if (intelligence == 28 || intelligence == 29) {
         intelligenceMod = 9;
      } else if (intelligence == 30) {
         intelligenceMod = 10;
      } else {
         intelligenceMod = 0;
      }

      /*---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------*/

      if (wisdom == 1) {
         wisdomMod = -5;
      } else if (wisdom == 2 || wisdom == 3) {
         wisdomMod = -4;
      } else if (wisdom == 4 || wisdom == 5) {
         wisdomMod = -3;
      } else if (wisdom == 6 || wisdom == 7) {
         wisdomMod = -2;
      } else if (wisdom == 8 || wisdom == 9) {
         wisdomMod = -1;
      } else if (wisdom == 10 || wisdom == 11) {
         wisdomMod = 0;
      } else if (wisdom == 12 || wisdom == 13) {
         wisdomMod = 1;
      } else if (wisdom == 14 || wisdom == 15) {
         wisdomMod = 2;
      } else if (wisdom == 16 || wisdom == 17) {
         wisdomMod = 3;
      } else if (wisdom == 18 || wisdom == 19) {
         wisdomMod = 4;
      } else if (wisdom == 20 || wisdom == 21) {
         wisdomMod = 5;
      } else if (wisdom == 22 || wisdom == 23) {
         wisdomMod = 6;
      } else if (wisdom == 24 || wisdom == 25) {
         wisdomMod = 7;
      } else if (wisdom == 26 || wisdom == 27) {
         wisdomMod = 8;
      } else if (wisdom == 28 || wisdom == 29) {
         wisdomMod = 9;
      } else if (wisdom == 30) {
         wisdomMod = 10;
      } else {
         wisdomMod = 0;
      }

      /*---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------*/

      if (charisma == 1) {
         charismaMod = -5;
      } else if (charisma == 2 || charisma == 3) {
         charismaMod = -4;
      } else if (charisma == 4 || charisma == 5) {
         charismaMod = -3;
      } else if (charisma == 6 || charisma == 7) {
         charismaMod = -2;
      } else if (charisma == 8 || charisma == 9) {
         charismaMod = -1;
      } else if (charisma == 10 || charisma == 11) {
         charismaMod = 0;
      } else if (charisma == 12 || charisma == 13) {
         charismaMod = 1;
      } else if (charisma == 14 || charisma == 15) {
         charismaMod = 2;
      } else if (charisma == 16 || charisma == 17) {
         charismaMod = 3;
      } else if (charisma == 18 || charisma == 19) {
         charismaMod = 4;
      } else if (charisma == 20 || charisma == 21) {
         charismaMod = 5;
      } else if (charisma == 22 || charisma == 23) {
         charismaMod = 6;
      } else if (charisma == 24 || charisma == 25) {
         charismaMod = 7;
      } else if (charisma == 26 || charisma == 27) {
         charismaMod = 8;
      } else if (charisma == 28 || charisma == 29) {
         charismaMod = 9;
      } else if (charisma == 30) {
         charismaMod = 10;
      } else {
         charismaMod = 0;
      }
   }
   
}