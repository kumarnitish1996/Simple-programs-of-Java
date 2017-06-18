// This program shows how to use Classs
// By - Nitish Tiwari

class Box{
	double width;
	double length;
	double height;
	}

class Use_of_class{

	public static void main(String args[]){
	Box mybox = new Box();
	double vol;

	mybox.width = 10;
	mybox.length = 20;
	mybox.height = 15;

	vol = mybox.width*mybox.height*mybox.length;

	System.out.println("Volume of the given box is " + vol);

	}
}

