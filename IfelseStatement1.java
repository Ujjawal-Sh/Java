public class IfelseStatement1 {
    public static void main(String args[]) {
        int marks = 95;
        if (marks < 50) {
            System.out.println("Fail");
        } else if (marks >= 50 && marks < 65) {
            System.out.println("D grade");
        } else if (marks >= 65 && marks < 75) {
            System.out.println("C grade");
        } else if (marks >= 75 && marks < 90) {
            System.err.println("B grade");
        } else if (marks >= 90 && marks <= 100) {
            System.out.println("A grade");
        } else {
            System.out.println("Invalid");
        }
    }
}
