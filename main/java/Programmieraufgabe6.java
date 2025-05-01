public class Programmieraufgabe6 {
    public static void main(String[] args) {
        int Line = 9;
        String Stern = "*";
        String Punkt = ".";
        int Anz = 1;
        int Anz2 = 1;

        while (Line>=1) {
            while (Anz2<=9){
                if (Anz % 2==0) {
                    System.out.print(Punkt);
                    Anz++;
                    Anz2++;
                }
                else {
                    System.out.print(Stern);
                    Anz++;
                    Anz2++;
                }

            }
            Line--;
            Anz2=1;
            System.out.println();
        }
    }
}

