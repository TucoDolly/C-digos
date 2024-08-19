
import java.text.DecimalFormat;
import java.util.Scanner;




public class NewClass {
    public static void main(String[] args) {
        DecimalFormat df = new DecimalFormat("#,##0.00");
        double altChico = 1.5, altZe = 1.1;
        int anos = 0;
        while (altZe <= altChico) {
            altChico = altChico + 0.02;
            altZe = altZe + 0.03;
            anos++;
        }
        System.out.println("Anos: " + anos + " Ze: " + df.format(altZe) + 
                " Chico: " + df.format(altChico));
    }
}
