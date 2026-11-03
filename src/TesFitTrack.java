/**
 * Class untuk menguji fitur-fitur pada Member.
 */
public class TesFitTrack {
    /**
     * Menjalankan pengujian data anggota FitTrack.
     *
     * @param args argumen saat program dijalankan
     */
    public static void main(String[] args) {
        Member member1 = new Member(
                "Shifa Azzuhra",
                "081234567890",
                "28-10-2026",
                "Premium");

        Member member2 = new Member(
                "Nadia",
                "082345678901",
                "29-10-2026",
                "Basic");

        Member member3 = new Member(
                "Alya",
                "085678901234",
                "29-10-2026",
                "VIP");

        Member member4 = new Member(
                "Rina",
                "081234567899",
                "31-10-2026");

        Member[] daftarMember = { member1, member2, member3, member4 };

        System.out.println("Data Anggota FitTrack");

        for (int i = 0; i < daftarMember.length; i++) {
            System.out.println("\nAnggota ke-" + (i + 1));
            System.out.println(daftarMember[i]);
        }
        System.out.println("\nPengujian Validasi");

        member1.setNama("");
        member1.setNoTelepon("12345");
        member1.setJenisPaket("Gold");

        System.out.println("\nData anggota setelah pengujian:");
        System.out.println(member1);

        System.out.println("\nPengujian Constructor");

        System.out.println("\nConstructor 3 parameter:");
        System.out.println(member4);

        Member member5 = new Member();
        System.out.println("\nConstructor tanpa parameter:");
        System.out.println(member5);

        System.out.println("\nPengujian Tanggal Tidak Valid");
        member4.setTanggalDaftar("31/10/2026");

        System.out.println("Tanggal setelah pengujian: " + member4.getTanggalDaftar());

        System.out.println("\nPengujian Constructor dengan Data Tidak Valid");

        Member memberTidakValid = new Member(
                "",
                "12345",
                "31/10/2026",
                "Gold");

        System.out.println(memberTidakValid);
    }
}
