package vitaz.example.coderswag.Controller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_description.*
import vitaz.example.coderswag.Model.Product
import vitaz.example.coderswag.R
import vitaz.example.coderswag.Utilities.EXTRA_ITEM

class DescriptionActivity : AppCompatActivity() {

    lateinit var item : Product

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_description)
        item = intent.getParcelableExtra(EXTRA_ITEM)

        val resourceId = resources.getIdentifier(item.image, "drawable", packageName)
        itemImageView.setImageResource(resourceId)
        itemTitleView.text = item.title
        itemPriceView.text = item.price



    }
}