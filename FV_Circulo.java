/*
 * @author Fran
 * @version 1.0
 */
public class FV_Circulo {
    private int id;
    private double radio;
    private String color;

    public FV_Circulo() {
    }
    /**
     * Esto crea los objetos con o sin parametros
     * 
     */
    public FV_Circulo(String color, int id, double radio) {
        this.color = color;
        this.id = id;
        this.radio = radio;
    }
    
    /**
     * Esto devuelve el area de el circulo
     * usa el radio del circulo en el objeto
     * @return
     */
    public double CalculoAreaCirculo(){
        double result = Math.PI*(this.radio*this.radio);
        return result;
    }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("FV_Circulo{");
        sb.append("id=").append(id);
        sb.append(", radio=").append(radio);
        sb.append(", color=").append(color);
        sb.append('}');
        return sb.toString();
    }

}
