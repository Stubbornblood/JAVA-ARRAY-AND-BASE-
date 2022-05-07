import java.util.Scanner;
public class AnyBaseMultiplication {
    public static void main(String arg[]){
        Scanner scn = new Scanner(System.in);
        int b = scn.nextInt();
        int n1 = scn.nextInt();
        int n2 = scn.nextInt();
    
        int d = getProduct(b, n1, n2);
        System.out.println(d);
        }
        public static int getProduct(int b, int n1, int n2){
            int rv = 0;
            int p = 1;
            while(n2>0){
                int d2 = n2%10;
                n2 = n2/10;
                int d = getProductvalue(b, d2, n1);
                rv = sum( b, d*p, rv);
                p = p*10;
            }
            return rv;
        }
        public static int getProductvalue(int b,int d2,int n1){
            int rv = 0;
            int c = 0;
            int p = 1;
            while(n1>0||c>0){
                int d1 = n1%10;
                n1 = n1/10;

                int d = d1*d2+c;
                c = d/b;
                d = d%b;

                rv = rv + (d*p);
                p = p*10;
            }
            return rv;

        }

        public static int sum(int b,int n1,int n2){
            int rv = 0;
            int c = 0;
            int p = 1;

            while(n1>0||n2>0||c>0){
            int d1 = n1%10;
            n1 = n1/10;

            int d2 = n2%10;
            n2 = n2/10;

            int d = d1+d2+c;
            c = d/b;
            d = d%b;

            rv = rv + (d*p);
            p = p*10;

            }
            return rv;
        }
        
    }

