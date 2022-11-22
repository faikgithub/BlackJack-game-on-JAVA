package j000_CodeChallange;

import java.util.Scanner;
public class BlackJack {
    static int bank=2000;
    static int card1;
    static int card2;
    static int total;
    static int dealerCard;
    static int dealerTotal;

    static int playerFark;

    static int dealerFark;
    static int bet;
    static int last;


    public static void main(String[] args) {

       Scanner sc=new Scanner(System.in);
        System.out.println("WELCOME TO THE BLACKJACK GAME!");
        System.out.println("YOU HAVE: "+bank+"\nWRITE YOUR BET");
       int bet=sc.nextInt();
       last=bank-bet;

        card1=hit();
        card2=hit();
        total=card1+card2;


         dealerCard=hit();
        dealerTotal+=dealerCard;
        //System.out.println("|                |\n|                |\n|  DEALER'S CARD: "+dealerCard+"  |\n|                |");

        score();

        hitOrStandStart();
            dealerGame();











    }

    private static void hitOrStandStart() {
        Scanner sc1=new Scanner(System.in);
        System.out.println();
        System.out.println("|                    |");
        System.out.println("| HIT-> 1  STAND-> 2 |");
        System.out.println("|                    |");
        System.out.println();
        int decision=sc1.nextInt();

        if(decision==1) {
            hitDecision();
        } else if(decision==2) {
            dealerGame();
            switch(decision) {
                case 2: break;
            }
        } else {
            System.out.println("HATALI NUMARA GIRDINIZ!");
        }

                hitOrStandStart();





    }

    private static void dealerGame() {

               for(int i=0; i<5; i++) {
                   playerFark = 21 - total;
                   dealerFark = 21 - dealerTotal;
                   int dealercard1 = hit();
                   System.out.println("|                    |");
                   System.out.println("|  DEALER'S CARD: " + dealercard1 + "  |");
                   System.out.println("|                    |");
                   dealerTotal+=dealercard1;
                   System.out.println("|    YOU    DEALER   |\n      " + (total) + "        " + (dealerTotal) + "   |");


                   if (dealerTotal > 21) {
                       System.out.println("|    YOU    DEALER   |\n      " + (total) + "        " + dealerTotal + "   |");
                       System.out.println("DEALER GOT BUSTED!");
                       System.out.println("YOU WON!");
                       System.out.println("NEW BANK BALANCE: " + ((bet * 2) + last) + "\n GOOD LUCK");
                       break;

                   }

                   if (playerFark >= dealerFark) {
                       System.out.println();
                       System.out.println("|      GAME OVER     |");
                       System.out.println("|    YOU    DEALER   |\n      " + (total) + "        " + dealerTotal + "   |");
                       System.out.println("YOU LOST!");
                       System.out.println("YOUR NEW BANK BALANCE: "+last+" ANOTHER GAME?");

                       break;


                   }

                   if (playerFark == dealerFark) {
                       System.out.println();
                       System.out.println("|       DRAW     |");
                       System.out.println("YOU TOOK " + bet + "$ BACK!\nBANK:" + (last + bet) + "\nGOOD LUCK!");
                       break;

                   }

               }



    }

    private static void hitDecision() {
               for(int j=0; j<10; j++) {
                   int newCard = hit();
                   System.out.println("|                    |");
                   System.out.println("|  CARD: " + newCard + "           |");
                   System.out.println("|                    |");
                   System.out.println("|    YOU    DEALER   |\n      " + (total += newCard) + "        " + dealerTotal + "    |");
                      if(total>21) {
                          System.out.println("YOU GOT BUSTED!");
                          System.out.println("BANK BALANCE: " + (last) + "\nANOTHER CHANCE?");
                          break;
                      }
                   hitOrStandStart();

               }



    }




    private static void score() {
        System.out.println("|                    |");
        System.out.println("|  DEALER'S CARD: "+ BlackJack.dealerCard +"  |");
        System.out.println("|                    |");
        System.out.println("|  YOUR CARD: " + BlackJack.card1 +"      |");
        System.out.println("|  YOUR CARD: " + BlackJack.card2 +"      |");
        System.out.println("|    YOU    DEALER   |\n      "+(total)+"        "+dealerTotal+"    |");

    }

    private static int hit() {
        int card = (int) (Math.random() * 99+1);

        if(card<7.69230769232) {
            card=2;
        } else if(card<7.69230769232*2) {
            card=3;
        }  else if(card<7.69230769232*3) {
            card=4;
        }  else if(card<7.69230769232*4) {
            card=5;
        } else if(card<7.69230769232*5) {
            card=6;
        } else if(card<7.69230769232*6) {
            card=7;
        } else if(card<7.69230769232*7) {
            card=8;
        } else if(card<7.69230769232*8) {
            card=9;
        } else if(card<7.69230769232*9) {
            card=11;
        } else if(card<7.69230769232*10) {
            if(playerFark>=11 || dealerFark>=11) {
                card=11;
            } else{
                card=1;
            }
        }

        else if(card<7.69230769232*11) {
            if(playerFark>=11 || dealerFark>=11) {
                card=11;
            } else{
                card=1;
            }
        }
        else if(card<7.69230769232*12) {
            if(playerFark>=11 || dealerFark>=11) {
                card=11;
            } else{
                card=1;
            }
        }
        else if(card<7.69230769232*13) {
            if(playerFark>=11 || dealerFark>=11) {
                card=11;
            } else{
                card=1;
            }
        }

        return card;
    }
}
