package Vista;

public class MainIGU {
    
    public static void main(String[] args){
        //Creamos la pantalla
        HomeIGU pantalla = new HomeIGU();
        
        //Hacemos visible la pantalla
        pantalla.setVisible(true);
        //la pantalla aparece en el centro, no toma nada como referencia.
        pantalla.setLocationRelativeTo(null); 
    }
}
