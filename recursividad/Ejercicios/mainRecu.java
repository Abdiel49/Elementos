public class mainRecu{
    
    public static void main(String[]args){
        recursividad r;
        r = new recursividad();

        //sms("ejercisio 1 potencia de  = "+r.potencia(4, 3));
        
        //sms("el numero 15 es primo? => "+r.esPrimo(15));
        //sms("el numero 7 es primo? => "+r.esPrimo(7));
        //sms("el numero 23 es primo? => "+r.esPrimo(23));
        
        //sms("el numero 12345 tiene : "+r.cantidadDigitos(12345)+" digitos");
        //sms("el numero 123456789 tiene : "+r.cantidadDigitos(123456789)+" digitos");
        
        //sms("todos los numeros de 2468 son pares? "+r.allPar(2468));
        //sms("todos los numeros de 2456 son pares? "+r.allPar(2456));
        //sms("todos los numeros de 52426 son pares? "+r.allPar(52426));
        //sms("todos los numeros de 28642086 son pares? "+r.allPar(28642086));

        //sms("suma/resta de digitos del num 2341675 es: "+r.sumDic(2341675, true, 0)+" es div entre 11"+r.divOnce(2341675));
        //sms("suma/resta de digitos del num 2648967 es: "+r.sumDic(2648967, true, 0)+" es div entre 11"+r.divOnce(2648967));
        
        //sms("la canticad de 'e' en elementos de programacion es "+r.cantChar("elementos de programacion", 'e'));
        //sms("la canticad de 'e' en 'adele' es "+r.cantChar("adele", 'e'));
        
        //sms("la cadena 'hola mundo' invertida sera '"+r.invertit("hola mundo")+"'");
    
        //sms("la cadena 'elementos de programacion' tiene "+r.cantVocales("elementos de programacion")+" vocales");
        //sms("la cadena 'holamundo' tiene "+r.cantVocales("holamundo")+" vocales");
        //sms("la cadena 'sistemas informaticos universitarios' tiene "+r.cantVocales("sistemas informaticos universitarios")+" vocales");
        //sms("la cadena 'eucalipto' tiene "+r.cantVocales("sistemas informaticos universitarios")+" vocales");
   
        //sms("la cadena 'omo' es palintromo? "+r.palindromo("omo"));
        //sms("la cadena 'hola' es palintromo? "+r.palindromo("hola"));
        //sms("la cadena 'ya no on ay' es palintromo? "+r.palindromo("ya no on ay"));   

        //sms("la suma de los primero 4 num mult de 4 es "+r.calcuSumCuatro(4));

        //sms("lord es prefijo de 'lordem' :"+r.esPrefijo("lordem", "lord"));
        //sms("'gen' es prefijo de 'gamdalf' :"+r.esPrefijo("gamdalf", "gen"));

        //sms("'dem' es sufijo de lordem : "+r.esSufijo("lordem", "dem"));
        //sms("'eta' es sufijo de 'soquete' : "+r.esSufijo("soquete", "eta"));

        //sms("theFuckSecuency of 3 is: "+r.secuencia(3));
        //sms("theFuckSecuency of 8 is: \n\t"+r.secuencia(8));
        //sms("theFuckSecuency of 20 is: \n\t"+r.secuencia(20));

        //sms("chinitos de nivel 3 = "+r.chinitos(3));
        //sms("chinitos de nivel 1 = "+r.chinitos(1));
        //sms("chinitos de nivel 5 = "+r.chinitos(5));

        //sms("el cambio perfacto para 54 pesos es :\n"+r.cambiar(54.0));
        //sms("el cambio perfacto para 62.56 pesos es :\n"+r.cambiar(62.56));
        //sms("el cambio perfacto para 125.36 pesos es :\n"+r.cambiar(125.36));

        //sms("al eliminar las segundas ocurencias del numero 2656342 =>  56342 -> "+r.elimOcurrencias(2656342));
        Ejercicio39 e = new Ejercicio39();
        sms("la cadena 'gggbbddeeewwasss' en su forma reducida sera: "+e.formatReduc("gggbbddeeewwasss"));
    }

    private static void sms (String cad){
        System.out.println(cad);
    } 
}