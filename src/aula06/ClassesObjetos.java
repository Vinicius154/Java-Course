package aula06;

public class ClassesObjetos {

    public static void main(String[] args) { // "Faísca" -> O que tiver aqui dentro executa
        radar meuradar = new radar(50); // Chamando o construtor e passando o parâmetro exigido no metodo
        radar meuradar2 = new radar(120);
        radar meuradar3 = new radar(179);
        radar meuradar4  = new radar(76);
        meuradar.multa(); // Chamado o metodo multa junto com a variável com o construtor da classe radar
        meuradar2.multa();
        meuradar3.multa();
        meuradar4.multa();
    }

}

class radar { // Classe radar
    double velocidade; // Variável double que vai receber a velocidade
    public radar(double velocidade) { // Criação do Construtor radar, ele vai precisar de um parâmetro double chamado velocidade para ser executado.
        this.velocidade = velocidade; // Declarando que a velocidade vem por meio do parâmetro
    }

    public void multa() { // Metodo da classe radar sendo criado como multa, o "void" indica que ele é de um "tipo"/retorno vazio
        System.out.println("O radar multou um veículo a " + this.velocidade + "Km/h"); // Printando um texto, contendo a velocidade capturado no metodo radar.
    }

    // Estrutura de um metodo
    // public -> Indica o nível de acesso desse metodo
    // tipo -> Indica o que vai retornar
    // nome() -> Sobre o que se trata, e dentro dos parenteses, pode passar parâmetros de execução
}

