package singletonPattern;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Singleton a = Singleton.getInstance("Hello");
		Singleton b = Singleton.getInstance("Nice");
		System.out.println(a.getData());
		System.out.println(b.getData());
		System.out.println(a==b);
	}

}
