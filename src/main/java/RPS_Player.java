import java.util.Random;

public class RPS_Player {
    private int numberOfGamesWon;
    private int numberOfGamesPlayed;
    private int choice;
    private String name;

    private Random rand = new Random();

    public RPS_Player(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

    /**
     * Returns the number of games played since a clear() was issued.
     * @return returns the number of games played.
     */
    public int getNumberOfGamesPlayed(){
        return numberOfGamesPlayed;
    }

    /**
     * Returns the number of games won since a clear() was issued.
     * @return returns the number of games won.
     */
    public int getNumberOfGamesWon(){
        return numberOfGamesWon;
    }

    /**
     * Returns the win percentage as number between 0 and 1.
     * @return win percentage as a double.
     */
    public double getWinPercentage(){
        return (double) numberOfGamesWon/numberOfGamesPlayed;
    }

    //Added

    public int getChoice() {
        return choice;
    }

    public void setChoice(int choice) {
        this.choice = choice;
    }

    public void setNumberOfGamesWon(int numberOfGamesWon) {
        this.numberOfGamesWon = numberOfGamesWon;
    }

    public void setNumberOfGamesPlayed(int numberOfGamesPlayed) {
        this.numberOfGamesPlayed = numberOfGamesPlayed;
    }

    ////////////////////////////////////////////////////////////

    /**
     * Starts a new game.
     */
    public void clear(){
        // TODO: replace this line with your code.
        numberOfGamesPlayed = 0;
        numberOfGamesWon = 0;
        choice = 0;


    }

    /**
     * This player challenges anotherPlayer whereby both players make a
     * random choice of rock, paper, scissors.  A reference to the winning
     * player is returned or null if there is a draw.
     * @param anotherPlayer an RPS_Player that this player is challenging.
     * @return Reference to the RPS_Player that won or a null if there is a draw
     */
    public RPS_Player challenge(RPS_Player anotherPlayer){
        // TODO: replace this line with your code.
        //rock =  1
        //paper = 2
        //scissors = 3
        choice = rand.nextInt(3);
        anotherPlayer.setChoice(rand.nextInt(3));
        if (choice == 0  && anotherPlayer.getChoice() == 2 || choice == 1 && anotherPlayer.getChoice() == 0 || choice == 2 && anotherPlayer.getChoice() == 1){
            numberOfGamesPlayed+=1;
            anotherPlayer.setNumberOfGamesPlayed(anotherPlayer.getNumberOfGamesPlayed()+1);
            numberOfGamesWon+=1;
            return this;
        }
        else if(choice  == anotherPlayer.getChoice()){
            numberOfGamesPlayed+=1;
            anotherPlayer.setNumberOfGamesPlayed(anotherPlayer.getNumberOfGamesPlayed()+1);
            return null;
        }
        else {
            numberOfGamesPlayed+=1;
            anotherPlayer.setNumberOfGamesPlayed(anotherPlayer.getNumberOfGamesPlayed()+1);
            anotherPlayer.setNumberOfGamesWon(anotherPlayer.getNumberOfGamesWon()+1);
            return anotherPlayer;
        }



    }

    /**
     * This player challenges anotherPlayer whereby this player uses the previous
     * choice made and anotherPlayer makes a random choice of rock, paper, scissors.
     * A reference to the winning player is returned or null if there is a draw.
     * @param anotherPlayer an RPS_Player that this player is challenging.
     * @return Reference to the RPS_Player that won or a null if there is a draw
     */
    public RPS_Player keepAndChallenge(RPS_Player anotherPlayer){
        // TODO: replace this line with your code.
        anotherPlayer.setChoice(rand.nextInt(3));
        if (choice == 0  && anotherPlayer.getChoice() == 2 || choice == 1 && anotherPlayer.getChoice() == 0 || choice == 2 && anotherPlayer.getChoice() == 1){
            numberOfGamesPlayed+=1;
            anotherPlayer.setNumberOfGamesPlayed(anotherPlayer.getNumberOfGamesPlayed()+1);
            numberOfGamesWon+=1;
            return this;
        }
        else if(choice  == anotherPlayer.getChoice()){
            numberOfGamesPlayed+=1;
            anotherPlayer.setNumberOfGamesPlayed(anotherPlayer.getNumberOfGamesPlayed()+1);
            return null;
        }
        else {
            numberOfGamesPlayed+=1;
            anotherPlayer.setNumberOfGamesPlayed(anotherPlayer.getNumberOfGamesPlayed()+1);
            anotherPlayer.setNumberOfGamesWon(anotherPlayer.getNumberOfGamesWon()+1);
            return anotherPlayer;
        }

    }

}

