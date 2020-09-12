
import java.util.Scanner;

public class üni {
    public static void main(String[] args) {
        System.out.println("---------------Welcome to Izmir Universirty Of Economics Grade Calculator--------------");
        Scanner scan = new Scanner(System.in);
        while (true) {

           System.out.println("please enter your  name: ");
            String nam = scan.next();
            System.out.println("please enter your surname: ");
            String sur = scan.next();
            System.out.println("please enter your school İD :  ");
            int schoolID = scan.nextInt();
            System.out.println("please enter your class name : ");
            String cn = scan.next();
            System.out.println("please enter your 1st GRADE : "   );
            int fırstGrade = scan.nextInt();
            System.out.println("please enter your 2ND GRADE : ");
            int secondGrade = scan.nextInt();
            System.out.println("please enter your 3TH GRADE :  ");
            int thırdGrade = scan.nextInt();

            int avarageofGrades=(fırstGrade+secondGrade+thırdGrade)/3;


                if (secondGrade >= 90) {
                    System.out.println("Situation:AA   "+avarageofGrades+":PASS WİTH GREAT ");


                }
                else if (90>secondGrade && secondGrade>=85){
                    System.out.println("Situation:  "+avarageofGrades+"  BA:PASS WİTH GREAT ");

                }

                else if (85>secondGrade && secondGrade>=80) {

                    System.out.println("Situation:  "+avarageofGrades+"BB:PASS");

                }

                else if (80>secondGrade && secondGrade >=75) {

                    System.out.println("Situation:   "+avarageofGrades+"CB: PASS ");

                }

                else if (75>secondGrade && secondGrade >=70) {

                    System.out.println("Situation:   "+avarageofGrades+"CC:PASS ");

                }

                else if (70>secondGrade && secondGrade >=65) {

                    System.out.println("Situation:  "+avarageofGrades+"DC:PASS BUT NEED TO STUDY HARDER  ");

                }

                else if (65>secondGrade && secondGrade >=60) {

                    System.out.println("Situation:  "+avarageofGrades+"DD:PASS BUT NEED TO STUDY HARDER ");

                }

                else if (60>secondGrade && secondGrade >=40) {

                    System.out.println("Situation:FD  "+avarageofGrades+":FAİL,WİTH CONDİTİON ");

                }

                else if (40>=secondGrade){

                    System.out.println("Situation:FF  "+avarageofGrades+":FAİL,NEED TO REPEAT THİS CLASS ");









                }





        }}}
