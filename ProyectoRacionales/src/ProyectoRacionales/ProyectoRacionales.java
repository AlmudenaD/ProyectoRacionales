package ProyectoRacionales;



import java.util.*;
import static Sleer2.SLeer2.datoInt;
/**
 * @author Almudena 
 * @version 4.7
 * @since 15/02/2018
 */
public class ProyectoRacionales {

    /**
     * Clase Racionales.
     * @param args.
     */
    @SuppressWarnings("javadoc")
	public static void main(String[] args) {
         
       CRacional r =new CRacional();
       CRacional s =new CRacional();
       int opcion = menu();
       while (opcion !=0){
       switch(opcion){    
           case 0: System.out.println("¡Adios!");break;
           case 1: System.out.println(" A elegido la opcion 'Sumar' ");Sumar(r,s);break;
           case 2: System.out.println(" A elegido la opcion 'Restar' ");Restar(r,s);break;
           case 3: System.out.println(" A elegido la opcion 'Multiplicar' ");Multiplicar(r,s);break;
           case 4: System.out.println(" A elegido la opcion 'Dividir' ");Dividir(r,s);break;
           case 5: System.out.println(" A elegido la opcion 'Cambiar de Signo' ");CambioDeSigno(r);break;
           case 6: System.out.println(" A elegido la opcion 'Incrementar' ");Incrementar(r);break;
           case 7: System.out.println(" A elegido la opcion 'Decrementar' ");Decrementar(r);break;
           case 8: System.out.println(" A elegido la opcion 'Copiar' ");Copiar (r,s);break;
           case 9: System.out.println(" A elegido la opcion 'Simplificar'");Simplificar(r);break;
           case 10: System.out.println(" A elegido la opcion 'Mayor, menor o igual' ");Comparar(r,s);break;
           case 11: System.out.println(" A elegido la opcion 'Comprobar si es nulo' ");SerNulo(CRacional.Leer());break;
       }
       pausa();
       opcion =menu();
       }
       System.out.println("¡Adios!");
       }
       /**
     * Sumar dos valores r y s. 
     * @param r.
     * @param s.
     */
    @SuppressWarnings("javadoc")
	public static void Sumar(CRacional r, CRacional s){
           System.out.println("\nIntroduce la primera fraccion, por favor. ");
           r=CRacional.Leer();
           limpiar();
           System.out.println("\nIntroduce la segunda fraccion, por favor. ");
           s=CRacional.Leer();
           Separador();
           limpiar();
           System.out.println("\nEl Resultado Sumar " + r.toString() + " mas " + s.toString() + " equivale a " + r.Sumar(s) + "\nque Simplificado equivale a " + r.Sumar(s).Simplificar());
           Separador();
       }
       /**
     * Restar dos valores r y s. 
     * @param r.
     * @param s.
     */
    @SuppressWarnings("javadoc")
	public static void Restar(CRacional r, CRacional s){
          System.out.println("\nIntroduce la primera fraccion, por favor. ");
          r=CRacional.Leer();
          limpiar();
          System.out.println("\nIntroduce la segunda fraccion, por favor. ");
          s=CRacional.Leer();
          Separador();
          limpiar(); 
          System.out.println("\nEl Resultado Restar " + r.toString() + " menos " + s.toString() + " equivale a " + r.Restar(s).Simplificar());
          Separador();
       } 
       /**
     * Multiplicar dos valores r y s. 
     * @param r.
     * @param s.
     */
    @SuppressWarnings("javadoc")
	public static void Multiplicar(CRacional r, CRacional s){
           System.out.println("\nIntroduce la primera fraccion, por favor. ");
           r=CRacional.Leer();
           limpiar();
           System.out.println("\nIntroduce la segunda fraccion, por favor ");
           s=CRacional.Leer();
           Separador();
           limpiar();
           System.out.println("\nEl Resultado Multiplicar " + r.toString() + " por " + s.toString() + " equivale a " + r.Multiplicar(s) + "\nque Simplicado equivale a " + r.Multiplicar(s).Simplificar());
           Separador();
       }
       /**
     * Dividir dos valores r y s. 
     * @param r.
     * @param s.
     */
    @SuppressWarnings("javadoc")
	public static void Dividir(CRacional r, CRacional s){
           System.out.println("\nIntroduce la primera fraccion, por favor ");
           r=CRacional.Leer();
           limpiar();
           System.out.println("\nIntroduce la segunda fraccion, por favor. ");
           s=CRacional.Leer();
           Separador();
           limpiar();
           System.out.println("\nEl Resultado Dividir " + r.toString() + " entre " + s.toString() + " equivale a " + r.Dividir(s) + "\nque Simplificado equivale a " + r.Dividir(s).Simplificar());
           Separador();
       }
       /**
     * Cambiar de signo un valor r. 
     * @param r.
     */
    @SuppressWarnings("javadoc")
	public static void CambioDeSigno(CRacional r){
           r=CRacional.Leer();
           Separador();
           System.out.println(("Si a " +r+ " le cambiamos de signo tenemos "+r.CambioDeSigno()+"\n")+ " Si Simplificamos " +r+ " obtenemos " +r.Simplificar());
           Separador();
       }
       /**
     * Incrementar una fraccion. 
     * @param r.
     */
    @SuppressWarnings("javadoc")
	public static void Incrementar(CRacional r){
           r=CRacional.Leer();
           Separador();
           System.out.println("Si a " +r+ " le incrementamos su valor en uno, tenemos " + r.Incrementar() + "\n" + " Si Simplificamos " + r + " obtenemos " + r.Simplificar());
           Separador();
       }
       /**
     * Decrementar una fraccion. 
     * @param r.
     */
    @SuppressWarnings("javadoc")
	public static void Decrementar(CRacional r){
           r=CRacional.Leer();
           Separador();
           System.out.println("Si a " +r+ " le decrementamos su valor en uno, tenemos " + r.Decrementar() + "\n" + " Si Simplificamos " + r + " obtenemos " + r.Simplificar());
           Separador();
       }
       /**
     * Copiar una fraccion.
     * @param r.
     * @param s.
     */
    @SuppressWarnings("javadoc")
	public static void Copiar(CRacional r, CRacional s){
          r=CRacional.Leer();
          s.Copiar(r);
          System.out.println("El valor del racional original era " + r.toString() + "\nSe ha copiado su valor: " + s.toString());
          Separador();
       }
       /**
     * Simplificar una fraccion. 
     * @param r.
     */
    @SuppressWarnings("javadoc")
	public static void Simplificar(CRacional r){
         r=CRacional.Leer();
         Separador();
         System.out.println("La fraccion " + r.toString() + " Simplificada equivale a " + r.Simplificar());
       }
       /**
     * Comparar dos fracciones para saber si son iguales. 
     * @param r.
     * @param s.
     */
    @SuppressWarnings("javadoc")
	public static void Comparar(CRacional r, CRacional s){
           System.out.println("\n\t---Primera Fraccion---");
           r=CRacional.Leer();
           limpiar();
           System.out.println("\n\t---Segunda Fraccion---");
           s=CRacional.Leer();
           Separador();
           limpiar();
           if (r.equals(s)){
               System.out.println(r.toString() + " y " + s.toString() + " son iguales. ");
           }
           else if(r.Menor(s)){
               System.out.println(r.toString() + " es menor que " + s.toString());
           }
           else if(r.Mayor(s)){
               System.out.println(r.toString() + " es mayor que " + s.toString());
           }
           Separador();
       }
       /**
     * Para saber si es una fraccion nula. 
     * @param r.
     */
    @SuppressWarnings("javadoc")
	public static void SerNulo(CRacional r){
           Separador();
           if (r.EsCero()== true){
               System.out.println("\n Es una fraccion nula. ");
           }
           else{
               System.out.println("\n No es una fraccionm nula. ");
           }
           Separador();
       }
       /**
     * Menu de eleccion.
     * @return opcion.
     */
    
	public static int menu(){
       limpiar();
       System.out.println("---NUMEROS RACIONALES---");
       System.out.println("\n1.- Sumar");
       System.out.println("\n2.- Restar");
       System.out.println("\n3.- Multiplicar");
       System.out.println("\n4.- Dividir");
       System.out.println("\n5.- Cambiar Signo");
       System.out.println("\n6.- Incrementar");
       System.out.println("\n7.- Decrementar");
       System.out.println("\n8.- Copiar");
       System.out.println("\n9.- Simplificar");
       System.out.println("\n10.- Mayor, menor o igual");
       System.out.println("\n11.- Comprobar si es nulo");
       int opcion;
        do{
          opcion=datoInt("\nSelecciona una opcion (0 para salir):");
        limpiar();
        }
        while (opcion <0 || opcion > 11);
        return opcion;
       }
       /**
     * Dejar 5 espacios entre salida y salida de datos
     */
    public static void limpiar(){
        for (int i=0; i<5; i++){
            System.out.println();
        }
        }
       /**
     * Para introducir los valores por teclado
     */
    public static void pausa(){
           @SuppressWarnings("resource")
		Scanner entrada= new Scanner (System.in);
           System.out.println("Presiona intro para continuar");
           @SuppressWarnings("unused")
		String itro =entrada.nextLine();
           
       }
       /**
     * Separar unas sentecias de otras
     */
    public static void Separador(){
           for (int i=0; i<5; i++){
               System.out.println("*");
           }
           System.out.println();
       }
       }
       



    
