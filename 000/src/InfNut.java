
public class InfNut {
	private String[][] nut= new String[2][30];
	private int n;
	public InfNut()
	{
		n=2;
		nut[0][0]="aaa";  nut[1][0]="12kg";
		nut[0][0]="bbb";  nut[0][0]="15kg";
	}
	
	public void leer()
	{
		
	}
	
	public void Mostrar()
	{
		for (int i = 0; i <2; i++) {
			for (int j = 0; j <n; j++) {
				System.out.println(nut[i][j]);
			}
		}
	}
}
