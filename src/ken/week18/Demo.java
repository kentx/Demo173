package ken.week18;

public class Demo {
	
	public static void main(String[] args) {
		Student s1=new Student();
		s1.show();
		s1.name="����";
		s1.age=10;
		s1.classNu="173";
		s1.show();
		
		Student s2=new Student();
		s2.name="��ë";
		s2.age=11;
		//s1.classNu="173";
		s2.show();
		
		Student s3=new Student();
		s3.name="����";
		s3.age=6;
		s3.classNu="175";
		s1.show();
		s2.show();
		s3.show();
		
		Student.classNu="123";
		Student.eat();
		//Student.show();
		
		
		
		
		
		/*Student s1=new Student();
		s1.show();
		s1.setName("С������ȥ");
		s1.setAge(6);
		s1.show();
		Student s2=new Student("С��", 7);
		s2.show();*/
		
		
		
	}
    
}
