package com.example.wikifate.ui.adapters

import android.content.Context
import android.media.Image
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.ImageView
import com.example.wikifate.data.Servant

class ServantListAdapter(context: Context, resource: Int, servants: MutableList<Servant>) :
    ArrayAdapter<Servant>(context, resource, servants) {
    private val inflater: LayoutInflater=context.getSystemService(Context.LAYOUT_INFLATER_SERVICE)
            as LayoutInflater

    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
        return super.getView(position, convertView, parent)
    }

    private class viewHolder{
        private var image: ImageView
    }
}