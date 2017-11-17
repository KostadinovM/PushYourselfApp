package com.example.valentinvaleanu.pushyourself.data;

import android.provider.BaseColumns;

/**
 * Created by Tina on 15-Nov-17.
 */

public class DataContract {
    private DataContract() {
    }

    public class DataEntry implements BaseColumns {
        public static final String TABLE_LEGS_NAME = "legs_exercises";

        public static final String LEGS_ID = BaseColumns._ID;
        public static final String COLUMN_NAME="name";
        public static final String COLUMN_MUSCLE_GROUP="muscle_group";
        public static final String COLUMN_DESCRIPTION="description";
        public static final String COLUMN_DIFFICULTY="difficulty";

        public static final String TABLE_ARMS_NAME = "arms_exercises";
        public static final String ARMS_ID = BaseColumns._ID;


        public static final String TABLE_BACK_NAME = "back_exercises";
        public static final String BACK_ID = BaseColumns._ID;


        public static final String TABLE_ABS_NAME = "abs_exercises";
        public static final String ABS_ID = BaseColumns._ID;


        public static final String TABLE_CHEST_NAME = "chest_exercises";
        public static final String CHEST_ID = BaseColumns._ID;


        public static final String TABLE_CARDIO_NAME = "cardio_exercises";
        public static final String CARDIO_ID = BaseColumns._ID;


    }
}
