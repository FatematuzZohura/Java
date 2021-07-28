
package Project;


public class Patient {
    private final String patientName;
    private final int patientAge;
    private final String  patientGender;
    private final String disease;
    Patient (String patientName, int patientAge,String patientGender, String disease)
    {
        this.patientName= patientName;
        this.patientGender= patientGender;
        this.patientAge=patientAge;
        this.disease=disease;
    }   

    public String getDisease()
    {return disease;}

    @Override
    public String toString()
    {
        return (patientName+""+patientAge+""+patientGender +" "+ disease);
    }
}
