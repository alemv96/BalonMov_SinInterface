public abstract class ABalon{
  private float x;
  private float y;
  private float speed;
  private float radio;
  private int color;

  public ABalon(float x ,float y ,float speed ,float radio ,int color){
    this.x = x;
    this.y = y;
    this.color = color;
    this.speed = speed;
    this.radio = radio;
  }

  public void actualizar(float speed){
    if (speed >= 100){
      this.x = 200;
      this.y = 50;
    }
    else{
      this.x = 80;
      this.y = 10;
    }

    //verifico si el balon choca con otro objeto
    actualizarEstado();
  }

  public abstract void actualizarEstado();

  public float getX(){
    return this.x;
  }

  public float getY(){
    return this.y;
  }

  public int getColor(){
    return this.color;
  }

}
