# 🏡 DesaSystem

DesaSystem adalah aplikasi berbasis Java yang dirancang untuk mendukung proses pengajuan dan pengelolaan surat penting di kantor desa. Aplikasi ini menggunakan konsep **Pemrograman Berbasis Komponen (Component-Based Programming)** dengan implementasi interface sebagai penghubung antar komponen.

---

## 📁 Struktur Proyek

```
DesaSystem/
├── Admin.java
├── AdminActions.java
├── Application.java
├── ApplicationHandler.java
├── Citizen.java
├── Main.java
└── UserActions.java
```

---

## 🧩 Komponen Utama

### 🧑‍💼 `Admin.java`
- Merepresentasikan petugas desa.
- Menerapkan interface `AdminActions`, `UserActions`, dan `ApplicationHandler`.
- Bertugas memproses permohonan dari warga (menyetujui/menolak).

### 👤 `Citizen.java`
- Merepresentasikan warga.
- Menggunakan interface `UserActions` untuk mengajukan dan memantau permohonan.

### 📄 `Application.java`
- Menyimpan data permohonan surat, seperti ID, jenis dokumen, alasan, dan status.

### 🔄 `ApplicationHandler.java`
- Interface yang digunakan untuk menangani operasi pada permohonan surat.
- Diimplementasikan oleh Admin untuk pengelolaan data.

### ✅ `AdminActions.java`
- Interface untuk tindakan yang dapat dilakukan Admin (approve/reject).

### 📥 `UserActions.java`
- Interface untuk tindakan warga (submit/check status).

### 🚀 `Main.java`
- Titik masuk program.
- Menyediakan menu interaktif untuk login sebagai Warga atau Admin.

---

## 🧪 Cara Menjalankan

1. Clone repositori ini:
   ```bash
   git clone https://github.com/jihanabilah07/DesaSystem.git
   ```

2. Pindah ke folder proyek:
   ```bash
   cd DesaSystem
   ```

3. Kompilasi semua file Java:
   ```bash
   javac *.java
   ```

4. Jalankan aplikasi:
   ```bash
   java Main
   ```

---

## 👥 Pengembang
- **Jihan Nabilah** – 2208107010035  
- **Qandila Ahmara** – 2208107010039  
