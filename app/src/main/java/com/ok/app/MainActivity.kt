package com.ok.app

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.LongSparseArray
import android.util.SparseArray
import java.lang.RuntimeException
import kotlin.collections.HashMap

class MainActivity : AppCompatActivity() {

    val userMap = HashMap<Integer,String>()

    val userArray = SparseArray<String>()

    val sparseArray = SparseArray<String>()
    val longSparseArray = LongSparseArray<String>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        sparseArray.append(1,"a")
        sparseArray.put(2,"b")


        val array = SparseArray<String>()
        array.put(1,"a")
        array.put(2,"b")
        array.put(3,"c")


//        ContainerHelpers.binarySearch(array,3,"b")

    }

    fun mapPerformance(){

        val hashMap = HashMap<Int, String>()
        val startTime = System.currentTimeMillis()

        for (index in 1..10000){
            hashMap.put(index, index.toString())
        }

        val totalMemory = Runtime.getRuntime().totalMemory()
        val endTime = System.currentTimeMillis()

        System.out.println("【""】")

    }
}
