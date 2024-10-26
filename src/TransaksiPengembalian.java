class TransaksiPengembalian extends Transaksi {

    public TransaksiPengembalian(Anggota anggota, Buku buku) {
        super(anggota, buku, "Pengembalian");
    }

    @Override
    public void prosesTransaksi() {
        buku.tambahStok();
        sukses = true;
        System.out.println("Pengembalian berhasil: " + buku.getJudul() + " oleh " + anggota.getNama());
    }
}