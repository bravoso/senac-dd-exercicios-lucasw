package exercicio05.view;

import java.lang.invoke.SwitchPoint;

public class Caller {

	public static void main(String[] args) {
		
		String resultadoMetodo = chamarMenu();
		
		}
		
		

	

	private static String chamarMenu() {
		// TODO Auto-generated method stub
		String retorno = InterfacePrincipal.selecionarOpcao();
		
		return retorno;
		
	}
	
}
