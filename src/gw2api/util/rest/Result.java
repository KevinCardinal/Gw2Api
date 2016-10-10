package gw2api.util.rest;

public interface Result<T> {
    /**
     * The actual result that is sent by the server.
     *
     * @return the result
     */
    T getResult();
}
