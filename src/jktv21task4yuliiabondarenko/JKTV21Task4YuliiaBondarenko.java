/*Task 4 */
package jktv21task4yuliiabondarenko;

import java.util.Random;
/* @author pupil
 */
public class JKTV21Task4YuliiaBondarenko {

    public static void main(String[] args) {
        System.out.println("---------------Однометрные массивы---------------");
        int[] numbers = new int[500];
        int[] numbersNew = new int [100];
        Random rnd = new Random();        
        int summa = 0;
        int kol = 0;        
       
            for (int j = 0; j < numbersNew.length; j++){
                while (true){
                    int num = rnd.nextInt(100);//random numbers 0..99
                    if (num%2 != 0){
                        numbersNew[j]=num;
                        System.out.printf("%5d", numbersNew[j]);
                        summa = summa + numbersNew[j];
                        kol++;
                        if (kol%10 == 0){
                            System.out.println("");
                        }
                        break;
                    }
                }
            }   
        System.out.println("***************************************************");
        System.out.println("Sum = " + summa);
        System.out.println("Kolichestvo numbers is " + kol);
        System.out.println("среднее арифметическое всех элементов массива " + summa/kol);
    }
    
}
