package edu.stts.materialcomponents.utils

import android.app.Activity
import android.app.Dialog
import android.content.*
import android.content.res.Resources
import android.graphics.Bitmap
import android.graphics.Color
import android.graphics.PorterDuff
import android.net.Uri
import android.os.Build
import android.support.annotation.ColorInt
import android.support.annotation.ColorRes
import android.support.annotation.DrawableRes
import android.support.v4.content.ContextCompat
import android.support.v4.graphics.drawable.RoundedBitmapDrawableFactory
import android.support.v4.widget.NestedScrollView
import android.support.v7.widget.Toolbar
import android.util.TypedValue
import android.view.Menu
import android.view.View
import android.view.WindowManager
import android.widget.ImageView
import android.widget.Toast
import com.bumptech.glide.Glide
import com.bumptech.glide.load.engine.DiskCacheStrategy
import com.bumptech.glide.request.target.BitmapImageViewTarget
import com.google.android.gms.maps.GoogleMap
import edu.stts.materialcomponents.R
import java.text.SimpleDateFormat
import java.util.*

object Tools {

    fun setSystemBarColor(act: Activity) {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            val window = act.window
            window.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS)
            window.clearFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS)
            window.statusBarColor = act.resources.getColor(R.color.colorPrimaryDark)
        }
    }

    fun setSystemBarColor(act: Activity, @ColorRes color: Int) {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            val window = act.window
            window.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS)
            window.clearFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS)
            window.statusBarColor = act.resources.getColor(color)
        }
    }

    fun setSystemBarColorDialog(act: Context, dialog: Dialog, @ColorRes color: Int) {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            val window = dialog.window
            window!!.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS)
            window.clearFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS)
            window.statusBarColor = act.resources.getColor(color)
        }
    }

    fun setSystemBarLight(act: Activity) {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
            val view = act.findViewById<View>(android.R.id.content)
            var flags = view.systemUiVisibility
            flags = flags or View.SYSTEM_UI_FLAG_LIGHT_STATUS_BAR
            view.systemUiVisibility = flags
        }
    }

    fun setSystemBarLightDialog(dialog: Dialog) {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
            val view = dialog.findViewById<View>(android.R.id.content)
            var flags = view.systemUiVisibility
            flags = flags or View.SYSTEM_UI_FLAG_LIGHT_STATUS_BAR
            view.systemUiVisibility = flags
        }
    }

    fun clearSystemBarLight(act: Activity) {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
            val window = act.window
            window.statusBarColor = ContextCompat.getColor(act, R.color.colorPrimaryDark)
        }
    }

    /**
     * Making notification bar transparent
     */
    fun setSystemBarTransparent(act: Activity) {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            val window = act.window
            window.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS)
            window.statusBarColor = Color.TRANSPARENT
        }
    }

    fun displayImageOriginal(ctx: Context, img: ImageView, @DrawableRes drawable: Int) {
        try {
            Glide.with(ctx).load(drawable)
                .crossFade()
                .diskCacheStrategy(DiskCacheStrategy.NONE)
                .into(img)
        } catch (e: Exception) {
        }

    }

    /*fun displayImageRound(ctx: Context, img: ImageView, @DrawableRes drawable: Int) {
        try {
            Glide.with(ctx).load(drawable).asBitmap().centerCrop().into<>(object : BitmapImageViewTarget(img) {
                override fun setResource(resource: Bitmap) {
                    val circularBitmapDrawable = RoundedBitmapDrawableFactory.create(ctx.resources, resource)
                    circularBitmapDrawable.isCircular = true
                    img.setImageDrawable(circularBitmapDrawable)
                }
            })
        } catch (e: Exception) {
        }

    }*/

    fun displayImageOriginal(ctx: Context, img: ImageView, url: String) {
        try {
            Glide.with(ctx).load(url)
                .crossFade()
                .diskCacheStrategy(DiskCacheStrategy.NONE)
                .into(img)
        } catch (e: Exception) {
        }

    }

    fun getFormattedDateSimple(dateTime: Long?): String {
        val newFormat = SimpleDateFormat("MMMM dd, yyyy")
        return newFormat.format(Date(dateTime!!))
    }

    fun getFormattedDateEvent(dateTime: Long?): String {
        val newFormat = SimpleDateFormat("EEE, MMM dd yyyy")
        return newFormat.format(Date(dateTime!!))
    }

    fun getFormattedTimeEvent(time: Long?): String {
        val newFormat = SimpleDateFormat("h:mm a")
        return newFormat.format(Date(time!!))
    }

    fun getEmailFromName(name: String?): String? {
        return if (name != null && name != "") {
            name.replace(" ".toRegex(), ".").toLowerCase() + "@mail.com"
        } else name
    }

    fun dpToPx(c: Context, dp: Int): Int {
        val r = c.resources
        return Math.round(TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, dp.toFloat(), r.displayMetrics))
    }

    fun configActivityMaps(googleMap: GoogleMap): GoogleMap {
        // set map type
        googleMap.mapType = GoogleMap.MAP_TYPE_NORMAL
        // Enable / Disable zooming controls
        googleMap.uiSettings.isZoomControlsEnabled = false

        // Enable / Disable Compass icon
        googleMap.uiSettings.isCompassEnabled = true
        // Enable / Disable Rotate gesture
        googleMap.uiSettings.isRotateGesturesEnabled = true
        // Enable / Disable zooming functionality
        googleMap.uiSettings.isZoomGesturesEnabled = true

        googleMap.uiSettings.isScrollGesturesEnabled = true
        googleMap.uiSettings.isMapToolbarEnabled = true

        return googleMap
    }

    fun copyToClipboard(context: Context, data: String) {
        val clipboard = context.getSystemService(Context.CLIPBOARD_SERVICE) as ClipboardManager
        val clip = ClipData.newPlainText("clipboard", data)
        clipboard.primaryClip = clip
        Toast.makeText(context, "Text copied to clipboard", Toast.LENGTH_SHORT).show()
    }

    fun nestedScrollTo(nested: NestedScrollView, targetView: View) {
        nested.post { nested.scrollTo(500, targetView.bottom) }
    }

    fun dip2px(context: Context, dpValue: Float): Int {
        val scale = context.resources.displayMetrics.density
        return (dpValue * scale + 0.5f).toInt()
    }

    fun px2dip(context: Context, pxValue: Float): Int {
        val scale = context.resources.displayMetrics.density
        return (pxValue / scale + 0.5f).toInt()
    }

    fun toggleArrow(view: View): Boolean {
        if (view.rotation == 0f) {
            view.animate().setDuration(200).rotation(180f)
            return true
        } else {
            view.animate().setDuration(200).rotation(0f)
            return false
        }
    }

    fun toggleArrow(show: Boolean, view: View): Boolean {
        return toggleArrow(show, view, true)
    }

    fun toggleArrow(show: Boolean, view: View, delay: Boolean): Boolean {
        if (show) {
            view.animate().setDuration((if (delay) 200 else 0).toLong()).rotation(180f)
            return true
        } else {
            view.animate().setDuration((if (delay) 200 else 0).toLong()).rotation(0f)
            return false
        }
    }

    fun changeNavigateionIconColor(toolbar: Toolbar, @ColorInt color: Int) {
        val drawable = toolbar.navigationIcon
        drawable!!.mutate()
        drawable.setColorFilter(color, PorterDuff.Mode.SRC_ATOP)
    }

    fun changeMenuIconColor(menu: Menu, @ColorInt color: Int) {
        for (i in 0 until menu.size()) {
            val drawable = menu.getItem(i).icon ?: continue
            drawable.mutate()
            drawable.setColorFilter(color, PorterDuff.Mode.SRC_ATOP)
        }
    }

    fun changeOverflowMenuIconColor(toolbar: Toolbar, @ColorInt color: Int) {
        try {
            val drawable = toolbar.overflowIcon
            drawable!!.mutate()
            drawable.setColorFilter(color, PorterDuff.Mode.SRC_ATOP)
        } catch (e: Exception) {
        }

    }

    fun getScreenWidth(): Int {
        return Resources.getSystem().displayMetrics.widthPixels
    }

    fun getScreenHeight(): Int {
        return Resources.getSystem().displayMetrics.heightPixels
    }

    /*fun toCamelCase(input: String): String {
        var input = input
        input = input.toLowerCase()
        val titleCase = StringBuilder()
        var nextTitleCase = true

        for (c in input.toCharArray()) {
            if (Character.isSpaceChar(c)) {
                nextTitleCase = true
            } else if (nextTitleCase) {
                c = Character.toTitleCase(c)
                nextTitleCase = false
            }

            titleCase.append(c)
        }

        return titleCase.toString()
    }*/

    fun insertPeriodically(text: String, insert: String, period: Int): String {
        val builder = StringBuilder(text.length + insert.length * (text.length / period) + 1)
        var index = 0
        var prefix = ""
        while (index < text.length) {
            builder.append(prefix)
            prefix = insert
            builder.append(text.substring(index, Math.min(index + period, text.length)))
            index += period
        }
        return builder.toString()
    }


    fun rateAction(activity: Activity) {
        val uri = Uri.parse("market://details?id=" + activity.packageName)
        val goToMarket = Intent(Intent.ACTION_VIEW, uri)
        try {
            activity.startActivity(goToMarket)
        } catch (e: ActivityNotFoundException) {
            activity.startActivity(
                Intent(
                    Intent.ACTION_VIEW,
                    Uri.parse("https://play.google.com/store/apps/details?id=com.fingerspot.kitaschool")
                )
            )
        }

    }

}