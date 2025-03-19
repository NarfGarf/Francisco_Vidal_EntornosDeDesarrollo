public class Main {
    public static void main(String[] args) {
        FV_Circulo circulo = new FV_Circulo("rojo",1,3);
        FV_Rectangulo cuadrado = new FV_Rectangulo("azul",1,4,4);
        System.out.println("area de circulo:");
        System.out.println(Math.PI*(circulo.getRadio()*circulo.getRadio()));
        System.out.println("area de cuadrado");
        System.out.println(cuadrado.getLadoA()*cuadrado.getLadoB());
    }
}
