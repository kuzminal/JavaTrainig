import javax.swing.JOptionPane;
public class CalcBMIValue {
	public static void main(String[] args) {
		double mass, height, bmi;
		String resultString;
		
		resultString = JOptionPane.showInputDialog("Ваш рост в метрах:");
		height = Double.parseDouble(resultString);
		resultString = JOptionPane.showInputDialog("Ваш вес в килограммах:");
		mass = Double.parseDouble(resultString);
		bmi = mass/height/height;
		
		bmi = Math.round(bmi*100)/100.0;
		JOptionPane.showMessageDialog(null, "Индекс массы тела : "+ bmi);
	}
}
