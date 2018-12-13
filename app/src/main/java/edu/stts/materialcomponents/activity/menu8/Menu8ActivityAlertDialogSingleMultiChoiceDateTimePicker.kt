package edu.stts.materialcomponents.activity.menu8

import android.app.DatePickerDialog
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.View
import android.app.TimePickerDialog
import android.icu.util.Calendar
import android.widget.Toast
import edu.stts.materialcomponents.R
import android.support.v7.app.AlertDialog
import android.content.DialogInterface
import android.graphics.Color
import android.os.Build
import android.support.annotation.RequiresApi
import android.support.design.widget.BottomSheetDialog
import android.widget.DatePicker
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_menu_8.*
import kotlinx.android.synthetic.main.activity_menu_8.view.*
import java.text.DateFormat
import java.util.*

class Menu8Activity: AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu_8)

        val mSlctdTxtTv = findViewById<TextView>(R.id.txtViewMulti)
        btn_multiChoice.setOnClickListener {
            val builder = AlertDialog.Builder(this@Menu8Activity)
            val colorsArray = arrayOf("Harta", "Tahta", "Wanita", "Wisuda", "Miliyarder", "Kere")
            val checkedColorsArray = booleanArrayOf(true,
                false,
                false,
                true,
                false,
                false
            )

            val colorsList = Arrays.asList(*colorsArray)
            builder.setTitle("Pilih")
            builder.setMultiChoiceItems(colorsArray, checkedColorsArray) { dialog, which, isChecked ->
                checkedColorsArray[which] = isChecked
                val currentItem = colorsList[which]
                Toast.makeText(applicationContext, currentItem + " " + isChecked, Toast.LENGTH_SHORT).show()
            }
            builder.setPositiveButton("OK") { dialog, which ->
                mSlctdTxtTv.text = "Pilihan Anda..... \n"
                for (i in checkedColorsArray.indices) {
                    val checked = checkedColorsArray[i]
                    if (checked) {
                        mSlctdTxtTv.text = mSlctdTxtTv.text.toString() + colorsList[i] + "\n"
                    }
                }
            }

            builder.setNeutralButton("Cancel") { dialog, which ->
            }
            val dialog = builder.create()
            dialog.show()
        }

        btn_singleChoice.setOnClickListener {

            val listItems = arrayOf("Harta", "Tahta", "Wanita", "Wisuda")
            val mBuilder = AlertDialog.Builder(this@Menu8Activity)
            mBuilder.setTitle("Pilihan Hidup")
            mBuilder.setSingleChoiceItems(listItems, -1) { dialogInterface, i ->
                txtView.text = listItems[i]
                dialogInterface.dismiss()
            }
            // Set the neutral/cancel button click listener
            mBuilder.setNeutralButton("Cancel") { dialog, which ->
                // Do something when click the neutral button
                dialog.cancel()
            }

            val mDialog = mBuilder.create()
            mDialog.show()
        }

        btn_alert.setOnClickListener{
            val builder = AlertDialog.Builder(this@Menu8Activity)
            builder.setTitle("Alert Dialog")
            builder.setMessage("Apakah Anda Jomblo Bawaan Lahir??")
            builder.setPositiveButton("YES"){dialog, which ->
                Toast.makeText(applicationContext,"Kasihan Sekali Kau Ferguso!!",Toast.LENGTH_SHORT).show()
            }
            builder.setNegativeButton("No"){dialog,which ->
                Toast.makeText(applicationContext,"Selamat!",Toast.LENGTH_SHORT).show()
            }
            val dialog: AlertDialog = builder.create()
            dialog.show()
        }
    }

    @RequiresApi(Build.VERSION_CODES.N)
    fun clickTimePicker(view: View) {
        val c = Calendar.getInstance()
        val hour = c.get(Calendar.HOUR)
        val minute = c.get(Calendar.MINUTE)

        val tpd = TimePickerDialog(this,TimePickerDialog.OnTimeSetListener(function = { view, h, m ->

            Toast.makeText(this, h.toString() + " : " + m +" : " , Toast.LENGTH_LONG).show()

        }),hour,minute,false)

        tpd.show()
    }


    @RequiresApi(Build.VERSION_CODES.N)
    fun clickDatePicker(view: View) {
        val c = Calendar.getInstance()
        val year = c.get(Calendar.YEAR)
        val month = c.get(Calendar.MONTH)
        val day = c.get(Calendar.DAY_OF_MONTH)

        val dpd = DatePickerDialog(this, DatePickerDialog.OnDateSetListener { view, year, monthOfYear, dayOfMonth ->
            // Display Selected date in Toast
            Toast.makeText(this, """$dayOfMonth - ${monthOfYear + 1} - $year""", Toast.LENGTH_LONG).show()

        }, year, month, day)
        dpd.show()
    }





}