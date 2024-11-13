
/**
 * DŽcrivez votre classe Drug ici.
 *
 * @author (votre nom)
 * @version (un numŽro de version ou une date)
 */
public class Drug
{
    // variables d'instance - remplacez l'exemple qui suit par le v™tre
    private int x;
    private String name;
    private String laboratory;
    private String indication;
    private String activePrinciple;
    private String therapeuticClass;
    private boolean asthmaticContraIndication = false;
    private boolean pregnantContraIndication = false;
    private int dosage;
    private int posology;
    private int pillNumber;
    

    /**
     * Constructeur d'objets de classe Drug
     */
    public Drug(String Name, String Laboratory, String Indication,
    String ActivePrinciple, String TherapeuticClass, int Dosage,
    int PillNumber)
    {
        this.name = Name;
        this.laboratory = Laboratory;
        this.indication = Indication;
        this.activePrinciple = ActivePrinciple;
        this.therapeuticClass = TherapeuticClass;
        this.dosage = Dosage;
        this.pillNumber = PillNumber;
    }
    
    public String getName(){
        return this.name;
    }
    
    public String getLaboratory(){
        return this.laboratory;
    }
    
    public String getActivePrinciple(){
        return this.activePrinciple;
    }
    
    public String getIndication(){
        return this.indication;
    }
    
    public String getTherapeuticClass(){
        return this.therapeuticClass;
    }
    
    public int getDosage(){
        return this.dosage;
    }
    
    public boolean getAsthmaticContraIndication(){
        return asthmaticContraIndication;
    }
    
    public boolean getPregnantContraIndication(){
        return pregnantContraIndication;
    }
    
    public int getPosology(){
        return posology;
    }
    
    public int getPillNumber(){
        return pillNumber;
    }
    
    public void setAsthmaticContraIndication(boolean AsthContre){
        asthmaticContraIndication = AsthContre;
    }
    
    public void setPregnantContraIndication(boolean PregContre){
        this.pregnantContraIndication = PregContre;
    }
    
    public void setPillNumber(int number){
        if (number > 0 ){
        this.pillNumber= number;
        }
    }
    
    public void setPosology(int newPosology){
        if (newPosology > 0 ){
        this.posology = newPosology;
        }
    }
    
}
