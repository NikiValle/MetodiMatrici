import java.util.Scanner;
public class SimmetriaDiagonale{
    public static void main(String[]args){
        Scanner in = new Scanner(System.in);
        int[][] mxn = new int[4][4];
        for(int i=0; i<mxn.length;i++){
            for (int j=0;j<mxn[0].length;j++){
                System.out.println("Inserisci un elemento");
                mxn[i][j]=in.nextInt();
            }
        }
        if(Simmetria(mxn)){
            System.out.println("La matrice è simmetrica");
        }
        else{
            System.out.println("La matrice non è simmetrica");
        }
    }
    private static boolean Simmetria(int[][] a){
        boolean simmetrico =true;
        for(int i =0;i<a.length;i++) {
            for (int j = 0; j < a.length; j++) {
                if (a[i][j] != a[j][i]) {
                    simmetrico = false;
                    break;
                }
            }
        }
        return simmetrico;
    }
}