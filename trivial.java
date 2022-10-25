
package trivial2;
import java.util.*;



public class trivial2 {

    //Creado por Alvaro, Gabriel y Sergio//
    public static void main(String[] args) {
      final String green ="\u001B[32m" ;
      final String red ="\u001B[31m" ;
        char o=4;
        System.out.println(""+o+"-------------------------"+o);
        System.out.println("|                         |");
        System.out.println("|   -----    |-----       |");
        System.out.println("|     |      |     |      |");
        System.out.println("|     |      |------      |");
        System.out.println("|     |      |      |     |");
        System.out.println("|     |      |        |   |");
        System.out.println(""+o+"-------------------------"+o);
       
        System.out.println(""+o+"-------------------------"+o);
        System.out.println("|                         |");
        System.out.println("|Eto es un trivial de Rock|");
        System.out.println("|                         |");
        System.out.println(""+o+"-------------------------"+o);
        
        
        String [] preguntas= {"�Qui�n fue el vocalista de Queen","�En que a�o se fund� Metallica", "�Cuantos miembros tiene la banda AC/DC?","�Cual fue el primer album de Twenty One Pilots?","�En que a�o se lanz� el alb�m The Night at the Opera?","�En que a�o aparecieron las Beatles?","�Cuantos albumes de estudio tiene Linkin Park?","�Como se llama el cantante de Megadeth","�Que artista se comio un murcielago?","En que a�o fallecio Michael Jackson","�Cuantas cuerdas tiene una guitarra?","�En que grupo tocaba Fredd Mercury?","�En que decada se fundo el Rock?"};
        String [] respuestas= {"freddy mercury", "1981","4","twenty one pilots","1975","1956","7","dave mustaine","ozzy ousbourne","2009","6","queen","30"};
        
        
        
        int puntos = 1;
        
        
        
        int random = (int) (Math.random()*(preguntas.length-1)+1-0)+0;
        int random1 = (int) (Math.random()*(preguntas.length-1)+1-0)+0;
        int random2 = (int) (Math.random()*(preguntas.length-1)+1-0)+0;
        int random3 = (int) (Math.random()*(preguntas.length-1)+1-0)+0;
        int random4 = (int) (Math.random()*(preguntas.length-1)+1-0)+0;
        int random5 = (int) (Math.random()*(preguntas.length-1)+1-0)+0;
        int random6 = (int) (Math.random()*(preguntas.length-1)+1-0)+0;
        int random7 = (int) (Math.random()*(preguntas.length-1)+1-0)+0;
        
        System.out.println("Escribe tu nombre: ");
        String nombre = new Scanner(System.in).nextLine();
        
        System.out.println(preguntas[random]+"");
        String solucion1 = new Scanner (System.in) .nextLine();
        
        
        
        
        
         if (respuestas[random].equals(solucion1)){  
        
                    
        System.out.println(green+"La respuesta es correcta"); 
        puntos ++ ;
        
            
            
        }else{
             System.out.println(red+"La respuesta es incorrecta");
             if(puntos > 0){ puntos --;}
        
          }
          
         
        String solucion2 = new Scanner (System.in) .nextLine();
          
          if (respuestas[random1].equals(solucion2)){  
        
            puntos ++ ;        
        System.out.println(green+"La respuesta es correcta");    
        
            
            
        }else{System.out.println(red+"La respuesta es incorrecta");
        if(puntos > 0){ puntos --;}
          } 
          
          
          System.out.println(preguntas[random2]+"");
        String solucion3 = new Scanner (System.in) .nextLine();
          if (respuestas[random2].equals(solucion3)){  
        
              puntos ++ ;      
        System.out.println(green+"La respuesta es correcta");    
        
            
            
        }else{System.out.println(red+"La respuesta es incorrecta");
        if(puntos > 0){ puntos --;}
          } 
          
          
          System.out.println(preguntas[random3]+"");
        String solucion4 = new Scanner (System.in) .nextLine();
          if (respuestas[random3].equals(solucion4)){  
        
              puntos ++ ;    
        System.out.println(green+"La respuesta es correcta");    
        
            
            
        }else{System.out.println(red+"La respuesta es incorrecta");
        if(puntos > 0){ puntos --;}
          }
          
          
          System.out.println(preguntas[random4]+"");
        String solucion5 = new Scanner (System.in) .nextLine();
          if (respuestas[random4].equals(solucion5)){  
        
               puntos ++ ;    
        System.out.println(green+"La respuesta es correcta");    
        
            
            
        }else{System.out.println(red+"La respuesta es incorrecta");
        if(puntos > 0){ puntos --;}
          } 
          
          
          System.out.println(preguntas[random5]+"");
        String solucion6 = new Scanner (System.in) .nextLine();
          if (respuestas[random5].equals(solucion6)){  
        
                puntos ++ ;    
        System.out.println(green+"La respuesta es correcta");    
        
            
            
        }else{System.out.println(red+"La respuesta es incorrecta");
        if(puntos > 0){ puntos --;}
          }
          
          
          System.out.println(preguntas[random6]+"");
        String solucion7 = new Scanner (System.in) .nextLine();
          if (respuestas[random6].equals(solucion7)){  
        
              puntos ++ ;     
        System.out.println(green+"La respuesta es correcta");    
        
            
            
        }else{System.out.println(red+"La respuesta es incorrecta");
        if(puntos > 0){ puntos --;}
          }
          
          
          
          System.out.println(preguntas[random7]+"");
        String solucion8 = new Scanner (System.in) .nextLine();
          if (respuestas[random7].equals(solucion8)){  
        
               puntos ++ ;    
        System.out.println(green+"La respuesta es correcta");    
        
            
            
        }else{System.out.println( red+"La respuesta es incorrecta");
         if(puntos > 0){ puntos --;}
        
          } 
          
            

         
        System.out.println("El jugador= "+nombre+ ", ha conseguido los siguientes puntos= " +puntos);
        
        if (puntos < 0 )
               System.out.println("Lo has echo fatal");
        else
            if (puntos < 4 )
                
               System.out.println("Te falta cultura");
        else 
               if (puntos > 4 )
                   
                System.out.println("Bien tienes bastante cultura");
        else
                   if (puntos == 8 )
                System.out.println("Lo has echo increible");     
        
    }
    
}
