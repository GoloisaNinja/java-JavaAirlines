package com.facepunchdynamite_joncollins;

public class Airline {
    private Person[] seats;

    public Airline() {
        this.seats = new Person[11];
    }

    public Person[] getSeats() {
        return this.seats;
    }
    public boolean checkSeatReserved(int index) {
        if (this.seats[index] == null) {
            return false;
        }
        return true;
    }

    public Person checkSeatReservation(int index) {
        Person reference = this.seats[index];
        return new Person(reference);
    }

    public void createSeatReservation(Person person) {
        String passengerName = person.getName();
        while(checkSeatReserved(person.getSeatNumber() - 1)) {
            System.out.println("**" + passengerName + ", seat: " + person.getSeatNumber() + " is already taken. " +
                               "Please choose a " +
                               "new one" +
                               ".**\n");
            person.chooseSeat();
        }
        int index = person.getSeatNumber();
        Person copy = new Person(person);
        this.seats[index - 1] = copy;
    }

    public String toString() {
        String temp = "";
        for (int i = 0; i < this.seats.length; i++) {
            int seatNum = i + 1;
            if (checkSeatReserved(i)) {
                temp += "Thank you " + this.checkSeatReservation(i).getName() + " for flying with Java Airlines. Your" +
                        " seat number is " + seatNum + ".\n";
            }
        }
        return temp;
    }

}
