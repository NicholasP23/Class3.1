public class Driver {

    public static void main(String[] args) {
       int[] numbers = new int[26];
       int[] lowerCase = new int[26];
       int[] upperCase = new int[26];
       int i=0;
       String spacing = "\t    ";
       String spacing2 = "\t\t\t";

       // Filling the 3 arrays with numbers, lower case,
       // and upper cases of the alphabet
       while(i<26){
            numbers[i] = i+1;
            upperCase[i] = i + 'A';
            lowerCase[i] = i + 'a';
            i++;
       }

       i=0;
       // Creating the table for a nice display
       System.out.println("-----------------------------------------");
       System.out.println('|' +"    "+ "Numbers" + "   "+"LowerCases"+"   "+"UpperCases  "+ '|' );
       while(i<26){
           System.out.println('|'+spacing+numbers[i]+spacing2+(char)lowerCase[i]+spacing2+(char)upperCase[i]+spacing+'|');
            i++;
       }
        System.out.println("-----------------------------------------");

    }
}