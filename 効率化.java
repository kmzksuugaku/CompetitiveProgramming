# CompetitiveProgramming

import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    	int n = sc.nextInt(); 
    	int m = sc.nextInt();
    	ArrayList<Mise> list = new ArrayList<>();
    	for(int i = 1; i <= n; i++){
    		int a = sc.nextInt();
    		int b = sc.nextInt();
    		Mise mise = new Mise(a,b);
    		list.add(mise);
    	}
    	Collections.sort(list,Comparator.comparing(Mise::getM));
    	long k = 0;
    	long sum = 0;
    	int w = 0;
    	while(k < m){
    		long ryo = list.get(w).getQ();
        long money = list.get(w).getM();
    		if(ryo + k < m) {
    			k += ryo;
    			sum += ryo*moeny;
    		}
    		else if(m <= ryo + k) {
    			sum += (m - k)*money;
    			k += ryo;
    		}
    		w++;
    	}
    	System.out.println(sum);
    }
}
class Mise{
	private int mon;
	private int qua;
	public Mise(int mon,int qua){
		this.mon = mon;
		this.qua = qua;
	}
	public int getM(){
		return this.mon;
	}
	public int getQ(){
		return this.qua;
	}
}
