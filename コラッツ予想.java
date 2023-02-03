import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		ArrayList<Integer> list = new ArrayList<Integer>();
		int n = 1;
		list.add(a);
		while(true){
			n++;
			if(a%2 == 0) {
				a /= 2;
				if(list.contains(a)) break;
				list.add(a);
			}
			else {
				a = 3 * a + 1;
				if(list.contains(a)) break;
				list.add(a);
			}
		}
		System.out.println(n);
	}
	public static int cola(int a){
		
		if(a == 1) return a;
		else if(a % 2 == 0) return cola(a/2);
		else {
			a = a*3 + 1;
			return cola(a);
		}
	}
	/*
	System.out.print();
	System.out.println();
	s.substring(j - 1,j);
	s.replace("a","b");
	Math.pow(2,2);
	Math.sqrt(2);
	ArrayList<Integer> list = new ArrayList<>();
	ArrayList<String> list = new ArrayList<>();
	ArrayList<NN> list = new ArrayList<>();
	ArrayList<SS> list = new ArrayList<>();
	ArrayList<NS> list = new ArrayList<>();
	Queue<String> que = new ArrayDeque<>();
	que.add();
	que.poll();
	que.seek();
	Deque<String> deque = new ArrayDeque<>();
	deque.push();
	deque.pop();
	deque.push();
	deque.peek();
	HashMap<Integer,Integer> map = new HashMap<>();
	HashMap<Integer,String> map = new HashMap<>();
	HashMap<String,Integer> map = new HashMap<>();
	HashMap<String,String> map = new HashMap<>();
	Collections.sort();
	Collections.reverse();
	Collections.sort(list,Comparator.comparing(NN::getA).thenComparing(NN::getB));
	Math.pow(26,j)*map.get(ss[i].substring(ss[i].length() - j - 1,ss[i].length() - j));
	ワーシャルフロイト↓
	for(int i = 1; i <= n; i++){
    		for(int j = 1; j <= n; j++){
    			for(int k = 1; k <= n; k++){
    				dist[j][k] = Math.min(dist[j][k],dist[j][i] + dist[i][k]);
    			}
    		}
    	}
	*/
	//以下自作関数,クラス
	public static int[] For0(int n){
		Scanner sc = new Scanner(System.in);
		int a[] = new int[n];
		for(int i = 0; i < n; i++){
			a[i] = sc.nextInt();
		}
		return a;
	}
	public static int[] For1(int n){
		Scanner sc = new Scanner(System.in);
		int a[] = new int[n + 1];
		for(int i = 1; i <= n; i++){
			a[i] = sc.nextInt();
		}
		return a;
	}
	public static String[][] ForMap(int n,int m){
		Scanner sc = new Scanner(System.in);
		String[][] a = new String[n + 1][m + 1];
		for(int i = 1; i <= n; i++){
			String s = sc.next();
			for(int j = 1; j <= m; j++){
				a[i][j] = s.substring(j - 1,j);
			}
		}
		return a;
	}
	
	//26^n 正確性を求める時
	public static long Power26(long n){
		long num = 1;
		for(int i = 0; i < n; i++){
			num *= 26;
		}
		return num;
	}
	public static int gcd(int a, int b) {
		if (b == 0) {
			return a;
		} else {
			return gcd(b, a % b);
		}
	}
	public static int lcm(int a, int b) {
		int d = gcd(a, b);
		return a / d * b;
	}
}
class NN{
	private int a;
	private int b;
	public NN(int a, int b){
		this.a = a;
		this.b = b;
	}
	public int getA(){
		return this.a;
	}
	public int getB(){
		return this.b;
	}
}
class SS{
	private String a;
	private String b;
	public SS(String a, String b){
		this.a = a;
		this.b = b;
	}
	public String getA(){
		return this.a;
	}
	public String getB(){
		return this.b;
	}
}
class NS{
	private int a;
	private String b;
	public NS(int a, String b){
		this.a = a;
		this.b = b;
	}
	public int getA(){
		return this.a;
	}
	public String getB(){
		return this.b;
	}
}

class Gra{
	private int t1;
	private ArrayList<Integer> list = new ArrayList<>();
	Gra(int t1,ArrayList<Integer> list){
		this.t1 = t1;
		this.list = list;
	}
	public int getT1(){
		return this.t1;
	}
	public ArrayList<Integer> getList(){
		return this.list;
	}
}

class GraS{
	private int t1;
	private ArrayList<String> list = new ArrayList<>();
	GraS(int t1,ArrayList<String> list){
		this.t1 = t1;
		this.list = list;
	}
	public int getT1(){
		return this.t1;
	}
	public ArrayList<String> getList(){
		return this.list;
	}
}
class Slist {
	private String a;
	private ArrayList<Integer> list = new ArrayList<>();
	Slist(String a,ArrayList<Integer> list){
		this.a = a;
		this.list = list;
	}
	public String getA(){
		return this.a;
	}
	public ArrayList<Integer> getList(){
		return this.list;
	}
}
class Zikoku {
	private int a;
	private int b;
	private int c;
	Zikoku(int a,int b,int c){
		this.a = a;
		this.b = b;
		this.c = c;
	}
	public int getA(){
		return this.a;
	}
	public int getB(){
		return this.b;
	}
	public int getC(){
		return this.c;
	}
}
class Dps {
	private boolean a;
	private String b;
	Dps(boolean a, String b){
		this.a = a;
		this.b = b;
	}
	public boolean getA(){
		return this.a;
	}
	public String getB(){
		return this.b;
	}
}

class Warp {
	private int a;
	private boolean b;
	private int x;
	private int y;
	public Warp(int a,boolean b,int x, int y){
		this.a = a;
		this.b = b;
		this.x = x;
		this.y = y;
	}
	public int getN(){
		return this.a;
	}
	public boolean getB(){
		return this.b;
	}
	public int getX(){
		return this.x = x;
	}
	public int getY(){
		return this.y = y;
	}
	public void setN(int a){
		this.a = a;
	}
	public void setB(boolean b){
		this.b = b;
	}
}

class Coin {
	private int s;
	private int w;
	private int m;
	public Coin(int s, int w, int m){
		this.s = s;
		this.w = w;
		this.m = m;
	}
	public int getS(){
		return this.s = s;
	}
	public  int getW(){
		return this.w = w;
	}
	public  int getM(){
		return this.m = m;
	}
	public void setS(int s){
		this.s = s;
	}
	public void setW(int w){
		this.w = w;
	}
	public void setM(int m){
		this.m = m;
	}
}
