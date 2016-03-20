package com.mycompany;


import org.testng.annotations.Test;

import java.util.List;


import static org.testng.Assert.*;

/**
 * Created by 90tombowker on 3/10/16.
 */
public class MathGameTest {

    MathGame mathGame = new MathGame();
    Users testUsers = new Users();
    MainMenu testMenu = new MainMenu();
    ReadFilesClass testRFC = new ReadFilesClass();


    @Test
    public void testUsersTrue() throws Exception {
        boolean result = testUsers.users("Bob", 8, "boy");
        assertTrue(result);
    }
    @Test
    public void testUsersFalseAge() throws Exception {
        boolean result = testUsers.users("Bob", -1, "boy");
        assertFalse(result);
    }
    @Test
    public void testUsersFalseGender() throws Exception {
        boolean result = testUsers.users("Bob", 8, "Blah");
        assertFalse(result);
    }
    @Test
    public void testUsersFalseEmptyName() throws Exception {
        boolean result = testUsers.users("", 6, "boy");
        assertFalse(result);
    }
    @Test
    public void testUsersFalseSpaceName() throws Exception {
        boolean result = testUsers.users(" ", 8, "boy");
        assertFalse(result);
    }
    @Test
    public void testIfQuestionsExists() throws Exception {
        List<String> result = testRFC.getQuestionsStrings();
        assertNotNull(result);
        assertFalse(result.isEmpty());
        assertEquals(result.get(0), "1 + 1", "First Question Test Error");
    }
    @Test
    public void testIfAnswersExists() throws Exception {
        List<String> result = testRFC.getAnswersString();
        assertNotNull(result);
        assertFalse(result.isEmpty());
        assertEquals(result.get(0), "2", "Question Test Error");
    }
    @Test
    public void testMathGame() throws Exception {
        mathGame.playMathGame();

    }
    @Test
    public void testMainMenuCaseOne() throws Exception {
        String result = testMenu.mainMenu(1);
        assertFalse(result.isEmpty());
    }
    @Test
    public void testMainMenuCaseTwo() throws Exception {
        String result = testMenu.mainMenu(2);
        assertFalse(result.isEmpty());
    }
    @Test
    public void testMainMenuCaseThree() throws Exception {
        String result = testMenu.mainMenu(3);
        assertFalse(result.isEmpty());
    }
    @Test
    public void testMainMenuInvalidCase() throws Exception {
        String result = testMenu.mainMenu(4);
        assertFalse(result.isEmpty());
    }



}