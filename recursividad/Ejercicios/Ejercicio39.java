public class Ejercicio39{
    /**
     * Dada una cadena extendida se pide encontrar su formato reducido, el que indica el caracter de la cadena
     * y la cantidad de veces que aparece.
        Por ejemplo:
            cad = gggbbddeeewwasss
        el resultado sera
            res = g3b2d2e3w2a1s3
     */
    public String formatReduc(String cad){
        return contarElim(cad, 0, "");
    }
    private String contarElim(String cad, int pos, String see){
        String resp="";
        if(pos<cad.length()){
            char aux = cad.charAt(pos);
            if(! yaEsta(aux, see, 0)){
                see+=aux+"";
                resp +=aux+""+contar(aux, cad, 0);
            }
            resp += contarElim(cad, pos+1, see);
        }
        return resp;
    } 
    private int contar(char a, String cad, int pos){
        int resp=0;
        if(pos<cad.length()){
            if((cad.charAt(pos))==a){
                resp =1;
            }
            resp+=contar(a, cad, pos+1);
        }
        return resp;
    }
    private boolean yaEsta(char a, String vistos, int pos){
        boolean resp = false;
        if(pos<vistos.length()){
            if((vistos.charAt(pos))== a)
                resp = true;
            else
                resp = yaEsta(a, vistos, pos+1) || resp;
        }
        return resp;
    }
}