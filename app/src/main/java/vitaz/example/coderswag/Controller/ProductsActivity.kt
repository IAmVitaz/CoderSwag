package vitaz.example.coderswag.Controller

import android.content.Intent
import android.content.res.Configuration
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import kotlinx.android.synthetic.main.activity_products.*
import vitaz.example.coderswag.Adapters.ProductsAdapter
import vitaz.example.coderswag.R
import vitaz.example.coderswag.Services.DataService
import vitaz.example.coderswag.Utilities.EXTRA_CATEGORY
import vitaz.example.coderswag.Utilities.EXTRA_ITEM

class ProductsActivity : AppCompatActivity() {

    lateinit var adapter: ProductsAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_products)

        val categoryType = intent.getStringExtra(EXTRA_CATEGORY)
        adapter = ProductsAdapter(this, DataService.getProducts(categoryType)) {item ->
            val descriptionIntent = Intent(this, DescriptionActivity::class.java)
            descriptionIntent.putExtra(EXTRA_ITEM, item)
            startActivity(descriptionIntent)
        }

        var spanCount = 2
        val orientation = resources.configuration.orientation
        if (orientation == Configuration.ORIENTATION_LANDSCAPE) {
            spanCount = 3
        }

        val screenSize = resources.configuration.screenWidthDp
        if (screenSize > 720) {
            spanCount = 3
        }

        val layoutManager = GridLayoutManager(this, spanCount)
        productListView.layoutManager = layoutManager
        productListView.adapter = adapter


    }
}

