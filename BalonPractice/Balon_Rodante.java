public class Balon_Rodante extends ABalon{

  public Balon_Rodante(float x ,float y ,float speed ,float radio ,int color){
    super(x , y, speed, radio, color);
  }

  public void actualizarEstado(){
    System.out.println("el balon esta rodando");
  }
}
