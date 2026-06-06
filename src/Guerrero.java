public class Guerrero extends Personaje
{
protected String arma;

public Guerrero (String nombre, String raza, int fuerza, double vitalidad, String arma)
{
super(nombre,raza,fuerza,vitalidad);
this.arma = arma;
}

public String getArma()
{
return arma;
}

  public void setArma(String arma)
  {
  this.arma=arma;  
  }
@override  
public String atacar (int fuerza, String oponente){
  return " atacando a " + oponente + "con una fuerza de"+ fuerza; 
}

    public void sanacion() {
        vitalidad += 4;
    }

public void mostrarPersonaje() {
        System.out.println("Se ha creado un personaje con los siguientes valores: ");
        System.out.println("Nombre: "    + nombre);
        System.out.println("Raza: "      + raza);
        System.out.println("Fuerza: "    + fuerza);
        System.out.println("Vitalidad: " + vitalidad);
        System.out.println("--------------------------------------------");
    }
  
  public void mostrarVitalidad() {
        System.out.println("Vitalidad del personaje atacado: " + vitalidad);
    }
}
