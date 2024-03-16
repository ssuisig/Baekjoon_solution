import java.io.*;
import java.util.*;

public class Main {
	
	public static void main(String argc[])throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer today = new StringTokenizer(br.readLine());
		int toYear = Integer.parseInt(today.nextToken());
		int toMonth = Integer.parseInt(today.nextToken());
		int toDay = Integer.parseInt(today.nextToken());
		
		StringTokenizer dday = new StringTokenizer(br.readLine());
		int dYear = Integer.parseInt(dday.nextToken());
		int dMonth = Integer.parseInt(dday.nextToken());
		int dDay = Integer.parseInt(dday.nextToken());
		
		int toDiffDay = 0;
		int dDiffDay = 0;
		
		if(!is_gg(dYear, toYear, dMonth, toMonth, dDay, toDay)) {
			
			toDiffDay += cal_days(toYear, toMonth, toDay);
			dDiffDay += cal_days(dYear, dMonth, dDay);

			
			System.out.println("D-"+(dDiffDay- toDiffDay));
		}
		else {
			System.out.println("gg");
		}
		
		
		
	}
	public static int cal_days(int year, int month,int day) {
		int[] days = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		int d = 0;
		
		for(int i = 1; i < year; i++) {
			d += 365 + is_leaf(i);
		}
		for(int i = 1; i < month; i++) {
			if(i == 2)
				d += is_leaf(year);
			d += days[i];
		}
		return day+d;
		
	}
	public static boolean is_gg(int dYear, int toYear, int dMonth, int toMonth, int dDay, int toDay) {
		if(dYear-toYear > 1000)
			return true;
		else if(dYear-toYear == 1000){
			if(dMonth-toMonth > 0)
				return true;
			else if(dMonth-toMonth == 0) {
				if(dDay-toDay >= 0) 
					return true;
				else
					return false;
			}
			else
				return false;
		}
		else
			return false;
		
	}
	public static int is_leaf(int year) {
		if(year % 400 == 0) {
			return 1;
		}
		else if(year % 100 == 0) {
			return 0;
		}
		else if(year % 4 == 0) {
			return 1;
		}
		else {
			return 0;
		}
	}

}
