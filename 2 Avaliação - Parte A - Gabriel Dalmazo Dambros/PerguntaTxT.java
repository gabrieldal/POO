//pergunta de texto que herda da classe abstrata pergunta

public class PerguntaTxT extends Pergunta {

    private String resposta;

    PerguntaTxT(String pergunta, String resposta) {
        super(pergunta);
        this.pergunta = pergunta;
        this.resposta = resposta;
    }

    public String getResposta() {
        return resposta;
    }

}