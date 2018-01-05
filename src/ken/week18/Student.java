package ken.week18;

public class Student {
	//成员变量
	int age;
	String name;
	static String classNu;
	
	// 无参构造方法
	public Student(){
		System.out.println("我是无参构造");
	}
    
	public Student(String name,int age){
		this.name=name;
		this.age=age;
		
	}
	
	public Student(String name){
		this.name=name;
		
	}
	//get/set
	public int getAge(){
		return age;
	}
	public String getName(){
		return name;
	}
	
	public void setAge(int age){
	 this.age=age;	
	}
		
	public void setName(String name){
		this.name=name;	
	}
	public void show(){
		System.out.println("我是学生");
		System.out.println(name+" "+age+" "+classNu);
	}
	
	public static void eat(){
		System.out.println("我是学生");
		System.out.println(classNu);
	}
	
	
	
	
	
	
	
	
	
	
	
}
