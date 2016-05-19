public class Balones{
  public static void main(String[] args){
    Balon_Rodante balonRodante = new Balon_Rodante(0 , 0, 0, 4, 1);
    Balon_Rebotante balonRebotante = new Balon_Rebotante(0 , 0, 0, 3, 2);

    balonRodante.actualizar(150);
    System.out.println("color " + balonRodante.getColor());
    System.out.println("posicion en x " + balonRodante.getX());
    System.out.println("pocision en y " + balonRodante.getY());
    balonRebotante.actualizar(90);
    System.out.println("color " + balonRebotante.getColor());
    System.out.println("posicion en x " + balonRebotante.getX());
    System.out.println("pocision en y " + balonRebotante.getY());
  }
}
