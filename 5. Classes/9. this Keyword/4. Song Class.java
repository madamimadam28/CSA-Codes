/* The Song class is designed to hold basic information about songs. We want to give the user the option to create songs as well as update all of the information about a song. For example, if a user accidentally thinks that Bruce Springsteen wrote The Heart of Rock and Roll, we want to be able to update that to Huey Lewis & The News.

Complete the Song class as outlined in the comments. Don’t change any of the instance variable or parameter names for this exercise. Instead, make sure you are using this notation.

Once completed, test your code using the SongTester class. You should test creating, printing, and updating information.

Sample Output:
artist= ABBA
title= Dancing Queen
Time= 3:54

artist= Bruce Springsteen
title= The Heart of Rock and Roll
Time= 5:14

artist= Huey Lewis & the News
title= The Heart of Rock and Roll
Time= 4:59 */

public class Song
{
    private String artist;
    private String title;
    private int minutes;
    private int seconds;

    public Song(String artist, String title, int minutes, int seconds){
        this.artist = artist;
        this.title = title;
        this.minutes = minutes;
        this.seconds = seconds;
    }

	/**
	* Returns value of artist
	* @return artist
	*/
	public String getArtist() {
        return artist;
	}

	/**
	* Sets new value of artist
	* @param artist Updated artist
	*/
	public void setArtist(String artist) {
	    this.artist = artist;
	}

	/**
	* Returns value of title
	* @return title
	*/
	public String getTitle() {
	    return title;
	}

	/**
	* Sets new value of title
	* @param title Updated title
	*/
	public void setTitle(String title) {
	    this.title = title;
	}

	/**
	* Returns value of minutes
	* @return minutes
	*/
	public int getMinutes() {
	    return minutes;
	}

	/**
	* Sets new value of minutes
	* @param minutes Updated minutes
	*/
	public void setMinutes(int minutes) {
	    this.minutes = minutes;
	}

	/**
	* Returns value of seconds
	* @return seconds
	*/
	public int getSeconds() {
	    return seconds;
	}

	/**
	* Sets new value of seconds
	* @param seconds Updated seconds
	*/
	public void setSeconds(int seconds) {
	    this.seconds = seconds;
	}

	/**
	* Create string representation of Song for printing
	* @return String of the song
	*/
	@Override
	public String toString() {
		return "artist= " + artist + "\ntitle= " + title + "\nTime= " + minutes + ":" + seconds;
	}
}

public class SongTester
{
    public static void main(String[] args)
    {
        // Start here!
        Song dq = new Song("ABBA", "Dancing Queen", 3, 54);
        Song thornr = new Song("Bruce Springsteen", "The Heart of Rock and Roll", 5, 14);
        
        System.out.println(dq);
        System.out.println(thornr);
        thornr.setArtist("Huey Lewis & the News");
        System.out.println(thornr);
    }
}
