
package parcial;

public class Calculador implements ICalculador {
    
    Punto punto1=new Punto();
    Punto punto2=new Punto();

    @Override
    public double calcularArea() {
        
        double a = ((punto2.getX()-punto1.getX()*punto2.getY()-punto1.getY())/2);
        return a;

    }

    @Override
    public double calcularPendiente() {
        
        int m = punto2.getY()-punto1.getY()/punto2.getX()-punto1.getX();
        return m;
    }

    @Override
    public double calcularDistancia() {
        
        double x = Math.pow(punto2.getX()-punto1.getX(), 2.0);
        double y= Math.pow(punto2.getY()-punto1.getY(), 2.0);
  
        return Math.sqrt(x+y);
    }
    
}
