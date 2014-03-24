public class tarea1 
  { 
    public native int suma (int number, int number2); 
	public native int multiplicacion (int number, int number2); 
	public native int resta (int number, int number2); 
	public native int division (int number, int number2); 
	
	public static void main (String[] args)
	{
		tarea1 aplicacion = new tarea1();
		
		int resultado_suma = aplicacion.suma(5 , 5);
		System.out.println("El resultado de la suma es : " + resultado_suma );
		int resultado_multiplicacion = aplicacion.multiplicacion(5 , 5);
		System.out.println("El resultado de la multiplicacion es : " + resultado_multiplicacion );
		int resultado_resta = aplicacion.resta(5 , 5);
		System.out.println("El resultado de la resta es : " + resultado_resta );
		int resultado_division = aplicacion.division(5 , 5);
		System.out.println("El resultado de la division es : " + resultado_division );
		
	}	
	
	static
	{
	
	System.loadLibrary("operaciones"); 
	
	} 
  } 