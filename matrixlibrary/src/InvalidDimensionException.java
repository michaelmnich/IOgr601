/**
 * Created by z1091308 on 2016-05-30.
 */
public class InvalidDimensionException extends Exception {

    InvalidDimensionException() {}
    InvalidDimensionException(String reason) {
        super(reason);
    }
}
