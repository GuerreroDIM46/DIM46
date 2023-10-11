package pruebas;

import java.util.Objects;

public class Coche {
    private String modelo;
    private String color;
    private int numeroDeRuedas;
    private String matricula;

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    void setMatricula(String matricula) {
        this.matricula = matricula;
    }
    
    public Coche() {
        numeroDeRuedas = 4;
    }
    
    public Coche(String color) {
        this();
        setColor(color); // como ya tengo el setter lo utilizo
    }
    
    public Coche(String modelo, String color) {
        this(color);
        this.modelo = modelo;
    }

    @Override
    public String toString() {
        return "Placa " + matricula + " - " + modelo + " (" + getColor() + "), " + numeroDeRuedas + " ruedas";
    }

	@Override
	public int hashCode() {
		return Objects.hash(matricula);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Coche other = (Coche) obj;
		return Objects.equals(matricula, other.matricula);
	}

    
    
  

}
