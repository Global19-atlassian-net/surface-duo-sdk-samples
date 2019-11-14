package com.microsoft.extend;

import android.graphics.Rect;

// Interface to notify listeners of changes to app layout in two screen layouts
public interface DualScreenDetectionListener {
    void useSingleScreenMode(int rotation);
    void useDualScreenMode(int rotation, Rect screenRect1, Rect screenRect2);
}