import java.util.Scanner;

public class UnoZeroVersioneDue {
    public static void main(String[]args){
        Scanner in = new Scanner(System.in);
        int[][] mxn = new int[4][4];
        for(int i=0; i<mxn.length;i++){
            for (int j=0;j<mxn[0].length;j++){
                System.out.println("Inserisci un elemento");
                mxn[i][j]=in.nextInt();
            }
        }
        mxn=ZeroUno(mxn);
        for(int i=0; i<mxn.length;i++) {
            for (int j = 0; j < mxn[0].length; j++) {
                System.out.print(mxn[i][j]+"  ");
            }
            System.out.println();
        }
    }
    private static int[][] ZeroUno(int[][]a){
        for(int i=0;i<a.length;i++){
            for(int j=i;j<a.length;j++){
                a[i][j]=1;
            }
        }
        for(int i=1;i<a.length;i++){
            for(int j=0;j<i;j++){
                a[i][j]=0;
            }
        }
        return a;
    }
}
