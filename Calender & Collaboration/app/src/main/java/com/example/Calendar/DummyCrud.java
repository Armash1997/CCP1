package com.example.Calendar;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;


public class CalendarActivity extends AppCompatActivity {
    private List<CalendarEvent> events;
    private CalendarEventAdapter adapter;

    // Initialize UI elements and data structures

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calendar);

        // Initialize UI elements and data structures

        // Create event
        CalendarEvent newEvent = new CalendarEvent();
        newEvent.setTitle("Meeting");
        newEvent.setDate(new Date());
        newEvent.setStartTime("9:00 AM");
        newEvent.setEndTime("10:30 AM");
        newEvent.setLocation("Conference Room");
        newEvent.setNotes("Discussion on project updates");
        createEvent(newEvent);

        // Read all events
        events = getAllEvents();
        adapter = new CalendarEventAdapter(events);
        recyclerView.setAdapter(adapter);

        // Update event
        CalendarEvent eventToUpdate = events.get(0);
        eventToUpdate.setLocation("New Location");
        updateEvent(eventToUpdate);

        // Delete event
        CalendarEvent eventToDelete = events.get(0);
        deleteEvent(eventToDelete);
    }

    private void createEvent(CalendarEvent event) {
        // Add the event to the list or save it to a database
        events.add(event);
        adapter.notifyItemInserted(events.size() - 1);
    }

    private List<CalendarEvent> getAllEvents() {
        // Retrieve the list of events from the database or other data source
        return events;
    }

    private void updateEvent(CalendarEvent event) {
        // Update the event in the list or database
        adapter.notifyDataSetChanged();
    }

    private void deleteEvent(CalendarEvent event) {
        // Remove the event from the list or database
        int position = events.indexOf(event);
        if (position != -1) {
            events.remove(event);
            adapter.notifyItemRemoved(position);
        }
    }
}
