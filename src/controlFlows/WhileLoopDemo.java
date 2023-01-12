package controlFlows;

public class WhileLoopDemo {

	public void printMultiple(int num) {
		int i = 1;
		while(i<10) {
			System.out.println(i + " * " + num + " = " + i*num);
			i++;
		}
	}
	
}
