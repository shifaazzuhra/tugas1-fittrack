
public class Member {
    private String nama;
    private String noTelepon;
    private String tanggalDaftar;
    private String jenisPaket;

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

}
