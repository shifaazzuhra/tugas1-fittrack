/**
 * Class Member digunakan untuk menyimpan data anggota gym FitTrack.
 */
public class Member {
    private static final int MIN_PANJANG_TELEPON = 10;
    private static final String PAKET_DEFAULT = "Basic";
    private static final String NAMA_DEFAULT = "Belum diisi";
    private static final String TELEPON_DEFAULT = "0000000000";
    private static final String TANGGAL_DEFAULT = "01-01-2026";

    private String nama;
    private String noTelepon;
    private String tanggalDaftar;
    private String jenisPaket;

    /**
     * Membuat anggota baru dengan data lengkap.
     *
     * @param nama          nama anggota
     * @param noTelepon     nomor telepon anggota
     * @param tanggalDaftar tanggal pendaftaran anggota
     * @param jenisPaket    jenis paket keanggotaan
     */
    public Member(String nama, String noTelepon, String tanggalDaftar, String jenisPaket) {
        this.nama = NAMA_DEFAULT;
        this.noTelepon = TELEPON_DEFAULT;
        this.tanggalDaftar = TANGGAL_DEFAULT;
        this.jenisPaket = PAKET_DEFAULT;

        setNama(nama);
        setNoTelepon(noTelepon);
        setTanggalDaftar(tanggalDaftar);
        setJenisPaket(jenisPaket);
    }

    /**
     * Membuat anggota baru dengan paket default Basic.
     *
     * @param nama          nama anggota
     * @param noTelepon     nomor telepon anggota
     * @param tanggalDaftar tanggal pendaftaran anggota
     */
    public Member(String nama, String noTelepon, String tanggalDaftar) {
        this(nama, noTelepon, tanggalDaftar, PAKET_DEFAULT);
    }

    /**
     * Membuat anggota dengan data default.
     */
    public Member() {
        this(NAMA_DEFAULT, TELEPON_DEFAULT, TANGGAL_DEFAULT, PAKET_DEFAULT);
    }

    /**
     * Mengambil nama anggota.
     *
     * @return nama anggota
     */
    public String getNama() {
        return nama;
    }

    /**
     * Mengambil nomor telepon anggota.
     *
     * @return nomor telepon anggota
     */
    public String getNoTelepon() {
        return noTelepon;
    }

    /**
     * Mengambil tanggal pendaftaran anggota.
     *
     * @return tanggal pendaftaran anggota
     */
    public String getTanggalDaftar() {
        return tanggalDaftar;
    }

    /**
     * Mengambil jenis paket anggota.
     *
     * @return jenis paket anggota
     */
    public String getJenisPaket() {
        return jenisPaket;
    }

    /**
     * Mengubah nama anggota jika tidak kosong.
     *
     * @param nama nama baru anggota
     */
    public void setNama(String nama) {
        if (nama == null || nama.trim().isEmpty()) {
            System.out.println("Nama tidak boleh kosong.");
            return;
        }

        this.nama = nama;
    }

    /**
     * Mengubah nomor telepon jika diawali 0 dan minimal 10 digit.
     *
     * @param noTelepon nomor telepon baru anggota
     */
    public void setNoTelepon(String noTelepon) {
        if (noTelepon == null ||
                !noTelepon.matches("0[0-9]+") ||
                noTelepon.length() < MIN_PANJANG_TELEPON) {
            System.out.println("Nomor telepon harus diawali 0 dan minimal 10 digit.");
            return;
        }

        this.noTelepon = noTelepon;
    }

    /**
     * Mengubah tanggal daftar jika formatnya dd-MM-yyyy.
     *
     * @param tanggalDaftar tanggal pendaftaran baru
     */
    public void setTanggalDaftar(String tanggalDaftar) {
        if (tanggalDaftar == null ||
                !tanggalDaftar.matches("\\d{2}-\\d{2}-\\d{4}")) {
            System.out.println("Format tanggal harus dd-MM-yyyy.");
            return;
        }

        this.tanggalDaftar = tanggalDaftar;
    }

    /**
     * Mengubah jenis paket jika termasuk Basic, Premium, atau VIP.
     *
     * @param jenisPaket jenis paket baru anggota
     */
    public void setJenisPaket(String jenisPaket) {
        if (jenisPaket == null ||
                (!jenisPaket.equals("Basic") &&
                        !jenisPaket.equals("Premium") &&
                        !jenisPaket.equals("VIP"))) {

            System.out.println("Jenis paket harus Basic, Premium, atau VIP.");
            return;
        }

        this.jenisPaket = jenisPaket;
    }

    /**
     * Menampilkan informasi anggota dalam bentuk teks.
     *
     * @return data anggota yang berisi nama, nomor telepon,
     *         tanggal daftar, dan jenis paket
     */
    @Override
    public String toString() {
        return "Nama: " + nama +
                "\nNo. Telepon: " + noTelepon +
                "\nTanggal Daftar: " + tanggalDaftar +
                "\nJenis Paket: " + jenisPaket;
    }
}
