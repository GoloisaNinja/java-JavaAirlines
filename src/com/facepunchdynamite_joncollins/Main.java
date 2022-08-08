package com.facepunchdynamite_joncollins;

public class Main {
    public static void main(String[] args) {
        Person[] people = new Person[] { new Person("Cleopatra", "Egypt", "69 BC", 1),
                new Person("Alexander the Great", "Macedon", "356 BC", 2),
                new Person("Julius Caesar", "Rome", "100 BC", 3),
                new Person("Hannibal", "Carthage", "247 BC", 4),
                new Person("Confucius", "China", "551 BC", 5),
                new Person("Pericles", "Greece", "429 BC", 6),
                new Person("Spartacus", "Thrace", "111 BC", 7),
                new Person("Marcus Aurelius", "Rome", "121 AD", 8),
                new Person("Leonidas", "Greece", "540 BC", 9),
                new Person("Sun Tzu", "China", "544 BC", 10),
                new Person("Hammurabi", "Babylon", "1750 BC", 4),
        };
        Airline airline = new Airline();
        for (int i = 0; i < people.length; i++) {
            if (people[i].applyForPassport()) {
                people[i].setPassport();
                airline.createSeatReservation(people[i]);
            }

        }
        Person[] seats = airline.getSeats();
        System.out.println(airline);
        System.out.println("***************** RESERVATIONS COMPLETE! *****************");
        for (int i = 0; i < seats.length; i++) {
            int seat = i + 1;
            if (seats[i] == null) {
                System.out.println("Seat " + seat + " is empty.\n");
            } else {
                System.out.println(seats[i] + "\n");
            }
        }
    }
}