package br.com.meuprojeto.aula.udemy;

import java.text.NumberFormat;
import java.util.Arrays;

//Leitura de Arrays
public class arrayUdemy {
    public static void main(String [] args) {
        int [] values = {10,20,15, 30, 40};
        Arrays.sort(values);
        System.out.println(Arrays.toString(values));
        System.out.println(values.length);
    }
}
//Duas Arrays em uma
class arrayString {
    public static void main(String[] args) {
        String [][] cars = {{"Tesla", "Mercedes"}, {"BMW", "Fiat"}};
        System.out.println(Arrays.deepToString(cars));
    }
}
//Converter Numeros
class conversionNumber {
    public static void main(String[] args){
        NumberFormat pound = NumberFormat.getCurrencyInstance();
        String productValue = pound.format(551120.80);
        System.out.println(productValue);
    }
}


