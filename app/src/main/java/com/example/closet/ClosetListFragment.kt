package com.example.closet

import android.content.Context
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import java.util.*

class ClosetListFragment: Fragment() {
    /**
     * Required interface for hosting activities
     * 1. Define Callbacks with a single callback function
     */
    interface Callbacks {
        fun onClothingItemSelected(clothingItemId: UUID)
    }

    /**
     * 2. Declare a Callback variable to hold the objet that implements Callbacks
     */
    private var callbacks: Callbacks? = null

    /**
     * Update EditClothingPageFragment
     */

    private lateinit var closetRecyclerView: RecyclerView
    private var adapter: ClothingItemAdapter? = ClothingItemAdapter(emptyList())
    private val closetListViewModel: ClosetViewModel by lazy {
        ViewModelProvider(this).get(ClosetViewModel::class.java)
    }

    /**
     * Override onAttch() to set the callbacks property.
     */
    override fun onAttach(context: Context) {
        super.onAttach(context)
        callbacks = context as Callbacks?
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        //Should we inflate EditCLothingList or Closet Recycler view?
        val view = inflater.inflate(R.layout.closet_list_recycler_view,container,false)
        closetRecyclerView = view.findViewById(R.id.closet_list_recycler_view_id) as RecyclerView
        closetRecyclerView.adapter = adapter
        closetRecyclerView.layoutManager = LinearLayoutManager(context)
        return view
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        closetListViewModel.clothingItemListLiveData.observe(
            viewLifecycleOwner,
            Observer { clothingItems->
                clothingItems?.let {
                    updateUI(clothingItems)
                }
            }
        )
    }

    /**
     * Override onDetach to unset the callbacks property.
     */

    override fun onDetach() {
        super.onDetach()
        callbacks = null
    }

    private inner class ClothingItemHolder(view: View) :
        RecyclerView.ViewHolder(view), View.OnClickListener {
        //Add images from camera. Store them in this container. Currently grabbing static data ClothingTitle header.
        private lateinit var clothingItem: ClothingItem

        // Clothing Items data to edit, and display.
        private val clothingTypeTextView: TextView = itemView.findViewById(R.id.clothing_type)
        private val clothingColorTextView: TextView = itemView.findViewById(R.id.clothing_color)
        private val clothingDescriptionTextView: TextView = itemView.findViewById(R.id.clothing_description)

        init {
            itemView.setOnClickListener(this)
        }

        fun bind(clothingItem: ClothingItem) {
            this.clothingItem = clothingItem
            clothingTypeTextView.text = this.clothingItem.clothingType
            clothingColorTextView.text = this.clothingItem.color
            clothingDescriptionTextView.text = this.clothingItem.description
        }

        override fun onClick(V: View) {
            callbacks?.onClothingItemSelected(clothingItem.id)
        }
    }

    /**
     * Creating a Fragment Adapter for Closet_list_item. NOT THE Recycler View.
     */
    private inner class ClothingItemAdapter(var clothingItems: List<ClothingItem>)
        : RecyclerView.Adapter<ClothingItemHolder>() {

        override fun onCreateViewHolder(parent: ViewGroup, viewType: Int)
            : ClothingItemHolder {
            val view = layoutInflater.inflate(R.layout.closet_list_item, parent, false)
            return ClothingItemHolder(view)
        }

        override fun getItemCount() = clothingItems.size

        override fun onBindViewHolder(holder: ClothingItemHolder, position: Int) {
            val clothingItem = clothingItems[position]
            holder.bind(clothingItem)
        }
    }


    private fun updateUI(clothingItems: List<ClothingItem>) {
        adapter = ClothingItemAdapter(clothingItems)
        closetRecyclerView.adapter = adapter
    }

    companion object {
        fun newInstance(): ClosetListFragment {
            return ClosetListFragment()
        }
    }
}