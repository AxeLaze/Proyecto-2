
public class Main {

	public static void main(String[] args) {
////////    	VARIABLES 		/////////////
		
//		int n=30, m=70; float r=0.6f;
//		int n=100, m=300; float r=0.4f;
		int n=500, m=2500; float r=0.2f;
		int d=4;
		float p=0.1f;
		 //d <=sqrt(2)
		boolean dirigido = false, auto = false;
		
////////		GRAFOS			//////////////

		Grafo grafo1 = new Grafo();
		
////////		METODO			////////////////
		
//		grafo1.ErdosRenyi("ErdosRenyi", n, m, dirigido, auto);
//		grafo1.MuestraNodos();
//		grafo1.CreateGV(grafo1.arista);
//		grafo1.Gilbert("Gilbert1", n, p, dirigido, auto);
		grafo1.Geografico("Geografico1", n, r, dirigido, auto);
		grafo1.AtributosNodos(grafo1.arista);
//		grafo1.BarabasiAlbert("Barabasi", n, d, dirigido, auto);
		
		grafo1.MuestraNodos();
		Grafo A = grafo1;
		Grafo B = grafo1;
		Grafo C = grafo1;

////////		CREAR BFS		/////////////////

//		A.CreateBFS(2);
//		A.MuestraNodos();
//		A.CreateGV(A.aristaBFS);
////////		CREAR DFS_I		/////////////////
//		C.CreateDFS_I(2);
//		C.MuestraNodos();
//		C.CreateGV(C.aristaDFS_I);
////////		CREAR DFS_R		/////////////////
		B.CreateDFS_R(2);
		B.AtributosNodos(B.aristaDFS_R);
		B.MuestraNodos();
		B.CreateGV(B.aristaDFS_R);
		
		
		
//		A.CreateGV();
//		B.CreateGV();
//		C.CreateGV();
				
	}
}
