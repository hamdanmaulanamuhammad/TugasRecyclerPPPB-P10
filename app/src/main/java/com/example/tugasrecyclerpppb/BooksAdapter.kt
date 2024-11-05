package com.example.tugasrecyclerpppb

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.tugasrecyclerpppb.databinding.ItemBooksBinding

class BooksAdapter(private val books: List<Books>) : RecyclerView.Adapter<BooksAdapter.BooksViewHolder>() {

    inner class BooksViewHolder(private val binding: ItemBooksBinding) : RecyclerView.ViewHolder(binding.root) {
        fun bind(book: Books) {
            with(binding) {
                imgBook.setImageResource(book.img)
                titleBook.text = book.title
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): BooksViewHolder {
        val binding = ItemBooksBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return BooksViewHolder(binding)
    }

    override fun onBindViewHolder(holder: BooksViewHolder, position: Int) {
        holder.bind(books[position])
    }

    override fun getItemCount(): Int = books.size
}
