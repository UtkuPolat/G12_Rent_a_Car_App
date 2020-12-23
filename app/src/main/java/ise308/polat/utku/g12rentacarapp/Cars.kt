package ise308.polat.utku.g12rentacarapp

class Cars constructor(                 // Base Class For Renting Cars
    private var carModel : String,
    private var carType : String,
    private var productionYear : Int,
    private var rentPrice : Double,
    private var rentFlag : Boolean,     // Is the selected car available for renting or not?
    private var carPlate: String) {

    fun getCarModel(): String {
        return this.carModel
    }
    fun getCarType(): String {
        return this.carType
    }
    fun getProductionYear(): Int {
        return this.productionYear
    }
    fun getRentPrice(): Double {
        return this.rentPrice
    }
    fun getRentFlag(): Boolean {
        return this.rentFlag
    }
    fun getCarPlate(): String {
        return this.carPlate
    }

}