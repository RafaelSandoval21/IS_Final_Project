package RegistroUsuarios;

public class RegistroUsuarios 
{
    String strNombres = "Norma,Omar,Felipe,Rodrigo,Maria";
    
    public boolean usuarios(String nombre) 
    {
        Boolean resp = false;
        
        if(strNombres.contains(nombre))
        {
            resp = true;
        }

		return resp;
	}

    public String registrar(String nombre, int edad, String direccion, String habilidades) 
    {
        if(!strNombres.contains(nombre))
        {
            strNombres += "," + nombre;            
        }

        String resp = "El Usuario " + nombre + " con edad de " + edad + " años, \n" + 
                        "Direccion en " + direccion + "\n" +
                        "y Habilidades en " + habilidades + ".\n" +
                        "Ha sido registrado exitosamente!";
        
        return resp;
	}
    
    public String registrarTiempo(int matricula, String nombre)
    {
        String resp = "";

        int dias = (int) (Math.random() * 6 + 1);
        int horas = (int) (Math.random() * 22 + 1);

        resp = "El Usuario " + nombre + " con Matricula " + matricula + "\n" + 
                        "Tiene registrados " + dias + " Dias y " + horas + " Horas en el Sistema.";
        
        return resp;
	}

}
