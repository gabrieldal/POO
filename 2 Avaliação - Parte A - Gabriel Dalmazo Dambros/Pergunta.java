//Pretendia fazer uma interface, porém a falta de objetos para instanciar foi um impedimento

abstract public class Pergunta {

    protected String pergunta;
    protected String resposta;

    public Pergunta(String pergunta) {
    }

    public String getPergunta() {
        return pergunta;
    }
    
// aqui achei que seria necessário fazer um método para pegar a resposta, mas não consegui fazer funcionar, então ficou tudo pela interface gráfica

    /*public Resposta(String resposta){
        
    }

    public String GetResposta(){
        return resposta;
}*/
}
