package Modelo;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.Files;

public class CuentaUsuario {
    private String nombre; 
    private String apellido;
    private String documento;
    private Double saldo;
    private TipoUsuario tipoUsuario;
    private TipoCuenta tipoCuenta;
    private Cobro cobro;

    // Ruta relativa (IMPORTANTE: usa solo el nombre para evitar problemas de ruta en otras PC)
    private static final String NOMBRE_ARCHIVO = "CreacionDeUsuario.txt";
    
    public CuentaUsuario(String nombre, String apellido, String documento, Double saldo, TipoUsuario tipoUsuario, TipoCuenta tipoCuenta, Cobro cobro) {
        this.tipoUsuario = tipoUsuario;
        this.tipoCuenta = tipoCuenta;
        this.cobro = cobro;
        // Se asegura que el saldo sea 0.0 si es nulo, para evitar NullPointerExceptions.
        this.saldo = saldo != null ? saldo : 0.0;
        this.nombre = nombre;
        this.apellido = apellido;
        this.documento = documento;
    }
    
    //GETTERS DE LOS DATOS//
    public double getSaldo(){
        return saldo;
    }
    public String getNombre(){
        return nombre;
    }
    public String getApellido(){
        return apellido;
    }
    public String getDocumento(){
        return documento;
    }
    public String getTipoUsuario() {
        return tipoUsuario.getTipo();
    }
    public String getTipoCuenta() {
        return tipoCuenta.getDescripcion();
    }
    public CuentaUsuario getCuentaUsuario(){
        return this;
    }
   
    //SETTERS DE LOS DATOS//
    public void setSaldo(Double saldo){
        this.saldo = saldo;
    }
   
    //METODOS//
    public String registrarCuenta(){
        // 1. Formatear la línea de datos para guardar. Usamos la coma (,) como separador.
        String lineaDatos = getNombre() + "," +
                            getApellido() + "," +
                            getDocumento() + "," +
                            getSaldo()+ "," +
                            getTipoCuenta()+ "," +
                            getTipoUsuario();
        
        
        // 2. Lógica de escritura del archivo
        try (PrintWriter writer = new PrintWriter(new FileWriter(NOMBRE_ARCHIVO, true))) {
            
            // El 'true' en FileWriter(NOMBRE_ARCHIVO, true) indica modo de APENDIZADO (añadir al final)
            // Esto evita que se sobrescriban los datos existentes.
            
            writer.println(lineaDatos); //Escribimos
            return "Creado con Exito";

        } catch (IOException e) {
            return "❌ ERROR al guardar la cuenta en el archivo: ";
        }
        
    }
        
    //pertenece a la clase misma, y no a una instancia específica (objeto) de esa clase.

    public static boolean recargarSaldo(String documento, double montoAAgregar) throws IOException {

        // Obtener la ruta (Path) del archivo
        Path path = Paths.get(NOMBRE_ARCHIVO);

        // 1. Leer todas las líneas del archivo en una lista (sustituye a leerTodasLasLineas())
        List<String> lineas = Files.readAllLines(path);
        List<String> nuevasLineas = new ArrayList<>();
        boolean cuentaEncontrada = false;

        for (String linea : lineas) {
            String[] datos = linea.split(",");

            // Asumiendo que Documento está en datos[2] y Saldo en datos[3]
            if (datos.length >= 4 && datos[2].trim().equals(documento)) {

                // Cuenta encontrada: Actualizar saldo
                try {
                    double saldoActual = Double.parseDouble(datos[3].trim());
                    double nuevoSaldo = saldoActual + montoAAgregar;

                    // Crear la nueva línea con el saldo actualizado
                    // NOTA: Ajusta los índices si tienes más o menos campos después del saldo.
                    // Asumo: Nombre, Apellido, Documento, Saldo, TipoUsuario, TipoCuenta
                    String nuevaLinea = datos[0] + "," + datos[1] + "," + datos[2] + "," + nuevoSaldo;

                    nuevasLineas.add(nuevaLinea);
                    cuentaEncontrada = true;

                } catch (NumberFormatException e) {
                    // Si el saldo no era un número, copiamos la línea vieja y registramos error
                    return false; 
                }

            } else {
                // Si no es la línea buscada, la copiamos tal cual.
                nuevasLineas.add(linea);
            }
        }

        if (cuentaEncontrada) {
            // 2. Sobrescribir el archivo completo con las líneas modificadas
            // Files.write(path, nuevasLineas) sobrescribe por defecto el archivo existente.
            Files.write(path, nuevasLineas);
            return true;
        }

        return false; // Cuenta no encontrada.
    }
    public void descontarMonto(Double monto){
        if(monto > 0){
            setSaldo(monto);
        }
    }
    
    public static Double consultarSaldo(String documento) throws IOException {
        
        // Usamos try-with-resources para asegurar que el archivo se cierre.
        try (BufferedReader br = new BufferedReader(new FileReader(NOMBRE_ARCHIVO))) {
            String linea;
            
            // Lee el archivo línea por línea hasta el final.
            while ((linea = br.readLine()) != null) {
                
                // Divide la línea usando la coma (,) como separador.
                String[] datos = linea.split(",");
                
                // Verificamos si la línea tiene al menos 4 partes (nombre, apellido, doc, saldo)
                // y si el documento coincide (asumiendo que el documento está en la posición [2])
                if (datos.length >= 4 && datos[2].trim().equals(documento)) {
                    
                    try {
                        // El saldo es el cuarto elemento (índice 3).
                        return Double.parseDouble(datos[3].trim());
                    } catch (NumberFormatException e) {
                        // Ocurre si el saldo guardado no es un número válido.
                        return null; 
                    }
                }
            }
        }
        
        // Retorna null si el bucle termina y el documento no fue encontrado.
        return null; 
    }
    
    public static CuentaUsuario buscarCuenta(String documento) throws IOException {
        try (BufferedReader br = new BufferedReader(new FileReader(NOMBRE_ARCHIVO))) {
            String linea;
            while ((linea = br.readLine()) != null) {
                String[] datos = linea.split(",");
                // Asumimos formato: Nombre, Apellido, Documento, Saldo, ...
                if (datos.length >= 3 && datos[2].trim().equals(documento)) {
                    String nombre = datos[0].trim();
                    String apellido = datos[1].trim();
                    double saldo = 0.0;
                    if (datos.length >= 4) {
                        try { saldo = Double.parseDouble(datos[3].trim()); } catch (Exception e){}
                    }
                    
                    // Devolvemos un objeto con los datos encontrados
                    return new CuentaUsuario(nombre, apellido, documento, saldo, null, null, null);
                }
            }
        } catch (java.io.FileNotFoundException e) {
            return null; // Archivo no encontrado
        }
        return null; // Usuario no encontrado
    }
    
    public Double conocerCobro(Cobro cobro){
        if(cobro != null){
            return cobro.getMonto();
        }else{
            return null;
        }
    }
    public String conocerTipoCuenta(String cuenta) throws IOException{
        // Usamos try-with-resources para asegurar que el archivo se cierre.
        try (BufferedReader br = new BufferedReader(new FileReader(NOMBRE_ARCHIVO))) {
            String linea;
            
            // Lee el archivo línea por línea hasta el final.
            while ((linea = br.readLine()) != null) {
                
                // Divide la línea usando la coma (,) como separador.
                String[] datos = linea.split(",");
                
                // Verificamos si la línea tiene al menos 5 partes (nombre, apellido, doc, saldo, TipoCuenta)
                // y si el documento coincide (asumiendo que el documento está en la posición [2])
                if (datos.length >= 5 && datos[2].trim().equals(documento)) {
                    //El TipoDato esta en el 5 elemento (Indice 2)
                    return datos[4].trim();
                }
            }
        }
        
        // Retorna null si el bucle termina y el documento no fue encontrado.
        return null; 
    }
    public boolean pagar(Cobro cobro){
        if(getCuentaUsuario() != null){
            if(getSaldo()>cobro.getMonto()){
                boolean pagado;
                pagado = cobro.isPagado();
                return pagado;
            }
        }
        return false;
    }
    
    /*public void consultarAfiliadoUTN() {
        // Simulación de consulta
        // La vista debe encargarse de mostrar mensajes de consulta y verificación de afiliación
        afiliadoUTN = true;
    }*/
    
    /*public void concerVehiculo(Vehiculo vehiculo) {
        // Simulación de consulta
        // La vista debe encargarse de mostrar mensajes de consulta y verificación de afiliación
        return vehiculo.getModelo();
    }*/
    
    //registrarUsuario? va esto aca?
}