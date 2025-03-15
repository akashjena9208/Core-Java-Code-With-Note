package in;

import java.util.Objects;

class Car1
{
	String  Color,Model,regdNo;

	public Car1(String color, String model, String regdNo) {
		Color = color;
		Model = model;
		this.regdNo = regdNo;
	}

	@Override
	public String toString() {
		return "car [Color=" + Color + ", Model=" + Model + ", regdNo=" + regdNo + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(Color, Model, regdNo);
	}

	@Override
	public boolean equals(Object obj) 
	{
		
		if(obj instanceof Car1)
		{
			Car1 car=(Car1) obj;
			if(this.regdNo.equals(car.regdNo))
			{
				return true;
			}
			
			else
			{
				return false;
			}

		}
		else
		{
			return false;
		}

	}

	public static void main(String[] args) {
		Car1 c1= new Car1("White","BMW","2001");
		Car1 c2=new Car1("Red","OD","2002");
		Car1 c3= new Car1("White","BMW","2001");

		System.out.println(c1.equals(c2));
		System.out.println(c1.equals(c3));
		
		System.out.println(c1==c3);


	}
}
