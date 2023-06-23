package java_prep;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Arrays;

public class Hello_World {

    public static void main(String[] args) {
        LocalDate date = LocalDate.of(2012,1,30);
      date = date.plusDays(10);

        System.out.println(date);
        int arr[] = new int[] {1,2,3};
    }

}
