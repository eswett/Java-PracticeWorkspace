package PhraseOMatic;
public class PhraseOMatic {
    public static void main( String[] args) {

        String[] wordListOne = {"ticky", "sticky", "blicky", "nifty", "boss"};

        String[] wordListTwo = {"empowered", "sticky",
            "value-added", "oriented", "centric", "distributed",
            "clustered", "branded","outside-the-box", "positioned",
            "networked", "focused", "leveraged", "aligned",
            "targeted", "shared", "cooperative", "accelerated"};

        String[] wordListThree = {"process", "tipping-point",
            "solution", "mission", "space", "vision",
            "shared", "focused","architecture", "core competency"};

        int oneLength = wordListOne.length;
        int twoLength = wordListTwo.length;
        int threeLength = wordListThree.length;

        int rand1 = (int) (Math.random() * oneLength);
        int rand2= (int) (Math.random() * twoLength);
        int rand3 = (int) (Math.random() * threeLength);

        String phrase = wordListOne[rand1] + " " + wordListTwo[rand2] + " " + wordListThree[rand3];

        System.out.println("What we need is a " + phrase);
    }
}
