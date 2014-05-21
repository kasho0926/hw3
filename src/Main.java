import java.util.ArrayList;


public class Main {
	public static void viterbi(ArrayList<ArrayList<Double>> A,ArrayList<ArrayList<Double>> B,ArrayList<Double> pi,
			                     ArrayList<Integer> ob_seq,ArrayList<Double> q_star,
			                       ArrayList<Double> p_star){
		ArrayList<ArrayList<Double>> delta=new ArrayList<ArrayList<Double>>(ob_seq.size());
		ArrayList<ArrayList<Integer>> psi=new ArrayList<ArrayList<Integer>>(ob_seq.size());
		int T =ob_seq.size();
		int N = A.size();
		
		for(int i = 0 ; i < T; i++){
			delta.set(i,new ArrayList<Double>(N) );
			psi.set(i,new ArrayList<Integer>(N) );
			for(int j = 0; j < N;j++){
				delta.get(i).set(j, new Double(0.0));
				psi.get(i).set(j, new Integer(0));
			}
		}
		
		
		for(int i = 0 ; i < N; i++){
			delta.get(0).set( i, pi.get(i) * B.get(i).get(ob_seq.get(0)) );
		}
		
		
		
		
	} //void viterbi()
	
	public static void main(String args[]){
		ArrayList<ArrayList<Double>> A = new ArrayList<ArrayList<Double>>();
		ArrayList<ArrayList<Double>> B = new ArrayList<ArrayList<Double>>();
		ArrayList<Double> pi = new ArrayList<Double>();
		ArrayList<Integer> ob_seq = new ArrayList<Integer>();
		ArrayList<Double> q_star = new ArrayList<Double>();
		ArrayList<Double> p_star = new ArrayList<Double>();
	}

}
