package com.example.uts_mobile

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.detail.*


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val data = createFac()
        rv_list_main.layoutManager = LinearLayoutManager(this)
        rv_list_main.setHasFixedSize(true)
        rv_list_main.adapter = FacAdapter(data, { onItem: FacData ->
            onItemClicked(onItem) })
    }
    private fun onItemClicked(onItem: FacData) {
        val showDetailActivityIntent = Intent(this, FacDetail::class.java)
        showDetailActivityIntent.putExtra(Intent.EXTRA_TEXT, onItem.gambar_fakultas)
        showDetailActivityIntent.putExtra(Intent.EXTRA_TITLE, onItem.nama_fakultas)
        showDetailActivityIntent.putExtra(Intent.EXTRA_TEMPLATE, onItem.deskripsi_fakultas)
        showDetailActivityIntent.putExtra(Intent.EXTRA_SUBJECT, onItem.list_prodi)
        startActivity(showDetailActivityIntent)
    }

    private fun createFac(): List<FacData> {
        val pesan =" merupakan salah satu dari Fakultas di UPN \"Veteran\" Jawa Timur. Yang terdiri dari program studi:"
        val rvList = ArrayList<FacData>()
        rvList.add(
            FacData(
                R.drawable.logoupnbaru,
                "Fakultas Ilmu Komputer",
                "Fakultas Ilmu Komputer" + pesan,
                "1. Informatika\n" +
                        "2. Sistem Informasi"
            )
        )
        rvList.add(
            FacData(
                R.drawable.logoupnbaru,
                "Fakultas Teknik",
                "Fakultas Teknik"+pesan,
                "1. Teknik Sipil\n" +
                        "2. Teknologi Pangan\n" +
                        "3. Teknik Industri\n" +
                        "4. Teknik Lingkungan\n" +
                        "5. Teknik Kimia"
            )
        )
        rvList.add(
            FacData(
                R.drawable.logoupnbaru,
                "Fakultas Ekonomi dan Bisnis",
                "Fakultas Ekonomi dan Bisnis"+pesan,
                "1. Akuntansi\n" +
                        "2. Manajemen\n" +
                        "3. Ekonomi Pembangunan"
            )
        )
        rvList.add(
            FacData(
                R.drawable.logoupnbaru,
                "Fakultas Pertanian",
                "Fakultas Pertanian"+pesan,
                "1. Agribisnis\n" +
                        "2. Agroteknologi"
            )
        )
        rvList.add(
            FacData(
                R.drawable.logoupnbaru,
                "Profil",
                "Name : Helmy kurniawan\n"+
                        "Tempat,Tanggal Lahir : 10 September 1999\n" +
                        "Alamat : Rungkut, Surabaya\n" +
                        "Telpon : 08993704720\n" +
                        "Email : helmykurniawan1313@gmail.com\n" +
                        "Github : https://github.com/helmykurniawan1313\n",
                "Pendidikan : \n" +
                        "1. SDN Medokan Ayu 1/270 \n" +
                        "2. SMPN 35 Surabaya \n" +
                        "3. SMKN 10 Surabaya Jurusan Multimedia"
            )
        )
        return rvList
    }}