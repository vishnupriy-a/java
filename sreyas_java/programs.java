import java.util.Scanner;
class cpu{
	double price;
	cpu(double price){
		this.price=price;
		
		}
	class processor{
		int number_of_cores;
		String manufacturer;
		processor(int n,String m){
				number_of_cores=n;
				manufacturer=m;
		}
	}
static class RAM{
		int memory;
		String manufacturer;
		RAM(int memory,String manufacturer){
			this.memory=memory;
			this.manufacturer=manufacturer;
		}
	}
}
Public  class programs{
	public static void main(String[] args)
{
	Scanner input=new Scanner(System.in);
	System.out.println("enter the cpu price");
	cpu cpu=new cpu(input nextDouble());
	System.out.println("enter no of cores,cpu manufacturer");
	cpu.processor p=cpu.new processor(input.nextInt(),input.next());
	System.out.println("enter ram size, manufacturer: ");
	cpu.RAM sum=new cpu.RAM(input nextInt(),inputnext());
	System.out.println("CPU DETAILS : ");
	System.out.println("price: "+cpu.price);
	System.out.println("cpu cores:"+p.number_of_cores);
	System.out.println("cpu manufacturer: "+p.manufacturer);
	System.out.println("ram size"+ram.memory);
	System.out.println("ram manufacturer: "+ram.manufacturer);
}
}
		



























	
