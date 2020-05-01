import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

import org.json.JSONStringer;

public class JSONWriter {
    String myString;

    protected String name;
    protected String charClass;
    protected int level;
    protected String alignment;
    protected String race;
    protected String gender;
    protected String description;

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
    protected int health;
    protected int tempHealth;

    protected String personality;
    protected String ideals;
    protected String bonds;
    protected String flaws;
    protected String featuresTraits;

    protected String armor;
    protected String otherProf;
    protected String equipment;
    protected String shield;
    protected String attacksSpellcasting = "";
    protected String raceTraits;
    protected String classTraits;
    protected String notesTA;

    protected int numcantripsKnown;
    protected int numspellsKnown;
    protected int numfirstlvl;
    protected int numsecondlvl;
    protected int numthirdlvl;
    protected int numfourthlvl;
    protected int numfithlvl;
    protected int numsixthlvl;
    protected int numseventhlvl;
    protected int numeigthlvl;
    protected int numninethlvl;

    public JSONWriter(String _name, String _charClass, int _level, String _alignment, String _race, String _gender,
            String _description, int _strength, int _dex, int _con, int _intelligence, int _wisdom, int _charisma,
            int _strengthMod, int _dexMod, int _conMod, int _intelligenceMod, int _wisdomMod, int _charismaMod,
            int _acrobatics, int _animalHandling, int _arcana, int _athletics, int _deception, int _history,
            int _insight, int _intimidation, int _investigation, int _medicine, int _nature, int _perception,
            int _performance, int _persuasion, int _religion, int _sleight, int _stealth, int _survival,
            boolean _strengthModProficiency, boolean _dexModProficiency, boolean _conModProficiency,
            boolean _intelligenceModProficiency, boolean _wisdomModProficiency, boolean _charismaModProficiency,
            boolean _acrobaticsProficiency, boolean _animalHandlingProficiency, boolean _arcanaProficiency,
            boolean _athleticsProficiency, boolean _deceptionProficiency, boolean _historyProficiency,
            boolean _insightProficiency, boolean _intimidationProficiency, boolean _investigationProficiency,
            boolean _medicineProficiency, boolean _natureProficiency, boolean _perceptionProficiency,
            boolean _performanceProficiency, boolean _persuasionProficiency, boolean _religionProficiency,
            boolean _sleightProficiency, boolean _stealthProficiency, boolean _survivalProficiency, int _armorClass,
            int _initiative, int _speed, int _health, int _tempHealth, String _personality, String _ideals,
            String _bonds, String _flaws, String _featuresTraits, String _armor, String _otherProf, String _equipment,
            String _shield, String _attacksSpellcasting, String _raceTraits, String _classTraits, String _notesTA,
            int _numcantripsKnown, int _numspellsKnown, int _numfirstlvl, int _numsecondlvl, int _numthirdlvl,
            int _numfourthlvl, int _numfithlvl, int _numsixthlvl, int _numseventhlvl, int _numeigthlvl,
            int _numninethlvl, String _fileName) throws FileNotFoundException, UnsupportedEncodingException {

        name = _name;
        charClass = _charClass;
        level = _level;
        alignment = _alignment;
        race = _race;
        gender = _gender;
        description = _description;

        strength = _strength;
        dex = _dex;
        con = _con;
        intelligence = _intelligence;
        wisdom = _wisdom;
        charisma = _charisma;

        strengthMod = _strengthMod;
        dexMod = _dexMod;
        conMod = _conMod;
        intelligenceMod = _intelligenceMod;
        wisdomMod = _wisdomMod;
        charismaMod = _charismaMod;

        acrobatics = _acrobatics;
        animalHandling = _animalHandling;
        arcana = _arcana;
        athletics = _athletics;
        deception = _deception;
        history = _history;
        insight = _insight;
        intimidation = _intimidation;
        investigation = _investigation;
        medicine = _medicine;
        nature = _nature;
        perception = _perception;
        performance = _performance;
        persuasion = _persuasion;
        religion = _religion;
        sleight = _sleight;
        stealth = _stealth;
        survival = _survival;

        strengthModProficiency = _strengthModProficiency;
        dexModProficiency = _dexModProficiency;
        conModProficiency = _conModProficiency;
        intelligenceModProficiency = _intelligenceModProficiency;
        wisdomModProficiency = _wisdomModProficiency;
        charismaModProficiency = _charismaModProficiency;

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

        armorClass = _armorClass;
        initiative = _initiative;
        speed = _speed;
        health = _health;
        tempHealth = _tempHealth;

        personality = _personality;
        ideals = _ideals;
        bonds = _bonds;
        flaws = _flaws;
        featuresTraits = _featuresTraits;

        armor = _armor;
        otherProf = _otherProf;
        equipment = _equipment;
        shield = _shield;
        attacksSpellcasting = _attacksSpellcasting;
        raceTraits = _raceTraits;
        classTraits = _classTraits;
        notesTA = _notesTA;

        numcantripsKnown = _numcantripsKnown;
        numspellsKnown = _numspellsKnown;
        numfirstlvl = _numfirstlvl;
        numsecondlvl = _numsecondlvl;
        numthirdlvl = _numthirdlvl;
        numfourthlvl = _numfourthlvl;
        numfithlvl = _numfithlvl;
        numsixthlvl = _numsixthlvl;
        numseventhlvl = _numseventhlvl;
        numeigthlvl = _numeigthlvl;
        numninethlvl = _numninethlvl;
        
        String fileName = _fileName;
        WriteJSON();
        WriteToFile(fileName);
    }

    public JSONWriter() {
        WriteJSON();
        System.out.println(myString);
    }

    public void WriteToFile(String fileName) throws FileNotFoundException, UnsupportedEncodingException {
        File file = new File(fileName + ".json");
        PrintWriter writer = new PrintWriter(fileName + ".json");
        writer.println(myString);
        writer.close();
    }

    public void WriteJSON() {
         myString = new JSONStringer()
            .object()
                .key("Character Sheet").object()

                    .key("character info").object()
                        .key("name")
                            .value(name)
                        .key("character class")
                            .value(charClass)
                        .key("level")
                            .value(level)
                        .key("alignment")
                            .value(alignment)
                        .key("race")
                            .value(race)
                        .key("gender")
                            .value(gender)
                        .key("description")
                            .value(description)
                        .key("personality")
                            .value(personality)
                        .key("ideals")
                            .value(ideals)
                        .key("bonds")
                            .value(bonds)
                        .key("flaws")
                            .value(flaws)
                        .key("featuresTraits")
                            .value(featuresTraits)
                        .key("raceTraits")
                            .value(raceTraits)
                            //meow
                        .key("classTraits")
                            .value(classTraits)
                    .endObject()//character info object

                    .key("character stats").object()
                        .key("armorClass")
                            .value(armorClass)
                        .key("initiative")
                            .value(initiative)
                        .key("speed")
                            .value(speed)
                        .key("health")
                            .value(health)
                        .key("tempHealth")
                            .value(tempHealth)
                    .endObject()// character stats object

                    .key("magic").object()
                        .key("attacksSpellcasting")
                            .value(attacksSpellcasting)
                        .key("numcantripsKnown")
                            .value(numcantripsKnown)
                        .key("numspellsKnown")
                            .value(numspellsKnown)
                        .key("numfirstlvl")
                            .value(numfirstlvl)
                        .key("numsecondlvl")
                            .value(numsecondlvl)
                        .key("numthirdlvl")
                            .value(numthirdlvl)
                        .key("numfourthlvl")
                            .value(numfourthlvl)
                        .key("numfithlvl")
                            .value(numfithlvl)
                        .key("numsixthlvl")
                            .value(numsixthlvl)
                        .key("numseventhlvl")
                            .value(numseventhlvl)
                        .key("numeigthlvl")
                            .value(numeigthlvl)
                        .key("numninethlvl")
                            .value(numninethlvl)
                    .endObject()// magic object

                    .key("items").object()
                        .key("armor")
                            .value(armor)
                        .key("shield")
                            .value(shield)
                        .key("equipment")
                            .value(equipment)
                    .endObject()// items object

                    .key("attributes").object()
                        .key("strength")
                            .value(strength)
                        .key("dexterity")
                            .value(dex)
                        .key("constitution")
                            .value(con)
                        .key("intelligence")
                            .value(intelligence)
                        .key("wisdom")
                            .value(wisdom)
                        .key("charisma")
                            .value(charisma)
                    .endObject() // attributes object

                    .key("modifiers").object()
                        .key("strengthMod")
                            .value(strengthMod)
                        .key("dexMod")
                            .value(dexMod)
                        .key("conMod")
                            .value(conMod)
                        .key("intelligenceMod")
                            .value(intelligenceMod)
                        .key("wisdomMod")
                            .value(wisdomMod)
                        .key("charismaMod")
                            .value(charismaMod)
                        
                        .key("skill modifiers").object()
                            .key("acrobatics")
                                .value(acrobatics)
                            .key("animalHandling")
                                .value(animalHandling)
                            .key("arcana")
                                .value(arcana)
                            .key("athletics")
                                .value(athletics)
                            .key("deception")
                                .value(deception)
                            .key("history")
                                .value(history)
                            .key("insight")
                                .value(insight)
                            .key("intimidation")
                                .value(intimidation)
                            .key("investigation")
                                .value(investigation)
                            .key("medicine")
                                .value(medicine)
                            .key("nature")
                                .value(nature)
                            .key("perception")
                                .value(perception)
                            .key("performance")
                                .value(performance)
                            .key("persuasion")
                                .value(persuasion)
                            .key("religion")
                                .value(religion)
                            .key("sleight")
                                .value(sleight)
                            .key("stealth")
                                .value(stealth)
                            .key("survival")
                                .value(survival)
                        .endObject() //skill modifiers object

                        .key("mod proficiency").object()
                            .key("strengthModProficiency")
                                .value(strengthModProficiency)
                            .key("dexModProficiency")
                                .value(dexModProficiency)
                            .key("conModProficiency")
                                .value(conModProficiency)
                            .key("intelligenceModProficiency")
                                .value(intelligenceModProficiency)
                            .key("wisdomModProficiency")
                                .value(wisdomModProficiency)
                            .key("charismaModProficiency")
                                .value(charismaModProficiency)
                            .key("acrobaticsProficiency")
                                .value(acrobaticsProficiency)
                            .key("animalHandlingProficiency")
                                .value(animalHandlingProficiency)
                            .key("arcanaProficiency")
                                .value(arcanaProficiency)
                            .key("athleticsProficiency")
                                .value(athleticsProficiency)
                            .key("deceptionProficiency")
                                .value(deceptionProficiency)
                            .key("historyProficiency")
                                .value(historyProficiency)
                            .key("insightProficiency")
                                .value(insightProficiency)
                            .key("intimidationProficiency")
                                .value(intimidationProficiency)
                            .key("investigationProficiency")
                                .value(investigationProficiency)
                            .key("medicineProficiency")
                                .value(medicineProficiency)
                            .key("natureProficiency")
                                .value(natureProficiency)
                            .key("perceptionProficiency")
                                .value(perceptionProficiency)
                            .key("performanceProficiency")
                                .value(performanceProficiency)
                            .key("persuasionProficiency")
                                .value(persuasionProficiency)
                            .key("religionProficiency")
                                .value(religionProficiency)
                            .key("sleightProficiency")
                                .value(sleightProficiency)
                            .key("stealthProficiency")
                                .value(stealthProficiency)
                            .key("survivalProficiency")
                                .value(survivalProficiency)
                        .endObject() //mod proficiency object
                    .endObject() // modifiers object

                    .key("misc").object()
                        .key("notesTA")
                            .value(notesTA)
                    .endObject() //misc object

                .endObject() // Character Sheet object
            .endObject()
        .toString();
    }
}