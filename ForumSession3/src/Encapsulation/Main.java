package Encapsulation;

public class Main {

    public static void main(String[] args) {

        Rekening rekeningSaya = new Rekening(1000000);

        rekeningSaya.setor(500000);
        rekeningSaya.tarik(200000);

        System.out.println("Saldo saat ini: Rp" + rekeningSaya.getSaldo());
    }
}
