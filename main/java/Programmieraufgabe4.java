public class Programmieraufgabe4 {
    public static void main(String[] args) {
        int Line = 7;
        String Stern = "*";
        String Punkt = ".";
        int Anz =7;
        int Anz2= 7;

        while (Line >=0) {
            while (Anz>=1) {
                if (Anz2==5) {
                    System.out.print(Punkt);
                    Anz--;
                }
                else {
                    System.out.print(Stern);
                    Anz--;
                }
            }
            Line--;
            Anz2=Anz2-1;
            Anz=Anz2;
            System.out.println();
        }

    }
}