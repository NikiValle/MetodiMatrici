import java.util.Scanner;
public class SommaRigheMatrice{
    public static void main(String[]args){
        Scanner in = new Scanner(System.in);
        int[][] mxn = new int[4][4];
        for(int i=0; i<mxn.length;i++){
            for (int j=0;j<mxn[0].length;j++){
                System.out.println("Inserisci un elemento");
                mxn[i][j]=in.nextInt();
            }
        }
        System.out.println(SommaRighe(mxn));
    }
    private static int [] SommaRighe(int[][]a){
        int somma;
        int [] sommato = new int[a.length];
        for(int i=0;i<sommato.length;i++){
            somma =0;
            for(int j=0;j<a[0].length;j++){
                somma = somma + a[i][j];
            }
        }
        return sommato;
    }
}