public class PopulationProjection {
    public static void main(String[] args) {
        System.out.println("(1 year = 365 days),(1 day = 86400 secs)");
        System.out.println("In U.S, 7 secs = 1 birth");
        System.out.print("      365 days =  ");
        System.out.print(86400/7);
        System.out.println(" births");
        System.out.println("In U.S, 13 secs = 1 death");
        System.out.print("      365 days =  ");
        System.out.print(86400/13);
        System.out.println(" deaths");
        System.out.println("In U.S, 45 secs = 1 new immigrant");
        System.out.print("      365 days =  ");
        System.out.print(86400/45);
        System.out.println(" new immigrants");
        System.out.println("Current Population = 312032486");
        System.out.print("Next five years births = ");
        System.out.println(5*(86400/7));
        System.out.print("Next five years deaths = ");
        System.out.println(5*(86400/13));
        System.out.print("Next five years immigrants = ");
        System.out.println(5*(86400/45));
        System.out.print("Next five years populations =");
        System.out.print(312032486 + (5 * (((86400/7) + (86400/45)) - (86400/13))) );

    }
}
