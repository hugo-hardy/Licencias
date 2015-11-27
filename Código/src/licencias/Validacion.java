/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package licencias;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author HARDY
 */
public class Validacion {
    
    public static boolean isValidAyN(String texto){
     Pattern pat = Pattern.compile("[a-zA-Z]{1,50}");
     Matcher mat = pat.matcher(texto);
     return mat.matches();
    }
    
    public static boolean isValidNroDoc(String doc){
     Pattern pat = Pattern.compile("([0-9]{1,8})");
     Matcher mat = pat.matcher(doc);
     return mat.matches();
    }
    
    public static boolean isValidDom(String dom){
     Pattern pat = Pattern.compile(" [A-Za-z0-9]{1,50}");
     Matcher mat = pat.matcher(dom);
     return mat.matches();
    }
        
    
    public static boolean isValidInsert(String texto){
        boolean resultado = true;
        
        ArrayList<String> listaNegra = new ArrayList<>();
        listaNegra.add("SELECT ");
        listaNegra.add("DROP ");
        listaNegra.add("DELETE ");
        listaNegra.add("TRUNCATE TABLE ");
        listaNegra.add("CREATE ");
        listaNegra.add("ALTER ");
        listaNegra.add("INSERT ");
        listaNegra.add("SHOW ");
        listaNegra.add("SHOW FIELDS ");
        listaNegra.add("GRANT ");
        listaNegra.add("DESCRIBE ");
        listaNegra.add("RENAME TABLE ");
        listaNegra.add("REPLACE ");
        listaNegra.add("INDEX ");
        listaNegra.add("SHUTDOWN ");
        listaNegra.add("BACKUP TABLE ");
        listaNegra.add("START TRANSACTION ");
        listaNegra.add("BEGIN WORK ");
        listaNegra.add("ALL PRIVILEGES ");
        listaNegra.add("CHECK TABLE ");
        listaNegra.add("CHECKSUM TABLE ");
        listaNegra.add("FLUSH ");
        listaNegra.add("HANDLER ");
        listaNegra.add("KILL ");
        listaNegra.add("LOAD DATA ");
        listaNegra.add("LOCK TABLES ");
        listaNegra.add("OPTIMIZE TABLE ");
        listaNegra.add("RENAME TABLE ");
        listaNegra.add("REPAIR TABLE ");
        listaNegra.add("REPLACE ");
        listaNegra.add("RESET ");
        listaNegra.add("REVOKE ");
        listaNegra.add("ROLLBACK ");
        listaNegra.add("UNION ");
        listaNegra.add("UNLOCK TABLES ");
        listaNegra.add("RESET ");
        listaNegra.add("RESET ");
        
        for(String ln:listaNegra){
           if(texto.toUpperCase().contains(ln)){
            resultado = false;
           }
        }
            
        return resultado;
    }   
}
