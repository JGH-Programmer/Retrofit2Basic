package git.myapplication.retrofit2basic

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.RecyclerView
import git.myapplication.retrofit2basic.databinding.ItemEmgmedBinding

class EmgMedResponse : androidx.recyclerview.widget.ListAdapter<EmgMedResponseItem, EmgMedResponse.EmgMedViewHolder>(EmgmedCallback){

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): EmgMedViewHolder {
        val binding = ItemEmgmedBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return EmgMedViewHolder(binding)
    }

    override fun onBindViewHolder(holder: EmgMedViewHolder, position: Int) {
        holder.bind(getItem(position))
    }
    class EmgMedViewHolder(private val binding: ItemEmgmedBinding) : RecyclerView.ViewHolder(binding.root){
        fun bind(item: EmgMedResponseItem){
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
        private val EmgmedCallback = object : DiffUtil.ItemCallback<EmgMedResponseItem>(){
            override fun areItemsTheSame(
                oldItem: EmgMedResponseItem,
                newItem: EmgMedResponseItem
            ): Boolean {
                return oldItem.hashCode() == newItem.hashCode()
            }

            override fun areContentsTheSame(
                oldItem: EmgMedResponseItem,
                newItem: EmgMedResponseItem
            ): Boolean {
                return oldItem == newItem
            }
        }

    }



}