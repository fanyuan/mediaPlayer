package com.example.demo.remoteview;

import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.content.Context;
import android.os.Build;

import androidx.annotation.RequiresApi;
import androidx.core.app.NotificationCompat;

public class RemoteViewUtil {
    @RequiresApi(api = Build.VERSION_CODES.O)
    public static void create(Context context){
        String channelID = "1";
        String channelName = "channel_name";

        NotificationChannel channel = new NotificationChannel(channelID, channelName, NotificationManager.IMPORTANCE_HIGH);

        NotificationManager manager = (NotificationManager) context.getSystemService(Context.NOTIFICATION_SERVICE);

        manager.createNotificationChannel(channel);
// 利用channelName可以在系统设置页面对app某个名称的通知进行管理
        NotificationCompat.Builder builder =new NotificationCompat.Builder(context, channelName);
        builder.setContentText("msgDesc");
        builder.setContentTitle("msgTitle");

//创建通知时指定channelID
        builder.setChannelId(channelID);
        Notification notification = builder.build();

        //NotificationManager manager = context.getSystemService(Context.NOTIFICATION_SERVICE);
        manager.notify(1, notification);
    }
}
