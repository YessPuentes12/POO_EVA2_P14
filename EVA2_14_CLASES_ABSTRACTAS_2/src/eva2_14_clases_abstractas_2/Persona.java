/*

 */
package eva2_14_clases_abstractas_2;


public abstract class Persona {

private String nombre;
private int edad;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
//------------------------------------------------------------------------------
    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

  public abstract void imprimirDatos();

//Si se usan métodos las clases tienen que serlo también



    
}
