import java.util.Scanner;
public class InvertiColonne {
    public static void main(String[]args){
        int colUno;
        int colDue;
        Scanner in = new Scanner(System.in);
        int[][] mxn = new int[3][4];
        for(int i=0; i<mxn.length;i++){
            for (int j=0;j<mxn[0].length;j++){
                System.out.println("Inserisci un elemento");
                mxn[i][j]=in.nextInt();
            }
        }
        System.out.println("Scegli la prima colonna");
        colUno = in.nextInt();
        System.out.println("Scegli la seconda colonna");
        colDue = in.nextInt();
        Inverti(mxn, colUno, colDue);
    }
    private static void Inverti(int[][] a,int colUno, int colDue){
        int [] colonna = new int[a[0].length];
        for(int i =0;i<colonna.length;i++){
            colonna[i]=a[i][colUno];
        }
        for(int i =0;i<a[0].length;i++){
            a[i][colUno] = a[i][colDue];
        }
        for(int i =0;i<a[0].length;i++){
            a[i][colDue] = colonna[i];
        }
    }
}