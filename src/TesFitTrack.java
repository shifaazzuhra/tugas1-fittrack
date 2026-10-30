public class TesFitTrack {
    public static void main(String[] args) {
        Member member1 = new Member(
            "Shifa Azzuhra",
            "081234567890",
            "28-10-2026",
            "Premium"
        );

        Member member2 = new Member(
            "Nadia",
            "082345678901",
            "29-10-2026",
            "Basic"
        );

        Member member3 = new Member(
            "Alya",
            "085678901234",
            "29-10-2026",
            "VIP"
        );

        Member[] daftarMember = {member1, member2, member3};

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
    }
    
}
