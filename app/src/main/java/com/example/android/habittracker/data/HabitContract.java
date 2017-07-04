package com.example.android.habittracker.data;

import android.provider.BaseColumns;

/**
 * Created by Kristine on 04.07.2017.
 */

public final class HabitContract {

    private HabitContract(){}

    public static abstract class HabitEntry implements BaseColumns{

        public static final String TABLE_NAME = "habits";
        public static final String _ID = BaseColumns._ID;
        public static final String COLUMN_HABIT_NAME= "habit";
        public static final String COLUMN_HABIT_AMOUNT = "amount";

    }
}
