package cobaia;

public class Main {
  public static void main(String[] args) {
    Documentos doc = new CPF();
    RetornoDialogo printa = new RetornoDialogo();
    DialogoEntradaDadoAlfaNumerico dialogo = new DialogoEntradaDadoAlfaNumerico(doc);
    dialogo.quandoOk(printa);
    dialogo.mostra();
   
    Documentos doc1 = new CEP();
    RetornoDialogo printa1 = new RetornoDialogo();
    DialogoEntradaDadoAlfaNumerico dialogo1 = new DialogoEntradaDadoAlfaNumerico(doc1);
    dialogo1.quandoOk(printa1);
    dialogo1.mostra();
    
    Documentos doc2 = new Placa();
    RetornoDialogo printa2 = new RetornoDialogo();
    DialogoEntradaDadoAlfaNumerico dialogo2 = new DialogoEntradaDadoAlfaNumerico(doc2);
    dialogo2.quandoOk(printa2);
    dialogo2.mostra();
    
    
    
    /*
    RetornoDialogoTituloEleitor prinTE = new RetornoDialogo(Titulo, 10);
    DialogoEntradaDadoNumericoTituloEleitor dialogoTE = new DialogoEntradaDadoNumericoTituloEleitor();
    dialogoTE.quandoOk(prinTE);
    dialogoTE.mostra();
    
    RetornoDialogoQuadra ver = new RetornoDiaogo(Quadra, 5);
    /*
    Desafios:
    * diálogo e retorno para qualquer dado numérico
    * diálogo e retorno para qualquer dado de qualquer tipo
    */
  }
}
