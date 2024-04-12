import java.util.Scanner;

public class UguaglianzaSottoDiagonale {
    public static void main(String[]args){
        Scanner in = new Scanner(System.in);
        int[][] mxn = new int[4][4];
        for(int i=0; i<mxn.length;i++){
            for (int j=0;j<mxn[0].length;j++){
                System.out.println("Inserisci un elemento");
                mxn[i][j]=in.nextInt();
            }
        }
        if(Uguali(mxn)){
            System.out.println("Gli elementi sotto la diagonale sono uguali");
        }
        else{
            System.out.println("Gli elementi sotto la diagonale non sono uguali");
        }
    }
    private static boolean Uguali(int[][]a){
        boolean uguali=true;
        int rif =a[1][0];
        for(int i=1;i<a.length;i++){
            for(int j=0;j<i;j++){
                if(a[i][j]!=rif){
                    uguali=false;
                    break;
                }
            }
        }
        return uguali;
    }
}
