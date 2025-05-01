public class Programmieraufgabe5 {
    public static void main(String[] args) {
        int Line = 9;
        String Stern = "*";
        int Anz =1;
        int Anz2= 1;
        int da=0;

        while (Line >= 0) {
            while (Anz>=1) {
                System.out.print(Stern);
                Anz--;
            }
            if (Anz2<=4 && da==0) {
                Anz2++;
            }
            else {
                Anz2--;
                da++;
            }
            Anz=Anz2;
            Line--;
            System.out.println();
        }






    }

}
