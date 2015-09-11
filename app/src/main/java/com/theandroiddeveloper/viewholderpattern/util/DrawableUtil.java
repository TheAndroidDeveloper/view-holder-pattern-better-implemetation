package com.theandroiddeveloper.viewholderpattern.util;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.support.annotation.ColorRes;
import android.support.annotation.DrawableRes;
import android.support.annotation.NonNull;
import android.support.v4.content.ContextCompat;

import com.theandroiddeveloper.viewholderpattern.R;

/**
 * Utility class to work with drawables.
 *
 * @author jonatan.salas
 */
public class DrawableUtil {

    /**
     * Util method that modifies the drawable color.
     *
     * @param context - context used to get the drawable and the color.
     * @param drawableId - the id of the drawable to get.
     * @param colorId - the id of the color to get.
     * @return a drawable with color modified.
     */
    public static Drawable modifyDrawableColor(@NonNull final Context context,
                                               @DrawableRes final int drawableId,
                                               @ColorRes final int colorId) {

        Drawable coloredDrawable = ContextCompat.getDrawable(context, drawableId);
        final int color = ContextCompat.getColor(context, colorId);

        //This is the better way to apply a particular color to a drawable.
        coloredDrawable.setColorFilter(color, PorterDuff.Mode.SRC_ATOP);

        return coloredDrawable;
    }
}
