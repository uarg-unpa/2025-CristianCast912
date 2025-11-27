public class cadenavocale7 {
    public static int vocales (String cadena){
        
        if(cadena.length() == 0){ //tambien se puede uaar cadena.isEmpty() 
            return null;
        } else {
            if (cadena.charAt(0) == 'a' || 'b' || 'e' || 'i' || 'o' || 'u' || 'A' || 'E' || 'I' || 'O' || 'U'){
                return 1 + cadena.substring(1);
            } else {
                return cadena.substring(1);
            }
        }
    }
}