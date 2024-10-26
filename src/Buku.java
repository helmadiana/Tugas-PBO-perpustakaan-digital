class Buku {
    private String judul;
    private String penulis;
    private int stok;

    public Buku(String judul, String penulis, int stok) {
        this.judul = judul;
        this.penulis = penulis;
        this.stok = stok;
    }

    public String getJudul() {
        return judul;
    }

    public String getPenulis() {
        return penulis;
    }

    public int getStok() {
        return stok;
    }

    public void kurangiStok() {
        if (stok > 0) {
            stok--;
        }
    }

    public void tambahStok() {
        stok++;
    }
}