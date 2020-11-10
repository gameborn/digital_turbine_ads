package com.digitalturbine.dtproductlist

import androidx.test.ext.junit.rules.ActivityScenarioRule
import androidx.test.ext.junit.runners.AndroidJUnit4
import org.junit.Before
import org.junit.Rule
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4::class)
class AutomatedUITests
{
    @get:Rule var activityRule = ActivityScenarioRule(MainActivity::class.java)

    @Before
    fun initTest()
    {

    }
}