public class Main {
    public static void main(String[] args) {
        Perpustakaan perpustakaan = new Perpustakaan();

        // Menambahkan buku dan anggota
        Buku buku1 = new Buku("Pemrograman Java", "James Gosling", 3);
        perpustakaan.tambahBuku(buku1);

        Buku buku2 = new Buku("Pemrograman Python", "Guido van Rossum", 2);
        perpustakaan.tambahBuku(buku2);

        Anggota anggota1 = new Anggota(101, "Alice");
        perpustakaan.tambahAnggota(anggota1);

        Anggota anggota2 = new Anggota(102, "Bob");
        perpustakaan.tambahAnggota(anggota2);

        // Melakukan peminjaman
        TransaksiPeminjaman transaksiPeminjaman1 = new TransaksiPeminjaman(anggota1, buku1);
        perpustakaan.tambahTransaksi(transaksiPeminjaman1);

        TransaksiPeminjaman transaksiPeminjaman2 = new TransaksiPeminjaman(anggota2, buku1);
        perpustakaan.tambahTransaksi(transaksiPeminjaman2);

        // Melakukan pengembalian
        TransaksiPengembalian transaksiPengembalian1 = new TransaksiPengembalian(anggota1, buku1);
        perpustakaan.tambahTransaksi(transaksiPengembalian1);

        // Tampilkan stok buku dan riwayat transaksi
        perpustakaan.tampilkanStokBuku();
        perpustakaan.tampilkanRiwayatTransaksi();
    }
}