package ec.edu.ups.controlador;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author Estudiantes
 */
public class ControladorArchivos {

    private Map<String, String> diccionarioEncriptado;
    
    public ControladorArchivos() {
        diccionarioEncriptado = new HashMap<>();
        llenarDiccionario();
    }
    
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
     
    
    public void llenarDiccionario(){
        String[] letras = {"a","b","c","d","e","f","g","h","i","j","k","l","m","n",
        "o","p","q","r","s","t","u","v","w","x","y","z"," "};
        String[] encriptado = {"!","]","^","æ","ü","×","¢","þ","≡","§","«",
            "A","¥","~","c","r","z","W","8","ç","2","L","f","&","#","[","-"};
        for (int i = 0; i < 26; i++) {
            diccionarioEncriptado.put(letras[i], encriptado[i]);
        }
        
    }
    
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
