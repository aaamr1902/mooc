/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author alberto
 */
public class Change {

    private char fromCharacter;
    private char toCharacter;

    public Change(char fromCharacter, char toCharacter) {
        this.fromCharacter = fromCharacter;
        this.toCharacter = toCharacter;
    }

    public String change(String characterString) {
        StringBuilder changedString = new StringBuilder();
        for (char character : characterString.toCharArray()) {
            if (character == fromCharacter) {
                changedString.append(toCharacter);
            } else {
                changedString.append(character);
            }
        }
        return changedString.toString();
    }
}