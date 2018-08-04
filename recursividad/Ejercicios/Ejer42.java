class Ejer42{
    /*
     * Dada una cadena, se pide indicar cuántas veces existe un patron de forma 
     * exacta en la cadena original.
     * Por ejemplo:
     *      cad = aaabbabbaa
     *      patron = abba
     * el resultado sera
     *      res = 2
     */
    int contarPatron(String cadena, String patron){
        return contarPatron(cadena, patron, 0);
    }
    public int contarPatron(String cadena, String patron, int pos){
        int resp=0;
        if((pos+patron.length())<cadena.length()){
            String aux = cadena.substring(pos, pos+patron.length());
            if(aux.equals(patron)){
                resp=1;
            }
            resp += contarPatron(cadena, patron, pos+1);
        }
        return resp;
    }
}