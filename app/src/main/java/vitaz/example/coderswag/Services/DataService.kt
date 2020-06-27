package vitaz.example.coderswag.Services

import vitaz.example.coderswag.Model.Category
import vitaz.example.coderswag.Model.Product

object DataService {
    val categories = listOf(
        Category("SHIRTS", "shirtimage"),
        Category("HOODIES", "hoodieimage"),
        Category("HATS", "hatimage"),
        Category("DIGITAL", "digitalgoodsimage")
    )

    val hats = listOf(
        Product("Devslopes Graphic Beanie", "$18", "hat1",0f),
        Product("Devslopes Hat Black", "$20", "hat2",0f),
        Product("Devslopes Hat White", "$18", "hat3",0f),
        Product("Devslopes Hat Snapback", "$22", "hat4",0f),
        Product("Devslopes Graphic Beanie 2", "$18", "hat1",0f),
        Product("Devslopes Hat Black 2", "$20", "hat2",0f),
        Product("Devslopes Hat White 2", "$18", "hat3",0f),
        Product("Devslopes Hat Snapback 2", "$22", "hat4",0f)

    )

    val hoodies = listOf(
        Product("Devslopes Hoodie Gray", "$28", "hoodie1",0f),
        Product("Devslopes Hoodie Red", "$32", "hoodie2",0f),
        Product("Devslopes Gray Hoodie", "$28", "hoodie3",0f),
        Product("Devslopes Black Hoodie", "$32", "hoodie4",0f),
        Product("Devslopes Hoodie Gray 2", "$28", "hoodie1",0f),
        Product("Devslopes Hoodie Red 2", "$32", "hoodie2",0f),
        Product("Devslopes Gray Hoodie 2", "$28", "hoodie3",0f),
        Product("Devslopes Black Hoodie 2", "$32", "hoodie4",0f)
    )

    val shirts = listOf(
        Product("Devslopes Shirt Black", "$18", "shirt1",0f),
        Product("Devslopes Badge Light Gray", "$20", "shirt2",0f),
        Product("Devslopes Logo Shirt Red", "$22", "shirt3",0f),
        Product("Devslopes Hustle", "$24", "shirt4",0f),
        Product("Kickflip Studios", "$18", "shirt5",0f),
        Product("Devslopes Shirt Black 2", "$18", "shirt1",0f),
        Product("Devslopes Badge Light Gray 2", "$20", "shirt2",0f),
        Product("Devslopes Logo Shirt Red 2", "$22", "shirt3",0f),
        Product("Devslopes Hustle 2", "$24", "shirt4",0f),
        Product("Kickflip Studios 2", "$18", "shirt5",0f)
    )


    val digitalGood = listOf<Product>()

    val listOfProducts = listOf<List<Product>>(shirts, hoodies, hats, digitalGood).flatten()

    fun getProducts(category: String) : List<Product> {
        return when(category) {
            "SHIRTS" -> shirts
            "HATS" -> hats
            "HOODIES" -> hoodies
            else -> digitalGood
        }
    }

}