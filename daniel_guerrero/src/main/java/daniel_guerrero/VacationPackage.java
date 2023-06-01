// Copyright (C) 2020
// All rights reserved
package daniel_guerrero;
public class VacationPackage {
	private String destination;
    private int numTravelers;
    private int duration;

    /**
     * Constructor de la clase VacationPackage.
     * @param destination   El destino de la vacación.
     * @param numTravelers  El número de viajeros.
     * @param duration      La duración de la vacación en días.
     */
    public VacationPackage(String destination, int numTravelers, int duration) {
        this.destination = destination;
        this.numTravelers = numTravelers;
        this.duration = duration;
    }

    public String getDestination() {
        return destination;
    }

    public int getNumTravelers() {
        return numTravelers;
    }

    public int getDuration() {
        return duration;
    }
}

