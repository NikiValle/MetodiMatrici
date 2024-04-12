import java.util.Scanner;
public class InvertiRighe{
    public static void main(String[]args){
        int rigaUno;
        int rigaDue;
        Scanner in = new Scanner(System.in);
        int[][] mxn = new int[3][4];
        for(int i=0; i<mxn.length;i++){
            for (int j=0;j<mxn[0].length;j++){
                System.out.println("Inserisci un elemento");
                mxn[i][j]=in.nextInt();
            }
        }
        System.out.println("Scegli la prima riga");
        rigaUno = in.nextInt();
        System.out.println("Scegli la seconda riga");
        rigaDue = in.nextInt();
        Inverti(mxn, rigaUno, rigaDue);
    }
    private static void Inverti(int[][] a,int uno, int due){
        int [] riga = new int[a.length];
        for(int i =0;i<riga.length;i++){
            riga[i]=a[uno][i];
        }
        for(int i =0;i<a[0].length;i++){
            a[uno][i] = a[due][i];
        }
        for(int i =0;i<a[0].length;i++){
            a[due][i] = riga[i];
        }
    }
}