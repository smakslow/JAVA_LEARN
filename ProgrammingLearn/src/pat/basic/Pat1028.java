package pat.basic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Pat1028 {
    static class Student {
        String name;
        Date date;

        public Student() {
        }

        public Student(String name, Date date) {
            this.name = name;
            this.date = date;
        }
    }

    public static void main(String[] args) throws IOException, ParseException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n = reader.readLine().charAt(0) - '0';
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd");
        String[] str;
        int count = 0;
        Date start = dateFormat.parse("1814/09/06");
        Date end = dateFormat.parse("2014/09/06");
        Date max = start, min = end;
        String old = null, young = null;
        Date now;
        for (int i = 0; i < n; i++) {
            str = reader.readLine().split(" ");
            now = dateFormat.parse(str[1]);
            if (now.compareTo(start) >= 0 && end.compareTo(now) >= 0) {
                count++;
                if (now.compareTo(max) > 0) {
                    max = now;
                    old = str[0];
                }
                if (now.compareTo(min) < 0) {
                    min = now;
                    young = str[0];
                }
            }
        }
        System.out.println(count + " " + young + " " + old);
    }
}
