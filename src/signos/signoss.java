package signos;
//importar paquete para trabajar con expresiones regulares
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/***
 * 
 * @author josue
 *
 */
public class signoss {
	public static void main(String[] args){
		String patron=("([0-9]+)|([+|-|*|/|<|>|%])|(Hello|word|Marlon|Josué)|([a-z|A-Z]+)");
		//expresion a evaluar
		String Texto = "5662+256*/ X a Marlon Josué";
				
		Pattern p = Pattern.compile(patron);
		Matcher matcher = p.matcher(Texto);
		
		System.out.println("Compiladores * prueba analsis léxico");
		
		while(matcher.find()){
	
			String tokenTipo1= matcher.group(1);
			if(tokenTipo1 !=null)
			{
				System.out.println(" número:" + tokenTipo1);
			}
			
			String tokenTipo2= matcher.group(2);
			if(tokenTipo2 !=null)
			{
				System.out.println("Operadores" + tokenTipo2);
			}
			
			
			String tokenTipo3= matcher.group(3);
			if(tokenTipo3 !=null)
			{
				System.out.println("Palabra reservada: " + tokenTipo3);
			}
			
			String tokenTipo4= matcher.group(4);
			if(tokenTipo4 != null){
				System.out.println("Variable"+ tokenTipo4);
		}
			
	}

}
}
