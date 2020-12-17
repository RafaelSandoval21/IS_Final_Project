package RegistroUsuarios;

public class RegistroUsuarios 
{
    
    public boolean usuarios(String nombre) {
        Boolean resp = false;
        String strNombres = "Norma,Omar,Felipe,Rodrigo,Maria";

        if(strNombres.contains(nombre))
        {
            resp = true;
        }

		return resp;
	}

}
