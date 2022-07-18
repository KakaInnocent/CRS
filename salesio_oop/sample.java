import java.util.*; // To be able to use lists
class student{
    int studentID; //student serial number
    String firstName;
    String secondName;
    String course;
    String mathsGrade;
    String englishGrade;
    String computerScienceGrade;

    //What is a constructor?
    student(int SN, String fN, String lN, String crs, String mGrade, String eGrade, String csGrade){
        this.studentID = SN;
        this.firstName = fN;
        this.secondName = lN;
        this.course = crs;
        this.mathsGrade = mGrade;
        this.englishGrade = eGrade;
        this.computerScienceGrade = csGrade;
       }

       public void display(){
        System.out.println("Student ID: "+ this.studentID);
        System.out.println("First Name: "+ this.firstName);
        System.out.println("Second Name: "+ this.secondName);
        System.out.println("Course: "+ this.course);
        System.out.println("Maths Grade: "+ this.mathsGrade);
        System.out.println("English Grade: "+ this.englishGrade);
        System.out.println("Computer Science: "+ this.computerScienceGrade);
       }
}


public class sample{
        public static void main(String[] args) {
        //student student1 = new student(1, "Samuel", "Jackson", "Informatics Technology", "A", "B", "C");
        //student1.display();

        // Hard coding the names, and marks can be tedious and therefore we create an array to store our values.
        List<student> lists=new ArrayList<student>();

        int StdID[] = {0, 1, 2, 3};
        String fName[] = {"James", "Donald", "Mark", "Rachel"};
        String lName[] = {"Musau", "Kipkorir", "Goldberg", "Adenta"};
        String crse[] = {"System Design", "Economics", "Nursing", "Hospitality"};
        String mathGrd[] = {"C", "D", "A", "B"};
        String engGrd[] = {"A", "B", "C", "D"};
        String csGrd[] = {"D", "B", "A", "A"};

        for (int i=0; i<4; i++){
            student studentS = new student(StdID[i], fName[i], lName[i], crse[i], mathGrd[i], engGrd[i], csGrd[i]);
            lists.add(studentS);
        }
        
        for (int i=0; i<4; i++){
            lists.get(i).display();
        }
    }
}