package inhpol;  // super keyword

class Anim {
	
		  public void display(){
		    System.out.println("I am an animal");
		  }
		}

		class Dog extends Anim {

		  public void display(){
		    System.out.println("I am a dog");
		  }

		  public void printMessage(){

		    display();

		    super.display();
		  }
		}

		class Animal {
		  public static void main(String[] args) {
		    Dog dog1 = new Dog();
		    dog1.printMessage();
		  }
		}

