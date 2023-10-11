package pruebas;
public class MiClase {

  int miNumero;
  private boolean miBoolean = true;
  protected String string1 = "Primer";
  public String string2; // mala practica
  protected static String string3;

  public int getMiNumero() {
      return miNumero;
  }

  public boolean isMiBoolean() {
      return miBoolean;
  }

  public String getString1() {
      return string1;
  }

  private String getString2() { // absurdo
      return string2;
  }

  void setString2(String string2) {
      this.string2 = string2;
  }

  public static String getString3() {
      return string3;
  }

  public static void setString3(String string3) {
      MiClase.string3 = string3;
  }
 
}