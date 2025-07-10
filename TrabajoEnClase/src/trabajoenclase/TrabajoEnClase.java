/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package trabajoenclase;

import javax.swing.JOptionPane;

/**
 *
 * @author emmac
 */
public class TrabajoEnClase {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        int BnIban = Integer.parseInt(JOptionPane.showInputDialog("DIgite la cantidad de cuentas del Banco Nacional"));
        BN bn[] = new BN[BnIban];
        solicitaDatosBN(bn);

        int BCRIban = Integer.parseInt(JOptionPane.showInputDialog("DIgite la cantidad de cuentas del BCR"));
        BCR bcr[] = new BCR[BCRIban];
        solicitaDatosBcr(bcr);

        imprimeDatosBN(bn);
        imprimeDatosBCR(bcr);

    }

    public static void solicitaDatosBN(BN[] vector) {
        for (int i = 0; i < vector.length; i++) {
            int IBAN = Integer.parseInt(JOptionPane.showInputDialog("Digite el numero de cuenta"));
            int cedula = Integer.parseInt(JOptionPane.showInputDialog("digite el id"));
            int monto = Integer.parseInt(JOptionPane.showInputDialog("digite el monto"));
            vector[i] = new BN(IBAN, cedula, monto);

        }

    }

    public static void solicitaDatosBcr(BCR[] vector) {
        for (int i = 0; i < vector.length; i++) {
            int IBAN = Integer.parseInt(JOptionPane.showInputDialog("Digite el numero de cuenta"));
            int cedula = Integer.parseInt(JOptionPane.showInputDialog("digite el id"));
            String NombreUsuario = (JOptionPane.showInputDialog("Ingrese el nombre de usuario"));
            int monto = Integer.parseInt(JOptionPane.showInputDialog("digite el monto"));
            vector[i] = new BCR(IBAN, cedula, NombreUsuario, monto, monto);

        }
    }

    public static void imprimeDatosBN(BN[] vector) {
        StringBuilder resultado = new StringBuilder();
        for (int i = 0; i < vector.length; i++) {

            resultado.append(vector[i]);
            resultado.append("\n");
            JOptionPane.showMessageDialog(null, vector[i].toString());
        }
    }

    public static void imprimeDatosBCR(BCR[] vector) {
        StringBuilder resultado = new StringBuilder();
        for (int i = 0; i < vector.length; i++) {

            resultado.append(vector[i]);
            resultado.append("\n");
            JOptionPane.showMessageDialog(null, vector[i].toString());

        }
    }
}
