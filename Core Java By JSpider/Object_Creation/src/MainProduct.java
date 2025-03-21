class Product implements Cloneable {
	int quanty, price;
	String type;

	public Product(int quanty, int price, String type) {

		this.quanty = quanty;
		this.price = price;
		this.type = type;
	}

	@Override
	public String toString() {
		return "Product [quanty=" + quanty + ", price=" + price + ", type=" + type + "]";
	}

	protected Object clone() throws CloneNotSupportedException {
		return super.clone();

	}

}

public class MainProduct {

	public static void main(String[] args) {
		Product product = new Product(10, 1000, "Ice-Cream");
		System.out.println(product);
		/* product.clone(); */
		try {

			Object obj = product.clone();
			Product product2 = (Product) obj;
			System.out.println(product2);
		} catch (CloneNotSupportedException e) {
		
			System.out.println("Clone Faild");
		}

	}

}
