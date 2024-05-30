package com.example.edunihon.Data;

import com.example.edunihon.Model.Learn;
import com.example.edunihon.Model.Scholarship;
import com.example.edunihon.Model.University;
import com.example.edunihon.R;

import java.util.ArrayList;
import java.util.Arrays;

public class DataSource {
    public static ArrayList<University> universities = generateDummyuniversities();
    public static ArrayList<Scholarship> scholarships = generateDummyScholarships();
    public static ArrayList<Learn> learns = generateDummyLearn();

    private static ArrayList<University> generateDummyuniversities() {
        ArrayList<University> universities = new ArrayList<>();
        universities.add(new University(R.drawable.univ_tokyo, "Tokyo University", 84, "Tokyo", "Didirikan pada tahun 1877, Universitas Tokyo (Tokyo Daigaku) adalah lembaga pendidikan tinggi negeri nirlaba yang berlokasi di kawasan perkotaan kota metropolitan besar Tokyo (kisaran populasi lebih dari 5.000.000 jiwa). Lembaga ini juga memiliki kampus cabang di Komaba dan Kashiwa. Diakui secara resmi oleh Kementerian Pendidikan, Kebudayaan, Olahraga, Sains dan Teknologi Jepang, Universitas Tokyo (TODAI) adalah institusi pendidikan tinggi coedukasi Jepang yang berukuran besar (kisaran pendaftaran uniRank: 25.000-29.999 siswa). Universitas Tokyo (TODAI) menawarkan kursus dan program yang mengarah ke gelar pendidikan tinggi yang diakui secara resmi seperti gelar sarjana, magister, dan doktor di beberapa bidang studi. Institusi pendidikan tinggi Jepang berusia 146 tahun ini memiliki kebijakan penerimaan selektif berdasarkan ujian masuk. Pelamar internasional berhak untuk mengajukan permohonan pendaftaran. TODAI juga menyediakan beberapa fasilitas dan layanan akademik dan non-akademik kepada mahasiswa antara lain perpustakaan, perumahan, fasilitas olah raga, belajar di luar negeri dan program pertukaran, kursus online dan kesempatan pembelajaran jarak jauh, serta layanan administrasi."));
        universities.add(new University(R.drawable.univ_kyoto, "Kyoto University", 136, "Kyoto", "Didirikan pada tahun 1897, Universitas Kyoto (Kyoto Daigaku) adalah lembaga pendidikan tinggi negeri nirlaba yang berlokasi di kawasan perkotaan kota metropolitan Kyoto (kisaran populasi 1,000,000-5,000,000 jiwa). Diakui secara resmi oleh Kementerian Pendidikan, Kebudayaan, Olahraga, Sains dan Teknologi Jepang, Universitas Kyoto adalah institusi pendidikan tinggi coedukasi Jepang yang berukuran besar (kisaran pendaftaran uniRank: 20,000-24,999 siswa). Universitas Kyoto menawarkan kursus dan program yang mengarah ke gelar pendidikan tinggi yang diakui secara resmi seperti gelar sarjana, gelar master dan doktor di beberapa bidang studi. Pelamar internasional berhak untuk mengajukan permohonan pendaftaran. Kyoto University juga menyediakan beberapa fasilitas dan layanan akademik dan non-akademik kepada mahasiswa antara lain perpustakaan, perumahan, fasilitas olah raga, studi ke luar negeri dan program pertukaran, serta layanan administrasi."));
        universities.add(new University(R.drawable.univ_keio, "Keio University", 246, "Tokyo", "Didirikan pada tahun 1858, Universitas Keio (Keio Gijuku Daigaku) adalah institusi pendidikan tinggi swasta yang berlokasi di kawasan perkotaan kota metropolitan besar Tokyo (kisaran populasi lebih dari 5.000.000 jiwa). Lembaga ini juga memiliki kampus cabang di Fujisawa. Diakui secara resmi oleh Kementerian Pendidikan, Kebudayaan, Olahraga, Sains dan Teknologi Jepang, Universitas Keio adalah institusi pendidikan tinggi coedukasi Jepang yang berukuran sangat besar (kisaran pendaftaran uniRank: 30,000-34,999 siswa). Universitas Keio menawarkan kursus dan program yang mengarah ke gelar pendidikan tinggi yang diakui secara resmi seperti gelar sarjana, magister, dan doktor di beberapa bidang studi. Siswa internasional dipersilakan untuk mendaftar. Keio University juga menyediakan beberapa fasilitas dan layanan akademik dan non-akademik kepada mahasiswa termasuk perpustakaan, fasilitas olah raga, bantuan keuangan dan/atau beasiswa, program studi dan pertukaran di luar negeri, kursus online dan kesempatan pembelajaran jarak jauh, serta layanan administrasi."));
        universities.add(new University(R.drawable.univ_osaka, "Osaka University", 338, "Suita", "Didirikan pada tahun 1931, Universitas Osaka (Osaka Daigaku) adalah lembaga pendidikan tinggi negeri nirlaba yang berlokasi di pinggiran kota menengah Suita (kisaran populasi 250,000-499,999 jiwa), Osaka. Diakui secara resmi oleh Kementerian Pendidikan, Kebudayaan, Olahraga, Sains dan Teknologi Jepang, Universitas Osaka adalah institusi pendidikan tinggi coedukasi Jepang yang berukuran besar (kisaran pendaftaran uniRank: 20,000-24,999 siswa). Universitas Osaka menawarkan kursus dan program yang mengarah ke gelar pendidikan tinggi yang diakui secara resmi seperti gelar sarjana, magister, dan doktor di beberapa bidang studi. Siswa internasional dipersilakan untuk mendaftar. Osaka University juga menyediakan beberapa fasilitas dan layanan akademik dan non-akademik kepada mahasiswa antara lain perpustakaan, fasilitas olah raga, studi di luar negeri dan program pertukaran, serta layanan administrasi."));
        universities.add(new University(R.drawable.univ_tohoku, "Tohoku University", 349, "Sendai", "Didirikan pada tahun 1907, Universitas Tohoku (Tohoku Daigaku) adalah lembaga pendidikan tinggi negeri nirlaba yang berlokasi di kawasan perkotaan kota metropolitan Sendai (kisaran populasi 1,000,000-5,000,000 jiwa), Miyagi. Diakui secara resmi oleh Kementerian Pendidikan, Kebudayaan, Olahraga, Sains dan Teknologi Jepang, Universitas Tohoku adalah institusi pendidikan tinggi coedukasi Jepang yang berukuran besar (kisaran pendaftaran uniRank: 15,000-19,999 siswa). Universitas Tohoku menawarkan kursus dan program yang mengarah ke gelar pendidikan tinggi yang diakui secara resmi seperti gelar sarjana, magister, dan doktor di beberapa bidang studi. Institusi pendidikan tinggi Jepang berusia 116 tahun ini memiliki kebijakan penerimaan selektif berdasarkan ujian masuk. Pelamar internasional berhak untuk mengajukan permohonan pendaftaran. Universitas Tohoku juga menyediakan beberapa fasilitas dan layanan akademik dan non-akademik kepada mahasiswa termasuk perpustakaan, perumahan, fasilitas olah raga, bantuan keuangan dan/atau beasiswa, studi di luar negeri dan program pertukaran, kursus online dan kesempatan pembelajaran jarak jauh, serta layanan administrasi."));
        universities.add(new University(R.drawable.univ_hokkaido, "Hokkaido University", 376, "Sapporo", "Didirikan pada tahun 1918, Universitas Hokkaido (Hokkaido Daigaku) adalah lembaga pendidikan tinggi negeri nirlaba yang berlokasi di kawasan perkotaan kota metropolitan Sapporo (kisaran populasi 1,000,000-5,000,000 jiwa), Hokkaido. Lembaga ini juga memiliki kampus cabang di Hakodate dan Hokkaido. Diakui secara resmi oleh Kementerian Pendidikan, Kebudayaan, Olahraga, Sains dan Teknologi Jepang, Universitas Hokkaido (Hokudai) adalah institusi pendidikan tinggi coedukasi Jepang yang berukuran besar (kisaran pendaftaran uniRank: 15,000-19,999 siswa). Universitas Hokkaido (Hokudai) menawarkan kursus dan program yang mengarah ke gelar pendidikan tinggi yang diakui secara resmi seperti gelar pra-sarjana (yaitu sertifikat, diploma, asosiasi atau yayasan), gelar sarjana, gelar master dan doktor di beberapa bidang studi. Institusi pendidikan tinggi Jepang berusia 105 tahun ini memiliki kebijakan penerimaan selektif berdasarkan ujian masuk. Pelamar internasional berhak untuk mengajukan permohonan pendaftaran. Hokudai juga menyediakan beberapa fasilitas dan layanan akademik dan non-akademik kepada siswa termasuk perpustakaan, perumahan, fasilitas olahraga, bantuan keuangan dan/atau beasiswa, studi di luar negeri dan program pertukaran, serta layanan administrasi."));
        universities.add(new University(R.drawable.univ_waseda, "Waseda University", 388, "Tokyo", "Didirikan pada tahun 1882, Universitas Waseda (Waseda Daigaku) adalah institusi pendidikan tinggi swasta yang berlokasi di kawasan perkotaan kota metropolitan besar Tokyo (kisaran populasi lebih dari 5.000.000 jiwa). Diakui secara resmi oleh Kementerian Pendidikan, Kebudayaan, Olahraga, Sains dan Teknologi Jepang, Universitas Waseda adalah institusi pendidikan tinggi coedukasi Jepang yang berukuran sangat besar (kisaran pendaftaran uniRank: 45.000-49.999 siswa). Universitas Waseda menawarkan kursus dan program yang mengarah ke gelar pendidikan tinggi yang diakui secara resmi seperti gelar sarjana, magister, dan doktor di beberapa bidang studi. Institusi pendidikan tinggi Jepang berusia 141 tahun ini memiliki kebijakan penerimaan selektif berdasarkan ujian masuk. Pelamar internasional berhak untuk mengajukan permohonan pendaftaran. Universitas Waseda juga menyediakan beberapa fasilitas dan layanan akademik dan non-akademik kepada mahasiswa antara lain perpustakaan, studi di luar negeri dan program pertukaran, serta layanan administrasi."));
        universities.add(new University(R.drawable.univ_tsukuba, "Tsukuba University", 396, "Tsukuba", "Didirikan pada tahun 1973, Universitas Tsukuba (Tskuba Daigaku) adalah lembaga pendidikan tinggi negeri nirlaba yang berlokasi di kawasan perkotaan kota kecil Tsukuba (kisaran populasi 50,000-249,999 jiwa), Ibaraki. Lembaga ini juga memiliki kampus cabang di Tokyo. Diakui secara resmi oleh Kementerian Pendidikan, Kebudayaan, Olahraga, Sains dan Teknologi Jepang, Universitas Tsukuba adalah institusi pendidikan tinggi coedukasi Jepang yang berukuran besar (kisaran pendaftaran uniRank: 15.000-19.999 siswa). Universitas Tsukuba menawarkan kursus dan program yang mengarah ke gelar pendidikan tinggi yang diakui secara resmi seperti gelar sarjana, magister, dan doktor di beberapa bidang studi. Institusi pendidikan tinggi Jepang berusia 50 tahun ini memiliki kebijakan penerimaan selektif berdasarkan ujian masuk dan catatan serta nilai akademik siswa di masa lalu. Siswa internasional dipersilakan untuk mendaftar. University of Tsukuba juga menyediakan beberapa fasilitas dan layanan akademik dan non-akademik kepada mahasiswa antara lain perpustakaan, perumahan, fasilitas olah raga, studi ke luar negeri dan program pertukaran, serta layanan administrasi."));
        universities.add(new University(R.drawable.univ_nagoya, "Nagoya University", 403, "Nagoya", "Didirikan pada tahun 1939, Universitas Nagoya (Nagoya Daigaku) adalah lembaga pendidikan tinggi negeri nirlaba yang berlokasi di kawasan perkotaan kota metropolitan Nagoya (kisaran populasi 1,000,000-5,000,000 jiwa), Aichi. Diakui secara resmi oleh Kementerian Pendidikan, Kebudayaan, Olahraga, Sains dan Teknologi Jepang, Universitas Nagoya adalah institusi pendidikan tinggi coedukasi Jepang yang berukuran besar (kisaran pendaftaran uniRank: 15,000-19,999 siswa). Nagoya University menawarkan kursus dan program yang mengarah ke gelar pendidikan tinggi yang diakui secara resmi seperti gelar pra-sarjana (yaitu sertifikat, diploma, asosiasi atau yayasan), gelar sarjana, gelar master dan gelar doktor di beberapa bidang studi. Institusi pendidikan tinggi Jepang berusia 84 tahun ini memiliki kebijakan penerimaan selektif berdasarkan ujian masuk. Pelamar internasional berhak untuk mengajukan permohonan pendaftaran. Nagoya University juga menyediakan beberapa fasilitas dan layanan akademik dan non-akademik kepada mahasiswa antara lain perpustakaan, perumahan, fasilitas olahraga, bantuan keuangan dan/atau beasiswa, studi di luar negeri dan program pertukaran, serta layanan administrasi."));
        universities.add(new University(R.drawable.univ_kyushu, "Kyushu University", 419, "Fukuoka", "Didirikan pada tahun 1911, Universitas Kyushu (Kyushu Daigaku) adalah lembaga pendidikan tinggi negeri nirlaba yang berlokasi di kawasan perkotaan kota metropolitan Fukuoka (kisaran populasi 1,000,000-5,000,000 jiwa). Diakui secara resmi oleh Kementerian Pendidikan, Kebudayaan, Olahraga, Sains dan Teknologi Jepang, Universitas Kyushu adalah institusi pendidikan tinggi coedukasi Jepang yang berukuran besar (kisaran pendaftaran uniRank: 15,000-19,999 siswa). Universitas Kyushu menawarkan kursus dan program yang mengarah ke gelar pendidikan tinggi yang diakui secara resmi seperti gelar sarjana, gelar master, dan gelar doktor di beberapa bidang studi. Institusi pendidikan tinggi Jepang berusia 113 tahun ini memiliki kebijakan penerimaan selektif berdasarkan ujian masuk. Pelamar internasional berhak untuk mengajukan permohonan pendaftaran. Kyushu University juga menyediakan beberapa fasilitas dan layanan akademik dan non-akademik kepada mahasiswa antara lain perpustakaan, perumahan, fasilitas olah raga, studi di luar negeri dan program pertukaran, serta layanan administrasi."));
        return universities;
    }

    private static ArrayList<Scholarship> generateDummyScholarships() {
        ArrayList<Scholarship> scholarships = new ArrayList<>();
        scholarships.add(new Scholarship(R.drawable.scholars_mext, "Monbukagakusho / MEXT", "Japanese Ministry of Education, Culture, Sports, Science and Technology", "closed", "Fully Paid", "3 April 2024", "24 April 2024", "Beasiswa Monbukagakusho atau MEXT (Ministry of Education, Culture, Sports, Science and Technology) adalah salah satu beasiswa paling prestisius yang ditawarkan oleh pemerintah Jepang kepada mahasiswa internasional. Beasiswa. ini dirancang untuk menarik mahasiswa yang berbakat dari seluruh dunia untuk belajar di Jepang, baik di tingkat sarjana, pascasarjana, atau sebagai peneliti. Tujuan utama dari program beasiswa MEXT adalah untuk memperdalam hubungan internasional melalui pendidikan dan penelitian serta mempromosikan pemahaman dan kolaborasi antara Jepang dan negara-negara lain.", "https://www.id.emb-japan.go.jp/sch.html"));
        scholarships.add(new Scholarship(R.drawable.scholars_mitsui, "Mitsui Bussan Scholarship", "Mitsui & Co. Ltd. B", "closed", "Fully Paid", "15 Januari 2024", "16 Februari 2024", "Beasiswa Mitsui Bussan adalah program beasiswa yang didirikan oleh Mitsui & Co., Ltd. untuk mendukung mahasiswa Indonesia yang ingin menempuh pendidikan tinggi di Jepang. Program ini menawarkan beasiswa penuh yang mencakup biaya hidup dan pendidikan, dengan tujuan tidak hanya meningkatkan pengetahuan akademik para penerima beasiswa tetapi juga mengembangkan pemahaman mereka tentang budaya Jepang. Setelah lulus, diharapkan para penerima beasiswa dapat menggunakan pengalaman dan pengetahuan yang diperoleh untuk berkontribusi pada pembangunan Indonesia. Program ini menekankan pentingnya pengembangan pribadi dan profesional selama masa studi di Jepang, serta komitmen terhadap isu-isu sosial di Indonesia.", "https://www.mitsui.com/jp/en/sustainability/contribution/area/Asia/1239332_13188.html"));
        scholarships.add(new Scholarship(R.drawable.scholars_inpex, "INPEX Scholarship", "INPEX Scholarship Foundation", "closed", "Fully Paid", "1 Agustus 2024", "31 Oktober 2024", "Beasiswa INPEX adalah program beasiswa yang didirikan oleh INPEX Scholarship Foundation, sebuah organisasi non-profit di Jepang yang bertujuan untuk mempromosikan pemahaman bersama, persahabatan, dan niat baik antara Indonesia dan Jepang melalui pertukaran pelajar. Didirikan pada tahun 1981, beasiswa ini ditujukan untuk mahasiswa Indonesia yang menjanjikan dan ingin mengejar gelar pascasarjana di universitas di Jepang. Dengan penekanan pada pentingnya belajar bahasa Jepang, beasiswa ini mencakup biaya hidup bulanan, biaya perjalanan, serta biaya masuk dan kuliah di sekolah bahasa Jepang dan universitas di Jepang, mendukung kandidat sukses untuk mendapatkan visa pelajar dan mengamankan tempat tinggal saat tiba di Jepang.", "https://www.inpex-s.com/en/index.php"));
        scholarships.add(new Scholarship(R.drawable.scholars_ajinomoto, "Ajinomoto Scholarship", "Ajinomoto Foundation", "closed", "Fully Paid", "1 Januari 2024", "1 Maret 2024", "Beasiswa Ajinomoto adalah program beasiswa yang ditujukan untuk mahasiswa internasional yang ingin melanjutkan studi pascasarjana di Jepang, khususnya di bidang ilmu pengetahuan. Program ini menawarkan dukungan finansial yang mencakup biaya hidup, biaya pendidikan, dan tiket pesawat ke Jepang. Beasiswa ini bertujuan untuk mengembangkan individu yang mampu memimpin Asia di abad ke-21 dan berkontribusi pada pengembangan Asia dan dunia, serta memperkuat pemahaman timbal balik antara negara-negara tersebut dan Jepang.", "https://www.ajinomoto.co.id/en/scholarship\n"));
        scholarships.add(new Scholarship(R.drawable.scholars_aichi, "Aichi Scholarship", "Aichi Prefectural Government", "closed", "Partial", "1 Maret 2024", "1 Mei 2024", "Beasiswa Aichi adalah program beasiswa yang ditawarkan oleh Pemerintah Prefektur Aichi, Jepang, dengan tujuan untuk mendukung mahasiswa internasional berbakat yang ingin melanjutkan studi di bidang yang mendukung industri Aichi. Program ini mencakup biaya hidup, biaya perjalanan, dan biaya pendidikan, serta memberikan kesempatan untuk magang dan prospek kerja di perusahaan-perusahaan di Aichi setelah lulus. Dengan fokus pada pengembangan profesional dan integrasi ke dalam ekonomi lokal, Beasiswa Aichi membuka pintu bagi mahasiswa untuk menjadi bagian dari inovasi dan kemajuan industri di Jepang.", "https://www.pref.aichi.jp/soshiki/kokusai/aichi-scholarship-program.html"));
        scholarships.add(new Scholarship(R.drawable.scholars_jasso, "JASSO Scholarship", "Japan Student Services Organization", "closed", "Partial", "13 Februari 2024", "8 Maret 2024", "Beasiswa JASSO adalah skema beasiswa pemerintah Jepang yang dirancang untuk mendukung mahasiswa internasional yang ingin belajar di Jepang. Program ini menawarkan bantuan keuangan kepada mahasiswa yang menunjukkan prestasi akademik yang luar biasa dan memiliki kebutuhan finansial, dengan tujuan memfasilitasi lingkungan belajar yang stabil dan terjangkau. Beasiswa ini mencakup berbagai tingkat pendidikan, mulai dari sekolah bahasa Jepang hingga program pascasarjana, dan mengevaluasi kandidat berdasarkan kinerja akademik, kebutuhan finansial, dan aspek lain dari sistem seleksi aplikasi beasiswa JASSO.", "https://www.jasso.go.jp/en/ryugaku/scholarship_j/index.html"));
        return scholarships;
    }

    private static ArrayList<Learn> generateDummyLearn() {
        ArrayList<Learn> learns = new ArrayList<>();
        learns.add(new Learn(R.drawable.app_lingo, "LingoDeer - Learn Languages", "Pemula", new ArrayList<Integer>(Arrays.asList(R.drawable.japan_logo)), "LingoDeer adalah aplikasi pembelajaran bahasa yang menawarkan pendekatan unik dan mandiri dalam mengembangkan keterampilan berbahasa asing. Aplikasi ini diluncurkan pada tahun 2017 dan sejak itu telah membuat dampak besar di pasar pembelajaran bahasa. LingoDeer menyediakan pelajaran yang dikombinasikan dengan antarmuka interaktif yang penuh dengan paparan dan praktik dunia nyata. Dengan fokus pada bahasa Asia seperti Jepang, Korea, dan Mandarin, serta bahasa lainnya, LingoDeer memungkinkan pengguna untuk membentuk kalimat dalam kata-kata mereka sendiri, bukan hanya menghafal dan mengulangi dari buku frasa. Ini memberikan rasa kemajuan yang jelas kepada pengguna dan membantu mereka mempertahankan motivasi jangka Panjang.", "https://play.google.com/store/apps/details?id=com.lingodeer&hl=en_US"));
        learns.add(new Learn(R.drawable.app_cakap, "Cakap", "Mahir", new ArrayList<Integer>(Arrays.asList(R.drawable.japan_logo, R.drawable.british_logo)), "Cakap adalah aplikasi pembelajaran bahasa yang menawarkan kursus online interaktif untuk berbagai bahasa, termasuk Inggris dan Jepang. Dengan pendekatan pembelajaran dua arah, Cakap menghubungkan siswa dengan tutor profesional melalui video call, memungkinkan sesi belajar yang lebih personal dan efektif. Aplikasi ini dirancang untuk semua usia, menyediakan materi yang disesuaikan dengan tingkat kemampuan pengguna, dan menawarkan berbagai program, termasuk persiapan untuk tes kefasihan bahasa seperti TOEFL dan IELTS. Selain itu, Cakap juga berfokus pada upskilling, dengan kursus yang dirancang untuk meningkatkan keterampilan profesional penggunanya.", "https://play.google.com/store/search?q=cakap&c=apps&hl=en_US"));
        learns.add(new Learn(R.drawable.app_renshuu, "Renshuu", "Menengah", new ArrayList<Integer>(Arrays.asList(R.drawable.japan_logo)), "Renshuu adalah aplikasi pembelajaran bahasa Jepang yang menyenangkan dan bebas iklan, dirancang untuk mendukung berbagai gaya belajar dan tujuan. Aplikasi ini menawarkan jalur pembelajaran yang disesuaikan, mulai dari pemula hingga tingkat lanjut, dengan materi yang mencakup kosakata, kanji, dan tata bahasa. Renshuu memiliki lebih dari 10,000 pelajaran yang dibuat oleh pengguna, memungkinkan pembelajaran yang sangat fokus. Dengan lebih dari 15,000 file audio yang direkam oleh penutur asli, 17,000 gambar yang dipilih dengan cermat, dan 160,000 kalimat contoh, Renshuu memudahkan pemahaman kosakata. Sistem kuis yang dirancang khusus untuk bahasa Jepang memecah setiap materi menjadi komponen individu, sehingga pengguna dapat memahami, bukan hanya menghafal.", "https://play.google.com/store/search?q=renshuu&c=apps&hl=en_US"));
        learns.add(new Learn(R.drawable.app_busuu, "Busuu", "Mahir", new ArrayList<Integer>(Arrays.asList(R.drawable.japan_logo, R.drawable.british_logo)), "Busuu adalah platform pembelajaran bahasa yang komprehensif, menawarkan kursus yang dirancang oleh para ahli dalam 14 bahasa yang berbeda, termasuk Jepang dan Inggris. Aplikasi ini memungkinkan pengguna untuk belajar mandiri dengan rencana belajar yang disesuaikan, serta berinteraksi dengan lebih dari 120 juta penutur asli melalui pertukaran bahasa, memberikan umpan balik nyata dan praktik percakapan. Busuu juga menyediakan sesi langsung dengan pengajar ahli dan teknologi pintar untuk membantu pengguna mengulang materi yang perlu diperbaiki. Dengan fokus pada pembelajaran bahasa yang praktis dan interaktif, Busuu membantu pengguna membangun kepercayaan diri untuk percakapan dalam kehidupan nyata, baik untuk tujuan bisnis, perjalanan, sekolah, atau kesenangan.", "https://play.google.com/store/search?q=Busuu&c=apps&hl=en_US"));
        learns.add(new Learn(R.drawable.app_simply, "Simply Learn Japenese", "Pemula", new ArrayList<Integer>(Arrays.asList(R.drawable.japan_logo)), " Simply Learn Japanese adalah aplikasi yang dirancang untuk memudahkan pembelajaran bahasa Jepang dengan cara yang interaktif dan efektif. Aplikasi ini menyediakan lebih dari 1200 frasa dan kata-kata dalam bahasa Jepang yang disajikan dalam tulisan fonetik dan asli Jepang, direkam oleh penutur asli untuk memastikan pengucapan yang akurat. Pengguna dapat menyimpan frasa favorit, belajar kosakata dengan kartu flash menggunakan teknik pengulangan berjarak, dan menguji pengetahuan mereka melalui kuis bahasa. Fitur pencarian cepat memungkinkan akses mudah ke frasa yang dibutuhkan, dan ada juga pilihan untuk memperlambat suara untuk membantu pemahaman.", "https://play.google.com/store/apps/details?id=simply.learn.japanese&hl=en_US"));
        learns.add(new Learn(R.drawable.app_duolingo, "Duolinggo", "Pemula", new ArrayList<Integer>(Arrays.asList(R.drawable.japan_logo, R.drawable.british_logo)), "Duolingo adalah aplikasi pembelajaran bahasa yang populer dan gratis, menawarkan pelajaran singkat yang dirancang untuk membangun keterampilan berbicara, membaca, mendengarkan, dan menulis dalam lebih dari 40 bahasa. Dengan pendekatan yang menyenangkan dan interaktif, Duolingo memungkinkan pengguna untuk belajar dengan cara yang efektif berdasarkan metode ilmiah. Aplikasi ini telah mendapatkan pengakuan luas, termasuk penghargaan sebagai Aplikasi iPhone Terbaik oleh Apple dan terpilih sebagai yang terbaik di Google Play oleh Google. Duolingo juga menyediakan Duolingo English Test, yang merupakan pilihan sertifikasi bahasa yang diterima oleh ribuan institusi di seluruh dunia.", "https://play.google.com/store/search?q=duolingo&c=apps&hl=en_US"));
        learns.add(new Learn(R.drawable.app_heyjapan, "HeyJapan", "Pemula", new ArrayList<Integer>(Arrays.asList(R.drawable.japan_logo)), "HeyJapan adalah aplikasi pembelajaran bahasa Jepang yang dirancang untuk membantu pemula menguasai bahasa dengan efektif. Aplikasi ini menawarkan jalur belajar yang jelas dengan materi penting seperti kata-kata, kanji, tata bahasa dasar, frasa, serta latihan mendengarkan dan berbicara. Dengan berkomitmen belajar 15 hingga 30 menit setiap hari, pengguna dapat melihat perbedaan signifikan dalam 2 hingga 3 bulan. Fitur unik HeyJapan termasuk Shibi chat, yang memungkinkan pengguna untuk menerapkan apa yang telah dipelajari dalam percakapan, dan fitur percakapan Jepang yang baru dikembangkan, yang mendukung praktik komunikasi. Aplikasi ini cocok untuk mereka yang ingin belajar mandiri di rumah, mencari metode efektif untuk belajar bahasa Jepang, dan ingin mempersiapkan diri untuk ujian JLPT.", "https://play.google.com/store/search?q=HeyJapan&c=apps&hl=en_US"));
        return learns;
    }
}