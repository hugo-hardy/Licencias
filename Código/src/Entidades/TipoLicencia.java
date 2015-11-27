/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

import org.eclipse.persistence.jpa.jpql.parser.DateTime;

/**
 *
 * @author HARDY
 */
public class TipoLicencia {
    
    public static boolean cumpleEdadMinima(String tipoLicencia, int edad) {
        boolean cumple = false;
        switch(tipoLicencia){
            case "Clase A": 
                  if(edad >= 17)
                  { 
                    cumple = true;
                  }
                  else
                  {
                    cumple = false;
                  }
                     break;
            case "Clase B": if(edad >= 17)
                  { 
                    cumple = true;
                  }
                  else
                  {
                    cumple = false;
                  }
                     break;
            case "Clase C": if(edad >= 21)
                  { 
                    cumple = true;
                  }
                  else
                  {
                    cumple = false;
                  }
                     break;
            case "Clase D": if(edad >= 21)
                  { 
                    cumple = true;
                  }
                  else
                  {
                    cumple = false;
                  }
                     break;
            case "Clase E": if(edad >= 21)
                  { 
                    cumple = true;
                  }
                  else
                  {
                    cumple = false;
                  }
                     break;
            case "Clase F": if(edad >= 17)
                  { 
                    cumple = true;
                  }
                  else
                  {
                    cumple = false;
                  }
                     break;
            case "Clase G": if(edad >= 17)
                  { 
                    cumple = true;
                  }
                  else
                  {
                    cumple = false;
                  }
                     break;
        }    
        return cumple;
    }
    
    public Integer calcularVigencia(int edad, boolean primeraVez) {
        Integer vigencia = 0;
        
        if(edad >= 17 && edad<=21)
        {
          if(primeraVez)
          {
            vigencia = 1;
          }  
          else
          {
            vigencia = 3;
          }
        }
        if(edad > 21 && edad<=46)
        {
            vigencia = 5;
        }             
        if(edad > 46 && edad<=60)
        {
            vigencia = 4;
        }
        if(edad > 60 && edad<=70)
        {
            vigencia = 3;
        } 
        if(edad > 70)
        {
            vigencia = 1;
        } 
        return vigencia;
    }
    
    public static float calcularCosto(String tipoLicencia, int vigencia) {
        float monto = 0;
        switch(tipoLicencia){
            case "Clase A": 
                     switch(vigencia){
                         case 1: monto = 20;
                         break;
                         case 3: monto = 25;
                         break;
                         case 4: monto = 30;
                         break;
                         case 5: monto = 40;
                         break;
                             }
                     break;
            case "Clase B": switch(vigencia){
                         case 1: monto = 20;
                         break;
                         case 3: monto = 25;
                         break;
                         case 4: monto = 30;
                         break;
                         case 5: monto = 40;
                         break;
                             }
                     break;
            case "Clase C": switch(vigencia){
                         case 1: monto = 23;
                         break;
                         case 3: monto = 30;
                         break;
                         case 4: monto = 35;
                         break;
                         case 5: monto = 47;
                         break;
                             }
                     break;
            case "Clase D": switch(vigencia){
                         case 1: monto = 20;
                         break;
                         case 3: monto = 25;
                         break;
                         case 4: monto = 30;
                         break;
                         case 5: monto = 40;
                         break;
                             }
                     break;
            case "Clase E": switch(vigencia){
                         case 1: monto = 29;
                         break;
                         case 3: monto = 39;
                         break;
                         case 4: monto = 44;
                         break;
                         case 5: monto = 59;
                         break;
                             }
                     break;
            case "Clase F": switch(vigencia){
                         case 1: monto = 20;
                         break;
                         case 3: monto = 25;
                         break;
                         case 4: monto = 30;
                         break;
                         case 5: monto = 40;
                         break;
                             }
                     break;
            case "Clase G": switch(vigencia){
                         case 1: monto = 20;
                         break;
                         case 3: monto = 25;
                         break;
                         case 4: monto = 30;
                         break;
                         case 5: monto = 40;
                         break;
                             }
                     break;
        }    
        return monto;
    }
}
