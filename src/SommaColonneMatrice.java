import java.util.Scanner;
public class SommaColonneMatrice{
    public static void main(String[]args){
        Scanner in = new Scanner(System.in);
        int[][] mxn = new int[5][4];
        for(int i=0; i<mxn.length;i++){
            for (int j=0;j<mxn[0].length;j++){
                System.out.println("Inserisci un elemento");
                mxn[i][j]=in.nextInt();
            }
        }
        System.out.println(SommaColonne(mxn));
    }
    private static int [] SommaColonne(int[][]a){
        int somma;
        int [] sommato = new int[a.length];
        for(int i=0;i<sommato.length;i++){
            somma =0;
            for(int j=0;j<a[0].length;j++){
                somma = somma + a[j][i];
            }
        }
        return sommato;
    }
}