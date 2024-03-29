package com.example.googleassistant.data;

import java.lang.System;

@androidx.room.Database(entities = {com.example.googleassistant.data.Assistant.class}, version = 1, exportSchema = false)
@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\'\u0018\u0000 \u00072\u00020\u0001:\u0001\u0007B\u0005\u00a2\u0006\u0002\u0010\u0002R\u0012\u0010\u0003\u001a\u00020\u0004X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\b"}, d2 = {"Lcom/example/googleassistant/data/AssistantDatabase;", "Landroidx/room/RoomDatabase;", "()V", "assistantDao", "Lcom/example/googleassistant/data/AssistantDao;", "getAssistantDao", "()Lcom/example/googleassistant/data/AssistantDao;", "Companion", "app_debug"})
public abstract class AssistantDatabase extends androidx.room.RoomDatabase {
    private static volatile com.example.googleassistant.data.AssistantDatabase INSTANCE;
    @org.jetbrains.annotations.NotNull()
    public static final com.example.googleassistant.data.AssistantDatabase.Companion Companion = null;
    
    @org.jetbrains.annotations.NotNull()
    public abstract com.example.googleassistant.data.AssistantDao getAssistantDao();
    
    public AssistantDatabase() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0007R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\b"}, d2 = {"Lcom/example/googleassistant/data/AssistantDatabase$Companion;", "", "()V", "INSTANCE", "Lcom/example/googleassistant/data/AssistantDatabase;", "getInstance", "context", "Landroid/content/Context;", "app_debug"})
    public static final class Companion {
        
        @org.jetbrains.annotations.NotNull()
        public final com.example.googleassistant.data.AssistantDatabase getInstance(@org.jetbrains.annotations.NotNull()
        android.content.Context context) {
            return null;
        }
        
        private Companion() {
            super();
        }
    }
}