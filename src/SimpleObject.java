public class SimpleObject {
   protected int x = 0;
   protected int y = 0;
   private double width = 0.0;
   private double length = 0.0;
   private double square = 0.0;

   public void changeWidth(double width){
       this.width=width;
       recalculateSquare();

   }
   public void changeLength(double length){
this.length=length;
       recalculateSquare();
   }
   private void recalculateSquare(){
square = width * length;
   }

    void moveX (int distance){
      x+=distance;
    }
    void moveY (int distance){
        y+=distance;
    }
    public double getSquare(){
        return square;
    }
}
