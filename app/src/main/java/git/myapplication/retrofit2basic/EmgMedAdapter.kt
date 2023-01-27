package git.myapplication.retrofit2basic

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import git.myapplication.retrofit2basic.databinding.ItemEmgmedBinding

class EmgMedAdapter : ListAdapter<Row, EmgMedAdapter.EmgMedViewHolder>(DiffCallback){

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): EmgMedViewHolder {
        val binding = ItemEmgmedBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return EmgMedViewHolder(binding)
    }

    override fun onBindViewHolder(holder: EmgMedViewHolder, position: Int) {
        holder.bind(getItem(position))
    }
    class EmgMedViewHolder(private val binding: ItemEmgmedBinding) : RecyclerView.ViewHolder(binding.root){
        fun bind(item: Row){
            with(binding){
                tvName.text = item.iNSTNM
                tvType.text = item.jURISDNM
                tvPhone.text = item.iNSTTELNO
                tvAddr.text = item.rEFINELOTNOADDR
                tvWgs84lat.text = "위도: ${item.rEFINEWGS84LAT}"
                tvWgs84lon.text = "경도: ${item.rEFINEWGS84LOGT}"
            }
        }
    }

    companion object{
        private val DiffCallback = object : DiffUtil.ItemCallback<Row>(){
            override fun areItemsTheSame(
                oldItem: Row,
                newItem: Row
            ): Boolean {
                return oldItem.hashCode() == newItem.hashCode()
            }

            override fun areContentsTheSame(
                oldItem: Row,
                newItem: Row
            ): Boolean {
                return oldItem == newItem
            }
        }

    }



}