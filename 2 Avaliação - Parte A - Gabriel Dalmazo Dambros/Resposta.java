//aqui tento usar a classe resposta para ler o arquivo pergunta.txt e verificar a resposta certa
// ainda não idenfiquei o erro que a minha classe apresenta ao ler o arquivo, talvez seja o try catch
// mas não sei como corrigir, mas acredito que não usarei mais esse código, pois acredito que não funcionaria do jeito novo


/*import java.io.File;  
import java.io.FileNotFoundException;  
import java.util.Scanner;
import java.util.LinkedList; 


public class Resposta implements Tiposdeperguntas {
    try{
        File resposta = new File("perguntaT.txt");
        Scanner myReader = new Scanner(resposta);

        while (myReader.hasNextLine()) {
          String data = myReader.nextLine();
          System.out.println(data);
        }
        myReader.close();
    }   catch (FileNotFoundException e) {
        System.out.println("An error occurred.");
        e.printStackTrace();
    }
    public void listaRespostas(){

        linkedList<String> respostas = new linkedList<String>();

        respostas.add("Polimorfismo é a capacidade de um objeto de assumir várias formas.");
        respostas.add("Herança é a capacidade de uma classe herdar atributos e métodos de outra classe.");
        respostas.add("Encapsulamento é o agrupamento de dados e métodos que operam sobre esses dados.");
        respostas.add("Abstração é o processo de identificar apenas os atributos relevantes de um objeto, ignorando os detalhes irrelevantes.");
        respostas.add("Classe é um modelo ou molde para a criação de objetos.");
        respostas.add("Objeto é uma instância de uma classe.");
        respostas.add("Método é uma função que pertence a uma classe.");
    }
}*/
