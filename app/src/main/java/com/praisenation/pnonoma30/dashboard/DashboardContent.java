package com.praisenation.pnonoma30.dashboard;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Helper class for providing sample content for user interfaces created by
 * Android template wizards.
 * <p/>
 * TODO: Replace all uses of this class before publishing your app.
 */
public class DashboardContent {

    /**
     * An array of sample (dummy) items.
     */
    public static List<DashboardItem> ITEMS = new ArrayList<DashboardItem>();

    /**
     * A map of sample (dummy) items, by ID.
     */
    public static Map<String, DashboardItem> ITEM_MAP = new HashMap<String, DashboardItem>();

    static {
        // Add 3 sample items.
        addItem(new DashboardItem("1", "Edit your profile"));
        addItem(new DashboardItem("2", "Add to daily log"));
        addItem(new DashboardItem("3", "View Weekly log"));
    }

    private static void addItem(DashboardItem item) {
        ITEMS.add(item);
        ITEM_MAP.put(item.id, item);
    }

    /**
     * A dummy item representing a piece of content.
     */
    public static class DashboardItem {
        public String id;
        public String content;

        public DashboardItem(String id, String content) {
            this.id = id;
            this.content = content;
        }

        @Override
        public String toString() {
            return content;
        }
    }
}
