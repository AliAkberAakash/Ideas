package com.example.ideas.dummy;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Helper class for providing sample content for user interfaces created by
 * Android template wizards.
 * <p>
 * TODO: Replace all uses of this class before publishing your app.
 */
public class DummyContent {

    /**
     * An array of sample (dummy) items.
     */
    public static final List<DummyItem> ITEMS = new ArrayList<DummyItem>();

    /**
     * A map of sample (dummy) items, by ID.
     */
    public static final Map<String, DummyItem> ITEM_MAP = new HashMap<String, DummyItem>();

    private static String[] details = new String[] {
            "Weak Hash function for media files: A hash function that outputs the same hash if minor (to some extent) difference is found between two image files, audio files, etc.",
            "Software licence exchange: Sometimes you buy a software to be installed and used on two or three terminals (with different accounts), while you only need one, you could exchange the other licences with other peers",
            "Chat-room with fresh topics: Topics would be inferred using topic modeling (unsupervised learning). New topics would be learned from passed discussion for a limited window (say one day)\n",
            "Document level unification: It starts by de-duplication, identifying a level of atomic entities of document files (doc, xls, pdf, ppt..), for example a page for doc files, a sheet for xls files... then define a weak equality so as two pages are equal when un-styled text is equal. Many use cases would be of great utility after, like decreasing stock/network data, better search of those entities.",
            "Time suggestion for frequent phone calls: using history of calls (succeeded, and missed calls) of different communication solutions (WhatsApp, Viber, phone...) learn a model to suggest a better timing . It would very useful when peers are in different time-zones.",
            "Bulk un-subscription: You are probably receiving dozens or even hundred of mails each day like me, the idea is to let users be less dependent on the digital world, instead of manually entering each service apart and un-subscribing, a web -app or a phone app would let the user o-Authenticate fast in some services, and point automatically to the service if it presents an API for un-subscribing.",
            "Client-side hashing: A JS Client-side library that hashes files before upload, and hints the web service receiving the file with the hash before uploading: the why is obvious.",
            "A web scrapper that looks for dead resources: it furthermore attempts to alert the web services providers about dead resources with a wise alerting frequency politic.",
            "A directory for emerging talents, or so differently new brands.",
            "Detecting cigarette stubs: based on a strong image recognition model, a cleaning machine would enter even a nice garden to spoof stubs without messing plants.",
            "Pronunciation exchange platform: A language exchange platform is a social website that lets users learn from each others other languages. We suggest a service that focus on pronunciation; A user"
                    +" would record on his wall a phrase while other users would perfect his pronunciation on comments also using records.",
            "Password typing not in dots: A password should not be visible when typing as a for of obscuring to avoid shoulder eyes hacking, some solutions propose keystrokes encryption to avoid key-logging, "+
                    "Now what about letting simply the user contribute to it's obscuring by setting several rules that map all characters (letters, symbols and numbers) to other values, and ask the user to enter the other value following a randomly chosen rule. For example, asking the user to press the button on the left of 'g'",
            "A phone app to declare local commune damages: Using a live camera shot and a small description with the address. This would speed and ease locals and authorities communication: you know, things like a street crack, a dead bulb, etc.",
            "Un-Tic: Train a model to discover repetitive -not successful tasks-; Tasks are actions a developer attempted on his IDE ( intellij, eclipse...) but didn't produce anything; As an example, add a line then remove it. I am sure developers do dozens of actions that are just Tics. I do myself add a line then remove it, refresh a project two times, etc. As you can imagine, this would be a plug-in in famous IDEs."
    };

    private static final int COUNT = details.length;

    static {
        // Add some sample items.
        for (int i = 0; i < COUNT; i++) {
            addItem(createDummyItem(i));
        }
    }

    private static void addItem(DummyItem item) {
        ITEMS.add(item);
        ITEM_MAP.put(item.id, item);
    }


    private static DummyItem createDummyItem(int position) {
        DummyItem[] contents = {
                new DummyItem("1","Weak Hash function",details[0]),
                new DummyItem("2","Licence exchange platform",details[1]),
                new DummyItem("3","Chat-room with fresh topics",details[2]),
                new DummyItem("4","Document level unification",details[3]),
                new DummyItem("5","Phone calls time suggestion",details[4]),
                new DummyItem("6","Bulk un-subscription",details[5]),
                new DummyItem("7","Client-side hashing",details[6]),
                new DummyItem("8","Internet dead endpoints",details[7]),
                new DummyItem("9","Emerging talents directory",details[8]),
                new DummyItem("10","Detecting cigarette stubs",details[9]),
                new DummyItem("11","Pronunciation exchange platform",details[10]),
                new DummyItem("12","Password typing not in dots",details[11]),
                new DummyItem("13","Declare local commune damages",details[12]),
                new DummyItem("14","Un-Tic",details[13]),

        };

        return contents[position];
    }

    public static class DummyItem {
        public final String id;
        public final String content;
        public final String details;

        public DummyItem(String id, String content, String details) {
            this.id = id;
            this.content = content;
            this.details = details;
        }

        @Override
        public String toString() {
            return content;
        }
    }
}
