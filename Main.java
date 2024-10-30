import java.util.InputMismatchException;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //Question 1 (Calculator)

//      try {
//          System.out.println("Please enter first number");
//          double num1 = input.nextInt();
//          System.out.println("Please enter second number");
//          double num2 = input.nextInt();
//
//          double sum = num1 + num2;
//          double subtract = num1 - num2;
//          double multiply = num1 * num2;
//          double mod = num1 % num2;
//
//          System.out.println(num1 + " + " + num2 + " = " + sum);
//          System.out.println(num1 + " - " + num2 + " = " + subtract);
//          System.out.println(num1 + " * " + num2 + " = " + multiply);
//          System.out.println(num1 + " % " + num2 + " = " + mod);
//          check(num2);
//          double divide = num1 / num2;
//          System.out.println(num1 + " / " + num2 + " = " + divide);
//      }
//      catch (ArithmeticException e){
//          System.out.println(e.getMessage());
//      }

//*********************************************************************
        //       Question 2(multiplication table)

//       try{ System.out.println("Please enter number");
//
//        int num = input.nextInt();
//
//        for (int i = 1; i <=10 ; i++) {
//            System.out.println(num +" * "+ i +" = "+ (num*i));
//        }}
//       catch (InputMismatchException e){
//           System.out.println("Wrong input! please enter number");
//       }

////*********************************************************************
//        Question 3(Area of a circle)
//        try{System.out.println("Please enter radius of circle ");
//        double radius = input.nextDouble();
//
//        double parameter = 2*3.14*radius ;
//        double area = 3.14 *(Math.pow(radius,2));
//
//        System.out.println("Perimeter = "+parameter);
//        System.out.println("Area = "+area);
//        }
//        catch (InputMismatchException e){
//            System.out.println("Wrong input! please enter number");
//        }


////*********************************************************************
// //       Question 4(Average)

//     try {
//         System.out.println("Please enter count of numbers");
//         double count = input.nextInt();
//
//         double sum = 0;
//         double i = count;
//
//         while (i != 0) {
//
//             System.out.println("Enter an integer");
//             int num = input.nextInt();
//
//             sum = sum + num;
//             i--;
//
//         }
//         System.out.println("The average is " + sum / count);
//     }catch (InputMismatchException e){
//         System.out.println("Wrong input! please enter number");
//     }

////*********************************************************************
////        Question 5(add 2 integer and determine if equal to the third number)

//       try{ System.out.println("Please enter first number");
//        int first = input.nextInt();
//        System.out.println("Please enter second number");
//        int second = input.nextInt();
//        System.out.println("Please enter third number");
//        int third = input.nextInt();
//        int sum = first+second;
//        if(sum == third){
//            System.out.println("The result is : true");
//        }else System.out.println("The result is: false");}
//       catch (InputMismatchException e){
//           System.out.println("Wrong input! please enter number");
//       }catch (Exception e){
//           System.out.println("something wrong occur");
//       }

//// *********************************************************************
////        Question 6(Revers a word)

//      try{  System.out.println("Please enter word");
//        String word = input.nextLine();
//        checkWord(word);
//        char ch ;
//        String revers= ""  ;
//
//        for (int i =0; i<word.length() ; i++) {
//            ch = word.charAt(i);
//            revers = ch+revers;
//        }
//        System.out.println("Revers word : "+revers);}
//      catch (NullPointerException e){
//          System.out.println(e.getMessage());
//      }catch (InputMismatchException e){
//          System.out.println(e.getMessage());
//      }

////*********************************************************************
////        Question 7 (Even or odd)

//        System.out.println("Please enter number");
//        try {
//            int num = input.nextInt();
//            isNagetive(num);
//            if (num % 2 == 0) {
//                System.out.println("Number " + num + " is even");
//            } else System.out.println("Number " + num + " is odd");
//        } catch (InputMismatchException e) {
//            System.out.println("error, must enter number!");
//        }catch (ArithmeticException e){
//            System.out.println(e.getMessage());
//        }

// //********************************************************************
//        // Question  8(Temperature)
//
//        try {
//            System.out.println("Please enter temperature in centigrade");
//            double tempC = input.nextDouble();
//
//            double tempF = (tempC*1.8) +32 ;
//
//            System.out.println("Temperature in Fahrenheit is: "+tempF);
//        } catch (InputMismatchException e) {
//            System.out.println("Error, enter number only");
//        }catch (Exception e){
//            System.out.println("Something wrong occur");
//        }

//
////********************************************************************
////        Question  9 (Print the index)
//
//        try {
//            System.out.println("Enter a string");
//            String str = input.nextLine();
//            checkWord(str);
//            System.out.println("Enter number");
//            int index = input.nextInt();
//            checkInteger(str,index);
//            char ch = str.charAt(index);
//
//            System.out.println("Char at index "+ index + " is "+ ch);
//        } catch (NullPointerException e) {
//            System.out.println(e.getMessage());;
//        } catch (InputMismatchException e) {
//            System.out.println(e.getMessage());
//        }catch (IndexOutOfBoundsException e){
//            System.out.println(e.getMessage());
//        }catch (IllegalArgumentException e){
//            System.out.println(e.getMessage());
//        }

////********************************************************************
////         Question  10 (Area and perimeter of rectangle)
//
//        try {
//            System.out.println("Please enter width");
//            double width = input.nextDouble();
//            checknumber(width);
//            System.out.println("Please enter height");
//            double height = input.nextDouble();
//            checknumber(height);
//            double area = width*height;
//            double perimeter = 2*(width+height);
//
//            System.out.println("Area is : "+ area +"\nPerimeter is : "+perimeter);
//        } catch (IllegalArgumentException e) {
//            System.out.println(e.getMessage());
//        }catch (ArithmeticException e){
//            System.out.println(e.getMessage());
//        }catch (InputMismatchException e){
//            System.out.println("Error, only enter numbers");
//        }

////
////********************************************************************
////         Question  11 (Compare two numbers)
//        try {
//            System.out.println("Please enter first number");
//            int num1 = input.nextInt();
//            System.out.println("Please enter second number");
//            int num2 = input.nextInt();
//
//            if(num1 == num2){
//                System.out.println(num1+" = "+num2);
//            } else if (num1 > num2) {
//                System.out.println(num1+" > "+num2);
//                System.out.println(num1+" != "+num2);
//            }else {
//                System.out.println(num1+" < "+num2);
//                 System.out.println(num1+" != "+num2);}
//        } catch (InputMismatchException e) {
//            System.out.println("Error, only enter numbers");
//        }catch (Exception e){
//            System.out.println("Error, something wrong occur");
//        }
////
////********************************************************************
////     Question  12 (Convert from seconds to hours and minute)
//        try {
//            System.out.println("Please enter seconds");
//            int seconds = input.nextInt();
//            checkSeconds(seconds);
//            int hours = seconds/3600 ;
//            int minute = (seconds%3600)/60;
//            int sec =seconds%60;
//            System.out.println(hours+":"+minute+":"+sec);
//        } catch (InputMismatchException e) {
//            System.out.println("Error, only enter numbers");
//        }catch (IllegalArgumentException e){
//            System.out.println(e.getMessage());
//        }

////********************************************************************
////         Question  13 (Four integers if equal or not)

//        try {
//            System.out.println("please enter first integer");
//            int num1= input.nextInt();
//            System.out.println("please enter second integer");
//            int num2= input.nextInt();
//            System.out.println("please enter third integer");
//            int num3= input.nextInt();
//            System.out.println("please enter fourth integer");
//            int num4= input.nextInt();
//
//            if(num1 == num2 && num1==num3 &&num1==num4){
//                System.out.println("Numbers are equals");
//                } else
//                System.out.println("Numbers are not equals!");
//        } catch (InputMismatchException e) {
//            System.out.println("Error, only enter numbers");
//        }catch (Exception e){
//            System.out.println("Error,something wrong occur");
//        }


//
////        ********************************************************************
////         Question  14 (Check if number is positive or negative or zero)
//
//        try {
//            System.out.println("Please enter number");
//            int num = input.nextInt();
//
//            if (num > 0) {
//                System.out.println(num+" is Positive number");
//            }else if(num<0){
//                System.out.println(num+" is negative number");
//            }else System.out.println(" Zero number");
//        } catch (InputMismatchException e) {
//            System.out.println("Error, only enter numbers");
//        }catch (Exception e){
//            System.out.println("Error,something wrong occur");
//        }


//// ********************************************************************
////   Question  15 (count positive and negative)
//
//        try {
//            System.out.println("Please enter numbers or -1 to end");
//            int number = input.nextInt();
//
//            int positives =0;
//            int nagetives =0;
//            int countZeros = 0;
//
//            while (number != -1){
//
//                if(number>0){
//                    positives++;
//                }else
//                    if(number== 0){
//                    countZeros++;
//                }else nagetives++;
//
//                System.out.println("Please enter numbers or -1 to end");
//                number = input.nextInt();
//
//            }
//
//            System.out.println(positives+ " Positive numbers\n"+
//                   nagetives+ " Negative numbers\n"+
//                    countZeros+" Zero ");
//        } catch (InputMismatchException e) {
//            System.out.println("Error, only enter numbers");
//        }catch (Exception e){
//            System.out.println("Error,something wrong occur");
//        }


////        ********************************************************************
////         Question  16 (Revers integer)
//
//        try {
//            System.out.println("please enter integer");
//            String number = input.nextLine();
//
//            String revers="" ;
//            char ch ;
//
//            for (int i = 0 ; i<number.length() ;i++){
//                ch= number.charAt(i);
//                revers = ch+revers;
//
//            }
//            System.out.println(revers);
//        } catch (InputMismatchException e) {
//            System.out.println("Error, only enter numbers");
//        }catch (Exception e){
//            System.out.println("Error,something wrong occur");
//        }



////********************************************************************
////        Question  17 (Large and small number)
//

//        try {
//            System.out.println("Enter numbers or 0 to end");
//            int num =input.nextInt();
//            int max =num ;
//            int min =num;
//
//
//            while (num != 0){
//                 if(num>max)
//                max = num ;
//
//                 if(num<min)
//                     min =num;
//                System.out.println("Enter numbers or 0 to end");
//                num =input.nextInt();
//            }
//
//            System.out.println("Large number is : "+max+"\nMinimum number is : "+min);
//        } catch (InputMismatchException e) {
//            System.out.println("Error, only enter numbers");
//        }catch (Exception e){
//            System.out.println("Error,something wrong occur");
//        }


////********************************************************************
////         Question  18 ("a" appear in input)

        try {
            System.out.println("Enter String");
            String str = input.nextLine();
            checkWord(str);
            char ch ;
            int counter=0 ;
            for(int i = 0 ; i<str.length() ; i++){
             ch = str.charAt(i);
               if(ch=='A' || ch=='a'){
                   counter++;
               }
            }

            System.out.println("Numbers of a's = "+counter);
        } catch (NullPointerException e) {
            System.out.println(e.getMessage());;
        } catch (InputMismatchException e) {
            System.out.println(e.getMessage());        }


    }//end main


    //Q1
    public static void check(double num) throws ArithmeticException {
        if (num == 0) {
            throw new ArithmeticException("Sorry can't divide on zero");
        }
    }


    //Q6
    public static void checkWord(String word) throws NullPointerException, InputMismatchException {
        if (word.isEmpty()) {
            throw new NullPointerException("can't accept null String");
        }

        if (word.replaceAll("[^0-9]", "").length() >= 1) {
            throw new InputMismatchException("word must not contain numbers");
        }
    }


//Q7
    public static void isNagetive(int num)throws ArithmeticException{
        if(num<0){
            throw new ArithmeticException("number must not be negative");
        }
    }



    public static void checkInteger(String str ,int index)throws IndexOutOfBoundsException,IllegalArgumentException{
        if(index>=str.length()){
            throw new IndexOutOfBoundsException("Eroor, index is greater than word length");
        }
        if(index<0){
            throw new IllegalArgumentException("Error, index must not be negative");
        }

    }


    //Q10
    public static void checknumber(double num)throws ArithmeticException,IllegalArgumentException{
        if(num<0)
            throw new ArithmeticException("width or height can't be negative");
        if(num==0){
            throw new IllegalArgumentException("width or height can't be zero");
        }
    }


    //Q12
    public static void checkSeconds(int seconds)throws IllegalArgumentException{
        if(seconds<0){
            throw new IllegalArgumentException("Time can't be negative");
        }

    }


}
