public class TestSublimeJavaC {

	public TestSublimeJavaC(){
		this.name = "castle";
		this.age = 27;
	}

	private String name;

	private Integer age;
	
	public static void main(String[] args){
		for (int i =0; i < 1100 ;i++ ) {
			System.out.println("test......." + i);
		}
		
	}

	public String getName(){
		return name;
	}
	
	public Integer getAge(){
		return age;
	}

	public void setName(String name){
		this.name = name;
	}
	
	public  void setAge(Integer age){
		this.age = age;
	}

}

