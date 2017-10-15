public class Percolation {

    /**
     * Creates n x n grid
     */
    public Percolation (int n) {

    }

    /**
     * Opens site (row, col) if it is not open already
     * @param row
     * @param col
     */
    public void open(int row, int col) {

    }


    /**
     * Is site (row, col), open?
     * @param row
     * @param col
     * @return true if (row, col) is open
     */
    public boolean isOpen(int row, int col) {
        return false;
    }

    /**
     * Is site (row, col), full?
     * @param row
     * @param col
     * @return true if (row, col) is closed
     */
    public boolean isFull(int row, int col) {
        return false;
    }


    /**
     * Number of open sites
     * @return number of open sites
     */
    public int numberOfOpenSites() {
        return 0;
    }

    /**
     * Does the system percolate?
     * @return true if system percolates (if there is a open site on the top that can be connected to an open
     * site to the bottom via an interconnecting chain of neighboring (left, right, up, down) open sites
     */
    public boolean percolates() {
        return false;
    }

}
