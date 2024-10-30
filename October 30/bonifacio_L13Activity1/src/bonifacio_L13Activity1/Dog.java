package bonifacio_L13Activity1;

public class Dog {
	private DogSize dogSize;
	
	enum DogSize {
		TINY, SMALL, MEDIUM, LARGE, EXTRALARGE
	}
	
	public Dog(DogSize dogSize) {
		this.dogSize = dogSize;
	}
	
	public void selectDogSize() {
        switch (dogSize) {
            case SMALL:
                System.out.println("I am a small doggy.");
                break;
            case MEDIUM:
                System.out.println("I am a medium doggy.");
                break;
            case LARGE:
                System.out.println("I am a large doggy.");
                break;
            case EXTRALARGE:
                System.out.println("I am an extra large doggy.");
                break;
            case TINY:
            	System.out.println("I don't know which you like");
            default:
                System.out.println("I don't know what size is that");
        }
    }
}
