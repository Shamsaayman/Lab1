import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
    Scanner s = new Scanner(System.in);

//////////////////////// NUMBER 1 //////////////////////////////////

//        System.out.println("Please enter First number:");
//        int num1 = s.nextInt();
//        System.out.println("Please enter Second number:");
//        int num2 = s.nextInt();
//        System.out.println(num1 + "+" + num2 + "=" + (num1+num2));
//        System.out.println(num1 + "-" + num2 + "=" + (num1-num2));
//        System.out.println(num1 + "x" + num2 + "=" + (num1*num2));
//        System.out.println(num1 + "/" + num2 + "=" + (num1/num2));
//        System.out.println(num1 + " mod " + num2 + "=" + (num1%num2));

 //////////////////////// NUMBER 2//////////////////////////////////

//        System.out.println("Input a number:");
//        int num = s.nextInt();
//        for ( int i = 1 ; i<=10 ; i++){
//            System.out.println(num + " x " + i + " = " + num*i);
//        }

//////////////////////// NUMBER 3 //////////////////////////////////

//        System.out.println("Please enter radius:");
//        double rad = s.nextDouble();
//        System.out.println("Perimeter is: " + (2*3.14*rad));
//        System.out.println("Area is: " + (rad*rad*3.14));

//////////////////////// NUMBER 4 //////////////////////////////////

//        System.out.print("Enter the count of numbers: ");
//        int num = s.nextInt();
//        int sum = 0 ;
//        double avg = 0 ;
//        for (int i = 0; i < num; i++) {
//            System.out.print("Enter an Integer:");
//            int num2 = s.nextInt();
//            sum = num2 + sum;
//            avg = sum/num;
//
//        }
//        System.out.println("The Sum is : " + sum);
//
//        System.out.println("The Average is : " + avg);

//////////////////////// NUMBER 5 //////////////////////////////////

//
//        System.out.println("Please enter First number:");
//        int num1 = s.nextInt();
//        System.out.println("Please enter Second number:");
//        int num2 = s.nextInt();
//        System.out.println("Please enter Third number:");
//        int num3 = s.nextInt();
//
//        if ((num1+num2)== num3){
//            System.out.println("Th result is : True");
//        }
//        else{
//            System.out.println("Th result is : False");
//        }

//////////////////////// NUMBER 6 //////////////////////////////////

//        System.out.println("Input a word:");
//        String str = s.next();
//        String reverse = "";
//        for (int i = str.length() - 1; i >= 0; i--) {
//            reverse = reverse + str.charAt(i);
//        }
//        System.out.println("Reverse word: " + reverse);

//////////////////////// NUMBER 7 //////////////////////////////////

//        System.out.println("Enter a number:");
//        int num = s.nextInt();
//        if (num%2==0){
//            System.out.println("The number is Even");
//        }
//        else{
//            System.out.println("The number is Odd");
//        }

//////////////////////// NUMBER 8 //////////////////////////////////

//        System.out.println("Enter temperature in Centigrade:");
//        double num = s.nextDouble();
//        double result = (1.8*num) + 32;
//        System.out.println("Temperature in Fahrenheit is: " + result);

//////////////////////// NUMBER 9 //////////////////////////////////

//        System.out.println("Input a String: ");
//        String str = s.nextLine();
//        System.out.println("Input a number:");
//        int num = s.nextInt();
//        System.out.println("Output:" + str.charAt(num));

//////////////////////// NUMBER 10 //////////////////////////////////

//        System.out.println("Enter Width");
//        double w = s.nextDouble();
//        System.out.println("Enter Height");
//        double h = s.nextDouble();
//        System.out.println("Area is " + w + " x " + h + " = " + (w*h));
//        System.out.println("Perimeter is 2 x " +"(" + w + "+" + h +") "+ " = "  + (2*(w+h)));

//////////////////////// NUMBER 11//////////////////////////////////

//        System.out.println("Please enter First number:");
//        int num1 = s.nextInt();
//        System.out.println("Please enter Second number:");
//        int num2 = s.nextInt();
//
//        if (num1!=num2){
//            System.out.println(num1 + "!=" + num2);
//        }
//        else {
//            System.out.println(num1 + "==" + num2);
//        }
//
//         if (num1>=num2){
//            System.out.println(num1 + ">=" + num2);
//        }
//        else {
//            System.out.println(num1 + "<" + num2);
//        }
//
//         if (num1<=num2){
//            System.out.println(num1 + "<=" + num2);
//        }
//        else {
//            System.out.println(num1 + ">" + num2);
//        }

//////////////////////// NUMBER 12//////////////////////////////////

//        System.out.println("Input seconds");
//        int num = s.nextInt();
//        int hrs= num/60;
//        int min = hrs%60;
//        int sec = num%60;
//        hrs=hrs/60;
//        System.out.println(hrs +":"+ min +":"+sec);

//////////////////////// NUMBER 13//////////////////////////////////

//        System.out.println("Please enter First number:");
//        int num1 = s.nextInt();
//        System.out.println("Please enter Second number:");
//        int num2 = s.nextInt();
//        System.out.println("Please enter Third number:");
//        int num3 = s.nextInt();
//        System.out.println("Please enter Fourth number:");
//        int num4 = s.nextInt();
//
//        if ( (num1==num2) && (num3==num4)){
//            System.out.println("Numbers are Equal");
//        }
//        else{
//            System.out.println("Numbers are Not Equal");
//        }

//////////////////////// NUMBER 14//////////////////////////////////

//        System.out.println("Please enter number:");
//        int num = s.nextInt();
//        if(num>0){
//            System.out.println("Number is Positive");
//        }
//        else if (num==0){
//            System.out.println("Number is Zero");
//        }
//        else{
//            System.out.println("Number is Negative");
//
//        }

//////////////////////// NUMBER 15//////////////////////////////////

//        int num;
//        int psum=0;
//        int nsum=0;
//        int zsum=0;
//        do{
//            System.out.println("Please enter number:");
//            num= s.nextInt();
//
//              if (num>0){
//                  psum++;
//              }
//              else if (num<0){
//                  nsum++;
//              }
//              else {
//                  zsum++;
//              }
//
//        }
//        while (num!=-1);
//        System.out.println("Positives: " + psum);
//        System.out.println("Negatives: " + (nsum-1));
//        System.out.println("Zeros: " + zsum);

//////////////////////// NUMBER 16//////////////////////////////////

//        System.out.println("Please enter number:");
//        int num= s.nextInt();
//
//        int reverse = 0 ;
//        while (num!=0){
//           int mod = num%10;
//           reverse=reverse*10 + mod;
//           num = num/10;
//       }
//        System.out.println("The reversed number is: " + reverse);

//////////////////////// NUMBER 17//////////////////////////////////

//        int num;
//        int largest=Integer.MIN_VALUE;;
//        int smallest=Integer.MAX_VALUE;
//        int i = 1;
//        do {
//            System.out.println("Please enter number and 0 to end:");
//            num = s.nextInt();
//            if ( num > largest)
//                largest = num;
//            else if ( num < smallest  )
//                smallest = num;  ;
//        }
//        while (num!=0);
//        System.out.println("Largest Number is: " + largest);
//        System.out.println("Smallest Number is: " + smallest);

//////////////////////// NUMBER 18//////////////////////////////////

//int count = 0 ;
//        System.out.println("Input a String: ");
//        String str = s.nextLine();
//for ( int i = 0 ; i<str.length() ; i++){
//    if (str.charAt(i)=='a')
//        count++;
//}
//        System.out.println("Number of A's: " + count);
    }
}