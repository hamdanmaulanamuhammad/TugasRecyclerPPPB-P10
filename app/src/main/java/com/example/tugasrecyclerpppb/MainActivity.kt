package com.example.tugasrecyclerpppb

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.GridLayoutManager
import com.example.tugasrecyclerpppb.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // Data contoh buku dengan gambar dari drawable
        val booksList = listOf(
            Books(R.drawable.buku1, "Sendiri"),
            Books(R.drawable.buku2, "Suku Penunggang Layang-layang"),
            Books(R.drawable.buku3, "Jengki"),
            Books(R.drawable.buku4, "K Si Pemalas"),
            Books(R.drawable.buku5, "Toki si Kelinci Bertopi"),
            Books(R.drawable.buku6, "Malam yang Menegangkan"),
            Books(R.drawable.buku7, "Apel Emas"),
            Books(R.drawable.buku8, "Bandit Bandit Berkelas"),
            Books(R.drawable.buku9, "Teruslah Bodoh Jangan Pintar"),
            Books(R.drawable.buku10, "Ily"),
            Books(R.drawable.buku11, "Negeri di Ujung Tanduk"),
            Books(R.drawable.buku12, "Daun yang Jatuh Tak Pernah Membenci Angin"),
        )

        with(binding) {
            rvBooks.layoutManager = GridLayoutManager(this@MainActivity, 3)
            rvBooks.adapter = BooksAdapter(booksList)
        }
    }
}
