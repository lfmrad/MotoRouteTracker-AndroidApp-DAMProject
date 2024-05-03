package com.jmblfma.wheely.adapter

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.jmblfma.wheely.fragment.TrackHistoryFragment
import com.jmblfma.wheely.fragment.VehicleFragment
import com.jmblfma.wheely.model.TrackTest
import com.jmblfma.wheely.model.Vehicle

class ProfileViewPagerAdapter (
    fragmentActivity: FragmentActivity,
    private val trackHistoryList: ArrayList<TrackTest>,
    private val vehicleList: ArrayList<Vehicle>
) : FragmentStateAdapter(fragmentActivity) {

    private val TAB_TITLES = arrayOf("History", "Vehicles")

    override fun createFragment(position: Int): Fragment {
        return when (position) {
            0 -> TrackHistoryFragment.newInstance(trackHistoryList)
            1 -> VehicleFragment.newInstance(vehicleList)
            else -> throw IllegalStateException("Unexpected position $position")
        }
    }

    override fun getItemCount(): Int = TAB_TITLES.size

}
