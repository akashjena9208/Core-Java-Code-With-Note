package arrays;
class Student
{
	int id;
	String name;
	
	Student(int id,String name)
	{
		this.id=id;
		this.name=name;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + "]";
	}
	
}

public class ar02 
{
	public static void main(String[] args) {
		Student obj=new Student(1, "Akash");
		Student obj1=new Student(2, "Subha");
		Student obj2=new Student(3, "Inu");
		
		
		Student num[]= {obj,obj1,obj2};
		
		for(Student a:num)
		{
			System.out.println(a);
		}
		
		System.out.println("==============Back Ward using for loop=======================");
		
		//creating another array
		Student nums[]= new Student[3];
		nums[0]=obj;
		nums[1]=obj1;
		nums[2]=obj2;
		for(int i=nums.length-1; i>=0;i--
				)
		{
			System.out.println(nums[i]);
		}
	}

}
