import java.util.Scanner;

public class HowFarAway 
{
    public static void main(String[] args)
    {
      Scanner in = new Scanner(System.in);// gets input from user
      
      double lat1; // starting lat
      double lat2; // ending lat
      double long1; // starting long
      double long2;// ending long

      System.out.print("Enter the latitude of the starting location: ");
      lat1 = in.nextDouble(); //inputs starting lat from user

      System.out.print("Enter the latitude of the ending location: ");
      lat2 = in.nextDouble(); //inputs ending lat from user

      System.out.print("Enter the longitude of the starting location: ");
      long1 = in.nextDouble(); //inputs starting long from user

      System.out.print("Enter the longitude of the ending location: ");
      long2 = in.nextDouble(); //inputs ending long from user

      // creates geoLocation starting points
      GeoLocation initialLocation = new GeoLocation(lat1, long1);

      // end points
      GeoLocation finalLocation = new GeoLocation(lat2, long2);

      double answer = initialLocation.distanceFrom(finalLocation);

      System.out.print("The distance is " + answer + " miles");
    }
}