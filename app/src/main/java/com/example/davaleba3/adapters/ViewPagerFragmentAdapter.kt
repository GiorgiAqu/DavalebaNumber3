package com.example.davaleba3.adapters

import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.example.davaleba3.Fragments.FirstFragment
import com.example.davaleba3.Fragments.SecondFragment
import com.example.davaleba3.Fragments.ThirdFragment

class ViewPagerFragmentAdapter(activity: AppCompatActivity): FragmentStateAdapter(activity){
    override fun getItemCount() = 3

    override fun createFragment(position: Int): Fragment {
   if(position == 0) {
       return FirstFragment()}
       else if(position == 1){
           return SecondFragment()}
        else{return ThirdFragment()}
       }
   }
