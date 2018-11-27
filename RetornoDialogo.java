package cobaia;

public class RetornoDialogo {
  public void recebe(Documentos doc) {
    System.out.println( doc.getTipo() + " recebido, valor: " + doc.getTexto());
    System.out.println(doc.getTipo() + " : " + doc.getNumero());
  }


}
