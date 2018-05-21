# Java-
Clases de Java ULACIT

public class Test1 {

    public static void main(String[] args) {
       int numero= 25,
           numero2=20;
       String nombre="   Robert";
       nombre= nombre;
       String entre3y5 =nombre.trim();
       System.out.println(nombre);
       System.out.println(entre3y5);
    }
    
}

public class NewClass {
    public static void main(String[] args) {
        /*float n1= 50;
        float n2 = 13;
        float n3 = n1/n2;
        System.out.println(n3);*/
        
        /*
        Boolean a = false;
        Boolean b= true;
        System.out.println(a && b);*/
        
        /*
        String nombre = "Rob";
        int edad= 25;
        System.out.println((nombre.length() > 4 && edad > 18) || edad ==25);*/
        
    }
    
}

public class Password {
    public Boolean verify(String password) {
        Boolean validLength = password.length()>6;
        Boolean hasSign = password.contains("#") || password.contains("&");
        return validLength && hasSign;
        
    }
    
}
*Este se usa para el siguiente código:*
public class Password_prueba {
    public static void main(String[] args) {
        Password pass= new Password();
        Boolean isValid = pass.verify("Robert&#");
        System.out.println("EL password" + (isValid ? "": " no") + " es válido.");
    }
}
