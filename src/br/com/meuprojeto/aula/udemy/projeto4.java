package br.com.meuprojeto.aula.udemy;
// Faça um programa que imprima na tela apenas os números pares entre 0 e 100.

/* o IF verifica se o número é par, ou seja, se o resto da divisão por 2 é igual a 0.
    quando a dvisao é 0, ele retorna true e imprime o número,
    caso contrário, ele retorna false e não imprime o número.
*/

public class projeto4 {
    public static void main(String[] args) {
        for(int i=0; i <=100; i++){
            if(i % 2 == 0){
                System.out.print(i + " ");
            }
        }
    }
}

//Percorra uma string e imprima cada caractere separado por um espaço.
class projeto4_2 {
    public static void main(String[] args){
        String message = "Hello World";
            for(int i =0; i < message.length(); i++){
                System.out.print(message.charAt(i) + " ");
        }
    }
}



