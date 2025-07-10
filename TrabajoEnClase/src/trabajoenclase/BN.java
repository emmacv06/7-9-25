/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trabajoenclase;

/**
 *
 * @author emmac
 */
public class BN {
    
    private int IBAN;
    private int cedula; 
    private int monto; 

    public BN() {
    }

    public BN(int IBAN, int cedula, int monto) {
        this.IBAN = IBAN;
        this.cedula = cedula;
        this.monto = monto;
    }

    public int getIBAN() {
        return IBAN;
    }

    public void setIBAN(int IBAN) {
        this.IBAN = IBAN;
    }

    public int getCedula() {
        return cedula;
    }

    public void setCedula(int cedula) {
        this.cedula = cedula;
    }

    public int getMonto() {
        return monto;
    }

    public void setMonto(int monto) {
        this.monto = monto;
    }

    @Override
    public String toString() {
        return "BN{" + "IBAN=" + IBAN + ", cedula=" + cedula + ", monto=" + monto + '}';
    }
    
    
    
}
