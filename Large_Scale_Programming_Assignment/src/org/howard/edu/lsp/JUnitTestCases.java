package org.howard.edu.lsp.oopfinal.question1;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;
import java.util.HashSet;
import java.util.Set;


public class JUnitTestCases {
    private SongsDatabase db;

    @Before
    public void setUp() {
        db = new SongsDatabase();
        db.addSong("Rap", "Savage");
        db.addSong("Rap", "Gin and Juice");
        db.addSong("Country", "Sweet Alabama");
        db.addSong("Jazz", "Always There");
    }

    @Test
    public void testAddSong() {
        Set<String> songs = db.getSongs("Rap");
        assertTrue(songs.contains("Savage"));
        assertTrue(songs.contains("Gin and Juice"));
        assertEquals(2, songs.size());
    }

    @Test
    public void testGetGenreOfSong() {
        assertEquals("Rap", db.getGenreOfSong("Savage"));
        assertEquals("Jazz", db.getGenreOfSong("Always There"));
        assertNull(db.getGenreOfSong("Unknown Song"));
    }

    @Test
    public void testGetSongs() {
        Set<String> rapSongs = db.getSongs("Rap");
        Set<String> expectedRapSongs = new HashSet<>();
        expectedRapSongs.add("Savage");
        expectedRapSongs.add("Gin and Juice");
        assertEquals(expectedRapSongs, rapSongs);

        assertTrue(db.getSongs("Country").contains("Sweet Alabama"));
        assertTrue(db.getSongs("Pop").isEmpty());
    }
}
