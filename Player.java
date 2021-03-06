/**
 *  This is the 3rd version of Player for SER215 project
 *
 *  @author Dustin Godin
 *  @version 4.0
 *  @date 4/27/2017
 */
public class Player {
    /*------------------------------------------------------------
     START INSTANCE VARIABLES
     ------------------------------------------------------------*/
    protected int money, total;
    public boolean bust, isStanding;
    protected Hand hand;
    private String name;
    /*------------------------------------------------------------
    END INSTANCE VARIABLES
    ------------------------------------------------------------
    ------------------------------------------------------------
    START CONSTRUCTORS
    ------------------------------------------------------------*/
    //generic constructor
    public Player() {
        this.money = 0;
        this.total = 0;
        this.bust = false;
        this.isStanding = false;
        this.hand = new Hand();
        this.name = "";
    }

    //constructor to take in money
    public Player(int money, String name) {
        this.money = money;
        this.total = 0;
        this.bust = false;
        this.isStanding = false;
        this.hand = new Hand();
        this.name = name;
    }
    /*------------------------------------------------------------
    END CONSTRUCTORS
    ------------------------------------------------------------
    ------------------------------------------------------------
    START GETTERS AND SETTERS
    ------------------------------------------------------------*/
    //getter for money
    public int getMoney() {
        return money;
    }

    //setter for money
    public void setMoney(int money) {
        this.money = money;
    }

    //getter for total
    public int getTotal() {
        return total;
    }

    //setter for total
    public void setTotal(int total) {
        this.total = total;
    }

    //getter for bust
    public boolean isBust() {
        return bust;
    }

    //setter for bust
    public void setBust(boolean bust) {
        this.bust = bust;
    }

    //getter for isStanding
    public boolean getIsStanding() {
        return isStanding;
    }

    //setter for IsStanding
    public void setIsStanding(boolean standing) {
        this.isStanding = standing;
    }

    //getter for name
    public String getName() {
        return name;
    }

    //setter for name
    public void setName(String name) {
        this.name = name;
    }

    /*------------------------------------------------------------
    END GETTER AND SETTERS
    ------------------------------------------------------------
    ------------------------------------------------------------
    START METHODS
    ------------------------------------------------------------*/


    public void stand() {
        this.setIsStanding(true);
    }

    /*Adds the card to the hand. Calculates new total
    * and gets that total from the hand into the players variable*/
    public void hit(Card card){
        this.hand.addCard(card);
        Blackjack.dealCard(1, card);
        this.setTotal(hand.getTotal());
        if (this.total > 21)
            this.setBust(true);
    }

    //resets all variables for new round.
    public void reset(){
        this.total = 0;
        this.isStanding = false;
        this.bust = false;
        this.hand = new Hand();
    }
    /*------------------------------------------------------------
    END METHODS
    ------------------------------------------------------------
    */
}