package aula03;

import java.util.ArrayList;

public class ArraysEVetores {
    public static void main(String[] args) {
        // Vetores (arrays) são coleções de dados armazenadas em uma variável
        // No Java existem 3 modos
        // Primeiro:
        int[] arrNum = {1, 2, 4, 7}; // Esse define o tipo do array, ou seja, int[], e as chaves indicam que é um array, o nome da variável e os valores
        System.out.println(arrNum[0]); // Exemplo de print em cima da primeira condição, tendo em mente que o array inicia do índice 0

        //Segundo:atribuídos
        int[] arrNum3 = new int[2]; // Esse tipo é mais dinâmico pois não precisa passar os valores, porém, o tamanho é pré definido, nesse caso array com 2 valores

        // Terceiro:
        ArrayList<Integer> arr2Num = new ArrayList<Integer>(); // O mais dinâmico de todos, usa a classe arrayList do Java, indica o tipo no caso Integer e gera um array dinâmico
        arr2Num.add(3); // Jeito de adicionar valor no array com .add();
        arr2Num.add(9);
        arr2Num.add(2);
        arr2Num.add(6);
        System.out.println(arr2Num.get(0)); // Print, aqui usa .get() ao invés das [0] chaves
        arr2Num.remove(0); // Jeito de remover o valor de um array, pode ser por posição ou diretamente o objeto.
        System.out.println(arr2Num.get(0));

    }
}
