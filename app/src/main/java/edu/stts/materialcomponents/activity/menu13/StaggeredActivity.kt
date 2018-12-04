package edu.stts.materialcomponents.activity.menu13

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.StaggeredGridLayoutManager
import edu.stts.materialcomponents.R
import edu.stts.materialcomponents.activity.menu13.Adapter.StaggeredAdapter
import edu.stts.materialcomponents.utils.Tools
import edu.stts.materialcomponents.activity.menu13.Class.ItemObject
import kotlinx.android.synthetic.main.activity_menu_13_staggered.*


class StaggeredActivity: AppCompatActivity() {

    lateinit var sadapter: StaggeredAdapter


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu_13_staggered)

        var list: List<ItemObject> = getListItemData()
        rv_stag.setHasFixedSize(true)
        rv_stag.layoutManager = StaggeredGridLayoutManager(3, StaggeredGridLayoutManager.VERTICAL)
        sadapter = StaggeredAdapter(list, this)
        rv_stag.adapter = sadapter

        Tools.setSystemBarColor(this, R.color.grey_1000)
    }


    private fun getListItemData(): List<ItemObject> {
        val listViewItems = ArrayList<ItemObject>()
        listViewItems.add(ItemObject("Weedle", R.drawable.weedle))
        listViewItems.add(ItemObject("Plant1", R.drawable.img_plant_1))
        listViewItems.add(ItemObject("Pikachu", R.drawable.pikachu))
        listViewItems.add(ItemObject("Plant2", R.drawable.img_plant_2))
        listViewItems.add(ItemObject("No Internet", R.drawable.img_no_internet_satellite))
        listViewItems.add(ItemObject("Red Bag", R.drawable.image_shop_9))
        listViewItems.add(ItemObject("Shoe", R.drawable.image_shop_8))
        listViewItems.add(ItemObject("Basket", R.drawable.image_22))
        listViewItems.add(ItemObject("Book", R.drawable.image_23))
        listViewItems.add(ItemObject("Mountain", R.drawable.image_27))
        listViewItems.add(ItemObject("City", R.drawable.image_26))
        listViewItems.add(ItemObject("Chair", R.drawable.image_6))

        return listViewItems
    }

}