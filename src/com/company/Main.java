package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Game game = new Game("playstation");
        Prompter prompter = new Prompter(game);

        prompter.displayProgress();
    }
}
