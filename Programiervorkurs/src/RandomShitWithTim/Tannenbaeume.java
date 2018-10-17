package RandomShitWithTim;

public class Tannenbaeume {
    public static void main(String[] args) {

        DoZeTannenbaum(7);
        System.out.println();
    }

    public static void DoZeTannenbaum(int gofuckyourself) {
        if (gofuckyourself < 3) {
            return;
        }
        int gesamtebreite = (gofuckyourself * 2 - 1);
        for (int hoehe = 1; hoehe <= gofuckyourself; hoehe++) {
            if (hoehe != 1){System.out.println();}
            for (int breite = 1; breite <= gesamtebreite; breite++) {
                if ((gesamtebreite / 2) + 1 == breite) {
                    System.out.print("x");
                }
                else if(((gesamtebreite/2+1) - (hoehe-1)) <= breite && ((gesamtebreite/2+1) + (hoehe-1)) >= breite){
                        System.out.print("x");
                }
                else System.out.print(" ");
            }
        }
        for (int i = 1;i <= 2;i++){
            System.out.println();
            for (int j =1; j <= gesamtebreite; j++){
                if ((gesamtebreite / 2) + 1 == j) {
                    System.out.print("x");}
                else System.out.print(" ");

            }
        }
    }
}