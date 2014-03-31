import java.util.Random;
/**
 * DiceRoller will generate random numbers for basic
 * attributes of a D&D character using a 3.5 ruleset character
 * record sheet.
 * 
 * 
 * @author Paul Castillo 
 * @version 3/21/2014
 */
public class DiceRoller
{
    private int [] strengthRolls;
    private int [] dexterityRolls;
    private int [] constitutionRolls;
    private int [] intelligenceRolls;
    private int [] wisdomRolls;
    private int [] charsimaRolls;
    
    private int baseStrength;
    private int baseDexterity;
    private int baseConstitution;
    private int baseIntelligence;
    private int baseWisdom;
    private int baseCharisma;

    private Random randomGenerator;
    /**
     * DiceRoller creates a new random object.
     */
    public DiceRoller()
    {
        randomGenerator = new Random();
    }

    /**
     * rollBaseStats creates an array of four ints
     * for each base stat array, ("basestat"Rolls).
     */
    public void rollBaseStats()
    {
        reset();
        baseStrength = diceRoll();
        baseDexterity = diceRoll();
        baseConstitution = diceRoll();
        baseIntelligence = diceRoll();
        baseWisdom = diceRoll();
        baseCharisma = diceRoll();

        System.out.println("Base Strength: " + baseStrength);
        System.out.println("Base Dexterity: " + baseDexterity);
        System.out.println("Base Constitution: " + baseConstitution);
        System.out.println("Base Intelligence: " + baseIntelligence);
        System.out.println("Base Wisdom: " + baseWisdom);
        System.out.println("Base Charisma: " + baseCharisma);
    }

    /**
     * diceRoll returns an int 1 - 6.
     * @return number An int 1 - 6.
     */
    public int diceRoll()
    {
        int number;
        number = randomGenerator.nextInt(6) + 1;
        return number;
    }

    /**
     * reset() sets all stats to 0.
     */
    public void reset()
    {
        baseStrength = 0;
        baseDexterity = 0;
        baseConstitution = 0;
        baseIntelligence = 0;
        baseWisdom = 0;
        baseCharisma = 0;
    }

    /**
     * getBaseStrength() returns baseStrength.
     * @return baseStrength
     */
    public int getBaseStrength()
    {
        return baseStrength;
    }

    /**
     * getBaseConstitution() returns baseDexterity.
     * @return baseDexterity
     */
    public int getBaseDexterity()
    {
        return baseDexterity;
    }

    /**
     * getBaseConstitution() returns baseConstitution.
     * @return baseConstitution
     */
    public int getBaseConstitution()
    {
        return baseConstitution;
    }

    /**
     * getBaseIntelligence() returns baseIntelligence.
     * @return baseIntelligence
     */
    public int getBaseIntelligence()
    {
        return baseIntelligence;
    }

    /**
     * getBaseWisdom() returns baseWisdom.
     * @return baseWisdom
     */
    public int getBaseWisdom()
    {
        return baseWisdom;
    }

    /**
     * getBaseCharisma() returns baseCharisma.
     * @return baseCharisma
     */
    public int getBaseCharisma()
    {
        return baseCharisma;
    }
}
