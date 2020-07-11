package ec.edu.ups.controlador;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

/**
 * Clase ControladorArchivos.
 * Esta clase permite desencriptar el mensaje guardado en un archivo ubicado en 
 * cualquier ruta que decida el usuario.
 * @author Romel Avila, Sebastian Uyaguari
 */
public class ControladorArchivos {

    private Map<String, String> diccionarioEncriptado;
    
    /**
    * Metodo ControladorArchivos (Constructor).
    * El metodo constructor inicializa el atributo diccionarioEncriptado, ademas 
    * llena el diccionario con los datos correspondientes para poder encriptar.
    */
    public ControladorArchivos() {
        diccionarioEncriptado = new HashMap<>();
        llenarDiccionario();
    }
    
    /**
     * Metodo desencriptarMensajeArchivo.
     * El metodo desencripta el mensaje recibido como parametro cambiando las letras
     * por un caracter especifico para despues retornar. 
     * @param mensaje
     * @return retorna una variable tipo String: texto
     */ 
    public String desencriparMensajeArchivo(String mensaje){
        
        String texto="";
        for (int i = 0; i < mensaje.length(); i++) {
            String letra = mensaje.charAt(i)+"";
            if(!letra.equals("-")){
                for (Map.Entry<String, String> entry : diccionarioEncriptado.entrySet()) {
                    String key = entry.getKey();
                    String value = entry.getValue();
                    if(letra.equals(value)){
                        texto+=key;
                        }
                    }     
            }else{
                texto+=" ";
            } 
        }
        return texto;
    }
     
    /**
     * Metodo llenarDiccionario.
     * Este metodo tiene la funcion de llenar el diccionario mediante dos vectores,
     * el cual el primero es para asignar la clave o llave mientras que el segundo
     * es para asignar el velor.
     */
    public void llenarDiccionario(){
        String[] letras = {"a","b","c","d","e","f","g","h","i","j","k","l","m","n",
        "o","p","q","r","s","t","u","v","w","x","y","z"," "};
        String[] encriptado = {"!","]","^","æ","ü","×","¢","þ","≡","§","«",
            "A","¥","~","c","r","z","W","8","ç","2","L","f","&","#","[","-"};
        for (int i = 0; i < 26; i++) {
            diccionarioEncriptado.put(letras[i], encriptado[i]);
        }
        
    }
    
    /**
     * Metodo leerTexto.
     * El metodo recibe como parametro la ruta en la cual esta el archivo en el cual
     * obtiene el texto o cuerpo del archivo para ser retornado y desencriptarlo.
     * @param rutaT
     * @return retorna una variable tipo String: linea
     */
    public String leerTexto(String rutaT){
        try{
            FileReader archivoLectura= new FileReader(rutaT);
            BufferedReader lectuta= new BufferedReader(archivoLectura);String linea="";
            while(linea!=null){
                linea=lectuta.readLine();
                return linea;
            }
            lectuta.close();
        }catch(FileNotFoundException e1){
            System.out.println("Ruta de archivo no encontrada");
        }catch(IOException e2){
            System.out.println("Error de lectura");
        }catch(Exception e3){
            System.out.println("Error General");
        }
        return null;
    }
    
}
