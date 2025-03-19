public class Main {
    public static void main(String[] args) {
        FV_Circulo circulo = new FV_Circulo("rojo",1,3);
        FV_Rectangulo cuadrado = new FV_Rectangulo("azul",1,4,4);
        System.out.println("area de circulo:");
        double area1 = circulo.CalculoAreaCirculo();
        System.out.println(area1);
        System.out.println("area de cuadrado");
        double area2 = cuadrado.CalculoAreaCuadrado();
        System.out.println(area2);
        System.out.println("diferencias entre areas:");
        double diferencias = CalculoDiferencia(area1,area2);
        System.out.println(diferencias);

        System.out.println("cuadrado"+cuadrado);
        System.out.println("circulo"+circulo);
        System.out.println("differencia"+diferencias);
    }
    
    
    
    public static double CalculoDiferencia(double area1,double area2){
        return area1-area2;
    }
}
