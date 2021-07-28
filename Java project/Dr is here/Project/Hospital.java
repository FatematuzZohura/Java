
package Project;

import java.util.ArrayList;
import java.util.Scanner;


public class Hospital {
    int doctorCount = 0;
   int patientCount=0;
   ArrayList<Doctor> doctorList = new ArrayList<>();
   ArrayList <Patient> patientList = new ArrayList<>();
   public void start() {
  @SuppressWarnings("resource")
  Scanner input = new Scanner(System.in);
  char YesOrNo = 'Y';
  while (YesOrNo  =='Y'){
   System.out.print("\tQ:What do you want to do?\n\n");
   System.out.print("\t\t1 :  Add doctor\n\n");
   System.out.print("\t\t2 : Show doctors\n\n");
   System.out.print("\t\t3 : Add patient\n\n");
   System.out.print("\t\t4 : Assign doctor to patients\n\n");
   System.out.print("\t\t5 : Doctor and their patients\n\n");
      
   System.out.println("\t\t\tYou Select : ");
   String switchChoice=input.next();
   switch (Integer.parseInt(switchChoice)) 
   {
    case 1: {
     @SuppressWarnings("resource")
     
     Scanner input1 = new Scanner(System.in);
     String tempName;
     String  tempSpeciality;
     
     System.out.print("Enter Doctor Name:");
     tempName = input1.nextLine();
     tempName = tempName + " ";
     
     System.out.print("Select Doctor Speciality\n1: Opthalmologist \n2: Surgeon \n3: ENT");
     Scanner input2 = new Scanner(System.in);
     int tempSpecNo = input1.nextInt();
       switch (tempSpecNo) {
           case 1:
               tempSpeciality="Opthalmologist";
               break;
           case 2:
               tempSpeciality="Surgeon";
               break;
           case 3:
               tempSpeciality="ENT";
               break;
           default:
               tempSpeciality=" ";
               break;
       }
     Doctor o1 = new Doctor(tempName,tempSpeciality);
     doctorList.add(doctorCount,o1);
     doctorCount++;
     break;
    }
    case 2: {
     showDoctors();
     break;
    }
    case 3: {
     @SuppressWarnings("resource")
     
     Scanner input1 = new Scanner(System.in);
     String tempName,tempGender, tempDisease;
     int tempAge;
     
     System.out.print("Enter Patient Name:");
     tempName = input1.nextLine();
     tempName = tempName + " ";
     
     System.out.print("Enter Patient Age:");
     @SuppressWarnings("resource")
     Scanner input2 = new Scanner(System.in);
     tempAge = input2.nextInt();
     
     System.out.print("Enter Patient Gender:");
     @SuppressWarnings("resource")
     Scanner input3 = new Scanner(System.in);
     tempGender = input3.nextLine();
     tempGender = " " + tempGender + " ";
     

     
     System.out.print("Select Patient Disease\n1: eye \n2: heart patient \n3: earnose");
     Scanner input4 = new Scanner(System.in);
     int tempSpecNo = input4.nextInt();
       switch (tempSpecNo) {
           case 1:
               tempDisease="eye";
               break;
           case 2:
               tempDisease="heart patient";
               break;
           case 3:
               tempDisease="earnose";
               break;
           default:
               tempDisease=" ";
               break;
       }
     
     Patient p1 = new Patient(tempName,tempAge,tempGender, tempDisease);
     
     patientList.add(patientCount,p1);
     patientCount++;
     break;
//                    System.out.println(showPatients());
    }
    case 4: {
     assignDoctor();
     break;
    }
    case 5: {
     System.out.print("Enter Doctor ID > 0 AND <= "+Integer.toString(doctorCount));
     @SuppressWarnings("resource")
     Scanner in = new Scanner(System.in);
     int i = in.nextInt();
     i=i--;
     System.out.println("\n \n \n "+ ""+doctorList.get(i).getDoctorName()+""+doctorList.get(i).getDoctorPatientList());
     break;
    }
    default: {
     System.out.println("Invalid Selection");
      break;
    }
   }
   System.out.println("\n\tDo u want to Do some thing Else \n\t\tY = yes\n\t\tN = No\n");
   System.out.println("You Select : ");
   YesOrNo =(input.next()).charAt(0);
   if(Character.isLowerCase(YesOrNo )){
    YesOrNo =Character.toUpperCase(YesOrNo );
   }
  }
 }
 
 
   public void showDoctors()
  {
      for(int i = 0 ; i<doctorCount;i++ ){
       System.out.println(doctorList.get(i)+"\n");
      }
  }
  public ArrayList<Patient> showPatients()
  {
      return patientList;
  }

  public void assignDoctor()
  {
      
   for (Patient x: patientList)
   {      
    for (Doctor y: doctorList)
    {     
     if (x.getDisease().equals("eye"))
     {
      if (y.getDoctorspeciality().equals("Opthalmologist"))
      {
       y.addPatientsToDoctor(x);
       System.out.println("\n Docter(Opthalmologist) Added  With Patient with Eye disease");
      }
     }
     if (x.getDisease().equals("Heart patient"))
     {
      if (y.getDoctorspeciality().equals("Surgeon"))
      {
       y.addPatientsToDoctor(x);
       System.out.println("\n Docter(Surgeon) Added  With Patient with heart disease");
      }
     }
     if (x.getDisease().equals("earnose"))
     {
      if (y.getDoctorspeciality().equals("ENT"))
      {
       y.addPatientsToDoctor(x);
       System.out.println("\n Docter(ENT) Added  With Patient with earnose disease");
      }
     }
    }
   }
  }
    
}
