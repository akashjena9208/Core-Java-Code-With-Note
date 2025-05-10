package shreeharijava8lambra;

@FunctionalInterface
interface Display {
	int getSize(String s);
}

public class Displayimpl implements Display {

	@Override
	public int getSize(String s) {

		return s.length();
	}

}
