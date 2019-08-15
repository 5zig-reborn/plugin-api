package eu.the5zig.mod.util;

public interface CoordinateClipboard {
    /**
     * @return The x coordinate
     */
    int getLocationX();

    /**
     * @return The z coordinate
     */
    int getLocationZ();

    /**
     * Sets a new location
     * @param x The x coordinate
     * @param z The z coordinate
     */
    void setLocation(int x, int z);

    /**
     * @return The previous coordinates
     */
    CoordinateClipboard getPrevious();

    /**
     * @return The next coordinates
     */
    CoordinateClipboard getNext();

    /**
     * Creates a new coordinates page and appends it to the current one.
     * @return The new coordinates page
     */
    CoordinateClipboard makeNext();
}
