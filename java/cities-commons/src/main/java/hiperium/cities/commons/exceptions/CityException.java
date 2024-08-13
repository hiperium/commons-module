package hiperium.cities.commons.exceptions;

/**
 * The CityException class is an exception thrown when there is an error related to a city.
 */
public sealed class CityException extends RuntimeException
    permits DisabledCityException, ResourceNotFoundException {

    /**
     * The CityException class is an exception thrown when there is an error related to a city.
     *
     * @param message The error message.
     */
    public CityException(String message) {
        super(message);
    }
}
