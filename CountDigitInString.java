//import for Scanner and other utility classes
import java.util.*;


// Warning: Printing unwanted or ill-formatted data to output will cause the test cases to fail

class CountDigitInString {
    public static void main(String args[] ) throws Exception {
        /* Sample code to perform I/O:
         * Use either of these methods for input

        //BufferedReader
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String name = br.readLine();                // Reading input from STDIN
        System.out.println("Hi, " + name + ".");    // Writing output to STDOUT
*/
        //Scanner
        Scanner s = new Scanner(System.in);
        String name = s.nextLine();                 // Reading input from STDIN
       // Writing output to STDOUT
        int a[]=new int[name.length()];
        for(int i=0;i<name.length();i++){
            a[i]=Integer.parseInt(name.charAt(i)+"");
        }
        
        for (int i=0;i<10;i++){
            int count=0;
            for(int j=0;j<name.length();j++){
                if(i==a[j]){
                    count++;
                }
            }
            System.out.println(i+" "+count);
            count=0;
        }     
    }
    /*
    Input
77150
Output
0 1
1 1
2 0
3 0
4 0
5 1
6 0
7 2
8 0
9 0
    */
}
