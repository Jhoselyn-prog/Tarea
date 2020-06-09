import java.util.StringTokenizer;

import org.omg.CORBA.StructMember;


public class ContarCadenas {
	public static void main(String[] args) {
		String cad = "Hola como  estas,todo  bien adios ";
		StringTokenizer st=new StringTokenizer(cad);
		int n = st.countTokens();
		System.out.println("El numero palabras es :"+ (n+1));
	}

}
