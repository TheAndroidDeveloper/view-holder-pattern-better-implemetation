package com.theandroiddeveloper.viewholderpattern.helper;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.support.annotation.NonNull;

import com.theandroiddeveloper.viewholderpattern.R;
import com.theandroiddeveloper.viewholderpattern.adapter.model.MessageContent;
import com.theandroiddeveloper.viewholderpattern.util.DrawableUtil;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Helper class to work with messaging.
 *
 * @author jonatan.salas
 */
public class MessageHelper {
    private Drawable mDrawable;

    /**
     *  Constructor with parameters
     *
      * @param context - The context where MessageHelper is going to use.
     */
    public MessageHelper(@NonNull final Context context) {
        this.mDrawable = DrawableUtil.modifyDrawableColor(
                context,
                R.drawable.ic_account_circle_black_36dp,
                R.color.teal
        );
    }

    /**
     * Method that returns a hardcoded list of messages.
     *
     * @return a hardcoded list of messages.
     */
    public List getActualMessages() {
        List<MessageContent> messageList = new ArrayList<>();
        MessageContent[] messages = new MessageContent[] {
                new MessageContent()
                        .setImage(mDrawable)
                        .setName("John Doe")
                        .setMessage("Hey, How are you?")
                        .setHour("22:20"),
                new MessageContent()
                        .setImage(mDrawable)
                        .setName("John")
                        .setMessage("What about you?")
                        .setHour("20:12"),
                new MessageContent()
                        .setImage(mDrawable)
                        .setName("Johnny")
                        .setMessage("I´m fine, thanks.")
                        .setHour("19:25"),
                new MessageContent()
                        .setImage(mDrawable)
                        .setName("Larry")
                        .setMessage("Still programming? ")
                        .setHour("01:25"),
                new MessageContent()
                        .setImage(mDrawable)
                        .setName("Manuel")
                        .setMessage("Man, what we do tonight?")
                        .setHour("23:25"),
                new MessageContent()
                        .setImage(mDrawable)
                        .setName("John Doe")
                        .setMessage("Hey, How are you?")
                        .setHour("22:20"),
                new MessageContent()
                        .setImage(mDrawable)
                        .setName("John")
                        .setMessage("What about you?")
                        .setHour("20:12"),
                new MessageContent()
                        .setImage(mDrawable)
                        .setName("Johnny")
                        .setMessage("I´m fine, thanks.")
                        .setHour("19:25"),
                new MessageContent()
                        .setImage(mDrawable)
                        .setName("Larry")
                        .setMessage("Still programming? ")
                        .setHour("01:25"),
                new MessageContent()
                        .setImage(mDrawable)
                        .setName("Manuel")
                        .setMessage("Man, what we do tonight?")
                        .setHour("23:25"),
                new MessageContent()
                        .setImage(mDrawable)
                        .setName("John Doe")
                        .setMessage("Hey, How are you?")
                        .setHour("22:20"),
                new MessageContent()
                        .setImage(mDrawable)
                        .setName("John")
                        .setMessage("What about you?")
                        .setHour("20:12"),
                new MessageContent()
                        .setImage(mDrawable)
                        .setName("Johnny")
                        .setMessage("I´m fine, thanks.")
                        .setHour("19:25"),
                new MessageContent()
                        .setImage(mDrawable)
                        .setName("Larry")
                        .setMessage("Still programming? ")
                        .setHour("01:25"),
                new MessageContent()
                        .setImage(mDrawable)
                        .setName("Manuel")
                        .setMessage("Man, what we do tonight?")
                        .setHour("23:25"),
                new MessageContent()
                        .setImage(mDrawable)
                        .setName("John Doe")
                        .setMessage("Hey, How are you?")
                        .setHour("22:20"),
                new MessageContent()
                        .setImage(mDrawable)
                        .setName("John")
                        .setMessage("What about you?")
                        .setHour("20:12"),
                new MessageContent()
                        .setImage(mDrawable)
                        .setName("Johnny")
                        .setMessage("I´m fine, thanks.")
                        .setHour("19:25"),
                new MessageContent()
                        .setImage(mDrawable)
                        .setName("Larry")
                        .setMessage("Still programming? ")
                        .setHour("01:25"),
                new MessageContent()
                        .setImage(mDrawable)
                        .setName("Manuel")
                        .setMessage("Man, what we do tonight?")
                        .setHour("23:25"),
                new MessageContent()
                        .setImage(mDrawable)
                        .setName("John Doe")
                        .setMessage("Hey, How are you?")
                        .setHour("22:20"),
                new MessageContent()
                        .setImage(mDrawable)
                        .setName("John")
                        .setMessage("What about you?")
                        .setHour("20:12"),
                new MessageContent()
                        .setImage(mDrawable)
                        .setName("Johnny")
                        .setMessage("I´m fine, thanks.")
                        .setHour("19:25"),
                new MessageContent()
                        .setImage(mDrawable)
                        .setName("Larry")
                        .setMessage("Still programming? ")
                        .setHour("01:25"),
                new MessageContent()
                        .setImage(mDrawable)
                        .setName("Manuel")
                        .setMessage("Man, what we do tonight?")
                        .setHour("23:25"),
                new MessageContent()
                        .setImage(mDrawable)
                        .setName("John Doe")
                        .setMessage("Hey, How are you?")
                        .setHour("22:20"),
                new MessageContent()
                        .setImage(mDrawable)
                        .setName("John")
                        .setMessage("What about you?")
                        .setHour("20:12"),
                new MessageContent()
                        .setImage(mDrawable)
                        .setName("Johnny")
                        .setMessage("I´m fine, thanks.")
                        .setHour("19:25"),
                new MessageContent()
                        .setImage(mDrawable)
                        .setName("Larry")
                        .setMessage("Still programming? ")
                        .setHour("01:25"),
                new MessageContent()
                        .setImage(mDrawable)
                        .setName("Manuel")
                        .setMessage("Man, what we do tonight?")
                        .setHour("23:25"),
                new MessageContent()
                        .setImage(mDrawable)
                        .setName("Manuel")
                        .setMessage("Man, what we do tonight?")
                        .setHour("23:25"),
                new MessageContent()
                        .setImage(mDrawable)
                        .setName("John Doe")
                        .setMessage("Hey, How are you?")
                        .setHour("22:20"),
                new MessageContent()
                        .setImage(mDrawable)
                        .setName("John")
                        .setMessage("What about you?")
                        .setHour("20:12"),
                new MessageContent()
                        .setImage(mDrawable)
                        .setName("Johnny")
                        .setMessage("I´m fine, thanks.")
                        .setHour("19:25"),
                new MessageContent()
                        .setImage(mDrawable)
                        .setName("Larry")
                        .setMessage("Still programming? ")
                        .setHour("01:25"),
                new MessageContent()
                        .setImage(mDrawable)
                        .setName("Manuel")
                        .setMessage("Man, what we do tonight?")
                        .setHour("23:25"),
                new MessageContent()
                        .setImage(mDrawable)
                        .setName("John Doe")
                        .setMessage("Hey, How are you?")
                        .setHour("22:20"),
                new MessageContent()
                        .setImage(mDrawable)
                        .setName("John")
                        .setMessage("What about you?")
                        .setHour("20:12"),
                new MessageContent()
                        .setImage(mDrawable)
                        .setName("Johnny")
                        .setMessage("I´m fine, thanks.")
                        .setHour("19:25"),
                new MessageContent()
                        .setImage(mDrawable)
                        .setName("Larry")
                        .setMessage("Still programming? ")
                        .setHour("01:25"),
                new MessageContent()
                        .setImage(mDrawable)
                        .setName("Manuel")
                        .setMessage("Man, what we do tonight?")
                        .setHour("23:25"),
                new MessageContent()
                        .setImage(mDrawable)
                        .setName("John Doe")
                        .setMessage("Hey, How are you?")
                        .setHour("22:20"),
                new MessageContent()
                        .setImage(mDrawable)
                        .setName("John")
                        .setMessage("What about you?")
                        .setHour("20:12"),
                new MessageContent()
                        .setImage(mDrawable)
                        .setName("Johnny")
                        .setMessage("I´m fine, thanks.")
                        .setHour("19:25"),
                new MessageContent()
                        .setImage(mDrawable)
                        .setName("Larry")
                        .setMessage("Still programming? ")
                        .setHour("01:25"),
                new MessageContent()
                        .setImage(mDrawable)
                        .setName("Manuel")
                        .setMessage("Man, what we do tonight?")
                        .setHour("23:25"),
                new MessageContent()
                        .setImage(mDrawable)
                        .setName("John Doe")
                        .setMessage("Hey, How are you?")
                        .setHour("22:20"),
                new MessageContent()
                        .setImage(mDrawable)
                        .setName("John")
                        .setMessage("What about you?")
                        .setHour("20:12"),
                new MessageContent()
                        .setImage(mDrawable)
                        .setName("Johnny")
                        .setMessage("I´m fine, thanks.")
                        .setHour("19:25"),
                new MessageContent()
                        .setImage(mDrawable)
                        .setName("Larry")
                        .setMessage("Still programming? ")
                        .setHour("01:25"),
                new MessageContent()
                        .setImage(mDrawable)
                        .setName("Manuel")
                        .setMessage("Man, what we do tonight?")
                        .setHour("23:25")
        };

        messageList.addAll(Arrays.asList(messages));

        return messageList;
    }
}
