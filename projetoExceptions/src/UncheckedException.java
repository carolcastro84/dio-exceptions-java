import javax.swing.*;

public class UncheckedException {
    public static void main(String[] args){
        String a = JOptionPane.showInputDialog("Numerador:");
        String b = JOptionPane.showInputDialog("Denominador:");
        try {
            int resultado = dividir(Integer.parseInt(a), Integer.parseInt(b));
            System.out.println(resultado);
        } catch (NumberFormatException e) {
            //throw new RuntimeException(e);
            //e.printStackTrace();
            JOptionPane.showMessageDialog(null,"Entrada inválida " + e.getMessage());
        } catch (ArithmeticException e){
            JOptionPane.showMessageDialog(null,"Divisao por zero " + e.getMessage());
        } finally {
            System.out.println("finally");
        }

    }

    public static int dividir (int a, int b) {return a / b;};
}
