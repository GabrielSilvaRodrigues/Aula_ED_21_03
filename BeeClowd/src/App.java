import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        // int[] x = new int[10];
        // Scanner ler = new Scanner(System.in);
        // for(int i=0; i<10; i++){
        //     double dado = ler.nextDouble();
        //     if(dado<=0){
        //         dado=1;
        //     }
        //     x[i] = (int)dado;
            
        // }
        // for(int i=0; i<x.length;i++){
        //     System.out.println("X["+i+"] = "+x[i]);
        int[] x = new int[10];
        Scanner ler = new Scanner(System.in);
        for(int i=0; i<=10; i++){
            double dado = ler.nextDouble();
            if(dado<=0){
                dado=1;
            }
            x[i] = (int)dado;
            
        }
        for(int i=0; i<x.length;i++){
            System.out.println("X["+i+"] = "+x[i]);
        }
    }
}
