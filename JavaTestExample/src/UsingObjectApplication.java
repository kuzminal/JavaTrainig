import javax.swing.JOptionPane;

class MyClassTest{
	int number;
	char symbol;
}

public class UsingObjectApplication {
	public static void main(String[] args) {
		MyClassTest objClass = new MyClassTest();
		objClass.number = 100;
		objClass.symbol = 'A';
		
		String textString = "Число " + objClass.number + "\n";
		textString += "Символ: " + objClass.symbol;
		
		JOptionPane.showMessageDialog(null, textString);
	}
}
