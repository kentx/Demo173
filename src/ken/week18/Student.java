package ken.week18;

public class Student {
	//��Ա����
	int age;
	String name;
	static String classNu;
	
	// �޲ι��췽��
	public Student(){
		System.out.println("�����޲ι���");
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
		System.out.println("����ѧ��");
		System.out.println(name+" "+age+" "+classNu);
	}
	
	public static void eat(){
		System.out.println("����ѧ��");
		System.out.println(classNu);
	}
	
	
	
	
	
	
	
	
	
	
	
}
