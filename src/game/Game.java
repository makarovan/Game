/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package game;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author pupil
 */
public class Game {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int attempt = 0;
        Random random_gen = new Random();
        int random_number = random_gen.nextInt(11);//от 0 до 10
        System.out.println(random_number);
        Scanner number_scan = new Scanner(System.in);
        System.out.println("Компьютер загада число. Попробуйте его угадать. У вас 3 попытки.");
        System.out.print("Введите число от 0 до 10: ");
        
        //for (int i=0; i <3; i++){ //три попытки
        while (true){
            int number = number_scan.nextInt();
            if(number>10 || number<0){ // || это знак or; && это знак and
                System.out.print("Ваше число меньше 0 или больше 10. Попытка засчитана. Введите число: ");
            }
            else if (number == random_number){
                System.out.println("Вы угадали число!");
                break;
            }
            else{
                if(attempt<2){
                    System.out.print("Вы не угадали число. Попробуй еще раз: ");
                     //System.out.println("Вы не угадали число. Загаданное число: "+random_number); //вариант без форматирования
                }
                else{
                    System.out.println("Ты проиграл");
                    break;
                }
            }
            attempt++;
        }
    }
}
