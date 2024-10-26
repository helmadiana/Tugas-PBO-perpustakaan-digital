class TransaksiPeminjaman extends Transaksi {

    public TransaksiPeminjaman(Anggota anggota, Buku buku) {
        super(anggota, buku, "Peminjaman");
    }

    @Override
    public void prosesTransaksi() {
        if (buku.getStok() > 0) {
            buku.kurangiStok();
            sukses = true;
            System.out.println("Peminjaman berhasil: " + buku.getJudul() + " oleh " + anggota.getNama());
        } else {
            sukses = false;
            System.out.println("Stok habis untuk buku: " + buku.getJudul());
        }
    }
}
