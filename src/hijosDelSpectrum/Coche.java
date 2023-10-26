package hijosDelSpectrum;

public class Coche extends VehiculoConRuedas implements Arrancable{
	private int numeroDeRuedas;
  private String matricula;

	public void setMatricula(String matricula) {
    this.matricula = matricula;
}
  
	public Coche() {
		super();
		numeroDeRuedas = 4;
	}

	public Coche(String color) {
		this();
		super.setColor(color);// como ya tengo el setter lo utilizo
	}

	public Coche(String modelo, String color) {
		super(modelo, color); // le constructor de vehiculo con ruedas
		numeroDeRuedas = 4;
	}
	
	@Override
	public String toString() {
		return "Placa " + matricula + " - " + super.toString();
  }
	// cosas mas el toStrin de la clase superior
	
	 @Override
   public int hashCode() {
       final int prime = 31;
       int result = 1;
       result = prime * result + ((matricula == null) ? 0 : matricula.hashCode());
       result = prime * result + ((modelo == null) ? 0 : modelo.hashCode());
       return result;
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
       if (matricula == null) {
           if (other.matricula != null)
               return false;
       } else if (!matricula.equals(other.matricula))
           return false;
       if (modelo == null) {
           if (other.modelo != null)
               return false;
       } else if (!modelo.equals(other.modelo))
           return false;
       return true;
   }

	@Override
	public int getNumeroDeRuedas() {
				return numeroDeRuedas;
	}
	// reescritura del get numeor de ruedas

//	@Override
//	public void arrancar() {
//		System.out.println("coche arrancado");
//		
//	}
}
