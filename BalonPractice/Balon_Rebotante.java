public class Balon_Rebotante extends ABalon{

  public Balon_Rebotante(float x ,float y ,float speed ,float radio ,int color){
    super(x , y, speed, radio, color);
  }
  public void actualizarEstado(){
      System.out.println("el balon esta rebotando");
  }
}
