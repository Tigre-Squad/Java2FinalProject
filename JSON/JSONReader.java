import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

import org.json.JSONObject;

public class JSONReader{
    /**
    * @author Julian Mato-Hernandez
    */
    String name; 
    String charClass;  
    int level; 
    String alignment; 
    String race; 
    String gender; 
    String description; 
    String personality; 
    String ideals; 
    String bonds; 
    String flaws; 
    String featuresTraits; 
    String raceTraits; 
    String classTraits; 
    
    int armorClass; 
    int initiative; 
    int speed; 
    int health; 
    int tempHealth; 
    
    String attacksSpellcasting; 
    int numcantripsKnown; 
    int numspellsKnown; 
    int numfirstlvl; 
    int numsecondlvl; 
    int numthirdlvl; 
    int numfourthlvl; 
    int numfithlvl; 
    int numsixthlvl; 
    int numseventhlvl; 
    int numeigthlvl; 
    int numninethlvl; 
    
    String armor; 
    String shield; 
    String equipment; 
    
    int strength; 
    int dex; 
    int con; 
    int intelligence; 
    int wisdom; 
    int charisma; 
    
    int strengthMod; 
    int dexMod; 
    int conMod; 
    int intelligenceMod; 
    int wisdomMod; 
    int charismaMod; 
    
    int acrobatics; 
    int animalHandling; 
    int arcana; 
    int athletics; 
    int deception; 
    int history; 
    int insight; 
    int intimidation; 
    int investigation; 
    int medicine; 
    int nature; 
    int perception; 
    int performance; 
    int persuasion; 
    int religion; 
    int sleight; 
    int stealth; 
    int survival; 
    
    boolean strengthModProficiency; 
    boolean dexModProficiency; 
    boolean conModProficiency; 
    boolean intelligenceModProficiency; 
    boolean wisdomModProficiency; 
    boolean charismaModProficiency; 
    
    boolean acrobaticsProficiency; 
    boolean animalHandlingProficiency; 
    boolean arcanaProficiency; 
    boolean athleticsProficiency; 
    boolean deceptionProficiency; 
    boolean historyProficiency; 
    boolean insightProficiency; 
    boolean intimidationProficiency; 
    boolean investigationProficiency; 
    boolean medicineProficiency; 
    boolean natureProficiency; 
    boolean perceptionProficiency; 
    boolean performanceProficiency; 
    boolean persuasionProficiency; 
    boolean religionProficiency; 
    boolean sleightProficiency; 
    boolean stealthProficiency; 
    boolean survivalProficiency; 
    String notesTA;
    public void Load(String filePath){
        JSONObject obj = JSONUtils.getJSONObjectFromFile(filePath);
        String[] names = JSONObject.getNames(obj);
        System.out.println(filePath);
		for (String string : names) {
			System.out.println(string + ": " + obj.get(string));
		}
        
        System.out.print("\n");
        
         name = obj.getJSONObject("Character Sheet").getJSONObject("character info").getString("name");
         charClass = obj.getJSONObject("Character Sheet").getJSONObject("character info").getString("character class");
         level = obj.getJSONObject("Character Sheet").getJSONObject("character info").getInt("level");
         alignment = obj.getJSONObject("Character Sheet").getJSONObject("character info").getString("alignment");
         race = obj.getJSONObject("Character Sheet").getJSONObject("character info").getString("race");
         gender = obj.getJSONObject("Character Sheet").getJSONObject("character info").getString("gender");
         description = obj.getJSONObject("Character Sheet").getJSONObject("character info").getString("description");
         personality = obj.getJSONObject("Character Sheet").getJSONObject("character info").getString("personality");
         ideals = obj.getJSONObject("Character Sheet").getJSONObject("character info").getString("ideals");
         bonds = obj.getJSONObject("Character Sheet").getJSONObject("character info").getString("bonds");
         flaws = obj.getJSONObject("Character Sheet").getJSONObject("character info").getString("flaws");
         featuresTraits = obj.getJSONObject("Character Sheet").getJSONObject("character info").getString("featuresTraits");
         raceTraits = obj.getJSONObject("Character Sheet").getJSONObject("character info").getString("raceTraits");
         classTraits = obj.getJSONObject("Character Sheet").getJSONObject("character info").getString("classTraits");

         armorClass = obj.getJSONObject("Character Sheet").getJSONObject("character stats").getInt("armorClass");
         initiative = obj.getJSONObject("Character Sheet").getJSONObject("character stats").getInt("initiative");
         speed = obj.getJSONObject("Character Sheet").getJSONObject("character stats").getInt("speed");
         health = obj.getJSONObject("Character Sheet").getJSONObject("character stats").getInt("health");
         tempHealth = obj.getJSONObject("Character Sheet").getJSONObject("character stats").getInt("tempHealth");

         attacksSpellcasting = obj.getJSONObject("Character Sheet").getJSONObject("magic").getString("attacksSpellcasting");
         numcantripsKnown = obj.getJSONObject("Character Sheet").getJSONObject("magic").getInt("numcantripsKnown");
         numspellsKnown = obj.getJSONObject("Character Sheet").getJSONObject("magic").getInt("numspellsKnown");
         numfirstlvl = obj.getJSONObject("Character Sheet").getJSONObject("magic").getInt("numfirstlvl");
         numsecondlvl = obj.getJSONObject("Character Sheet").getJSONObject("magic").getInt("numsecondlvl");
         numthirdlvl = obj.getJSONObject("Character Sheet").getJSONObject("magic").getInt("numthirdlvl");
         numfourthlvl = obj.getJSONObject("Character Sheet").getJSONObject("magic").getInt("numfourthlvl");
         numfithlvl = obj.getJSONObject("Character Sheet").getJSONObject("magic").getInt("numfithlvl");
         numsixthlvl = obj.getJSONObject("Character Sheet").getJSONObject("magic").getInt("numsixthlvl");
         numseventhlvl = obj.getJSONObject("Character Sheet").getJSONObject("magic").getInt("numseventhlvl");
         numeigthlvl = obj.getJSONObject("Character Sheet").getJSONObject("magic").getInt("numeigthlvl");
         numninethlvl = obj.getJSONObject("Character Sheet").getJSONObject("magic").getInt("numninethlvl");

         armor = obj.getJSONObject("Character Sheet").getJSONObject("items").getString("armor");
         shield = obj.getJSONObject("Character Sheet").getJSONObject("items").getString("shield");
         equipment = obj.getJSONObject("Character Sheet").getJSONObject("items").getString("equipment");

         strength = obj.getJSONObject("Character Sheet").getJSONObject("attributes").getInt("strength");
         dex = obj.getJSONObject("Character Sheet").getJSONObject("attributes").getInt("dexterity");
         con = obj.getJSONObject("Character Sheet").getJSONObject("attributes").getInt("constitution");
         intelligence = obj.getJSONObject("Character Sheet").getJSONObject("attributes").getInt("intelligence");
         wisdom = obj.getJSONObject("Character Sheet").getJSONObject("attributes").getInt("wisdom");
         charisma = obj.getJSONObject("Character Sheet").getJSONObject("attributes").getInt("charisma");

         strengthMod = obj.getJSONObject("Character Sheet").getJSONObject("modifiers").getInt("strengthMod");
         dexMod = obj.getJSONObject("Character Sheet").getJSONObject("modifiers").getInt("dexMod");
         conMod = obj.getJSONObject("Character Sheet").getJSONObject("modifiers").getInt("conMod");
         intelligenceMod = obj.getJSONObject("Character Sheet").getJSONObject("modifiers").getInt("intelligenceMod");
         wisdomMod = obj.getJSONObject("Character Sheet").getJSONObject("modifiers").getInt("wisdomMod");
         charismaMod = obj.getJSONObject("Character Sheet").getJSONObject("modifiers").getInt("charismaMod");

         acrobatics = obj.getJSONObject("Character Sheet").getJSONObject("modifiers").getJSONObject("skill modifiers").getInt("acrobatics");
         animalHandling = obj.getJSONObject("Character Sheet").getJSONObject("modifiers").getJSONObject("skill modifiers").getInt("animalHandling");
         arcana = obj.getJSONObject("Character Sheet").getJSONObject("modifiers").getJSONObject("skill modifiers").getInt("arcana");
         athletics = obj.getJSONObject("Character Sheet").getJSONObject("modifiers").getJSONObject("skill modifiers").getInt("athletics");
         deception = obj.getJSONObject("Character Sheet").getJSONObject("modifiers").getJSONObject("skill modifiers").getInt("deception");
         history = obj.getJSONObject("Character Sheet").getJSONObject("modifiers").getJSONObject("skill modifiers").getInt("history");
         insight = obj.getJSONObject("Character Sheet").getJSONObject("modifiers").getJSONObject("skill modifiers").getInt("insight");
         intimidation = obj.getJSONObject("Character Sheet").getJSONObject("modifiers").getJSONObject("skill modifiers").getInt("intimidation");
         investigation = obj.getJSONObject("Character Sheet").getJSONObject("modifiers").getJSONObject("skill modifiers").getInt("investigation");
         medicine = obj.getJSONObject("Character Sheet").getJSONObject("modifiers").getJSONObject("skill modifiers").getInt("medicine");
         nature = obj.getJSONObject("Character Sheet").getJSONObject("modifiers").getJSONObject("skill modifiers").getInt("nature");
         perception = obj.getJSONObject("Character Sheet").getJSONObject("modifiers").getJSONObject("skill modifiers").getInt("perception");
         performance = obj.getJSONObject("Character Sheet").getJSONObject("modifiers").getJSONObject("skill modifiers").getInt("performance");
         persuasion = obj.getJSONObject("Character Sheet").getJSONObject("modifiers").getJSONObject("skill modifiers").getInt("persuasion");
         religion = obj.getJSONObject("Character Sheet").getJSONObject("modifiers").getJSONObject("skill modifiers").getInt("religion");
         sleight = obj.getJSONObject("Character Sheet").getJSONObject("modifiers").getJSONObject("skill modifiers").getInt("sleight");
         stealth = obj.getJSONObject("Character Sheet").getJSONObject("modifiers").getJSONObject("skill modifiers").getInt("stealth");
         survival = obj.getJSONObject("Character Sheet").getJSONObject("modifiers").getJSONObject("skill modifiers").getInt("stealth");

         strengthModProficiency = obj.getJSONObject("Character Sheet").getJSONObject("modifiers").getJSONObject("mod proficiency").getBoolean("strengthModProficiency");
         dexModProficiency = obj.getJSONObject("Character Sheet").getJSONObject("modifiers").getJSONObject("mod proficiency").getBoolean("dexModProficiency");
         conModProficiency = obj.getJSONObject("Character Sheet").getJSONObject("modifiers").getJSONObject("mod proficiency").getBoolean("conModProficiency");
         intelligenceModProficiency = obj.getJSONObject("Character Sheet").getJSONObject("modifiers").getJSONObject("mod proficiency").getBoolean("intelligenceModProficiency");
         wisdomModProficiency = obj.getJSONObject("Character Sheet").getJSONObject("modifiers").getJSONObject("mod proficiency").getBoolean("wisdomModProficiency");
         charismaModProficiency = obj.getJSONObject("Character Sheet").getJSONObject("modifiers").getJSONObject("mod proficiency").getBoolean("charismaModProficiency");

         acrobaticsProficiency = obj.getJSONObject("Character Sheet").getJSONObject("modifiers").getJSONObject("mod proficiency").getBoolean("acrobaticsProficiency");
         animalHandlingProficiency = obj.getJSONObject("Character Sheet").getJSONObject("modifiers").getJSONObject("mod proficiency").getBoolean("animalHandlingProficiency");
         arcanaProficiency = obj.getJSONObject("Character Sheet").getJSONObject("modifiers").getJSONObject("mod proficiency").getBoolean("arcanaProficiency");
         athleticsProficiency = obj.getJSONObject("Character Sheet").getJSONObject("modifiers").getJSONObject("mod proficiency").getBoolean("athleticsProficiency");
         deceptionProficiency = obj.getJSONObject("Character Sheet").getJSONObject("modifiers").getJSONObject("mod proficiency").getBoolean("deceptionProficiency");
         historyProficiency = obj.getJSONObject("Character Sheet").getJSONObject("modifiers").getJSONObject("mod proficiency").getBoolean("historyProficiency");
         insightProficiency = obj.getJSONObject("Character Sheet").getJSONObject("modifiers").getJSONObject("mod proficiency").getBoolean("insightProficiency");
         intimidationProficiency = obj.getJSONObject("Character Sheet").getJSONObject("modifiers").getJSONObject("mod proficiency").getBoolean("intimidationProficiency");
         investigationProficiency = obj.getJSONObject("Character Sheet").getJSONObject("modifiers").getJSONObject("mod proficiency").getBoolean("investigationProficiency");
         medicineProficiency = obj.getJSONObject("Character Sheet").getJSONObject("modifiers").getJSONObject("mod proficiency").getBoolean("medicineProficiency");
         natureProficiency = obj.getJSONObject("Character Sheet").getJSONObject("modifiers").getJSONObject("mod proficiency").getBoolean("natureProficiency");
         perceptionProficiency = obj.getJSONObject("Character Sheet").getJSONObject("modifiers").getJSONObject("mod proficiency").getBoolean("perceptionProficiency");
         performanceProficiency = obj.getJSONObject("Character Sheet").getJSONObject("modifiers").getJSONObject("mod proficiency").getBoolean("performanceProficiency");
         persuasionProficiency = obj.getJSONObject("Character Sheet").getJSONObject("modifiers").getJSONObject("mod proficiency").getBoolean("persuasionProficiency");
         religionProficiency = obj.getJSONObject("Character Sheet").getJSONObject("modifiers").getJSONObject("mod proficiency").getBoolean("religionProficiency");
         sleightProficiency = obj.getJSONObject("Character Sheet").getJSONObject("modifiers").getJSONObject("mod proficiency").getBoolean("sleightProficiency");
         stealthProficiency = obj.getJSONObject("Character Sheet").getJSONObject("modifiers").getJSONObject("mod proficiency").getBoolean("stealthProficiency");
         survivalProficiency = obj.getJSONObject("Character Sheet").getJSONObject("modifiers").getJSONObject("mod proficiency").getBoolean("survivalProficiency");
        
         notesTA = obj.getJSONObject("Character Sheet").getJSONObject("misc").getString("notesTA");
        
        CharacterSheetV3 sheet = new CharacterSheetV3( name,  charClass,  level,  alignment,  race,  gender,
         description,  personality,  ideals,  bonds,  flaws,  featuresTraits,
         raceTraits,  classTraits,  armorClass,  initiative,  speed,  health,  tempHealth,
         attacksSpellcasting,  numcantripsKnown,  numspellsKnown,  numfirstlvl,  numsecondlvl,
         numthirdlvl,  numfourthlvl,  numfithlvl,  numsixthlvl,  numseventhlvl,  numeigthlvl,
         numninethlvl,  armor,  shield,  equipment,  strength,  dex,  con,
         intelligence,  wisdom,  charisma,  strengthMod,  dexMod,  conMod,  intelligenceMod,
         wisdomMod,  charismaMod,  acrobatics,  animalHandling,  arcana,  athletics,  deception,
         history,  insight,  intimidation,  investigation,  medicine,  nature,  perception,
         performance,  persuasion,  religion,  sleight,  stealth,  survival,
         strengthModProficiency,  dexModProficiency,  conModProficiency,
         intelligenceModProficiency,  wisdomModProficiency,  charismaModProficiency,
         acrobaticsProficiency,  animalHandlingProficiency,  arcanaProficiency,
         athleticsProficiency,  deceptionProficiency,  historyProficiency,
         insightProficiency,  intimidationProficiency,  investigationProficiency,
         medicineProficiency,  natureProficiency,  perceptionProficiency,
         performanceProficiency,  persuasionProficiency,  religionProficiency,
         sleightProficiency,  stealthProficiency,  survivalProficiency,  notesTA);

    }
    
    public String sendString(String filePath) throws FileNotFoundException{
        JSONObject obj = JSONUtils.getJSONObjectFromFile(filePath);
        String[] names = JSONObject.getNames(obj);
        System.out.println(filePath);
		for (String string : names) {
			System.out.println(string + ": " + obj.get(string));
		}
    
         name = obj.getJSONObject("Character Sheet").getJSONObject("character info").getString("name");
         charClass = obj.getJSONObject("Character Sheet").getJSONObject("character info").getString("character class");
         level = obj.getJSONObject("Character Sheet").getJSONObject("character info").getInt("level");
         alignment = obj.getJSONObject("Character Sheet").getJSONObject("character info").getString("alignment");
         race = obj.getJSONObject("Character Sheet").getJSONObject("character info").getString("race");
         gender = obj.getJSONObject("Character Sheet").getJSONObject("character info").getString("gender");
         description = obj.getJSONObject("Character Sheet").getJSONObject("character info").getString("description");
         personality = obj.getJSONObject("Character Sheet").getJSONObject("character info").getString("personality");
         ideals = obj.getJSONObject("Character Sheet").getJSONObject("character info").getString("ideals");
         bonds = obj.getJSONObject("Character Sheet").getJSONObject("character info").getString("bonds");
         flaws = obj.getJSONObject("Character Sheet").getJSONObject("character info").getString("flaws");
         featuresTraits = obj.getJSONObject("Character Sheet").getJSONObject("character info").getString("featuresTraits");
         raceTraits = obj.getJSONObject("Character Sheet").getJSONObject("character info").getString("raceTraits");
         classTraits = obj.getJSONObject("Character Sheet").getJSONObject("character info").getString("classTraits");

         armorClass = obj.getJSONObject("Character Sheet").getJSONObject("character stats").getInt("armorClass");
         initiative = obj.getJSONObject("Character Sheet").getJSONObject("character stats").getInt("initiative");
         speed = obj.getJSONObject("Character Sheet").getJSONObject("character stats").getInt("speed");
         health = obj.getJSONObject("Character Sheet").getJSONObject("character stats").getInt("health");
         tempHealth = obj.getJSONObject("Character Sheet").getJSONObject("character stats").getInt("tempHealth");

         attacksSpellcasting = obj.getJSONObject("Character Sheet").getJSONObject("magic").getString("attacksSpellcasting");
         numcantripsKnown = obj.getJSONObject("Character Sheet").getJSONObject("magic").getInt("numcantripsKnown");
         numspellsKnown = obj.getJSONObject("Character Sheet").getJSONObject("magic").getInt("numspellsKnown");
         numfirstlvl = obj.getJSONObject("Character Sheet").getJSONObject("magic").getInt("numfirstlvl");
         numsecondlvl = obj.getJSONObject("Character Sheet").getJSONObject("magic").getInt("numsecondlvl");
         numthirdlvl = obj.getJSONObject("Character Sheet").getJSONObject("magic").getInt("numthirdlvl");
         numfourthlvl = obj.getJSONObject("Character Sheet").getJSONObject("magic").getInt("numfourthlvl");
         numfithlvl = obj.getJSONObject("Character Sheet").getJSONObject("magic").getInt("numfithlvl");
         numsixthlvl = obj.getJSONObject("Character Sheet").getJSONObject("magic").getInt("numsixthlvl");
         numseventhlvl = obj.getJSONObject("Character Sheet").getJSONObject("magic").getInt("numseventhlvl");
         numeigthlvl = obj.getJSONObject("Character Sheet").getJSONObject("magic").getInt("numeigthlvl");
         numninethlvl = obj.getJSONObject("Character Sheet").getJSONObject("magic").getInt("numninethlvl");

         armor = obj.getJSONObject("Character Sheet").getJSONObject("items").getString("armor");
         shield = obj.getJSONObject("Character Sheet").getJSONObject("items").getString("shield");
         equipment = obj.getJSONObject("Character Sheet").getJSONObject("items").getString("equipment");

         strength = obj.getJSONObject("Character Sheet").getJSONObject("attributes").getInt("strength");
         dex = obj.getJSONObject("Character Sheet").getJSONObject("attributes").getInt("dexterity");
         con = obj.getJSONObject("Character Sheet").getJSONObject("attributes").getInt("constitution");
         intelligence = obj.getJSONObject("Character Sheet").getJSONObject("attributes").getInt("intelligence");
         wisdom = obj.getJSONObject("Character Sheet").getJSONObject("attributes").getInt("wisdom");
         charisma = obj.getJSONObject("Character Sheet").getJSONObject("attributes").getInt("charisma");

         strengthMod = obj.getJSONObject("Character Sheet").getJSONObject("modifiers").getInt("strengthMod");
         dexMod = obj.getJSONObject("Character Sheet").getJSONObject("modifiers").getInt("dexMod");
         conMod = obj.getJSONObject("Character Sheet").getJSONObject("modifiers").getInt("conMod");
         intelligenceMod = obj.getJSONObject("Character Sheet").getJSONObject("modifiers").getInt("intelligenceMod");
         wisdomMod = obj.getJSONObject("Character Sheet").getJSONObject("modifiers").getInt("wisdomMod");
         charismaMod = obj.getJSONObject("Character Sheet").getJSONObject("modifiers").getInt("charismaMod");

         acrobatics = obj.getJSONObject("Character Sheet").getJSONObject("modifiers").getJSONObject("skill modifiers").getInt("acrobatics");
         animalHandling = obj.getJSONObject("Character Sheet").getJSONObject("modifiers").getJSONObject("skill modifiers").getInt("animalHandling");
         arcana = obj.getJSONObject("Character Sheet").getJSONObject("modifiers").getJSONObject("skill modifiers").getInt("arcana");
         athletics = obj.getJSONObject("Character Sheet").getJSONObject("modifiers").getJSONObject("skill modifiers").getInt("athletics");
         deception = obj.getJSONObject("Character Sheet").getJSONObject("modifiers").getJSONObject("skill modifiers").getInt("deception");
         history = obj.getJSONObject("Character Sheet").getJSONObject("modifiers").getJSONObject("skill modifiers").getInt("history");
         insight = obj.getJSONObject("Character Sheet").getJSONObject("modifiers").getJSONObject("skill modifiers").getInt("insight");
         intimidation = obj.getJSONObject("Character Sheet").getJSONObject("modifiers").getJSONObject("skill modifiers").getInt("intimidation");
         investigation = obj.getJSONObject("Character Sheet").getJSONObject("modifiers").getJSONObject("skill modifiers").getInt("investigation");
         medicine = obj.getJSONObject("Character Sheet").getJSONObject("modifiers").getJSONObject("skill modifiers").getInt("medicine");
         nature = obj.getJSONObject("Character Sheet").getJSONObject("modifiers").getJSONObject("skill modifiers").getInt("nature");
         perception = obj.getJSONObject("Character Sheet").getJSONObject("modifiers").getJSONObject("skill modifiers").getInt("perception");
         performance = obj.getJSONObject("Character Sheet").getJSONObject("modifiers").getJSONObject("skill modifiers").getInt("performance");
         persuasion = obj.getJSONObject("Character Sheet").getJSONObject("modifiers").getJSONObject("skill modifiers").getInt("persuasion");
         religion = obj.getJSONObject("Character Sheet").getJSONObject("modifiers").getJSONObject("skill modifiers").getInt("religion");
         sleight = obj.getJSONObject("Character Sheet").getJSONObject("modifiers").getJSONObject("skill modifiers").getInt("sleight");
         stealth = obj.getJSONObject("Character Sheet").getJSONObject("modifiers").getJSONObject("skill modifiers").getInt("stealth");
         survival = obj.getJSONObject("Character Sheet").getJSONObject("modifiers").getJSONObject("skill modifiers").getInt("stealth");

         strengthModProficiency = obj.getJSONObject("Character Sheet").getJSONObject("modifiers").getJSONObject("mod proficiency").getBoolean("strengthModProficiency");
         dexModProficiency = obj.getJSONObject("Character Sheet").getJSONObject("modifiers").getJSONObject("mod proficiency").getBoolean("dexModProficiency");
         conModProficiency = obj.getJSONObject("Character Sheet").getJSONObject("modifiers").getJSONObject("mod proficiency").getBoolean("conModProficiency");
         intelligenceModProficiency = obj.getJSONObject("Character Sheet").getJSONObject("modifiers").getJSONObject("mod proficiency").getBoolean("intelligenceModProficiency");
         wisdomModProficiency = obj.getJSONObject("Character Sheet").getJSONObject("modifiers").getJSONObject("mod proficiency").getBoolean("wisdomModProficiency");
         charismaModProficiency = obj.getJSONObject("Character Sheet").getJSONObject("modifiers").getJSONObject("mod proficiency").getBoolean("charismaModProficiency");

         acrobaticsProficiency = obj.getJSONObject("Character Sheet").getJSONObject("modifiers").getJSONObject("mod proficiency").getBoolean("acrobaticsProficiency");
         animalHandlingProficiency = obj.getJSONObject("Character Sheet").getJSONObject("modifiers").getJSONObject("mod proficiency").getBoolean("animalHandlingProficiency");
         arcanaProficiency = obj.getJSONObject("Character Sheet").getJSONObject("modifiers").getJSONObject("mod proficiency").getBoolean("arcanaProficiency");
         athleticsProficiency = obj.getJSONObject("Character Sheet").getJSONObject("modifiers").getJSONObject("mod proficiency").getBoolean("athleticsProficiency");
         deceptionProficiency = obj.getJSONObject("Character Sheet").getJSONObject("modifiers").getJSONObject("mod proficiency").getBoolean("deceptionProficiency");
         historyProficiency = obj.getJSONObject("Character Sheet").getJSONObject("modifiers").getJSONObject("mod proficiency").getBoolean("historyProficiency");
         insightProficiency = obj.getJSONObject("Character Sheet").getJSONObject("modifiers").getJSONObject("mod proficiency").getBoolean("insightProficiency");
         intimidationProficiency = obj.getJSONObject("Character Sheet").getJSONObject("modifiers").getJSONObject("mod proficiency").getBoolean("intimidationProficiency");
         investigationProficiency = obj.getJSONObject("Character Sheet").getJSONObject("modifiers").getJSONObject("mod proficiency").getBoolean("investigationProficiency");
         medicineProficiency = obj.getJSONObject("Character Sheet").getJSONObject("modifiers").getJSONObject("mod proficiency").getBoolean("medicineProficiency");
         natureProficiency = obj.getJSONObject("Character Sheet").getJSONObject("modifiers").getJSONObject("mod proficiency").getBoolean("natureProficiency");
         perceptionProficiency = obj.getJSONObject("Character Sheet").getJSONObject("modifiers").getJSONObject("mod proficiency").getBoolean("perceptionProficiency");
         performanceProficiency = obj.getJSONObject("Character Sheet").getJSONObject("modifiers").getJSONObject("mod proficiency").getBoolean("performanceProficiency");
         persuasionProficiency = obj.getJSONObject("Character Sheet").getJSONObject("modifiers").getJSONObject("mod proficiency").getBoolean("persuasionProficiency");
         religionProficiency = obj.getJSONObject("Character Sheet").getJSONObject("modifiers").getJSONObject("mod proficiency").getBoolean("religionProficiency");
         sleightProficiency = obj.getJSONObject("Character Sheet").getJSONObject("modifiers").getJSONObject("mod proficiency").getBoolean("sleightProficiency");
         stealthProficiency = obj.getJSONObject("Character Sheet").getJSONObject("modifiers").getJSONObject("mod proficiency").getBoolean("stealthProficiency");
         survivalProficiency = obj.getJSONObject("Character Sheet").getJSONObject("modifiers").getJSONObject("mod proficiency").getBoolean("survivalProficiency");
        
         notesTA = obj.getJSONObject("Character Sheet").getJSONObject("misc").getString("notesTA");
        
         String send = ( name+","+  charClass+","+  level+","+  alignment+","+  race+","+  gender+","+
         description+","+  personality+","+  ideals+","+  bonds+","+  flaws+","+  featuresTraits+","+
         raceTraits+","+classTraits+","+armorClass+","+initiative+","+speed+","+health+","+tempHealth+","+
         attacksSpellcasting+","+numcantripsKnown+","+numspellsKnown+","+numfirstlvl+","+numsecondlvl+","+
         numthirdlvl+","+numfourthlvl+","+numfithlvl+","+numsixthlvl+","+numseventhlvl+","+numeigthlvl+","+
         numninethlvl+","+armor+","+shield+","+equipment+","+strength+","+dex+","+con+","+
         intelligence+","+wisdom+","+charisma+","+strengthMod+","+dexMod+","+conMod+","+intelligenceMod+","+
         wisdomMod+","+charismaMod+","+acrobatics+","+animalHandling+","+arcana+","+athletics+","+deception+","+
         history+","+insight+","+intimidation+","+investigation+","+medicine+","+nature+","+perception+","+
         performance+","+persuasion+","+religion+","+sleight+","+stealth+","+survival+","+
         strengthModProficiency+","+dexModProficiency+","+conModProficiency+","+
         intelligenceModProficiency+","+wisdomModProficiency+","+charismaModProficiency+","+
         acrobaticsProficiency+","+animalHandlingProficiency+","+  arcanaProficiency+","+
         athleticsProficiency+","+deceptionProficiency+","+historyProficiency+","+
         insightProficiency+","+intimidationProficiency+","+investigationProficiency+","+
         medicineProficiency+","+natureProficiency+","+perceptionProficiency+","+
         performanceProficiency+","+persuasionProficiency+","+religionProficiency+","+
         sleightProficiency+","+stealthProficiency+","+survivalProficiency+","+notesTA);

        return send;
      
   }
	public static void main(String[] args) {
        
        
    }
}