package aula02;

public class Condicionais {
    public static void main(String[] args) {
        byte nota = 7; // Definindo um valor nota para aplicar os conceitos de condicional (if e else)

        // Operadores condicionais:
        // >  Maior que
        // <  Menor que
        // >= Maior ou igual
        // == Igual
        // != Diferente
        // && E
        // || Ou

        if(nota >= 9) { // Condição 1 -> Se nota for maior ou igual a 9 ( > maior que || = Igual )
            System.out.println("Acima da média"); // Se for True, printe Acima da média
        } else if(nota < 9 && nota >= 6) { // Caso seja False, valide se nota é menor que 9 e maior ou igual a 6
            System.out.println("Na média"); // Caso condição seja satisfeita, printe Na média
        } else { //Se não
            System.out.println("Abaixo da Média"); //Printe Abaixo da média
        }
    }
}
