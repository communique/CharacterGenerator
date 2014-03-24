import java.util.Random;
import java.util.Scanner;
/**
 * CharacterGenerator will generate random numbers for basic
 * attributes of a D&D character using a 3.5 ruleset character
 * record sheet.
 * 
 * 
 * @author Paul Castillo 
 * @version 3/21/2014
 */
public class CharacterGenerator
{
    public static final int MAX_BASE_ATTRIBUTE = 18;
    
    private int baseStrength;
    private int baseDexterity;
    private int baseConstitution;
    private int baseIntelligence;
    private int baseWisdom;
    private int baseCharisma;
    private int weight;
    private int height;
    private int number;

    private String charFirstName;
    private String charLastName;
    private String Alignment;
    private String patronDeity;
    private String characterGender;
    
    private Random randomGenerator;
    Scanner keyboard = new Scanner(System.in);

    public CharacterGenerator()
    {
        randomGenerator = new Random();
    }
    
    public void rollBaseStats()
    {
        reset();
        baseStrength = diceRoll();
        baseDexterity = diceRoll();
        baseConstitution = diceRoll();
        baseIntelligence = diceRoll();
        baseWisdom = diceRoll();
        baseCharisma = diceRoll();
        
        System.out.println(baseStrength);
        System.out.println(baseDexterity);
        System.out.println(baseConstitution);
        System.out.println(baseIntelligence);
        System.out.println(baseWisdom);
        System.out.println(baseCharisma);
    }
    
    public int diceRoll()
    {
        int number;
        number = randomGenerator.nextInt(18) + 1;
        return number;
        
    }
    
    public void reset()
    {
        baseStrength = 0;
        baseDexterity = 0;
        baseConstitution = 0;
        baseIntelligence = 0;
        baseWisdom = 0;
        baseCharisma = 0;
        weight = 0;
        height = 0;
        charFirstName = "blank";
        charLastName = "blank";
        Alignment = "blank";
        patronDeity = "blank";
        characterGender = "blank";
    }
    
    public int getBaseStrength()
    {
        return baseStrength;
    }
    
    public int getBaseDexterity()
    {
        return baseDexterity;
    }
    
    public int getBaseConstitution()
    {
        return baseConstitution;
    }
    
    public int getBaseIntelligence()
    {
        return baseIntelligence;
    }
    
    public int getBaseWisdom()
    {
        return baseWisdom;
    }
    
    public int getBaseCharisma()
    {
        return baseCharisma;
    }
    
    public int getWeight()
    {
        return weight;
    }
    
    public int getHeight()
    {
        return height;
    }
}
