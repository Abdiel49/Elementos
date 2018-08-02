class recursividad{
    
    //  1) Potencia en un numero k
    public int potencia(int a, int b){
        if(b==1)
            return a;
        else 
            return a*potencia(a, b-1);
    }
    // 2) num es primo
    public boolean esPrimo(int num){
        if(divisores(num,1)==1) return true;
        return false;
    }
    private int divisores(int num, int div){
        int resp=0;
        if(div <= (Math.sqrt(num))){
            if(num%div == 0)
                resp+=1;
            resp += divisores(num, div+1);
        }
        return resp;
    }

    //  3)  cantidad de digitos
    public int cantidadDigitos(int num){
        int cant=0;
        if(num>0){
            cant+=1+cantidadDigitos(num/10);
        }
        return cant;
    }

    //  14)     digitos de un numero n son primos
    boolean allPar(int num){
        boolean resp= true;
        if(num>0){
            if(resp && ((num%10)%2)==0){
                resp=true && allPar(num/10);
            }else   
                resp=false;
        }
        return resp;
    }

    // 15.- Divisible entre 11
    boolean divOnce(int num){
        boolean resp = false;
        if((sumDic(num, true, 0))%11 == 0){
            resp=true;
        }
        return resp;
    }//2648967 -> 2-6+4-8+9-6+7
    private int sumDic(int num, boolean sw, int sum){
        int resp=0;
        if(num>0){
            if(sw){
                resp = sumDic(num/10, false, resp);
                resp += sum + num%10;
            }else{
                resp = sumDic(num/10, true, resp);
                resp += sum - num%10;
            }
        }
        return resp;
    }

    // 17.- cadenas
    // a) contar caracter
    int cantChar(String cad, char c){
        int resp = cantChar(cad, c, 0, 0);
        return resp;
    }
    private int cantChar(String cad, char c,int pos, int cant){
        int resp = 0;
        if(pos<cad.length()){
            if(cad.charAt(pos)== c){
                resp+=1+cantChar(cad, c, pos+1, resp);
            }else
                resp+=cantChar(cad, c, pos+1, cant);
        }
        return resp;
    }
    // b) invertir cadena
    String invertit(String cad){
        String resp=invertir(cad, 0);
        return resp;
    }
    private String invertir(String cad, int pos){
        String resp="";
        if(pos<cad.length()){
            resp=invertir(cad, pos+1)+cad.charAt(pos);
        }
        return resp;
    }
    // c) contar vocales
    int cantVocales(String cad){
        int resp=cantVocales(cad, 0);
        return resp;
    }
    private int cantVocales(String cad, int pos){
        int resp=0;
        if(pos<cad.length()){
            char aux = cad.charAt(pos);
            if(aux=='a' || aux=='e' || aux=='i' || aux=='o' || aux=='u'){
                resp=1;
            }
            resp+=cantVocales(cad, pos+1);
        }
        return resp;
    }

    // 20) palabra palindromo
    boolean palindromo(String cad){
        boolean resp=palindromo(cad, 0, true);
        return resp;
    }
    private boolean palindromo(String cad, int pos, boolean sw){
        boolean resp = true;
        if(pos<(cad.length()/2)){
            char aux=cad.charAt(pos);
            if(sw && aux==cad.charAt(cad.length()-pos-1))
                resp = true;
            else
                resp =false;
            resp = resp && palindromo(cad, pos+1, resp);
        }
        return resp;
    }

    // 21) suma n numeros mult 4
    int calcuSumCuatro(int n){
        int resp=calcuSumCuatro(n, 0);
        return resp;
    }
    private int calcuSumCuatro(int num, int cont){
        int resp=0;
        if(num>0){
            resp+=cont+calcuSumCuatro(num-1, cont+4);
        }
        return resp;
    }
    //                                   012345 - 012
    // 28) a) Palabra X prefijo de Y     lordem - dem
    boolean esPrefijo(String cad, String pref){
        return esPrefijo(cad, pref, pref.length()-1, true);
    }
    private boolean esPrefijo(String cad, String pref, int pos, boolean sw){
        boolean resp=true;
        if(pos>0 && sw){
            if(cad.charAt(pos) == pref.charAt(pos))
                resp = resp && esPrefijo(cad, pref, pos-1, resp);
            else
                resp = false;
        }
        return resp;
    }
    // 28) b) Palabra X sufijo de Y     lordem - dem = true
    boolean esSufijo(String cad, String pref){
        return esSufijo(cad, pref, (cad.length()-pref.length()), true);
    }
    private boolean esSufijo(String cad, String pref, int pos, boolean sw){
        boolean resp=true;
        if(pos<cad.length() && sw){
            if(cad.charAt(pos) == pref.charAt(pos-(pref.length()))){
                resp = resp && esSufijo(cad, pref, pos+1, resp);
            }else
                resp = false;
        }
        return resp;
    }

    /*                  EXTRA 
        hacer un proceso recursivo que debuelva/imprima la siguiente secuencia de cadenas,
                                                             dado un numero N 1<= n <= 100
    *      1/2     1/3     1/4     1/5     1/8     1/9     1/16    1/17    1/32 ...
cuando N=   1       2       3       4       5       6       7       8       9   ...
            impar   par     impar   par     impar   par     impar   par   impar ....
    *   tome en cuenta que el unico dato de entrada es un numero entero positivo, suerte :v
    * NOTA:  (la respuesta se espera que sea una cadena (String) y es opcional imprimirlo)  
    */
    String secuencia(int n){
        return theFuckSecuen(n, 1, "", 2);
    }
    private String theFuckSecuen(int n, int ini, String cad, int numPar){
        String resp="";
        if(ini<=n){
            if(ini%2 == 1){
                resp = "1/"+numPar;
                resp += "\t"+theFuckSecuen(n, ini+1, resp, numPar);
            }else{
                resp = "1/"+(numPar+1);
                resp += "\t"+theFuckSecuen(n, ini+1, resp, numPar*2);
            }
        }
        return resp;
    }

    /// chinitos de nivel n
    String chinitos(int n){
        if(n==1)
            return "(-_-)";
        else
            return "(-"+chinitos(n-1)+"-)";
    }


    // 31) el cambio perfecto
    String cambiar(double monto){
        String resp = "";
        Dou d = new Dou(monto);
        double[] billetes = {100, 50, 20, 10, 5, 2};
        double[] monedas = {0.50, 0.25, 0.1, 0.05, 0.01};
        resp = "\t *** BILLETES ***\n"+contar(billetes, 0, d, "Billetes")+
               "\t *** MONEDAS ***\n" +contar(monedas, 0, d, "Monedas");
        return resp;
    }
    String contar(double[] cambiar, int pos, Dou monto, String tipoCambio){
        String resp="";
        if(pos<cambiar.length){
            int cant = cantUnidades(monto.getNum(), cambiar[pos]);
            if(cant>0){
                newMonto(monto, cambiar[pos]);
                resp = cant +"\t"+tipoCambio+" de "+cambiar[pos]+"\n"+contar(cambiar, pos+1, monto, tipoCambio);
            }else{
                resp = contar(cambiar, pos+1, monto, tipoCambio);
            }
        }
        return resp;
    }
    private double newMonto(Dou monto, double cambio){
        double resp = 0;
        if(monto.getNum()>=cambio){
            monto.rest(cambio);
            resp = monto.getNum() - newMonto(monto, cambio);   
        }
        return resp;
    }
    private int cantUnidades(double monto, double cambio){
        int resp=0;
        if(monto>=cambio){
            resp =1+cantUnidades((monto-cambio), cambio);
        }
        return resp;
    }
    private class Dou{
        private double num;
        public Dou(double n){
            this.num = n;
        }
        public void rest(double val){
            this.num-= val;
        }
        public double getNum(){
            return num;
        }
    }


    // 32) eliminar segudas ocurencias de un numero entero de Izq a Der
    String elimOcurrencias(int num){
        String cad = num+"";
        return (elim(cad, cad.length()-1, ""));
    }//                     2656342 =>  56342
    private String elim(String cad, int pos, String vistos){
        String resp="";
        if(pos>=0){                             //  2656342 =>  56342
            char aux = cad.charAt(pos);         //  0123456     01234
            if(! yaEsta(aux, vistos, 0)){
                vistos += aux+"";
            }
            resp = elim(cad, pos-1, vistos)+aux+"";
        }
        return resp;
    }
    private boolean yaEsta(char a, String cad, int pos){
        boolean resp = false;
        if(pos<cad.length()){
            if(cad.charAt(pos)== a)
                resp = true;
            else
                resp = yaEsta(a, cad, pos+1);
        }
        return resp;
    }
    


}