public class Main {

    public static void main(String[] args) {
	// write your code here




        double  x=8;
        for (int i = 1; i < 13; i++) {

double c=1.0/12.0;
//float hz=2^(x-1);
            x=c+x;
            double hz=       Math.pow(2,x);

            System.out.println(i);
            System.out.println(x);
           // System.out.println(c);
            System.out.println(hz);
            System.out.println();


        }

    }


}
