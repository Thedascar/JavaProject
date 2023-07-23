package br.com.ReinforcingJava.Collections.dominio;

import java.util.Objects;

public class SmartPhone {
    private String serialNumber;
    private String marca;

    public String getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public SmartPhone(String serialNumber, String marca) {
        this.serialNumber = serialNumber;
        this.marca = marca;


    }

    @Override
    public String toString() {
        return "SmartPhone{" +
                "serialNumber='" + serialNumber + '\'' +
                ", marca='" + marca + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof SmartPhone smartPhone)) return false;
        return Objects.equals(getSerialNumber(), smartPhone.getSerialNumber()) && Objects.equals(getMarca(), smartPhone.getMarca());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getSerialNumber(), getMarca());
    }
}
