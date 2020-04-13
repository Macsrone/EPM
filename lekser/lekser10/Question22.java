package lekser10;

public class Question22 {

	public static void main(String[] args) {

		String input="<!DOCTYPE html><html><head><title>Java</title></head><body><p id=\"myid\"></p></body></html>";
	    
        if(input.contains("<html>")) {
            int first=input.indexOf("\"");
            int second=input.indexOf("\"", first+1);
            System.out.println(input.substring(first+1, second));
        }else {
            System.out.println("Invalid input!");
        }
		
	}
}
