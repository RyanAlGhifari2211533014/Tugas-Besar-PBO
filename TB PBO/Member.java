package com.tbpboziggy;

    public abstract class Member {
        protected Integer poin = 0;

        String namaPelanggan;
        String kodeBarang;
        String namaBarang;
        String noHp;
        String alamat;
        String namaKasir="Ziggy";
        Long hargaBarang;
        Long jumlahBeli;
        Long totalBayar;
    
        public int getPoin() {
            return poin;
        }

        public int redeemPoin(int hargaSouvenir) {
            return this.poin = this.poin - hargaSouvenir;
        }

        protected int getBonusPoin(int totalBayar) {
            int poin = (int) (totalBayar / 10000);
            return poin;
    }
}