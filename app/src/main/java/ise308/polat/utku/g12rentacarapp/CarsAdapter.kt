package ise308.polat.utku.g12rentacarapp

import android.graphics.Color
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class CarsAdapter(private val carList : ArrayList<Cars>) : RecyclerView.Adapter<CarsAdapter.CarsViewHolder>() {


    inner class CarsViewHolder(carsItemView: View) : RecyclerView.ViewHolder(carsItemView) {
        var textViewCarModel = carsItemView.findViewById<TextView>(R.id.tv_car_model)
        var textViewCarType = carsItemView.findViewById<TextView>(R.id.tv_car_type)
        var textViewProductionYear = carsItemView.findViewById<TextView>(R.id.tv_production_year)
        var textViewRentPrice = carsItemView.findViewById<TextView>(R.id.tv_rent_price)
        var textViewRentFlag = carsItemView.findViewById<TextView>(R.id.tv_rent_flag)
        var textViewCarPlate = carsItemView.findViewById<TextView>(R.id.tv_car_plate)


    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CarsViewHolder {

        val carsItemInflater = LayoutInflater.from(parent.context)
        val carsItemView = carsItemInflater.inflate(R.layout.cars_item, parent, false)
        return CarsViewHolder(carsItemView)

    }

    override fun onBindViewHolder(holder: CarsViewHolder, position: Int) {
        val carsForDisplay = carList.get(position)
        holder.textViewCarModel.text = carsForDisplay.getCarModel()
        holder.textViewCarType.text = carsForDisplay.getCarType()
        holder.textViewProductionYear.text = carsForDisplay.getProductionYear().toString()
        holder.textViewRentPrice.text = carsForDisplay.getRentPrice().toString()
        if (carsForDisplay.getRentFlag()) {
            holder.textViewRentFlag.text = "Available"
        } else {
            holder.textViewRentFlag.text = "Not Available"
        }
        holder.textViewCarPlate.text = carsForDisplay.getCarPlate()
    }

    override fun getItemCount() = carList.size


}
