
public class Member {
    private String nama;
    private String noTelepon;
    private String tanggalDaftar;
    private String jenisPaket;

    public Member(String nama, String noTelepon, String tanggalDaftar, String jenisPaket) {
    setNama(nama);
    setNoTelepon(noTelepon);
    setTanggalDaftar(tanggalDaftar);
    setJenisPaket(jenisPaket);
}

public Member(String nama, String noTelepon, String tanggalDaftar) {
    this(nama, noTelepon, tanggalDaftar, "Basic");
}

public Member() {
    this("Belum diisi", "0000000000", "01-01-2026", "Basic");
}

    public String getNama() {
        return nama;
    }

    public String getNoTelepon() {
        return noTelepon;
    }

    public String getTanggalDaftar() {
        return tanggalDaftar;
    }

    public String getJenisPaket() {
        return jenisPaket;
    }
    

public void setNama(String nama) {
    if (nama == null || nama.trim().isEmpty()) {
        System.out.println("Nama tidak boleh kosong.");
        return;
    }

    this.nama = nama;
}

public void setNoTelepon(String noTelepon) {
    if (noTelepon == null || !noTelepon.matches("0[0-9]{9,}")) {
        System.out.println("Nomor telepon harus diawali 0 dan minimal 10 digit.");
        return;
    }

    this.noTelepon = noTelepon;
}

public void setTanggalDaftar(String tanggalDaftar) {
    if (tanggalDaftar == null ||
        !tanggalDaftar.matches("\\d{2}-\\d{2}-\\d{4}")) {
        System.out.println("Format tanggal harus dd-MM-yyyy.");
        return;
    }

    this.tanggalDaftar = tanggalDaftar;
}


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

@Override
public String toString() {
    return "Nama: " + nama +
           "\nNo. Telepon: " + noTelepon +
           "\nTanggal Daftar: " + tanggalDaftar +
           "\nJenis Paket: " + jenisPaket;
}
}
