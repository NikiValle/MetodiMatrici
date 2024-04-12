import java.util.Scanner;
public class MatriceTrasposta{
    public static void main(String[]args){
        Scanner in = new Scanner(System.in);
        int[][] mxn = new int[4][4];
        for(int i=0; i<mxn.length;i++){
            for (int j=0;j<mxn[0].length;j++){
                System.out.println("Inserisci un elemento");
                mxn[i][j]=in.nextInt();
            }
        }
        System.out.println(Simmetria(mxn));
    }
    private static int[][] Simmetria(int[][] a){
        int [][] b = a;
        for(int i =0;i<a.length;i++) {
            for (int j = 0; j < a.length; j++) {
                a[i][j]=b[j][i];
                }
            }
        return a;
    }
}