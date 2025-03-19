public class FV_Rectangulo {
    private int id;
    private double ladoA;
    private double ladoB;
    private String color;

    public FV_Rectangulo() {
    }

    public FV_Rectangulo(String color, int id, double ladoA, double ladoB) {
        this.color = color;
        this.id = id;
        this.ladoA = ladoA;
        this.ladoB = ladoB;
    }

    @Override
    public String toString() {
        return "FV_Rectangulo [id=" + id + ", ladoA=" + ladoA + ", ladoB=" + ladoB + ", color=" + color + "]";
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getLadoA() {
        return ladoA;
    }

    public void setLadoA(double ladoA) {
        this.ladoA = ladoA;
    }

    public double getLadoB() {
        return ladoB;
    }

    public void setLadoB(double ladoB) {
        this.ladoB = ladoB;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

}
