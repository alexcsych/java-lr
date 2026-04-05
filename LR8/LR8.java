package LR8;

import java.io.FileWriter;
import java.io.PrintWriter;
import java.text.DateFormat;
import java.util.Date;
import java.util.Scanner;
import java.util.SortedSet;
import java.util.TreeSet;
import java.util.Locale;

public class LR8 {
  private static final String FILE_NAME = "date.txt";

  public static void main(String[] args) {
    int n = 15;

    try {
      Scanner scanner = new Scanner(System.in);
      
      System.out.print("\nEnter languageTag (e.g., en-US): ");
      String languageTag = scanner.nextLine().trim();
      Locale locale = Locale.forLanguageTag(languageTag);

      System.out.print("\nEnter interval in s (e.g., 5): ");
      int interval = scanner.nextInt();

      SortedSet<Date> dateSet = new TreeSet<>(new CustomDateComparator());
      
      try (PrintWriter writer = new PrintWriter(new FileWriter(FILE_NAME, true))) {
        for (int i = 0; i < n; i++) {
          Date now = new Date();
          dateSet.add(now);
          DateFormat df = DateFormat.getDateTimeInstance(DateFormat.FULL, DateFormat.MEDIUM, locale);
          String formattedDate = df.format(now);
          
          System.out.println("Current date: " + formattedDate);
          
          writer.println(formattedDate);
          writer.flush();
          
          Thread.sleep(interval * 1000);
        }
      }
      
      System.out.println("SortedSet dateSet: " + dateSet);
    } catch (Exception e) {
        e.printStackTrace();
    }
  }
}
