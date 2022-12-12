package com.app.project2_alarm_jam.sahruljob21

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    val list = ArrayList<Kelas>()
    val listKelas = arrayOf(
        "MUHAMMAD KHUSNU MAROM" ,
        "MUHAMMAD HUDA GUNAWAN",
        "MUTMAINAH SEPTIARINI",
        "NASYWA SUKRIA HANIFA",
        "NOR HIDAYAH",
        "NOVITA SARI",
        "NUR IZZA",
        "RISKA ANGGUN",
        "SAHRUL LUKMAN HAKIM",
        "SETYA NENG RAHAYU",
        "SITI AGNIA AMALIA"
    )
    lateinit var kelasView: RecyclerView
    lateinit var kelasAdapter: KelasAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        kelasView = findViewById(R.id.kelasView)
        kelasView.layoutManager = LinearLayoutManager(this)

        for (i in listKelas.indices) {
            list.add(Kelas(listKelas[i]))
        }

        kelasAdapter = KelasAdapter(list)
        kelasAdapter.notifyDataSetChanged()
        kelasView.adapter = kelasAdapter
    }
}