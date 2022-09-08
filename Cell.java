public class Cell {
    private CellStatus cs;
    Cell() {
        cs = CellStatus.EMPTY;
    }

    public void setCs(CellStatus newCs) {
        cs = newCs;
    }

    public CellStatus getCs() {
        return cs;
    }

    public void print() {
        if(cs == CellStatus.EMPTY) {
            System.out.print("[ ]");
        }
        else {
            if(cs == CellStatus.X) {
                System.out.print("[X]");
            }
            else {
                System.out.print("[O]");
            }
        }
    }

}
