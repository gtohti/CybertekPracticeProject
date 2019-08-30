package tests;

import cybertekPages.RadioButtonsPage;

public class JustTestOnce extends RadioButtonsPage {
    public static void main(String[] args) throws Exception{
        RadioButtonsPage tests = new RadioButtonsPage();
        tests.radioButtons();
        tests.textElemets();
        tests.radioButtonPage();

    }
}
