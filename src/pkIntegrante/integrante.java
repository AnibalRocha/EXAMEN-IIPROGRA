package pkIntegrante;

public class integrante {
    public int id;
    public String nombre;
    public int edad;
    public String sexo;  

    // se crea un constructor
    public integrante(){
    }

    public integrante(int id, String nombre, int edad, String sexo){

        this.id = id;
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = sexo;
        
    }
}
