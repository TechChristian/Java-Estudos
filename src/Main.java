import java.util.Scanner;

public class Main {

    //Utilizando IF e ElSE para verificar operações.
    public static void main(String[] args) {
        String firstName = "Christian";
        Scanner minhaIdade = new Scanner(System.in);
        System.out.println("Digite Sua idade " + firstName + ":");
        byte idadePessoa = minhaIdade.nextByte();
        byte idadeCnh = 18;
        System.out.println("Olá " + firstName + " você tem " + idadePessoa + " Anos");
        if (idadePessoa > idadeCnh) {
            System.out.println("você é maior de idade e estar apto a tirar sua CNH");
        } else {
            System.out.println("você é menor de idade e não estar apto a tirar sua CNH ");
        }
    }
}


