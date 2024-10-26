class Transaksi {
    protected Anggota anggota;
    protected Buku buku;
    protected String jenisTransaksi;
    protected boolean sukses;

    public Transaksi(Anggota anggota, Buku buku, String jenisTransaksi) {
        this.anggota = anggota;
        this.buku = buku;
        this.jenisTransaksi = jenisTransaksi;
    }

    public void prosesTransaksi() {
        // Metode ini akan di-override oleh kelas anak
    }

    public String getInfoTransaksi() {
        return "Transaksi: " + jenisTransaksi + " - " + buku.getJudul() + " oleh " + anggota.getNama() + " - Status: " + (sukses ? "Berhasil" : "Gagal");
    }
}