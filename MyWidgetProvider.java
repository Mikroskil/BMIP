package com.example.bmipro2;

import android.app.PendingIntent;
import android.appwidget.AppWidgetManager;
import android.appwidget.AppWidgetProvider;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.widget.RemoteViews;


public class MyWidgetProvider extends AppWidgetProvider {
	@Override
	public void onUpdate(Context context, AppWidgetManager appWidgetManager,
			int[] appWidgetIds) {

		// initializing widget layout
		RemoteViews remoteViews = new RemoteViews(context.getPackageName(),
				R.layout.widget);

		// register for button event
		remoteViews.setOnClickPendingIntent(R.id.sync_button,
				buildButtonPendingIntent(context));

		// updating view with initial data
		remoteViews.setTextViewText(R.id.title, getTitle());
		remoteViews.setTextViewText(R.id.desc, getDesc());

		// request for widget update
		pushWidgetUpdate(context, remoteViews);
	}

	public static PendingIntent buildButtonPendingIntent(Context context) {
		++MyWidgetIntentReceiver.clickCount;

		// initiate widget update request
		Intent intent = new Intent();
		intent.setAction(WidgetUtils.WIDGET_UPDATE_ACTION);
		return PendingIntent.getBroadcast(context, 0, intent,
				PendingIntent.FLAG_UPDATE_CURRENT);
	}

	private static CharSequence getDesc() {
		return "";
	}

	private static CharSequence getTitle() {
		return "Fakta Menarik";
	}

	public static void pushWidgetUpdate(Context context, RemoteViews remoteViews) {
		ComponentName myWidget = new ComponentName(context,
				MyWidgetProvider.class);
		AppWidgetManager manager = AppWidgetManager.getInstance(context);
		manager.updateAppWidget(myWidget, remoteViews);
	}
}
