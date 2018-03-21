package ProyectoRacionales;
//Holas


import static Sleer2.SLeer2.datoLong;
/**
 * @author Almudena.
 * @version 4.7.
 * @since 15/02/2018.
 */
public class CRacional {
    
    private long numerador;
    private long denominador; 
   
   
    /**
     * Constructor.
     */
    public CRacional(){
    numerador=0;
    denominador=1;
}
    /**
     * Constructor.
     * @param num.
     */
    @SuppressWarnings("javadoc")
	public CRacional(long num){
    numerador=num;   
}  
    /**
     * Constructor.
     * @param num.
     * @param den.
     */
    @SuppressWarnings("javadoc")
	public CRacional(long num, long den){
    
    if (den>0){
     numerador=num;
     denominador=den;
    }
    else if (den<0){
     numerador=-(num);
     denominador=-(den);    
    }
    else if (den==0){
     numerador=num;
     denominador=1;
    }
}
   /**
 * Constructor.
 * @param r.
 */
public CRacional(CRacional r){
    this.numerador=r.numerador;
    this.denominador=r.denominador;
}
    

    /**
     * Obtener Numerador.
     * @return numerador.
     */
   
	public long getNumerador(){
     return numerador;
} 
    /**
     * Obtener Denominador.
     * @return denominador.
     */
   
	public long getDenominador(){
     return denominador;
}      


   /**
 * Obtener Suma de dos fracciones.
 * @param r.
 * @return numerador, denominador.
 */

public CRacional Sumar(CRacional r){
    if (denominador == r.denominador){
     long num = this.numerador + r.numerador;
     long den = this.denominador;
     return new CRacional(num, den);
}
    else{
     long num = (this.numerador * r.denominador) + (r.numerador * this.numerador);
     long den = (this.denominador * r.denominador);
     return new CRacional(num,den);
}
}
   /**
 * Obtener la resta de dos fracciones.
 * @param r.
 * @return numerador, denominador.
 */
@SuppressWarnings("javadoc")
public CRacional Restar(CRacional r){
    if(denominador == r.denominador){
     long num = this.numerador - r.numerador;
     long den = this.denominador;
     return new CRacional(num, den);
}
    else{
     long num = (this.numerador * r.denominador) - (r.numerador * this.denominador);
     long den = (this.denominador * r.denominador);
     return new CRacional(num, den);
}
}
   /**
 * Obtener la Multiplicacion de dos fracciones.
 * @param r.
 * @return numerador, denominador.
 */
@SuppressWarnings("javadoc")
public CRacional Multiplicar(CRacional r){
    long num = this.numerador * r.numerador;
    long den = this.denominador * r.denominador;
    return new CRacional(num,den);    
}
   /**
 * Obtener la Division de dos fracciones. 
 * @param r
 * @return numerador, denominador.
 */
@SuppressWarnings("javadoc")
public CRacional Dividir(CRacional r){
    long num = this.numerador * r.denominador;
    long den = this.denominador * r.numerador;
    return new CRacional(num, den);
}
   /**
 * Obtener si dos fracciones son iguales.
 * @param r.
 * @return true.
 */
@SuppressWarnings("javadoc")
public boolean equals(CRacional r){
    if(this.numerador * r.denominador == r.numerador * this.denominador){
     return true;  
    }
    else{
     return false;
    }
}
  /**
 * Obtener la menor fraccion. 
 * @param r.
 * @return a.
 */
@SuppressWarnings("javadoc")
public boolean Menor(CRacional r){
   boolean a = false;
   long m1, m2 = 0;
   m1 = this.numerador * r.denominador;
   m2 = r.numerador * this.denominador;
   if (m1<m2){
    a = true;   
   }
   return a;
}
  /**
 * Obtener la mayor fraccion. 
 * @param r.
 * @return b.
 */
@SuppressWarnings("javadoc")
public boolean Mayor(CRacional r){
   boolean b = false;
   long m1, m2 = 0;
    m1 = this.numerador * r.denominador;
    m2 = r.numerador * this.denominador;
   if (m1>m2){
    b = true;
   }
   return b;
}
 public String toString(){
  String texto = numerador+ "/" +denominador;
  return texto;
}
 /**
 * Copiar una fraccion. 
 * @param r.
 * @return this.
 */
@SuppressWarnings("javadoc")
public CRacional Copiar(CRacional r){
  this.numerador = r.numerador;
  this.denominador = r.denominador;
  return this;
}
 /**
 * Obtener si el numerador es cero.
 * @return cero.
 */

public boolean EsCero(){
  boolean cero = true;
  if (this.numerador == 0){
   cero = false; 
   }
  return cero;
}
 /**
 * Incrementar una fraccion.
 * @return this.
 */

public CRacional Incrementar(){
  if(this.denominador != 1){
   this.numerador += this.denominador;
  }
  else{
   this.numerador += 1;   
  }
   return this;
}
/**
 * Decrementar una fraccion.
 * @return this.
 */
public CRacional Decrementar(){
 if(this.denominador != 1){
  this.numerador -= this.denominador;
  }   
 else{
  this.numerador -= 1;  
  }
 return this;
}
/**
 * Cambiar de signo una fraccion. 
 * @return this.
 */
public CRacional CambioDeSigno(){
 this.numerador *= (-1);
 return this;
}
/**
 * Simplificar una fraccion.
 * @return this.
 */

public CRacional Simplificar(){
 long resto = 0, mcd = 0, div = 0;
 if (this.getNumerador()<0){
  mcd= this.getNumerador() * -1;
 }   
 else{
  mcd = this.getNumerador();   
 }
 div = this.getDenominador();
 while(div>0){
  resto = mcd % div;
  mcd = div;
  div = resto;
 }
 if (mcd > 1){
     numerador = numerador / mcd;
     denominador = denominador / mcd;
 }
 return this;
}
/**
 * Leer una fraccion.
 * @return numerador, denominador.
 */

public static CRacional Leer(){
 long num = datoLong("Introduce el numerador: ");
 long den = datoLong("Introduce el denominador: ");
 return new CRacional(num,den);
}
}



