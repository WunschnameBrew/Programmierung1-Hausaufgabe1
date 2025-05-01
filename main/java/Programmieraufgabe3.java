import com.sun.jdi.connect.Connector;

public class Programmieraufgabe3 {
    public static void main(String[] args) {
        int Test = 1 ;
        String Text1 = "*******" ;
        String Text2 = "......." ;

        while(Test <=4 ) {
            if (Test ==1 || Test ==3) {
                System.out.println(Text1) ;
                        Test++ ;
            }
            if (Test ==2 || Test ==4) {
                System.out.println(Text2) ;
                        Test++ ;
            }

        }
    }
}
