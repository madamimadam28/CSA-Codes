/* The ticketing system at the airport is broken, and passengers have lined up to board the plane in the incorrect order. 
The line of passengers has already been created for you, and is stored in the ArrayList tickets in the AirlineTester class.

Devise a way to separate passengers into the correct boarding groups.

Currently, there is an AirlineTicket class that holds the information for each passengers ticket. They have a name, seat, row, and boarding group.

Use the TicketOrganizer class to help fix the order of passengers boarding. 
First, create a constructor that takes an ArrayList of AirlineTickets and assigns it to the instance variable tickets. 
Then, create a getTickets method to get the ArrayList of AirlineTickets.

In the TicketOrganizer class, create a method called printPassengersByBoardingGroup that prints out the name of the passengers organized by boarding group. 
The boarding groups go from 1-5, and have been predetermined for you. This should print the boarding group followed by all passengers in the group:

Boarding Group 1:
Delores
Deanna
Boarding Group 2:
Ella-Louise
Dawn
Candice
Nevaeh
Patricia
Saba
Boarding Group 3:
Ayla
Everly
Austin
Boarding Group 4:
Xander
Adrian
Boarding Group 5:
Siena
Sharon
You should also create a method named canBoardTogether which determines if passengers already in line in the tickets ArrayList can board with the people 
they are standing next to in line (using the existing order of the tickets ArrayList). 
f a passenger has the same row and boarding group as the person behind them, this method should print that those two passengers can board together. 
For instance if Passenger 11 and Passenger 12 are both in Row 3, and in Boarding Group 4, the method would print:

Xander can board with Adrian.
If there are no passengers that can board together, then it should print There are no passengers with the same row and boarding group. to the console. */

public class AirlineTicket
{
    private String[] seats = {"A","B","C","D","E","F"};
    private String name;
    private String seat;
    private int boardingGroup;
    private int row;
    
    public AirlineTicket(String name, String seat, int boardingGroup, int row)
    {
        this.name = name;
        if(isValidSeat(seat))
        {
            this.seat = seat;
        }
        this.boardingGroup = boardingGroup;
        this.row = row;
        
    }
    
    private boolean isValidSeat(String seat)
    {
        boolean isValidSeat = false;
        for(String elem: seats)
        {
            if(seat.equals(elem))
            {
                isValidSeat = true;
            }
        }
        return isValidSeat;
    }
    
    public String getSeat()
    {
        return this.seat;
    }
    
    public String getName()
    {
        return this.name;
    }
    
    public int getBoardingGroup()
    {
        return this.boardingGroup;
    }
    
    public int getRow()
    {
        return this.row;
    }
    
    public String toString()
    {
        return name + " Seat: " + seat + " Row: " + row + " Boarding Group: " + boardingGroup;
    }
}

import java.util.ArrayList;

public class TicketOrganizer
{
    private ArrayList<AirlineTicket> tickets;

    public TicketOrganizer(ArrayList<AirlineTicket> arr) {
        tickets = arr;
    }
    
    public ArrayList<AirlineTicket> getTickets() {
        return tickets;
    }
    
    public void printPassengersByBoardingGroup() {
        for (int i = 1; i <= 5; ++i) {
            System.out.println("Boarding Group " + i + ":");
            for (int j = 0; j < tickets.size(); ++j) {
                if (tickets.get(j).getBoardingGroup() == i) {
                    System.out.println(tickets.get(j).getName());
                }
            }
        }
    }
    
    public void canBoardTogether() {
        boolean check = false;
        for (int i = 0; i < tickets.size() - 1; ++i) {
            if (tickets.get(i).getRow() == tickets.get(i + 1).getRow() && tickets.get(i).getBoardingGroup() == tickets.get(i + 1).getBoardingGroup()) {
                System.out.println(tickets.get(i).getName() + " can board with " + tickets.get(i + 1).getName() + ".");
                check = true;
            }
        }
        if (!check) {
            System.out.println("There are no passengers with the same row and boarding group.");
        }
    }
}

import java.util.ArrayList;

public class AirlineTicketTester
{
    public static void main(String[] args)
    {
        ArrayList<AirlineTicket> tickets = new ArrayList<AirlineTicket>();
        //This creates a randomized list of passengers
        addPassengers(tickets);
        for(AirlineTicket elem: tickets)
        {
            System.out.println(elem);
        }
       //This creates a TicketOrganizer object
        TicketOrganizer ticketOrganizer = new TicketOrganizer(tickets);
        
        //These are the methods of the ticketOrganizer in action
        System.out.println("\nPassengers Ordered by Boarding Group:");
        ticketOrganizer.printPassengersByBoardingGroup();
        System.out.println("\nPassengers in line who can board together:");
        ticketOrganizer.canBoardTogether();
    }
    
    //Do not touch this method! It is adding random passengers to the AirlineTicket array
    public static void addPassengers(ArrayList<AirlineTicket> tickets)
    {
        String[] names = {"Xander", "Siena", "Ella-Louise", "Dawn", "Sharon", "Ayla", "Delores", "Adrian", "Candice", "Everly", "Nevaeh", "Patricia", "Saba", "Austin", "Deanna"};
        String[] seats = {"A","B","C","D","E","F"};
        for(int index = 0; index< 15; index++)
        {
            int random = (int)(Math.random() * 5);
            AirlineTicket ticket = new AirlineTicket(names[index], seats[random], ((int)(Math.random()*5)+1), ((int)(Math.random()*8)+1));
            tickets.add(ticket);
        }
    }
    
}