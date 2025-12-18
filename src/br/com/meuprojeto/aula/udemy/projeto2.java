package br.com.meuprojeto.aula.udemy;

import java.util.Arrays;
//Exercicio de ler arrays, ordenar elas utilizando "Sort"
public class projeto2 {
    static void sortArrays(int[] i, String[] s) {
        Arrays.sort(i);
        Arrays.sort(s);
    }
    public static void main(String[] args){
        int[] my_array = {
                1789, 203, 1899, 1456, 2013,
                1458, 2458, 1254, 1472, 2365,
                1456, 2165, 1457, 2456};
        String [] my_array2 = {
                "Java",
                "Python",
                "PHP",
                "C#",
                "C Programming",
                "C++"
        };
        sortArrays(my_array,my_array2);
        System.out.println(Arrays.toString(my_array));
        System.out.println(Arrays.toString(my_array2));
    }

}


