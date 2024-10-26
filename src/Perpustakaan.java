import java.util.ArrayList;
import java.util.List;

class Perpustakaan {
    private List<Buku> daftarBuku = new ArrayList<>();
    private List<Anggota> daftarAnggota = new ArrayList<>();
    private List<Transaksi> daftarTransaksi = new ArrayList<>();

    public void tambahBuku(Buku buku) {
        daftarBuku.add(buku);
    }

    public void tambahAnggota(Anggota anggota) {
        daftarAnggota.add(anggota);
    }

    public Buku cariBukuBerdasarkanJudul(String judul) {
        for (Buku buku : daftarBuku) {
            if (buku.getJudul().equalsIgnoreCase(judul)) {
                return buku;
            }
        }
        return null;
    }

    public Anggota cariAnggotaBerdasarkanId(int id) {
        for (Anggota anggota : daftarAnggota) {
            if (anggota.getId() == id) {
                return anggota;
            }
        }
        return null;
    }

    public void tambahTransaksi(Transaksi transaksi) {
        daftarTransaksi.add(transaksi);
        transaksi.prosesTransaksi();
    }

    public void tampilkanRiwayatTransaksi() {
        System.out.println("\nRiwayat Transaksi:");
        for (Transaksi transaksi : daftarTransaksi) {
            System.out.println(transaksi.getInfoTransaksi());
        }
    }

    public void tampilkanStokBuku() {
        System.out.println("\nInformasi Stok Buku:");
        for (Buku buku : daftarBuku) {
            System.out.println("Judul: " + buku.getJudul() + ", Penulis: " + buku.getPenulis() + ", Stok: " + buku.getStok());
        }
    }
}