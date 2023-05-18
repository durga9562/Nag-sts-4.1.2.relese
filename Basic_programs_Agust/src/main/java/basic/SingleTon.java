package basic;

public class SingleTon {
private static SingleTon obj;
private SingleTon() {}
public static SingleTon getInstance() {
	if(obj==null) {
		obj=new SingleTon();
	}
	System.out.println(obj);
	return obj;
	
}
public static void main(String[] args) {
	getInstance();
}
}
