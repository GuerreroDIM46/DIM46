package pruebas;

public class Ejecucion {

  public static void main(String[] args) {
    
      MiClase miObjeto = new MiClase(); // creo una instancia
    
      System.out.println("miNumero es " + miObjeto.miNumero);
//      System.out.println("miBoolean es " + miObjeto.miBoolean); // sin acceso
      System.out.println("miBoolean es " + miObjeto.isMiBoolean());
    
      System.out.println("string1 es " + miObjeto.string1);
      System.out.println("string1 tiene longitud " + miObjeto.string1.length());
    
//      System.out.println("string2 es " + miObjeto.getString2(); // absurdo
      System.out.println("string2 es " + miObjeto.string2);
    
      MiClase.setString3("string-3");
//      System.out.println("string3 es " + miObjeto.getString3()); // warning
      System.out.println("string3 es " + MiClase.getString3());
  }

}
