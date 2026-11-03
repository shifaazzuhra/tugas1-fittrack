
# FitTrack

FitTrack merupakan program sederhana berbasis Java untuk mengelola data anggota gym. Program ini dibuat sebagai tugas remedial UTS Praktikum Pemrograman Berorientasi Objek.

## Fitur Program
- Menyimpan nama, nomor telepon, tanggal daftar, dan jenis paket anggota.
- Melakukan validasi data anggota.
- Menggunakan constructor overloading untuk membuat objek Member.
- Menampilkan beberapa anggota menggunakan array.
- Menampilkan informasi anggota melalui method toString().

## Konsep PBO
- Class dan Object
- Encapsulation
- Constructor Overloading
- Getter dan Setter
- Method Overriding (toString)

## Struktur Project
- src/Member.java : Class untuk menyimpan dan mengelola data anggota.
- src/TesFitTrack.java : Class untuk menjalankan pengujian program.
- README.md : Dokumentasi project.

## Cara Menjalankan
Buka terminal pada folder utama project, lalu jalankan:

```powershell
javac src/Member.java src/TesFitTrack.java
java -cp src TesFitTrack
```

## Pengujian
Pengujian dilakukan untuk memastikan:
- Data beberapa anggota dapat ditampilkan.
- Nama kosong ditolak.
- Nomor telepon tidak valid ditolak.
- Jenis paket di luar Basic, Premium, dan VIP ditolak.
- Constructor dengan tiga parameter menggunakan paket Basic.
- Constructor tanpa parameter menggunakan data default.
- Tanggal dengan format yang salah ditolak.
- Data sebelumnya tidak berubah ketika input tidak valid.
