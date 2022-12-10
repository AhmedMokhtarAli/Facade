public class ShapeMaker {
   private Shape circle,rectangle,squer;

    public ShapeMaker() {
        circle=new Circle();
        rectangle=new Rectengle();
        squer=new Squer();
    }

    public void makeSquer()
    {
        squer.draw();
    }

    public void makeCircle()
    {
        circle.draw();
    }

    public void makeRectangle()
    {
        squer.draw();
    }
}
