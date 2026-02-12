package aula05;

public class Casting {
    public static void main(String[] args) {
    // O Conceito do Casting é transformar o valor de uma variável em outro.
    // Por exemplo conversões simples como Double para int, como seria?
    double meuDouble = 0.0; // Variável que quero converter
    int meuInt = (int) meuDouble; // Para passar eu tenho que declarar uma variável do tipo que quero e após o "=" colocar o tipo entre parênteses
    double meuDouble2 = (double) meuInt; // aqui só para demostração, passei para double de novo, esse (é omitivel)

    // Em casos mais complexos o buraco é mais em baixo, como por exemplo, passar String para Numero
    String numero = "10";
    int numInt = Integer.parseInt(numero); // Aqui eu tive que usar a classe Integer.parseInt para converter o valor
    String numStr = String.valueOf(numInt); // Isso se eu quisesse transformar o Int em uma string, usando a classe String.valueof()
    }
}