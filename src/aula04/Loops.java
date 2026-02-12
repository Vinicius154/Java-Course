package aula04;

import java.util.ArrayList;

public class Loops {
    public static void main(String[] args) {
        // Loop são iterações em cima de uma lista de itens basicamente

        // Tem 3 exemplos abaixo, o primeiro sendo iterando sobre i, i não é um array e a gente ta iterando sobre a condição
        // int i -> Declaração da variável
        // i <= 10 -> Condição da iteração
        // i++ -> O que será incrementando
        for(int i = 1; i <= 10; i++) {
            System.out.println(i); // print sobre a iteração, ou seja, 1, 2, 3, 4... 10, Até que a condição seja satisfeita
        }

        // Exemplo 2, iterando sobre um Vetor
        String[] nomeZ = {"Nome1", "Nome2", "Nome3"}; // Declaração do vetor

        // String nome1 -> Definindo a tipagem
        // nomeZ -> Lista a qual vai passar pela iteração
        // Nesse caso ele vai percorrer toda a lista em cima de nomeZ, o que acaba se tornando mais prático do que passar em cima de uma variavel
        // Ou seja, no caso de um array esse é o melhor cenário
        for(String nome1 : nomeZ) {
            System.out.println(nome1);
        }

        // Exemplo 3, arrayList
        ArrayList<String> nomes = new ArrayList<>();
        nomes.add("Vinicius");
        nomes.add("Mony");
        nomes.add("Bruno");

        // Mesmas características do aray acima.
        for(String nome : nomes) {
            System.out.println(nome);
        }

        // FALANDO SOBRE WHILE
        // While por mais que parecido com o for o conceito dele é um pouco diferente, o for executa enquanto tal condição não é atingida.
        // O While executa ATÉ QUE tal condição seja atingida.
        // Exemplo:
        int contador = 0; // Definindo um ponto de partida
        while(contador < 10) { //Condição
            System.out.println("Estou no While");
            contador++; // Iteração que será feita, ISSO É OBRIGATÓRIO se não, vira um loop infinito
        }
    }
}
