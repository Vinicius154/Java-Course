package aula01;

public class TiposPrimitivos {
    // Um arquivo java possui sempre uma classe e a classe principal desse arquivo deve possuir o nome do arquivo, no caso estou em um arquivo chamado TiposPrimitivos,
    // Consequentemente minha classe é TiposPrimitivos, tem que possuir a tag Public Class nome {}

    public static void main(String[] args) {
        // Declaração de variavéis. O Java é uma linguagem MUITO tipada, ou seja, não podemos declarar uma variavel sem definir o tipo dela.
        // Além do mais, os valores não podem mudar de Tipo durante a execução, ou seja, um int não pode virar uma String

        // TIPOS PRIMITIVOS
        // Strings
        char letra = 'a';  // Para apenas uma letra

        // Números
        byte valor1 = 10; // 8bits -> Cobre um range de -128 para 127
        short valor2 = 255; // 16bits -> Cobre um range de -32k até 32k
        int valor3 = 10000; // 32bits -> Range de -2 Trilhões para 2 trilhões
        long valor4 = 10000000L; // 64bits -> Range gigante e possui o L no final

        // Afinal, porque tantos tipos para inteiros? Basicamente cada um tem um consumo na memória, definir eles é importante.
        // O L no final do long serve para deixar explicito qual tipagem

        // Números decimais
        float valor5 = 100.2f; // Para números decimais com precisão simples, possui 32 bits
        double valor6 = 10.293829382; // Para decimais com precisão dupla, possui 64 bits e pode ter muitas casas decimais

        // boolean -> true ou false

        //TIPO NÃO PRIMITIVO
        String Nome = "Vinicius Bel"; // Para frases ou palavras/nomes
    }
}
