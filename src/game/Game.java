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
        Random random_gen = new Random();
        int random_number = random_gen.nextInt(11);//от 0 до 10
        System.out.println(random_number);
        Scanner number_scan = new Scanner(System.in);
        System.out.println("Компьютер загада число. Попробуйте его угадать.");
        System.out.print("Введите число от 0 до 10: ");
        int number = number_scan.nextInt();
        if(number>10 || number<0){ // || это знак or; && это знак and
            System.out.println("Ваше число меньше 0 или больше 10");
        }
        else if (number == random_number){
            System.out.println("Вы угадали число!");
        }
        else if (number != random_number){
            System.out.printf("Вы не угадали число. Загаданное число: %d%n", random_number);
             //System.out.println("Вы не угадали число. Загаданное число: "+random_number); //вариант без форматирования
        }
        else{
                
            System.out.println("Ошибка");}
            
            
            
    }
    
}
