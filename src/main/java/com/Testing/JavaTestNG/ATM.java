package com.Testing.JavaTestNG;

public class ATM {
    private double saldo;

    public ATM(double saldoAwal) {
        if (saldoAwal < 0) {
            throw new IllegalArgumentException("Saldo awal tidak bisa negatif");
        }
        this.saldo = saldoAwal;
    }

    public double lihatSaldo() {
        return saldo;
    }

    public void setorUang(double jumlah) {
        if (jumlah <= 0) {
            throw new IllegalArgumentException("Jumlah setoran harus lebih besar dari 0");
        }
        saldo += jumlah;
    }

    public void tarikUang(double jumlah) {
        if (jumlah <= 0) {
            throw new IllegalArgumentException("Jumlah penarikan harus lebih besar dari 0");
        }
        if (jumlah > saldo) {
            throw new IllegalArgumentException("Saldo tidak mencukupi untuk penarikan ini");
        }
        saldo -= jumlah;
    }
}
