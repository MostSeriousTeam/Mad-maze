package Graph;

import java.util.HashMap;
import java.util.LinkedList;
//
public class Graphe  {
	private int h,w;
	private HashMap adj;
	private Object visited;
		public Graphe(int h, int w) {
			super();
			this.h = h;
			this.w = w;
	
		this.adj = new HashMap<>();
		for (int i = 0; i < h; i++)
		for (int j = 0; j < w; j++) {
		Vertex c = new Vertex(i, j);
		addVertex(c);
		if (i > 0) addEdge(c, new Vertex(i-1, j));
		if (i < h-1) addEdge(c, new Vertex(i+1, j));
		if (j > 0) addEdge(c, new Vertex(i, j-1));
		if (j < w-1) addEdge(c, new Vertex(i, j+1));
		}
		}
	
	void addVertex(Vertex x) {
		this.adj.put(x, new LinkedList<>());
		}
		void addEdge(Vertex x, Vertex y) {
			((LinkedList<Object>) this.adj.get(x)).add(y);
		}
		
	static LinkedList<Vertex> shuffle(LinkedList<Vertex> l) {
		int n =l.size();
		Vertex[] a = new Vertex[n];
		for (Vertex c: l) a[--n] = c;
		shuffle(a); // mélange de Knuth d'un tableau
		LinkedList<Vertex> r = new LinkedList<>();
		for (Vertex c : a) r.add(c);
		return r;
	}
	
		private static void shuffle(Vertex[] a) {
		// TODO Auto-generated method stub
		
	}

		void dfs(Vertex from, Vertex v) {
			if (((HashMap) this.visited).containsKey(v)) return;
			((HashMap) this.visited).put(v, from);
			for (Vertex w: shuffle((LinkedList<Vertex>) this.adj.get(v)))
			dfs(v, w);
			}
			void dfs() {
			dfs(null, new Vertex(0, 0));
			
		
	}

			


}
