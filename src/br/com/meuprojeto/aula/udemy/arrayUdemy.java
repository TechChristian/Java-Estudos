package br.com.meuprojeto.aula.udemy;

import java.text.NumberFormat;
import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

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
//operators AND e OR
class operators {
    public static void main(String[] args){
        boolean thereIsAJob = true;
        boolean hasCompany = false;
        boolean has50k = true;
        boolean has18years = false;
        boolean canFinance = (thereIsAJob || hasCompany) && has50k && has18years;
        System.out.println(canFinance);
    }
}

class operatorTernario {
    public static void main(String[] args){
        int ingresso = 800;
        String terAcesso = ingresso >= 500 ? "VIP" : "Pista";
        System.out.println(terAcesso);
    }
}

class switchEstudos {
    public static void main(String [] args){
        // Coleta o nome do produto
        System.out.print("Digite o nome do produto: ");
        Scanner s = new Scanner(System.in);
        String nomeProduto = s.next().toLowerCase(); //transforma a letra conforme a escrita do usuario.

        // Retornar o valor do produto

        switch (nomeProduto) {
            case "banana":
                System.out.println("9,50");
                break;
            case "manga":
                System.out.println("11,50");
                break;
            case "maça":
                System.out.println("7,50");
                break;
            default:
                System.out.println("Produto não encontrado");
        }

    }

}




