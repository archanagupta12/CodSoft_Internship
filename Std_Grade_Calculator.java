    import java.util.Scanner;
    public class Std_Grade_Calculator {
        public static void main(String[] args) {
            Scanner x= new Scanner(System.in);
            System.out.println("----Student Grade Calculator----");
            System.out.println("Enter total subjects:-");
            int tS= x.nextInt();
            int t=0;
            for (int i = 0; i < tS; i++) {
                System.out.println("Enter marks gained " + (i + 1));
                int m = x.nextInt();
                t=t+m;
            }
            double aPer = (double) t/ tS;
            char g;
            if (aPer >= 90) {
                g = 'O';
            } 
            else if (aPer >= 80) {
                g = 'A';
            } 
            else if (aPer >= 70) {
                g = 'B';
            } 
            else if (aPer >= 60) {
                g = 'C';
            }
            else if (aPer >= 50) {
                g = 'D';
            } 
            else {
                g = 'F';
            }
            System.out.println("Total Marks: " + t);
            System.out.println("Average Percentage : "+aPer+ "%");
            System.out.println("Grade: " + g);
        }
 }
    
