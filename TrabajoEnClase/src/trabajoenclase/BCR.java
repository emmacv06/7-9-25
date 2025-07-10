/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trabajoenclase;

/**
 *
 * @author emmac
 */
public class BCR {
    
    private int IBAN;
    private int cedula;
    private String NombreUsuario;
    private int NumeroSimpe;
    private int monto;

    public BCR() {
    }

    public BCR(int IBAN, int cedula, String NombreUsuario, int NumeroSimpe, int monto) {
        this.IBAN = IBAN;
        this.cedula = cedula;
        this.NombreUsuario = NombreUsuario;
        this.NumeroSimpe = NumeroSimpe;
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

    public String getNombreUsuario() {
        return NombreUsuario;
    }

    public void setNombreUsuario(String NombreUsuario) {
        this.NombreUsuario = NombreUsuario;
    }

    public int getNumeroSimpe() {
        return NumeroSimpe;
    }

    public void setNumeroSimpe(int NumeroSimpe) {
        this.NumeroSimpe = NumeroSimpe;
    }

    public int getMonto() {
        return monto;
    }

    public void setMonto(int monto) {
        this.monto = monto;
    }

    @Override
    public String toString() {
        return "BCR{" + "IBAN=" + IBAN + ", cedula=" + cedula + ", NombreUsuario=" + NombreUsuario + ", NumeroSimpe=" + NumeroSimpe + ", monto=" + monto + '}';
    }
    
    
    
}
